package com.multi.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //표시 --> 어노테이션
public class MemoController {
	
	@Autowired
	MemoDAO dao;
	
	@RequestMapping("insert.memo")
	public String insert(MemoVO vo) {
		System.out.println("컨트롤러가 받은 vo >> " + vo);
		dao.insert(vo);
		return "redirect:mongo_memo.jsp";
	}
	
	@RequestMapping("list.memo")
	public void list(Model model) {
		List<MemoVO> list = dao.list();
		model.addAttribute("list", list);
		System.out.println(list);
	}
}
