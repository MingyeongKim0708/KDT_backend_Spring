package com.multi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired
	MovieService movieService;

	@RequestMapping("movie")
	public void insert(MovieVO movieVO) {
		//전처리(service)한 다음에 db처리
		//views/movie.jsp로 이동
		movieService.insert(movieVO);
	}
}
