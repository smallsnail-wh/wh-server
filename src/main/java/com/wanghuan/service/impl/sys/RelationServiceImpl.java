package com.wanghuan.service.impl.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanghuan.dao.RelationDao;
import com.wanghuan.model.sys.RelationEntity;
import com.wanghuan.service.sys.RelationService;

@Service(value = "relationServiceImpl")
public class RelationServiceImpl implements RelationService {

	@Autowired
	private RelationDao relationDao;

	@Override
	public List<RelationEntity> getRelationByUserId(int userId) {
		return relationDao.getRelationByUserId(userId);
	}

}
