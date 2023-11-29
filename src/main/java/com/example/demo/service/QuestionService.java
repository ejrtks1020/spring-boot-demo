package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Question;
import com.example.demo.repository.QuestionRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        return this.questionRepository.findAll();
    }
}