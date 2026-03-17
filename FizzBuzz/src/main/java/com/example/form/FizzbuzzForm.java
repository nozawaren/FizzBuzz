package com.example.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.Data;

@Data
public class FizzbuzzForm {
	
	@Min(value = 1)
	@Max(value = 100)
	public int number;
	public String fizzbuzzResult;

}
