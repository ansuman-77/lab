package com.cg.iter.service;

import com.cg.iter.entity.Author;

public interface AuthorService {

	boolean saveAut(Author aut);

	Author getAut(int nextInt);

	boolean update(Author aut);

}