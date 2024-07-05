package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Envios;

@Repository
public class EnviosDAOlmpl implements EnviosDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Envios> findAll() {
		//TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Autor",Envios.class).getResultList();
		
	}
	
	@Override
	public Envios findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Envios envios) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Envios envios) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

}
