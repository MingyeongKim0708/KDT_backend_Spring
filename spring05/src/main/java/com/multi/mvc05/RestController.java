package com.multi.mvc05;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

	@RequestMapping("string")
	@ResponseBody // controller에서 data를 리턴할 때! ==> views를 만들필요가 없음.
	public String name() {
		return "winner";
	}

	@RequestMapping("json1")
	@ResponseBody
	public BbsDTO json1() {
		BbsDTO dto = new BbsDTO();
		dto.setId(1);
		dto.setTitle("win");
		dto.setContent("win!win!");
		dto.setWriter("apple");
		return dto;
	}

	@RequestMapping("json2")
	@ResponseBody //list<dto> --> array[json,json]
	public ArrayList<BbsDTO> json2() {
		ArrayList<BbsDTO> list = new ArrayList<BbsDTO>();
		for (int i = 0; i < 5; i++) {
			BbsDTO dto = new BbsDTO();
			dto.setId(i);
			dto.setTitle("win" + i);
			dto.setContent("win!win!" + i);
			dto.setWriter("apple");
			list.add(dto);
		}
		return list;
	}

}
