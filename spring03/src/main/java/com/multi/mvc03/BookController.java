package com.multi.mvc03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@Autowired
	BookDAO dao;
	
	@RequestMapping("insert")
	public String insert(BookDTO dto) {
		int result = dao.insert(dto);
		if(result==1) {
			return "insert"; //views로 이동
		}else {
			return "redirect:index.jsp";
		}
	}
	
	@RequestMapping("update")
	public String update(BookDTO dto) {
		int result= dao.update(dto);
		if(result == 1) {
			return "update";
		}else {
			return "redirect:index.jsp";
		}
	}
	
	@RequestMapping("delete")
	public String delete(String id) {
		int result= dao.delete(id);
		if(result == 1) {
			return "delete";
		}else {
			return "redirect:index.jsp";
		}
	}
	
	@RequestMapping("one")
	public void one(String id, Model model) {
		BookDTO dto = dao.one(id);
		//views/one.jsp로 dto 보내서 출력 필요 ==> model 객체 필요
		model.addAttribute("dto", dto);
			
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		List<BookDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	//요청하나당 함수하나
}
