package com.toast.cracker.dao;

import java.util.List;

import com.toast.cracker.vo.PlanVO;

public interface PlanDAO {
	
	public List<PlanVO> selectUserId() throws Exception; 

}
