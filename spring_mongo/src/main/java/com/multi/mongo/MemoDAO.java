package com.multi.mongo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository //db처리전담 싱글톤 만드는 표시
public class MemoDAO {

	//mongoTemplate
	@Autowired
	MongoTemplate mongo;
	
	public void insert(MemoVO vo) {
		vo.setDate(new Date());
		mongo.insert(vo, "memo");
	}
	
	public MemoVO one(String _id) {
		return mongo.findById(_id, MemoVO.class, "memo");
	}
	
	public List<MemoVO> list() {
		Query query = new Query();
		query.with(new Sort(Sort.Direction.DESC, "date"));
		return mongo.find(query, MemoVO.class, "memo");
	}
}
