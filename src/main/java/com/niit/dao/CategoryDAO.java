package com.niit.dao;
import java.util.*;

import com.niit.model.Category;

public interface CategoryDAO 
{
	 public List < Category > getAllCategory();
	 public boolean save(Category c);
	 public boolean deleteById(int id);
	 public boolean update(Category c);
	 public Category getById(int cat_id);
}



