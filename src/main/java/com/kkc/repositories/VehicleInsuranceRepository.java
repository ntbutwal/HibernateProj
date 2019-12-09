package com.kkc.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.kkc.entities.VehicleInsuranceEntity;

public class VehicleInsuranceRepository {
	
	private SessionFactory sessfactory;
	
	public void saveInDatabase(VehicleInsuranceEntity vie) {
		Session session= sessfactory.openSession();
		session.beginTransaction();
		session.persist(vie);
		session.getTransaction().commit();
		session.close();
	}

	public SessionFactory getSessfactory() {
		return sessfactory;
	}

	public void setSessfactory(SessionFactory sessfactory) {
		this.sessfactory = sessfactory;
	}
	
	
	

}
