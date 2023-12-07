package com.multi.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DictionaryController {

	@Autowired
	DictionaryService service;
	
	@RequestMapping("emotion")
	public void one(String sentence, Model model) {
		//문장에 들어있는 명사만을 추출해서
		String result = service.emotion(sentence);
		//==>  db에 넣기전 db에서 검색한 후 후처리
		//dao에게 명사를 주면서 jumsu 몽고 db에 검색해서
		//가지고 오라고 요청
		model.addAttribute("result", result);
	}

}
