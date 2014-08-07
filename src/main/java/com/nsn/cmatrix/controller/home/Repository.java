package com.nsn.cmatrix.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nsn.cmatrix.controller.BaseController;

@Controller
@RequestMapping("/repository")
public class Repository extends BaseController
{
	/**
	 * 
	 * @param userName
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list (String userName, ModelMap model) 
	{
		model.addAttribute("module", "repo");
		return "/app/home/repository/list";
	}
}
