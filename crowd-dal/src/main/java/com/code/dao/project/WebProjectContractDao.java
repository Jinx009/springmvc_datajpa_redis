package com.code.dao.project;

import java.util.List;

import com.code.entity.project.WebProjectContract;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by 高雄辉 on 2016-05-1815:24:33
 *
 * @description
 */
public interface WebProjectContractDao extends PagingAndSortingRepository<WebProjectContract,Long>,JpaSpecificationExecutor<WebProjectContract> {

	@Query(" select a from WebProjectContract a where a.projectId =:id ")
	public List<WebProjectContract> findByProjectId(@Param("id")Long id);
	
}