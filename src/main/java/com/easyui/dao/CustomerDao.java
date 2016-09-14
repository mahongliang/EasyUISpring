package com.easyui.dao;

import java.util.List;

import com.easyui.dto.PageHelper;
import com.easyui.entity.Customer;

public interface CustomerDao {
	
	public List<Customer> findAll();
	
	public void insert(Customer customer);
	
	public void deleteById(Integer id);
	
	public void update(Customer customer);

	public long getTotalRows();

	public List<Customer> findByPage(PageHelper page);

}
