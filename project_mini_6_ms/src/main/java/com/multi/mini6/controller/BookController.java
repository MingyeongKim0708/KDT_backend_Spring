package com.multi.mini6.controller;

import com.multi.mini6.dao.BookDAO;
import com.multi.mini6.vo.BookVO;
import com.multi.mini6.vo.PageVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller

@RequestMapping("/book")
public class BookController {

	@Autowired
    private BookDAO bookDAO;

    @GetMapping("/book")
    public void book(Model model) { // JSP 뷰 이름 반환
        List<BookVO> AllBooks = bookDAO.getAllBooks();

        model.addAttribute("AllBooks", AllBooks);
    }

    @GetMapping("/books")
    public void getBooks(Model model,
                           PageVO pageVO,
                           @RequestParam(defaultValue = "1") int page,
                           @RequestParam(defaultValue = "3") int pageSize) {

        // 전체 아이템 수 (예: 전체 책의 수)
        int totalItemCount = bookDAO.getBookCount();

        pageVO.setStartEnd();//start, end계산해주는 메서드
        System.out.println(pageVO);

        // PageVO 객체 생성
        pageVO = new PageVO(page, pageSize, totalItemCount);

        // 페이징 처리된 책 목록 가져오기
        List<BookVO> books = bookDAO.getPagedBooks(pageVO);

        //전체 페이지 수
        int totalPages = pageVO.getTotalPages();

        //전체 게시글 수
        int count = bookDAO.getBookCount(); //전체게시물 수
        
        
        //log.info("books: " + books);
        // 모델에 데이터 추가
        model.addAttribute("books", books);
        model.addAttribute("pageVO", pageVO);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("count", count);

    }


    @GetMapping("/getBookByISBN")
    @ResponseBody
    public ResponseEntity<BookVO> getBookByISBN(String bookISBN) {
        BookVO bookDto = bookDAO.getBookByISBN(bookISBN);
        return ResponseEntity.ok(bookDto);
    }

    @GetMapping("/getBookByName")
    @ResponseBody
    public ResponseEntity<BookVO> getBookByName(String bookName) {
        BookVO bookDto = bookDAO.getBookByName(bookName);
        return ResponseEntity.ok(bookDto);
    }

    @GetMapping("/getAllBooks")
    @ResponseBody
    public ResponseEntity<List<BookVO>> getAllBooks() {
        //log.info("getAllBooks() 호출됨");

        List<BookVO> bookDtoList = bookDAO.getAllBooks();
        return ResponseEntity.ok(bookDtoList);
    }

    @GetMapping("/getBookByAll")
    @ResponseBody
    public ResponseEntity<List<BookVO>> getBookByAll(String AllBookThing) {
        List<BookVO> bookDtoList = bookDAO.getBookByAll(AllBookThing);
        return ResponseEntity.ok(bookDtoList);
    }

//    @PostMapping("/addBook")
//    @ResponseBody
//    public ResponseEntity<String> addBook(BookVO bookDto) {
//        int result = bookDAO.addBook(bookDto);
//        if (result == 1) {
//            return ResponseEntity.ok("success");
//        } else {
//            return ResponseEntity.badRequest().body("fail");
//        }
//    }
//
//    @PostMapping("/updateBook")
//    @ResponseBody
//    public ResponseEntity<String> updateBook(BookVO bookDto) {
//        int result = bookDAO.updateBook(bookDto);
//        if (result == 1) {
//            return ResponseEntity.ok("success");
//        } else {
//            return ResponseEntity.badRequest().body("fail");
//        }
//    }
//
//    @PostMapping("/deleteBook")
//    @ResponseBody
//    public ResponseEntity<String> deleteBook(String bookISBN) {
//        int result = bookDAO.deleteBook(bookISBN);
//        if (result == 1) {
//            return ResponseEntity.ok("success");
//        } else {
//            return ResponseEntity.badRequest().body("fail");
//        }
//    }



}
