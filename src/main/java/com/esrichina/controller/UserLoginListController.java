package com.esrichina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esrichina.entity.UserLoginList;
import com.esrichina.service.UserLoginListService;
import com.esrichina.util.Common;
import com.esrichina.util.PageView;

/**
 * 
 * @author esrichina
 * 2013-11-19
 * @Email: mmm333zzz520@163.com
 * @version 1.0v
 */
@Controller
@RequestMapping(value="/background/userLoginList/")
public class UserLoginListController {
	@Autowired
	private UserLoginListService userLoginListService;
	
	/**
	 * 查询客户登陆信息
	 * @param model
	 * @param userLoginList
	 * @param pageNow
	 * @return
	 */
	@RequestMapping(value="query")
	public String queryUserLogin(Model model, UserLoginList userLoginList, String pageNow){
		PageView pageView = null;
		if(Common.isEmpty(pageNow)){
			pageView = new PageView(1);
		}else{
			pageView = new PageView(Integer.parseInt(pageNow));
		}
		userLoginListService.query(pageView, userLoginList);
		model.addAttribute("pageView", pageView);
		return "/background/userLoginList/loginList";
	}

}
