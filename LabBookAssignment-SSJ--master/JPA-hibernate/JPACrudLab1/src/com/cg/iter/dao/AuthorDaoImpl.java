package com.cg.iter.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.iter.Author;

public class AuthorDaoImpl implements AuthorDao{

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager manager = factory.createEntityManager();
	

	@Override
	public boolean addAuthor(Application author) {
		try {
			manager.getTransaction().begin();
			manager.persist(author);
			manager.getTransaction().commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteAuthor(Application author) {
		try {
			manager.remove(author);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	@Override
	public Application updateAuthor(Application author) {
		try {
			Application temp = findAuthor(author.getAuthorId());
			temp.setFirstName(author.getFirstName());
			temp.setLastName(author.getLastName());
			temp.setMiddleName(author.getMiddleName());
			temp.setPhoneNo(author.getPhoneNo());
			return temp;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	
	@Override
	public Application findAuthor(Integer id) {
		return manager.find(Application.class, id);
	}

}