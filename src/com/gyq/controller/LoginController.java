package com.gyq.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gyq.dao.ManageUserBaseMapper;
import com.gyq.model.ManageUserBase;
import com.gyq.model.ManageUserBaseExample;
import com.gyq.util.SHAUtil;

@Controller
@RequestMapping("/login")
public class LoginController {
	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private ManageUserBaseMapper manageUserBaseMaper;
	
	@RequestMapping("/initLogin.do")
	public String initLogin(){
		return "login";
	}
	
	@RequestMapping("/login.do")
	@ResponseBody
	public String login(HttpServletRequest request,Model model,ManageUserBase user) throws Exception{
		
		user.setPassword(SHAUtil.shaEncode(user.getPassword()));
		ManageUserBaseExample example = new ManageUserBaseExample();
		ManageUserBaseExample.Criteria crit = example.createCriteria();
		crit.andUsernameEqualTo(user.getUsername());
		crit.andPasswordEqualTo(user.getPassword());
		List<ManageUserBase> users = manageUserBaseMaper.selectByExample(example);
		if(users.size()>0)
			return "true";
		return "false";
	}
	
	@RequestMapping("initRegister.do")
	public String initRegister(HttpServletRequest request,Model model){
		return "register";
	}
	
	@RequestMapping("register.do")
	@ResponseBody
	public String register(HttpServletRequest request,Model model,ManageUserBase user) throws Exception{
		user.setPassword(SHAUtil.shaEncode(user.getPassword()));
		int count = manageUserBaseMaper.insert(user);
		if(count==1)
			return "true";
		else
			return "false";
	}
	
	@RequestMapping("/main.do")
	public String mian(){
		return "mainpage";
	}
}
