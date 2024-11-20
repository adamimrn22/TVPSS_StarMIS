package com.beyondtech.tvpss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/PPDAdmin/Contoh")
	public String ppd() {
		return "PPD_Admin/contoh";
	}

	@RequestMapping("/SchoolAdmin/Contoh")
	public String school() {
		return "SchoolAdmin/contoh";
	}

	@RequestMapping("/StateAdmin/Contoh")
	public String state() {
		return "StateAdmin/contoh";
	}

	@RequestMapping("/SuperAdmin/Contoh")
	public String superadmin() {
		return "SuperAdmin/contoh";
	}
}
