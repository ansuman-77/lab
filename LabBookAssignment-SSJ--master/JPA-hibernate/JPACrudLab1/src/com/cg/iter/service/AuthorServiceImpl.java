package com.cg.iter.service;

import com.cg.iter.dao.AuthorDao;
import com.cg.iter.dao.AuthorDaoImpl;
import com.cg.iter.entity.Author;

public class AuthorServiceImpl implements AuthorService {
	AuthorDao eDao;

	public AuthorServiceImpl() {
		eDao = new AuthorDaoImpl();
	}

	@Override
	public boolean saveAut(Author aut) {
		return eDao.saveAut(aut);
	}

	@Override
	public Author getAut(int id) {
		return eDao.getAut(id);
	}

	@Override
	public boolean update(Author aut) {
		return eDao.update(aut);
	}

}
