package com.multi.test100;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {

	@Autowired
	CarDAO dao;
	
	//a tag
	@RequestMapping("list4")
	public void list4(PageVO2 pageVO2, Model model) {
		pageVO2.setStartEnd();
		//System.out.println(pageVO2);
		
		List<CarVO> list = dao.list1(pageVO2);
		
		//전체 페이지 수
		int count = dao.count();
		System.out.println("전체 게시물 수 >> " + count);
		
		int pages = count / 20;
		if (count % 20 != 0) {
			pages = count / 20 + 1;
		}
		System.out.println("페이지당 가지고 온 게시물수>> " +list.size());
		
		//views로 전달
		model.addAttribute("list", list);
		model.addAttribute("pages", pages);
		model.addAttribute("count", count);
		
	}
	
	//ajax
	@RequestMapping("list5")
	public void list5(PageVO2 pageVO2, Model model) {
		pageVO2.setStartEnd();
		System.out.println(pageVO2);
		
		List<CarVO> list = dao.list1(pageVO2);
		
		//전체 페이지 수
		int count = dao.count();
		System.out.println("전체 게시물 수 >> " + count);
		
		int pages = count / 20;
		if (count % 20 != 0) {
			pages = count / 20 + 1;
		}
		System.out.println("페이지당 가지고 온 게시물수>> " +list.size());
		
		//views로 전달
		model.addAttribute("list", list);
		model.addAttribute("pages", pages);
		model.addAttribute("count", count);
		
	}
	
	//리스트 가져오기
	@RequestMapping("list0")
	public void list0(PageVO2 pageVO2, Model model) {
		pageVO2.setStartEnd();
		System.out.println(pageVO2);
		
		List<CarVO> list = dao.list1(pageVO2);
		
		model.addAttribute("list", list);
		
	}
	
	
}
