package com.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {

	
	@Autowired
	SqlSession session;
	
	String namespace="com.example.mapper.UserMapper";

	@Override
	public void create(UserVO createVO) {
		session.insert(namespace+".create",createVO);
		
	}

	@Override
	public void delete(String id) {
		session.delete(namespace+".delete",id);
		
	}

	@Override
	public UserVO read(String id) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".read",id);
	}

	@Override
	public void update(UserVO updateVO) {
		session.delete(namespace+".delete",updateVO);
		
	}

	@Override
	public String getTime() {
		return session.selectOne(namespace+".getTime");
		
	}
	


}
