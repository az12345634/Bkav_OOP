package com.example.bkav_ToDoList.repository;

import com.example.bkav_ToDoList.entity.ToDoList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoListRepository extends MongoRepository<ToDoList, String> {
        Page<ToDoList> findByScoreBetweenAndStatus(Integer minScore, Integer maxScore, String status, Pageable pageable);
        Page<ToDoList> findByStatus(String status, Pageable pageable);
        Page<ToDoList> findByScoreBetween(Integer minScore, Integer maxScore, Pageable pageable);

        Page<ToDoList> findAll(Pageable pageable);

}
