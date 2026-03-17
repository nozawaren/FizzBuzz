package com.example.domain.fizzbuzz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FizzBuzzs;
import com.example.domain.fizzbuzz.model.MFizzbuzz;
import com.example.domain.fizzbuzz.model.MResult;
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
		mapper.clear();
	}

	@Override
	public void setNumber(int number) {
		mapper.insertHistory(number);
	}

	@Override
	public List<MResult> getResult() {
		return mapper.selectResult();
	}


	@Override
	public List<MFizzbuzz> getHistory() {

		int hiscnt = mapper.historyCount();
		int strSet = -1;
		if(hiscnt > FizzBuzzs.HISTORY) {
			strSet = hiscnt-FizzBuzzs.HISTORY;
		}
		
		return mapper.findHistory(strSet);
	}

}
