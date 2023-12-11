package com.multi.mini6;

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
	
}
