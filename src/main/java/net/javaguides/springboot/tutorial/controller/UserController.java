package net.javaguides.springboot.tutorial.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.tutorial.entity.User;
import net.javaguides.springboot.tutorial.repository.UserRepository;

@Controller
@RequestMapping("/users/")
public class UserController {

	private final UserRepository userRepository;

	@Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping("signup")
	public String showSignUpForm(User student) {
		return "user/add-user";
	}

	@GetMapping("list")
	public String showUpdateForm(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "user/user-list";
	}

	@PostMapping("add")
	public String addUser(@Valid User student, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "user/add-user";
		}

		userRepository.save(student);
		return "redirect:list";
	}

	@GetMapping("edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {
		User student = userRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
		model.addAttribute("user", student);
		return "user/update-user";
	}

	@PostMapping("update/{id}")
	public String updateStudent(@PathVariable("id") long id, @Valid User student, BindingResult result, Model model) {
		if (result.hasErrors()) {
			student.setId(id);
			return "user/update-user";
		}

		userRepository.save(student);
		model.addAttribute("users", userRepository.findAll());
		return "index";
	}

	@GetMapping("delete/{id}")
	public String deleteStudent(@PathVariable("id") long id, Model model) {
		User student = userRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
		userRepository.delete(student);
		model.addAttribute("users", userRepository.findAll());
		return "index";
	}
}
