package com.example.domain.fizzbuzz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FizzBuzzs;
import com.example.domain.fizzbuzz.service.FizzbuzzService;
import com.example.domain.fizzbuzz.service.JudgeService;

@Service
public class JudgeServiceImpl implements JudgeService{
	@Autowired
	private FizzbuzzService fizzbuzzService;
	@Override
	public void judge(int number) {
		//結果テーブル初期化
		fizzbuzzService.delResult();
		int endNum = number + 100;
		String result = "";
		for(int i=number ; i <= endNum ;i++) {
			result = "";
			if((i % FizzBuzzs.FIZZBUZZ_NUM) == 0) {
				result = FizzBuzzs.FIZZBUZZ;
			}else if((i % FizzBuzzs.FIZZ_NUM) == 0){
				result = FizzBuzzs.FIZZ;
			}else if((i % FizzBuzzs.BUZZ_NUM) == 0){
				result = FizzBuzzs.BUZZ;
			}
			//結果テーブルに登録
			fizzbuzzService.setResult(i, result);
		}
	}
	

}
