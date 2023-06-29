package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;
import com.jsp.util.Config;

public class GetById {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		Hospital hospital=(Hospital)applicationContext.getBean("hospital");
		hospital.setId(1);
		HospitalService hospitalService=(HospitalService)applicationContext.getBean("hospitalService");
		Hospital hospital2=hospitalService.getByIdHospital(hospital);
		if(hospital2!=null) {
			System.out.println("Hospital id----_>"+hospital2.getId());
			System.out.println("Hospital Name-- >"+hospital2.gethName());
			System.out.println("Hospital Mobile >"+hospital2.getMobileNo());
			System.out.println("Hospital loc --->"+hospital2.getLocation());
			System.out.println("Hospital Web --->"+hospital2.getWebSite());
		}
		else {
			System.out.println("plz check the id");
		}
	}
}
