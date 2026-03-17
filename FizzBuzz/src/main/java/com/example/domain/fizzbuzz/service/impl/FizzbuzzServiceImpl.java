package com.example.domain.fizzbuzz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.fizzbuzz.service.FizzbuzzService;
import com.example.repository.FizzbuzzMapper;

@Service
public class FizzbuzzServiceImpl implements FizzbuzzService{

	@Autowired
	private FizzbuzzMapper mapper;
	@Override
	public void setResult(int resultNum, String fizzbuzzResult) {
		mapper.insertResult(resultNum, fizzbuzzResult);
	}

	@Override
	public void delResult() {
		mapper.delResult();
	}

	@Override
	public void setNumber(int number) {
		mapper.insertHistory(number);
	}

}
