package com.kkc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kkc.entities.InsuranceEntity;
import com.kkc.entities.VehicleInsuranceEntity;
import com.kkc.repositories.InsuranceRepository;
import com.kkc.repositories.VehicleInsuranceRepository;

public class InsertCustomerMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		InsuranceRepository insuranceRepository = (InsuranceRepository) ctx.getBean("insuranceRepository");

		InsuranceEntity insuranceentity = new InsuranceEntity();
		insuranceentity.setName("John Kc");
		insuranceentity.setEmail("john.kc95@gmail.com");
		insuranceentity.setPhno(2002203541l);
		insuranceRepository.save(insuranceentity);
		
		

		VehicleInsuranceRepository vir = (VehicleInsuranceRepository) ctx.getBean("vehicleInsuranceRepository");

		VehicleInsuranceEntity vie = new VehicleInsuranceEntity();
		vie.setName("Kishor Kunwar");
		vie.setEmail("ntbutwal@gmail.com");
		vie.setMake("Toyota");
		vie.setModel("Camry");
		vie.setType("Full-Coverage");
		vie.setYear(2017);
		vir.saveInDatabase(vie);

	}

}
