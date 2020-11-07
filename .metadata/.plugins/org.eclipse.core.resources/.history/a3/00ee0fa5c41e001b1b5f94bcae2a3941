package com.cafe.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cafe.dto.Menu;

@Repository
public class MenuDaoImple implements MenuDao {

	@Autowired
	HibernateTemplate ht;
	


	@Override
	public Menu getProduct(int itemId) {
		Menu menu = ht.execute(new HibernateCallback<Menu>() {

			@Override
			public Menu doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Menu m = (Menu)session.get(Menu.class, itemId);
				tr.commit();
				session.flush();
				session.close();
				return m;
			}
		});
		return menu;
	}

}
