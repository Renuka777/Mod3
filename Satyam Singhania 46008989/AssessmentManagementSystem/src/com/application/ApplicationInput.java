package com.application;

import java.util.Scanner;

import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class ApplicationInput {

	private static Session getSession() {
		// AnnotationConfiguration config = new AnnotationConfiguration();
		// Configuration config = new
		// Configuration().configure("hibernate.cfg.xml");
		// config.addAnnotatedClass(Application.class);
		// return config.buildSessionFactory().openSession();

		AnnotationConfiguration config = new AnnotationConfiguration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Application.class);
		return config.buildSessionFactory().openSession();
	}

	public static void addApplication(Application a) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		session.save(a);
		trans.commit();
		System.out.println("Records Added Into the Database");
		session.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Application Details: ");

		System.out.println("Enter Trainee ID: ");
		int id = sc.nextInt();

		System.out.println("Enter Trainee Name: ");
		String s1 = sc.next();

		System.out.println("Enter Module Name: ");
		String s2 = sc.next();

		System.out.println("Enter MPT marks: ");
		int m1 = sc.nextInt();

		System.out.println("Enter MTT marks: ");
		int m2 = sc.nextInt();

		System.out.println("Enter Assignment marks: ");
		int m3 = sc.nextInt();

		int totalMarks = m1 + m2 + m3;

		Application ap = new Application(id, s1, s2, m1, m2, m3, totalMarks);
		addApplication(ap);
	}
}
