package com.beyondtech.tvpss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/")
	public String home() {
		return "form-contoh";
	}

}
