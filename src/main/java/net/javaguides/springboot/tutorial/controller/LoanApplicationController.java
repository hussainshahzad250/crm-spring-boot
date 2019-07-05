package net.javaguides.springboot.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.tutorial.repository.LoanApplicationRepository;

@Controller
@RequestMapping("/loanApplication/")
public class LoanApplicationController {

	@Autowired
	private LoanApplicationRepository loanApplicationRepository;

	@Autowired
	public LoanApplicationController(LoanApplicationRepository loanApplicationRepository) {
		this.loanApplicationRepository = loanApplicationRepository;
	}

	@GetMapping("list")
	public String showApplication(Model model) {
		System.out.println("Request initiated");
		model.addAttribute("loans", loanApplicationRepository.findAll());
		return "loan/loanApplication";
	}

	@GetMapping("listing")
	public String listing(Model model) {
		System.out.println("Request initiated");
		model.addAttribute("loans", loanApplicationRepository.findAll());
		return "webui/index";
	}

}
