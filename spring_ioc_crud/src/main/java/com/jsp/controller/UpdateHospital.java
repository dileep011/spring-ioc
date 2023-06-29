package com.jsp.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;
import com.jsp.util.Config;

public class UpdateHospital {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
	Hospital hospital=(Hospital)applicationContext.getBean("hospital");
	System.out.println("Enter hospital id");
	hospital.setId(scan.nextInt());
	System.out.println("Enter hospital hName");
	hospital.sethName(scan.next());
	System.out.println("Enter hospital pHone");
	hospital.setMobileNo(scan.nextInt());
	System.out.println("Enter hospital Location");
	hospital.setLocation(scan.next());
	System.out.println("Enter hospital Website");
	hospital.setWebSite(scan.next());
	HospitalService hospitalService=(HospitalService)applicationContext.getBean("hospitalService");
	Hospital hospital2=hospitalService.UpdateHospital(hospital);
	if(hospital2!=null) {
		System.out.println("data updated");
	}
	else {
		System.out.println("data not updated");
	}
	
	}
}
