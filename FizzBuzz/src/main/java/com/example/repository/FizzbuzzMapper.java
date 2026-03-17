package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.fizzbuzz.model.MFizzbuzz;
import com.example.domain.fizzbuzz.model.MResult;

@Mapper
public interface FizzbuzzMapper {
	public int insertResult(int resultNum, String fizzbuzzResult);
	public int delResult();
	public int clear();
	public int insertHistory(int number);
	public List<MResult> selectResult();
	public int historyCount();
	public List<MFizzbuzz> findHistory(int strSet);
}
