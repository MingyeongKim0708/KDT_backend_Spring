package com.multi.mvc03;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(MovieDTO dto) {
		return my.insert("movie.create", dto); //mapper namespace="book". 파일 id명
	}
	
	public int update(MovieDTO dto) {
		return my.update("movie.update", dto);
	}
	
	public int delete(String id) {
		return my.delete("movie.delete", id);
	}
	
	public List<MovieDTO> list() {
		return my.selectList("movie.list");
	}
	
	public MovieDTO one(String id) {
		return my.selectOne("movie.one", id); //MovieDTO(bag) - db table 1 row --> DTO
	}
}
