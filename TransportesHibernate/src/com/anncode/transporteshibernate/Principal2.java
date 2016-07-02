package com.anncode.transporteshibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.anncode.transporteshibernate.camionero.Camionero;
import com.anncode.transporteshibernate.paquete.Paquete;
import com.anncode.transporteshibernate.provincia.Provincia;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory;
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		
		
		Provincia provincia = new Provincia("QR", "Queretaro");
		Camionero camionero = new Camionero("ABC123", "El camionero", "33332222", 1000, "MX");
		List<Paquete> paquetes = new ArrayList<>();
		paquetes.add(new Paquete("A001", "UNA DESC", "UN DST", "UNA DIR DEST", provincia, camionero));
		paquetes.add(new Paquete("B001", "UNA DESC", "UN DST", "UNA DIR DEST", provincia, camionero));
		paquetes.add(new Paquete("C001", "UNA DESC", "UN DST", "UNA DIR DEST", provincia, camionero));
		
		
		provincia.setPaquetes(paquetes);
		camionero.setPaquetes(paquetes);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(provincia);
		session.save(camionero);
//		session.flush();
		
		session.getTransaction().commit();
		session.close();
	}

}
