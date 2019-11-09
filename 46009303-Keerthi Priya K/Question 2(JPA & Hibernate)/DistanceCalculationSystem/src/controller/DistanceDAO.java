package controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Distance;

public class DistanceDAO {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "EclipseLink_JPA" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      Scanner sc = new Scanner(System.in);
	      Distance dist = new Distance( ); 
	      
	      System.out.println("Enter distance Id");
	      String id = sc.next();
	      System.out.println("Enter source");
	      String source = sc.next();
	      System.out.println("Enter destination");
	      String dest = sc.next();
	      System.out.println("Enter distance in km");
	      String km = sc.next();
	     // country.setCid(1);
	     
	      dist.setDistance_id(Integer.parseInt(id));
	      dist.setSource(source);
	      dist.setDestination(dest);
	      dist.setDist_in_km(Double.parseDouble(km));
	      dist.setDist_in_miles((Double.parseDouble(km)/1.6));
	      
	      entitymanager.persist( dist );
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
	}
}
