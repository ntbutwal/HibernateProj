package com.kkc.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.kkc.entities.InsuranceEntity;

public class InsuranceRepository {

	private SessionFactory sessionfactory;

	public void save(InsuranceEntity customer) {
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.persist(customer);
		session.getTransaction().commit();
		session.close();

	}
	

	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

}
