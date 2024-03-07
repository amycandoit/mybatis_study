package com.example.mybatis.mapper;

import com.example.mybatis.model.TestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//데이터베이스와의 상호작용을 담당. XML 파일과 해당 XML 파일의 매퍼 인터페이스를 포함.
@Mapper
public interface TestMapper {
    public List<TestDTO> getAll();
    //데이터를 가져오는 SQL 쿼리 실행
}
