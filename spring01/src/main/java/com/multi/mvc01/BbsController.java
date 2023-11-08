package com.multi.mvc01;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	//요청하나당 함수하나
	@RequestMapping("insert2")
	public void insert2(BbsDTO2 bag, Model model) {
		System.out.println(bag);
		//db처리 --> views/insert2.jsp결과 출력
		BbsDAO dao = new BbsDAO();//????????
     	int result = dao.insert(bag);//1
     	System.out.println(result);
     	//result는 views/아래까지 가지고 가야하는 속성값이야 설정!
     	//views까지 데이터를 넘길 수 있는 객체 필요(Model)
     	//함수(Model model) 써놓으면 스프링이 model 객체를 만들어서 넣어준다.
     	model.addAttribute("result", result);
	}
	
	@RequestMapping("update2") //return으로 넘어가므로 update2.jsp는 사용하지 않음
	public String update2(BbsDTO2 bag) {
		BbsDAO dao = new BbsDAO();
		int result = dao.update(bag);
		//views에 update2.jsp 만들기
		if(result == 1) {
			return "redirect:bbs.jsp"; //서버가 브라우저에게 명령 ==> redirect를 쓸때는 jsp까지 써야함
		}else {
			return "no"; //vies.no.jsp
		}
	}
	
	@RequestMapping("delete2")
	public void delete2(BbsDTO2 bag, Model model) {
		//bag에 넣고
		//dao를 이용해서 db처리
		BbsDAO dao = new BbsDAO();
		int result = dao.delete(bag);
		//views/delete2.jsp 만들어서 결과 출력
		model.addAttribute("result", result);
		
	}
}
