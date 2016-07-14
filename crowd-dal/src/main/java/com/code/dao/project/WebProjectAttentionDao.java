package com.code.dao.project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.code.entity.project.WebProjectAttention;


public interface WebProjectAttentionDao extends PagingAndSortingRepository<WebProjectAttention,Long>,JpaSpecificationExecutor<WebProjectAttention> {

	@Query(" select a from WebProjectAttention a where a.projectId =:id ")
	public  List<WebProjectAttention> findByProjectId(@Param("id")long id);

	@Query(" select a from WebProjectAttention a where webUser.id =:userId and projectId =:id ")
	public WebProjectAttention findByUserAndPro(@Param("userId")Long userId,@Param("id")Long id);

	@Modifying(clearAutomatically = true) 
	@Query(" update WebProjectAttention a set a.status = 0 where a.id =:id ")
	public void updateStatus(@Param("id")Long id);
	
	@Modifying(clearAutomatically = true) 
	@Query(" update WebProjectAttention a set a.status = 1 where a.id =:id ")
	public void saveStatus(@Param("id")Long id);

}
