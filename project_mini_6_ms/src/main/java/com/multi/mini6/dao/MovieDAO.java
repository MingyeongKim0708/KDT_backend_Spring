package com.multi.mini6.dao;

import com.multi.mini6.vo.BookVO;
import com.multi.mini6.vo.Movie2VO;
import com.multi.mini6.vo.PageVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MovieDAO {

	@Autowired
	SqlSessionTemplate my;

	public void insert(Movie2VO movie2VO) {
		my.insert("movie.insert", movie2VO);
	}

	public List<Movie2VO> getPagedMovieList(PageVO pageVO) {
		Map<String, Integer> map = new HashMap<>();
		map.put("offset", pageVO.getOffset());
		map.put("pageSize", pageVO.getPageSize());
		return my.selectList("movie.getPagedMovieList", map);
	}

	public int getMovieCount() {
		return my.selectOne("movie.getMovieCount");
	}

	public Movie2VO selectMovieById(int movie_id) {
		return my.selectOne("movie.selectMovieById", movie_id);
	}
}
