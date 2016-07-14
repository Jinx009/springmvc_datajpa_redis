package com.code.dao.project;

import java.util.List;

import com.code.entity.project.WebProjectOrder;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by 高雄辉 on 2016-05-1815:24:33
 *
 * @description
 */
public interface WebProjectOrderDao extends PagingAndSortingRepository<WebProjectOrder,Long>,JpaSpecificationExecutor<WebProjectOrder> {

	@Query(" select a from WebProjectOrder a where a.projectId =:id ")
	public List<WebProjectOrder> findByProjectId(@Param("id")Long id);

	@Query(" select a from WebProjectOrder a where a.userId =:userId ")
	public List<WebProjectOrder> findByUserId(@Param("userId")long userId);

	@Query(" select a from WebProjectOrder a where a.projectId =:id  and (a.payStatus =2 or a.payStatus =1) ")
	public List<WebProjectOrder> findUsefulByProjectId(@Param("id")Long id);

	@Query(" select count(a.id) as num from WebProjectOrder a where profitId =:id and (a.payStatus =2 or a.payStatus =1)  ")
	public int getNum(@Param("id")Long id);
}