package com.example.mybatis.service;

import com.example.mybatis.model.TestDTO;

import java.util.List;
//비즈니스 로직을 담당하는 인터페이스와 해당 인터페이스의 구현체를 정의.
public interface TestService {
    public List<TestDTO> getAll();
}
