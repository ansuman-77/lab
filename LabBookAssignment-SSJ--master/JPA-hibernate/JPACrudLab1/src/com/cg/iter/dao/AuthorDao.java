package com.cg.iter.dao;

import com.cg.iter.entity.Author;

public interface AuthorDao {

		public boolean addAuthor(Application author);
		public boolean deleteAuthor(Application author);
		public Application updateAuthor(Application author);
		public Application findAuthor(Integer id);
	}