package com.cafe.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cafe.dto.Cart;


@Repository
public class CartDaoImple implements CartDao {

	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public List<Cart> selectAll(int userId) {
		List<Cart> list = ht.execute(new HibernateCallback<List<Cart>>() {

			@Override
			public List<Cart> doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Cart where userId=?");
				q.setInteger(0, userId);
				List<Cart> li = q.list();
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
		});
		return list;
	}

	@Override
	public void insertItem(Cart cart) {
		ht.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				System.out.println(cart);
				session.save(cart);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	@Override
	public boolean deleteRecord(int orderId) {
		boolean flag = ht.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) {
				try {
					Transaction tr = session.beginTransaction();
					SQLQuery q = session.createSQLQuery("delete from cart where order_id = ?");
					q.setInteger(0, orderId);
					System.out.println("Inside cart dao");
					int row = q.executeUpdate();
					tr.commit();
					session.flush();
					session.close();
					if(row > 0)
						return true;
				}
				catch(HibernateException h) {
					session.flush();
					session.close();
					return false;
				}
				return false;
			}
		});
		return flag;
	}

	@Override
	public boolean deleteUserRecords(int userId) {
		boolean flag = ht.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				Transaction tr = session.beginTransaction();
				try {
					SQLQuery q = session.createSQLQuery("delete from cart where user_id = ?");
					q.setInteger(0, userId);
					int row = q.executeUpdate();
					tr.commit();
					session.flush();
					session.close();
					if(row > 0)
						return true;
					return false;
				}
				catch(HibernateException e) {
					session.flush();
					session.close();
				}
				catch (Exception e) {
					session.flush();
					session.close();
				}
				return false;
			}
		});
		return flag;
	}

	@Override
	public boolean updateCart(Cart cart) {
		boolean flag = ht.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session){
				// TODO Auto-generated method stub
				Transaction tr = session.beginTransaction();
				try {
					session.update(cart);
					tr.commit();
					session.flush();
					session.close();
					return true;
				}
				catch(HibernateException e) {

					session.flush();
					session.close();
				}
				catch (Exception e) {
					// TODO: handle exception
					session.flush();
					session.close();
				}
				return false;
			}
		});
		return flag;
	}

	@Override
	public Cart getRecord(int itemId, int userId) {
		Cart cart = ht.execute(new HibernateCallback<Cart>() {

			@Override
			public Cart doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				try {
					Query q = session.createQuery("from Cart where userId = ? and itemId = ?");
					q.setInteger(0, userId);
					q.setInteger(1, itemId);
					List<Cart> list = (List<Cart>)q.list();
					session.flush();
					session.close();
					return list.get(0);
					
				}
				catch(HibernateException e) {
					session.flush();
					session.close();
				}
				catch (Exception e) {
					// TODO: handle exception
					session.flush();
					session.close();
				}
				return null;
			}
		});
		
		
		return cart;
	}

	
	
	
	
	

}
