package com.multi.mvc04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@Autowired
	BookDAO dao;
	
	@RequestMapping("insert")
	public String insert(BookDTO dto) {
		int result = dao.insert(dto);
		if(result==1) {
			return "insert";
		}else {
			return "redirect:index.jsp";
		}
	}
	
	//요청하나당 함수하나
}
