package com.multi.mvc02;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(BookDTO dto) {
		return my.insert("book.create", dto);
	}
}
