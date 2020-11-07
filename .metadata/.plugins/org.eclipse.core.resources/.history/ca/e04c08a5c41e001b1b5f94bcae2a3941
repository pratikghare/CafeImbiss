package com.cafe.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe.dao.MenuDao;
import com.cafe.dto.Menu;

@Service
public class MenuServiceImple implements MenuService {

	@Autowired
	MenuDao menuDao;
	
	@Override
	public Menu getItem(int itemId) {
		return menuDao.getProduct(itemId);
	}

}
