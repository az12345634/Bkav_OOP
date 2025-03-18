package com.example.bkav_ToDoList.service.Impl;

import com.example.bkav_ToDoList.entity.ToDoList;
import com.example.bkav_ToDoList.repository.ToDoListRepository;
import com.example.bkav_ToDoList.response.BaseResponse;
import com.example.bkav_ToDoList.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ToDoListImpl implements ToDoListService {
    @Autowired
    private ToDoListRepository toDoListRepository;
//    @Override
//    public BaseResponse<Page<ToDoList>> getToDoList(Integer minScore, Integer maxScore, String status, int limit) {
//        Pageable pageable = PageRequest.of(0, limit);
//        Page<ToDoList> toDoListPage;
//
//        if (status != null && !status.isEmpty() && minScore != null && maxScore != null) {
//            toDoListPage = toDoListRepository.findByScoreBetweenAndStatus(minScore, maxScore, status, pageable);
//        } else if (status != null && !status.isEmpty()) {
//            toDoListPage = toDoListRepository.findByStatus(status, pageable);
//        } else if (minScore != null && maxScore != null) {
//            toDoListPage = toDoListRepository.findByScoreBetween(minScore, maxScore, pageable);
//        } else {
//            toDoListPage = toDoListRepository.findAll(pageable);
//        }
//
//        return new BaseResponse<>(200, "Success", toDoListPage);
//    }
@Override
public BaseResponse<Page<ToDoList>> getToDoList(Integer minScore, Integer maxScore, String status, int limit) {
    Pageable pageable = PageRequest.of(0, limit);
    Page<ToDoList> toDoListPage;

    if (status != null && !status.isEmpty() && minScore != null && maxScore != null) {
        toDoListPage = toDoListRepository.findByScoreBetweenAndStatus(minScore, maxScore, status, pageable);
    } else if (status != null && !status.isEmpty()) {
        toDoListPage = toDoListRepository.findByStatus(status, pageable);
    } else if (minScore != null && maxScore != null) {
        toDoListPage = toDoListRepository.findByScoreBetween(minScore, maxScore, pageable);
    } else {
        toDoListPage = toDoListRepository.findAll(pageable);
    }

    // Lọc bỏ delete = true
    List<ToDoList> filteredList = toDoListPage.getContent()
            .stream()
            .filter(todo -> !todo.isDelete()) // Loại bỏ bản ghi bị xóa
            .toList();

    Page<ToDoList> filteredPage = new PageImpl<>(filteredList, pageable, filteredList.size());

    return new BaseResponse<>(200, "Success", filteredPage);
}


    @Override
    public BaseResponse<?> update(String id, ToDoList toDoList) {
        Optional<ToDoList> optionalToDo = toDoListRepository.findById(id);

        if (optionalToDo.isPresent()) {
            ToDoList existingToDo = optionalToDo.get();
            existingToDo.setTitle(toDoList.getTitle());
            existingToDo.setDescription(toDoList.getDescription());
            existingToDo.setScore(toDoList.getScore());
            existingToDo.setStatus(toDoList.getStatus());
            existingToDo.setLastModified(LocalDateTime.now());
            toDoListRepository.save(existingToDo);

            return new BaseResponse<>(HttpStatus.OK.value(), "Cập nhật thành công", existingToDo);
        } else {
            return new BaseResponse<>(HttpStatus.NOT_FOUND.value(), "Không tìm thấy ToDo với ID: " + id, null);
        }
    }

    @Override
    public ToDoList create(ToDoList toDoList) {
        toDoList.setCreateTime(LocalDateTime.now());
        this.toDoListRepository.save(toDoList);
        return toDoList;
    }

    @Override
    public BaseResponse<?> delete(String id) {
        BaseResponse<String> baseResponse = new BaseResponse<>();
        Optional<ToDoList> toDoList = toDoListRepository.findById(id);

        if (toDoList.isEmpty()) {
            baseResponse.setCode(HttpStatus.NOT_FOUND.value());
            baseResponse.setMessage("Error not found");
            return baseResponse;
        }
        ToDoList toDoList1 = toDoList.get();
        toDoList1.setDelete(true);
        toDoListRepository.save(toDoList1);
        baseResponse.setCode(200);
        baseResponse.setMessage("Xoá thành công");
        return baseResponse;

    }
}
