package com.toast.cracker.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.toast.cracker.dao.PlanDAO;
import com.toast.cracker.vo.PlanVO;

@Service
public class PlanServiceImpl implements PlanService {
	
	@Inject
	private PlanDAO planDAO;

	@Override
	public List<PlanVO> selectUserId() throws Exception {
		
		return planDAO.selectUserId();
	}

}
