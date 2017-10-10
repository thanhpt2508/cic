package com.csetech.myspringmvc.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.csetech.myspringmvc.dao.DiachinhDAO;
import com.csetech.myspringmvc.entity.Diachinh;

@Transactional
public class DiachinhImpl implements DiachinhDAO {
	 private SessionFactory sessionFactory;
	 public void setSessionFactory(SessionFactory sessionFactory) {
	      this.sessionFactory = sessionFactory;
	  }
	@SuppressWarnings("unchecked")
	public List<Diachinh> listDiachinh() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		 
	    List<Diachinh> list = session.createQuery("from Diachinh").list();
	 
	   return list;
	}
		
}
