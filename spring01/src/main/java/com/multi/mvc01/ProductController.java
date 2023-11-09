package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("insert3")
	public String insert3(ProductDTO dto, Model model) {
		//1.받아서 dto에 넣기
		//2.dao 이용해서 db처리
		ProductDAO dao = new ProductDAO();
		int result = dao.insert(dto);
		//3.결과를 jsp로 만들어서 실행 후 html 코드를 브라우저에 전달
		
		//controller의 결과를 views/insert3.jsp에서 사용하고 싶을 때
		model.addAttribute("result", result); // views까지만 가고 없어짐
		if(result == 1) {
			return "insert3"; //views아래 파일을 지정할 때는 파일명만
		}else {
			return "redirect:product.jsp"; // redirect할 때는 클라이언트에게 요청하도록 지시(webapp아래)
			//redirect해서 jsp호출할 때는 파일명.jsp까지 쓰기
		}
	}
	
	@RequestMapping("update3")
	public String update3(ProductDTO dto, Model model) {
		ProductDAO dao = new ProductDAO();
		int result = dao.update(dto);
		
		model.addAttribute("result", result); // views까지만 가고 없어짐
		//result 는 Object. int-->Object
		//꺼낼때는 imt <-- Object
		if(result == 1) {
			return "update3"; //views아래 파일을 지정할 때는 파일명만
		}else {
			return "redirect:product.jsp"; // redirect할 때는 클라이언트에게 요청하도록 지시(webapp아래)
			//redirect해서 jsp호출할 때는 파일명.jsp까지 쓰기
		}
		
	}
	
		
}
