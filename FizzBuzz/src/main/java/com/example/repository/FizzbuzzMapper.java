package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FizzbuzzMapper {
	public int insertResult(int resultNum, String fizzbuzzResult);
	public int delResult();
	public int insertHistory(int number);
}
