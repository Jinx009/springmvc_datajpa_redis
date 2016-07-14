package com.code.dao.project;

import java.util.List;

import com.code.entity.project.WebProjectLeader;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by 高雄辉 on 2016-05-1815:24:33
 *
 * @description
 */
public interface WebProjectLeaderDao extends PagingAndSortingRepository<WebProjectLeader,Long>,JpaSpecificationExecutor<WebProjectLeader> {

	@Query(" select a from WebProjectLeader a where a.projectId =:id ")
	public List<WebProjectLeader> findByProjectId(@Param("id")Long id);

	@Query(" select  a from WebProjectLeader a where a.projectId =:id and userId =:userId and status!=1 ")
	public WebProjectLeader findByUserIdAndProjectId(@Param("id")Long id,@Param("userId")Long userId);

	@Query(" select a from WebProjectLeader a where a.projectId =:id and status =1 ")
	public WebProjectLeader findLeader(@Param("id")Long id);

}