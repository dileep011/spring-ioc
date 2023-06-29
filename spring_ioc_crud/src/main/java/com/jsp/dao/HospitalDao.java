package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dto.Hospital;
@Component
public class HospitalDao {
	@Autowired
	EntityManagerFactory entityManagerFactory;	
	public Hospital saveHospital(Hospital hospital) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		if(hospital!=null) {
			entityTransaction.begin();
			entityManager.persist(hospital);
			entityTransaction.commit();
		}
		return entityManager.find(Hospital.class, hospital.getId());	
	}
	public Hospital UpdateHospital (Hospital hospital) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital1=entityManager.find(Hospital.class, hospital.getId());
		if(hospital1!=null) {
			entityTransaction.begin();
			entityManager.merge(hospital);
			entityTransaction.commit();
		}
		return hospital1;	
	}
	public Hospital deleteHospital(Hospital hospital) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital1=entityManager.find(Hospital.class, hospital.getId());
		if(hospital1!=null) {
			entityTransaction.begin();
			entityManager.remove(hospital1);
			entityTransaction.commit();
		}
		return hospital1;
	}
	public Hospital getByIdHospital(Hospital hospital) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager.find(Hospital.class, hospital.getId());
	}
	public List<Hospital> getAllHosapital(){
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select a from Hospital a");
		return query.getResultList();	
	}
}
