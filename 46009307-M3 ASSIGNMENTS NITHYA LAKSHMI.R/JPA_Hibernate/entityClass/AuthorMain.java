package com.entityClass;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AuthorMain {

	public Session getSession() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Author.class);
		return cfg.buildSessionFactory().openSession();
	}

	public void addAuthors(Author a) {
		Session s = getSession();
		Transaction trans = s.beginTransaction();
		s.persist(a);
		trans.commit();
		s.close();
		System.out.println("Records Added into the Database");
	}

	public void updateAuthor() {

		Session s = getSession();
		Transaction trans = s.beginTransaction();
		Object o = s.load(Author.class, new Integer(1));
		Author a1 = (Author) o;
		a1.setMiddleName("Albert");

		trans.commit();

		System.out.println("Update the Values into the Database");
	}

	public void deleteAuthor() {

		Session ss = getSession();
		Transaction trans = ss.beginTransaction();

		Object ob1 = ss.load(Author.class, new Integer(4));
		Author a1 = (Author) ob1;

		ss.delete(a1);
		trans.commit();
		System.out.println("Object Deleted Successfully");
		ss.close();
	}

	public static void main(String[] args) {
		AuthorMain am = new AuthorMain();
		am.updateAuthor();
		Author a1 = new Author("Michael", "-", "Jordan", 7895642);
		Author a2 = new Author("Ali", "Hakim", "Khan", 96521);
		am.addAuthors(a1);
		am.addAuthors(a2);
		am.deleteAuthor();

	}
}
