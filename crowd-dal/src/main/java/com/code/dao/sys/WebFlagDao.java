package com.code.dao.sys;

import java.util.List;

import com.code.entity.sys.WebFlag;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by 高雄辉 on 2016-05-1815:26:18
 *
 * @description
 */
public interface WebFlagDao extends PagingAndSortingRepository<WebFlag,Long>,JpaSpecificationExecutor<WebFlag> {

	@Query(" select a from WebFlag a order by lastUpdateDate desc ")
	public List<WebFlag> getAll();

}