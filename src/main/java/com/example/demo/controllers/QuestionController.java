package com.example.demo.controllers;

import java.util.List;

import com.example.demo.entity.Question;
import com.example.demo.repository.QuestionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionRepository questionRepository;

    @GetMapping("/question/list")
    public String list(Model model){
        System.out.println("question list");
        List<Question> questionList = this.questionRepository.findAll();
        model.addAttribute("questionList", questionList);

        return "question_list";
    }
}
