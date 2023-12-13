package com.multi.chat;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

	@MessageMapping("/chat")
	@SendTo("/topic/messages") // 채팅방 이름 messages
	public Message send(Message message) {
		// from, text만 messages 채팅방에 가입한 브라우저로 그대로 보내고 싶은 경우
		// System.out.println("from : " + message.getFrom());
		Date date = new Date();
		message.setDate(date.getHours() + "시" + date.getMinutes() + "분");
		return message;
		// return 뒤에 있는 vo가 모두 브라우저에 도착
	}

	@MessageMapping("/chat2")
	@SendTo("/topic/messages2") // 채팅방 이름 messages2
	public Message2 send(Message2 message) {
		// from, text만 messages 채팅방에 가입한 브라우저로 그대로 보내고 싶은 경우
		// System.out.println("from : " + message.getFrom());
		String menu = "";

		switch (message.getText()) {
		case "1":
			menu = "챗 봇>>  10) 운동화		11) 모자			12) 가방";
			break;
		case "2":
			menu = "챗 봇>>  20) 배송조회	21) 주문완료상품조회";
			break;
		case "20":
			menu = "챗 봇>> DB에서 가지고 온 배송 상황 목록 \n" + "상품명: 르꼬뿌		배송상황: 물건 준비중";
			break;
		case "10":
			menu = "챗 봇>>  100) 나이커	    200) 르꼬뿌			300) 라코스또";
			break;
		case "100":
			menu = "챗 봇>>  1000) 나이커 운동화 세부 메뉴	1) 다시 처음 메뉴";
			break;
		case "1000":
			menu = "챗 봇>>  1001)나이커빨강(1만원)	1002)나이커파랑(2만원)	1003)나이커보라(3만원)	100)이전 메뉴로";
			break;
		default:
			menu = "챗 봇>>선택한 번호는 없는 메뉴입니다. 다시 입력해주세요.";
			break;
		}
		message.setMenu(menu);
		return message;
		// return 뒤에 있는 vo가 모두 브라우저에 도착
	}

	@MessageMapping("/chat3")
	@SendTo("/topic/messages3") // 채팅방이름 messages3
	public Message3 send(Message3 message) {
		// from, text만 messages채팅방에 가입한 브라우저로 그대로 보내고 싶은 경우
		String menu = "";

		switch (message.getText()) { // 1
		case "1":
			menu = "챗 봇>>  당신은 몇년생이신가요?	10)10대	20)20대 30) 30대";
			break;
		case "2":
			menu = "챗 봇>>  다음 기회에 봐요";
			break;

		case "10":
			menu = "챗 봇>> 어떤 기준으로 보고싶으신가요? 110) 인기도서    210) 신작도서";
			break;
		case "20":
			menu = "챗 봇>>  어떤 기준으로 보고싶으신가요? 120) 인기도서    220) 신작도서";
			break;
		case "30":
			menu = "챗 봇>>  어떤 기준으로 보고싶으신가요? 130) 인기도서    230) 신작도서";
			break;

		case "110":
			menu = "챗 봇>> 소설/에세이 중 하나를 골라주세요 1010) 소설   1011)에세이";
			break;
		case "210":
			menu = "챗 봇>> 소설/에세이 중 하나를 골라주세요 2010) 소설   2011)에세이";
			break;

		case "120":
			menu = "챗 봇>> 소설/에세이 중 하나를 골라주세요 1020) 소설   1021)에세이";
			break;
		case "220":
			menu = "챗 봇>> 소설/에세이 중 하나를 골라주세요 2020) 소설   2021)에세이";
			break;

		case "130":
			menu = "챗 봇>> 소설/에세이 중 하나를 골라주세요 1030) 소설   1031)에세이";
			break;
		case "230":
			menu = "챗 봇>> 소설/에세이 중 하나를 골라주세요 2030) 소설   2031)에세이";
			break;

		case "1010": // 10대 인기소설
			menu = "챗 봇>> 10대 인기 소설1 , 10대 인기 소설2 .....";
			break;
		case "1011": // 10대 인기에세이
			menu = "챗 봇>> 10대 인기 에세이1 , 10대 인기 에세이2 .....";
			break;
		case "2010": // 10대 신작 소설
			menu = "챗 봇>> 10대 신작 소설1 , 10대 신작 소설2 .....";
			break;
		case "2011": // 10대 신작 에세이
			menu = "챗 봇>> 10대 신작 에세이 , 10대 신작 에세이 .....";
			break;

		case "1020": // 20대 인기소설
			menu = "챗 봇>> 20대 인기 소설1 , 20대 인기 소설2 .....";
			break;
		case "1021": // 20대 인기에세이
			menu = "챗 봇>> 20대 인기 에세이1 , 20대 인기 에세이2 .....";
			break;
		case "2020": // 20대 신작 소설
			menu = "챗 봇>> 20대 신작 소설1 , 20대 신작 소설2 .....";
			break;
		case "2021": // 20대 신작 에세이
			menu = "챗 봇>> 20대 신작 에세이 , 20대 신작 에세이 .....";
			break;

		case "1030": // 30대 인기소설
			menu = "챗 봇>> 30대 인기 소설1 , 30대 인기 소설2 .....";
			break;
		case "1031": // 30대 인기에세이
			menu = "챗 봇>> 30대 인기 에세이1 , 30대 인기 에세이2 .....";
			break;
		case "2030": // 30대 신작 소설
			menu = "챗 봇>> 30대 신작 소설1 , 30대 신작 소설2 .....";
			break;
		case "2031": // 30대 신작 에세이
			menu = "챗 봇>> 30대 신작 에세이 , 30대 신작 에세이 .....";
			break;

		default:
			menu = "챗 봇>>선택한 번호는 없는 메뉴입니다. 다시 입력해주세요.";
			break;
		}
		message.setMenu(menu);
		return message;
		// return에 뒤에 있는vo가 가입한 브라우저에 도착

	}

}
