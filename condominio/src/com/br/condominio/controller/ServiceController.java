package com.br.condominio.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sistema")
public class ServiceController  extends ServletContextEvent{

	public ServiceController(ServletContext source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

}
