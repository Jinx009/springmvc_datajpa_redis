package com.code.dao.project;

import java.util.List;

import com.code.entity.project.WebProjectProfit;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by 高雄辉 on 2016-05-1815:24:33
 *
 * @description
 */
public interface WebProjectProfitDao extends PagingAndSortingRepository<WebProjectProfit,Long>,JpaSpecificationExecutor<WebProjectProfit> {

	@Query(" select a from WebProjectProfit a where a.projectId =:id ")
	public List<WebProjectProfit> findByProjectId(@Param("id")Long id);

}