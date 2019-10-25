package com.ans.conan.spring.mvc.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ans.conan.spring.jdbcTemplate.bean.UserInfo;
import com.ans.conan.spring.mvc.service.RegisterService;

@Controller
public class RegisterController {
	
	@Resource
	private RegisterService registerService;
	
	@RequestMapping(value="/register",method=RequestMethod.GET,params="new")
	public String listAllRegisterOptions(Map<String,Object> model) {
		model.put("userInfo", new UserInfo());
		return "register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String listAllRegisterOptions2(Map<String,Object> model) {
		model.put("userInfo", new UserInfo());
		return "register";
	}
	
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public String register(
			@Valid UserInfo userInfo,
			BindingResult bindingResult,
			@RequestParam(value = "photo", required = false) MultipartFile photo,
			 Model model) {
		if (bindingResult.hasErrors()) {
			return "register";
		}
		if (registerService.validateTheFileType(photo)) {
			userInfo.setPhotoPath(registerService.storePhoto(photo));
		}
		registerService.saveUserInfo(userInfo);	
		model.addAttribute("message",
				"Register Successful, Please try to login.");
		return "redirect:login";
	}
	
}
