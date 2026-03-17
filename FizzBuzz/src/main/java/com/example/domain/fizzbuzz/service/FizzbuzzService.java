package com.example.domain.fizzbuzz.service;

import java.util.List;

import com.example.domain.fizzbuzz.model.MFizzbuzz;
import com.example.domain.fizzbuzz.model.MResult;

public interface FizzbuzzService {
	
	public void setResult(int resultNum , String fizzbuzzResult);
	
	public void delResult();
	
	public void setNumber(int number);
	
	public List<MResult> getResult();
	
	public List<MFizzbuzz> getHistory();
	

}
