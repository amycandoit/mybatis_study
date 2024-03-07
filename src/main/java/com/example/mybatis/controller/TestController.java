package com.example.mybatis.controller;

import com.example.mybatis.model.TestDTO;
import com.example.mybatis.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//클라이언트의 요청을 받고, 해당 요청에 대한 적절한 서비스를 호출하여 응답을 구성. 보통 라우팅과 관련된 로직을 담당
@RestController // Restful
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final TestService testService;
@GetMapping
    public List<TestDTO> getAll() {
        return testService.getAll();
    }
}
