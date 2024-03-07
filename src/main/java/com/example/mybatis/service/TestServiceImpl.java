package com.example.mybatis.service;

import com.example.mybatis.mapper.TestMapper;
import com.example.mybatis.model.TestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//비즈니스 로직을 담당하는 인터페이스와 해당 인터페이스의 구현체를 정의.
@Service
@Transactional
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{
    private final TestMapper testMapper;

    public List<TestDTO> getAll() {
        return testMapper.getAll();
    }
}
