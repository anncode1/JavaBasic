package com.anncode.transporteshibernate;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.anncode.transporteshibernate.camion.Camion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory;
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		//Insertar
		Camion camion = new Camion("ABC123", "toyota", "el tipo camion", 100.5);

		
		//session.save(camion); //Insertando el registro
		//
		
		//Obtener
		Camion camion2 = (Camion) session.get(Camion.class, 5);
		System.out.println("ID: " + camion.getId());
		System.out.println("MATRICULA: " + camion.getMatricula());
		System.out.println("POTENCIA: " + camion.getPotencia());
		
		List<Camion> camiones = (List<Camion>) 
				session.createCriteria(Camion.class)
				.setMaxResults(2)
				.list();
		
		int i=0;
		for (Camion camion3 : camiones) {
			i++;
			System.out.println(i + ". ID " + camion3.getId());
			System.out.println(i + ". MATRICULA " + camion3.getMatricula());
		}
		
		//Actualizar con HQL
		session.beginTransaction();
		String hql = "UPDATE Camion set matricula = :matricula WHERE id = :id ";
		Query query = session.createQuery(hql);
		query.setParameter("matricula", "TYU987");
		query.setParameter("id", 5);
		query.executeUpdate();
		session.getTransaction().commit();
		
		
		//Actualizar con objeto
		session.beginTransaction();
		Camion camion4 = (Camion) session.get(Camion.class, 6);
		camion4.setMatricula("POIU123");
		session.getTransaction().commit();
		
		
		//Eliminar con objeto 
		/*session.beginTransaction();
		Camion camion5 = (Camion) session.get(Camion.class, 4);
		session.delete(camion5);
		session.getTransaction().commit();*/
		
		//Eliminar HQL
		session.beginTransaction();
		hql = "DELETE FROM Camion WHERE id = :id";
		query = session.createQuery(hql);
		query.setParameter("id", 5);
		query.executeUpdate();
		session.getTransaction().commit();
		
		//Cerrar sesiones
		session.close();
		sessionFactory.close();
		
		
	}

}
