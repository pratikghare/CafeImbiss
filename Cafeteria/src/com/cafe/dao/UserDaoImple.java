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

import com.cafe.dto.User;

@Repository
public class UserDaoImple implements UserDao {

	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public void addUser(User user) {
		ht.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(user);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}

	@Override
	public boolean findUser(User user) {
		// TODO Auto-generated method stub
		boolean b = ht.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				try {
					Transaction tr = session.beginTransaction();
					Query q = session.createQuery("from User where userEmail = ? and userPass = ?");
					q.setString(0, user.getUserEmail());
					q.setString(1, user.getUserPass());
					boolean check = !(q.list().isEmpty());
					user.setUserId(((User)q.list().get(0)).getUserId());
					user.setUserName(((User)q.list().get(0)).getUserName());
					user.setProfilePic(((User)q.list().get(0)).getProfilePic());
					tr.commit();
					session.flush();
					session.close();
					return check;
				}
				catch(HibernateException e) {
					session.flush();
					session.close();
				}
				catch(Exception e) {
					session.flush();
					session.close();
				}
				return false;
			}
		});
		return b;
	}

	@Override
	public User findUser(int userId) {
		User user = ht.execute(new HibernateCallback<User>() {

			@Override
			public User doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				User user = (User) session.get(User.class, userId);
				
				session.close();
				return user;
			}
		});
		return user;
	}

	@Override
	public void updateUser(User user) {
		ht.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				System.out.println("DAO Called");
				Transaction tr = session.beginTransaction();
				session.update(user);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	@Override
	public void deleteUser(User user) {
		ht.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				System.out.println("Inside delete");
				//User myUser = (User)session.get(User.class, user.getUserId());
				session.delete(user);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	@Override
	public String forgotPassword(String userEmail) {
		String password = ht.execute(new HibernateCallback<String>() {

			@Override
			public String doInHibernate(Session session) {
				try {
					Transaction tr = session.beginTransaction();
					Query q = session.createQuery("from User where userEmail = ?");
					q.setString(0, userEmail);
					List<User> li = q.list();
					int id= 0;
					if(!li.isEmpty())
						id = li.get(0).getUserId();
					tr.commit();
					session.flush();
					session.close();
					if(id!=0) {
					String link = "http://localhost:8080/Cafeteria/changePassForm.htm?userEmail="+id;
					return link;
					}
					return null;
				}
				catch(HibernateException e) {
					session.flush();
					session.close();
				}
				catch(Exception e) {
					session.flush();
					session.close();
				}
				return null;
			}
			
		});
		return password;
	}

	@Override
	public boolean changePassword(int userId, String pass) {
		boolean flag = ht.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) {
				Transaction tr = session.beginTransaction();
				try {
					SQLQuery q = session.createSQLQuery("update user set user_pass = ? where user_id = ?");
					q.setString(0, pass);
					q.setInteger(1, userId);
					int i = q.executeUpdate();
					tr.commit();
					session.flush();
					session.close();
					return true;
				}
				catch(HibernateException e) {
					tr.commit();
					session.flush();
					session.close();
				}
				catch(Exception e) {
					tr.commit();
					session.flush();
					session.close();
				}
				return false;
			}
		});
		return flag;
	}
	
	
	@Override
	public void uploadImage(String profilePic,int userId) {
		ht.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				User user = (User)session.get(User.class, userId);
				user.setProfilePic(profilePic); 
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

}
