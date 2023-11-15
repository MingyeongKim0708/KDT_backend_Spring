package com.multi.mvc05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping("movie")
	public void movie(MovieVO vo, Model model) {
		model.addAttribute("vo", vo);
	}
	
	//vo를 안쓸 경우
	/*
	 * @RequestMapping("movie")
	 * public void movie(String title, int price) {
	 * model.addAttribute("title", title);
	 * model.addAttribute("price", price); }
	 */

}
