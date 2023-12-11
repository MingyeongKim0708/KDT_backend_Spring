package com.multi.mini6;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LibraryDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(LibraryVO vo) {
		int result = my.insert("library.insert", vo);
		return result;
	}
}
