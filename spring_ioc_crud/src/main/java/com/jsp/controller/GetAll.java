package com.jsp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;
import com.jsp.util.Config;


public class GetAll {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		Hospital hospital=(Hospital)applicationContext.getBean("hospital");
		HospitalService hospitalService=(HospitalService)applicationContext.getBean("hospitalService");
		List<Hospital> list=hospitalService.getAllHosapital();
		if(list.size()>0) {
			for(Object o:list) {
				System.out.println(o);
			}
		}
		else {
			System.out.println("data not present in database");
		}
	}
}
