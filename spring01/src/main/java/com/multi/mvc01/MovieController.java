package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping("movie")
	public String movie(String movie) {
		String filename = "redirect:movie.jsp";
		if (movie.equals("드라마")) {
			filename = "drama";
		}else if (movie.equals("액션")) {
			filename = "action";
		}else if (movie.equals("코믹")) {
			filename = "comic";
		}
		return filename;
	}
}
