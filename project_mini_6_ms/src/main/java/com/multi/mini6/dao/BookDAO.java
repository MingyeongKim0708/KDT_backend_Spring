package com.multi.mini6.dao;

import com.multi.mini6.vo.BookVO;
import com.multi.mini6.vo.PageVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAO {

	@Autowired
	SqlSessionTemplate my;
	
	//select문
	public List<BookVO> getAllBooks() {
		return my.selectList("book.selectAll");
	}

	public BookVO getBookByISBN(String bookISBN) {
		return my.selectOne("book.selectOneByISBN", bookISBN);
	}

	public BookVO getBookByName(String bookName) {
		return my.selectOne("book.selectOneByName", bookName);
	}

	public List<BookVO> getBookByAll(String AllBookThing) {
		return my.selectList("book.searchBook", AllBookThing);
	}

	public List<BookVO> getPagedBooks(PageVO pageVO) {
		return my.selectList("book.getPagedBooks", pageVO);
	}

	public int getBookCount() {
		return my.selectOne("book.getBookCount");
	}



	//insert문
	public int addBook(BookVO bookVO) {
		return my.insert("book.insertOne", bookVO);
	}

	//update문
	public int updateBook(BookVO bookVO) {
		return my.update("book.updateOne", bookVO);
	}

	//delete문
	public int deleteBook(String bookISBN) {
		return my.delete("book.deleteOne", bookISBN);
	}

}
