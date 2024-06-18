package com.firstapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.firstapp.model.User;
import com.firstapp.utils.ActionResponse;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	SessionFactory sessionfactory;
	public ActionResponse register(User user) {
		// TODO Auto-generated method stub
		ActionResponse ar= new ActionResponse();
		try {
			Session session=sessionfactory.openSession();
			Transaction tx=session.beginTransaction();
			session.persist(user);
			tx.commit();
			ar.setAction("user_registration");
			ar.setResponse("success");
			
		}catch(Exception e) {
			System.out.println(e);
			ar.setAction("user_registration");
			ar.setResponse("failure");
		}
		return ar;
	}
	
	
	public List<User> getUsers() {
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("from User u");
		List<User> list=query.getResultList();
		return list;	}
	
}
