package com.example.mybatis.model;

import lombok.Getter;
import lombok.Setter;

//데이터 전송 객체 (DTO) 를 정의. 일반적으로 데이터베이스 테이블과 일치하는 구조를 갖음
@Getter
@Setter
public class TestDTO {
    private int id;
    private String testName;
}
