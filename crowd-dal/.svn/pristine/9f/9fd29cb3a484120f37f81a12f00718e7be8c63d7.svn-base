package com.code.dao.sys;

import java.util.List;

import com.code.entity.sys.WebAddress;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by 高雄辉 on 2016-05-1815:26:18
 *
 * @description
 */
public interface WebAddressDao extends PagingAndSortingRepository<WebAddress,Long>,JpaSpecificationExecutor<WebAddress> {

	@Query(" select a from WebAddress  a where a.parentId =:parentId  ")
	public List<WebAddress> findByParentId(@Param("parentId")long parentId);
	
}