package com.example.demo;

import java.util.List;

public interface IDAo<T, K> {

	public T save(T t);
	public T findById(K k);
	public List<T> findAll();
}
