package dao;

import org.apache.ibatis.session.SqlSession;

import vo.UserInfoVO;

public class UserInfoDAO {
	
	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public UserInfoVO selectOne(String id) {
		UserInfoVO vo = sqlSession.selectOne("ui.select_login",id);
		return vo;
	}

}
