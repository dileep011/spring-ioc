package com.jsp.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;
import com.jsp.util.Config;

public class SaveHospital {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		Hospital hospital=(Hospital)applicationContext.getBean("hospital");
		hospital.setId(scan.nextInt());
		hospital.sethName(scan.next());
		hospital.setLocation(scan.next());
		hospital.setMobileNo(scan.nextInt());
		hospital.setWebSite(scan.next());
		HospitalService hs=applicationContext.getBean(HospitalService.class);
		Hospital hospital2=hs.saveHospital(hospital);
		if(hospital2!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("data not saved");
		}
	}

}
