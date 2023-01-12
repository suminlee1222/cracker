package com.toast.cracker.service;

import java.util.List;

import com.toast.cracker.vo.PlanVO;

public interface PlanService {
	
	public List<PlanVO> selectUserId() throws Exception;

}
