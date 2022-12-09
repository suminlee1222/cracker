package com.toast.cracker.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.toast.cracker.vo.PlanVO;

@Repository
public class PlanDAOImpl implements PlanDAO{

	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.toast.cracker.mybatis.sql.test";
	
	@Override
	public List<PlanVO> selectUserId() throws Exception {
	
		return sqlSession.selectList(namespace + ".selectUserId");
	}	
	
	
}
