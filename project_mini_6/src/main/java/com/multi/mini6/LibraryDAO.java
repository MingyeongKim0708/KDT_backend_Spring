package com.multi.mini6;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LibraryDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(LibraryVO vo) {
		int result = my.insert("library.insert", vo);
		return result;
	}
	
	public int update(LibraryVO vo) {
		int result = my.update("library.update", vo);
		return result;
	}
	
	public int delete(LibraryVO vo) {
		int result = my.delete("library.delete", vo);
		return result;

	}
	// 리스트 전체 보기
	public List<LibraryVO> list() throws Exception {
		List<LibraryVO> list = my.selectList("library.list");
		return list;

	}

	// 리스트 중에서 선택한 물건 하나 보기
	public LibraryVO one(LibraryVO vo) throws Exception {
		LibraryVO vo2 = my.selectOne("library.one", vo);
		return vo2;
	}
}
