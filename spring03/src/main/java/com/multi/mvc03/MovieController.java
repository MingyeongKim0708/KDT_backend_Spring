package com.multi.mvc03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@Autowired
	MovieDAO dao;
	
	@RequestMapping("insertM")
	public String insert(MovieDTO dto) {
		int result = dao.insert(dto);
		if(result==1) {
			return "insertM"; //views로 이동
		}else {
			return "redirect:index.jsp";
		}
	}
	
	@RequestMapping("updateM")
	public String update(MovieDTO dto) {
		int result= dao.update(dto);
		if(result == 1) {
			return "updateM";
		}else {
			return "redirect:index.jsp";
		}
	}
	
	@RequestMapping("deleteM")
	public String delete(String id) {
		int result= dao.delete(id);
		if(result == 1) {
			return "deleteM";
		}else {
			return "redirect:index.jsp";
		}
	}
	
	@RequestMapping("oneM")
	public void one(String id, Model model) {
		MovieDTO dto = dao.one(id);
		//views/one.jsp로 dto 보내서 출력 필요 ==> model 객체 필요
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("listM")
	public void list(Model model) {
		List<MovieDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	//요청하나당 함수하나
}
