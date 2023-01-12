package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDAO;
import com.example.domain.UserVO;

@RestController
@RequestMapping("/api/user")
public class UserRestController {
	
	@Autowired
	UserDAO udao;
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public void insert(UserVO vo) {
		udao.create(vo);
	}

}
