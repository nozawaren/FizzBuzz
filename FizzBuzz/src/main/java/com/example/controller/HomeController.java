package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.domain.fizzbuzz.model.MFizzbuzz;
import com.example.domain.fizzbuzz.service.FizzbuzzService;
import com.example.domain.fizzbuzz.service.JudgeService;
import com.example.form.FizzbuzzForm;

@Controller
public class HomeController {
	
	@Autowired
	private JudgeService judgeService;
	@Autowired
	private FizzbuzzService fizzbuzzService;
	
	@GetMapping("/home")
	public String getHome(Model model,@ModelAttribute FizzbuzzForm form) {
		List<MFizzbuzz> history = fizzbuzzService.getHistory();
		model.addAttribute("HistoryList",history);
		model.addAttribute("FizzbuzzForm", form);
		return "home/home";
	}
	
	@PostMapping("/home")
	public String posthome(Model model,@ModelAttribute @Validated FizzbuzzForm form, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("attractionForm", form);
			return getHome(model, form);
		}
		//fizzbuzz判定/データ登録
		judgeService.judge(form.getNumber());
		//入力値登録
		fizzbuzzService.setNumber(form.getNumber());
		return "redirect:/result";
	}
}
