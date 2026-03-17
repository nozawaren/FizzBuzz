package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.domain.fizzbuzz.model.MResult;
import com.example.domain.fizzbuzz.service.FizzbuzzService;
import com.example.form.FizzbuzzForm;


@Controller
public class ResultController {

	@Autowired
	private FizzbuzzService fizzbuzzService;
	@GetMapping("/result")
	public String getResult(Model model,@ModelAttribute FizzbuzzForm form) {
		List<MResult> result = fizzbuzzService.getResult();
		model.addAttribute("ResultForm", result);
		MResult inputNum = result.get(0);
		model.addAttribute("inputNum",inputNum.getResultNum());
		return "result/result";
		
	}

}
