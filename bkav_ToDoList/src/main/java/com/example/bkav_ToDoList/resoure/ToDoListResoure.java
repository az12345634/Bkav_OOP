package com.example.bkav_ToDoList.resoure;

import com.example.bkav_ToDoList.entity.ToDoList;
import com.example.bkav_ToDoList.response.BaseResponse;
import com.example.bkav_ToDoList.service.ToDoListService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos")
public class ToDoListResoure {
    @Autowired
    private ToDoListService toDoListService;


    @GetMapping("/list")
    public ResponseEntity<BaseResponse<Page<ToDoList>>> getToDoList(
            @RequestParam(required = false) Integer minScore,
            @RequestParam(required = false) Integer maxScore,
            @RequestParam(required = false) String status,
            @RequestParam(defaultValue = "10") int limit) {

        BaseResponse<Page<ToDoList>> response = toDoListService.getToDoList(minScore, maxScore, status, limit);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/create")
    public ResponseEntity<?> addcread(@RequestBody ToDoList toDoList){
        return ResponseEntity.ok(toDoListService.create(toDoList));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable String id,
                                    @RequestBody ToDoList toDoList) {
        try {
            return ResponseEntity.ok(toDoListService.update(id, toDoList));
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id) {

        return ResponseEntity.ok(toDoListService.delete(id));
    }
}
