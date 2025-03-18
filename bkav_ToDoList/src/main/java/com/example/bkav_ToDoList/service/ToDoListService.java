package com.example.bkav_ToDoList.service;

import com.example.bkav_ToDoList.entity.ToDoList;
import com.example.bkav_ToDoList.response.BaseResponse;
import org.springframework.data.domain.Page;

public interface ToDoListService {
    BaseResponse<Page<ToDoList>> getToDoList(Integer minScore, Integer maxScore, String status, int limit);
    BaseResponse<?> update(String id, ToDoList toDoList);
    ToDoList create(ToDoList toDoList);
    BaseResponse<?> delete(String id);
}
