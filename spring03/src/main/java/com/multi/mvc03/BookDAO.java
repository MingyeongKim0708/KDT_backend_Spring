package com.multi.mvc03;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(BookDTO dto) {
		return my.insert("book.create", dto); //mapper namespace="book". 파일 id명
	}
	
	public int update(BookDTO dto) {
		return my.update("book.update", dto);
	}
	
	public int delete(String id) {
		return my.delete("book.delete", id);
	}
	
	public List<BookDTO> list() {
		return my.selectList("book.list");
	}
	
	public BookDTO one(String id) {
		return my.selectOne("book.one", id); //BookDTO(bag) - db table 1 row --> DTO
	}
}
