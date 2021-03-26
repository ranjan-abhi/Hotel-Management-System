package com.example.restaurant.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.restaurant.model.Cab;
import com.example.restaurant.model.CabAdmin;
import com.example.restaurant.util.HibernateUtil;

public class CabAdminDao {

static SessionFactory sessionFactory = null;
	
	public void save(CabAdmin CabAdmin) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(CabAdmin);
		session.getTransaction().commit();
		session.close();
	}
	public void update(CabAdmin CabAdmin) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(CabAdmin);
		session.getTransaction().commit();
		session.close();
	}
	public void delete_acc(CabAdmin CabAdmin) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(CabAdmin);
		session.getTransaction().commit();
		session.close();	
	}
	public void delete(int id, String uname) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		CabAdmin CabAdmin = (CabAdmin) session.get(CabAdmin.class, uname);
		Cab cab = (Cab) session.get(Cab.class, id);
		CabAdmin.getCabs().remove(cab);
		session.update(cab);
		session.getTransaction().commit();
		session.close();
	}
	
	public boolean authenticate(String uname, String upwd) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		boolean userFound = false;
		String SQL_QUERY =" from CabAdmin as o where o.username=?0 and o.password=?1";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,uname);
		query.setParameter(1,upwd);
		List list = query.list();
		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}
		session.close();
		return userFound;           
	}
	
	public CabAdmin fetchByName(String uname) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		CabAdmin CabAdmin = (CabAdmin) session.load(CabAdmin.class, uname);
		session.close();
		return CabAdmin;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<CabAdmin> fetchAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<CabAdmin> CabAdmins = session.createQuery("FROM CabAdmin").list();
		session.close();
		System.out.println("CabAdmin_List....."+CabAdmins);
		return CabAdmins;
	}
	
	public void save_cab(Cab cab, String uname) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		CabAdmin CabAdmin = (CabAdmin) session.load(CabAdmin.class, uname);
		System.out.println("CabAdmin DETAILS " + CabAdmin.getFirstname());
		CabAdmin.getCabs().add(cab);
		session.update(CabAdmin);
		session.getTransaction().commit();
		session.close();
}

}
