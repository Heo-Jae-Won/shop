package com.example.dao;

import com.example.domain.UserVO;

public interface UserDAO {
	public void create(UserVO vo);
	public void delete(String id);
	public UserVO read(String id);
	public void update(UserVO vo);
	public String getTime();
}
