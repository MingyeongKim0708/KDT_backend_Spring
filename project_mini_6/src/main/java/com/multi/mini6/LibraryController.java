package com.multi.mini6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibraryController {

	@Autowired
	LibraryDAO libraryDAO;
	
	@RequestMapping("library_insert")
	public void insert(LibraryVO libraryVO, Model model) {
		int result = libraryDAO.insert(libraryVO);
		System.out.println(result);
		model.addAttribute("result", result);
	}
	
	@RequestMapping("library_update")
	public void update(LibraryVO libraryVO, Model model) {
		int result = libraryDAO.update(libraryVO);
		System.out.println(result);
		model.addAttribute("result", result);
	}
	
	@RequestMapping("library_delete")
	public void delete(LibraryVO libraryVO, Model model) {
		int result = libraryDAO.delete(libraryVO);
		model.addAttribute("result", result);
		
	}
	
	@RequestMapping("library_one")
	public void one(LibraryVO libraryVO, Model model) throws Exception {
		//System.out.println(libraryVO);
		LibraryVO bag = libraryDAO.one(libraryVO);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("library_list")
	public void list(Model model) throws Exception {
		List<LibraryVO> list = libraryDAO.list();
		//System.out.println(list.size());
		model.addAttribute("list", list);
		
	}
}
