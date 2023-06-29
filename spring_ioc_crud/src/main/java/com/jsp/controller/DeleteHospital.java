package com.jsp.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;
import com.jsp.util.Config;

public class DeleteHospital {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		Hospital hospital=(Hospital)applicationContext.getBean("hospital");
		hospital.setId(scan.nextInt());
		HospitalService hospitalService=(HospitalService)applicationContext.getBean("hospitalService");
		Hospital hospital2=hospitalService.deleteHospital(hospital);
		if(hospital2!=null) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("data not deleted");
		}
		
	}

}
