package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.HospitalDao;
import com.jsp.dto.Hospital;
@Component
public class HospitalService {
	@Autowired
	HospitalDao hospitalDao;
	
	public Hospital saveHospital(Hospital hospital) {
		return hospitalDao.saveHospital(hospital);
	}
	public Hospital UpdateHospital (Hospital hospital) {
		return hospitalDao.UpdateHospital(hospital);
	}
	public Hospital deleteHospital(Hospital hospital) {
		return hospitalDao.deleteHospital(hospital);
	}
	public Hospital getByIdHospital(Hospital hospital) {
		return hospitalDao.getByIdHospital(hospital);
	}
	public List<Hospital> getAllHosapital(){
		return hospitalDao.getAllHosapital();
	}

}
