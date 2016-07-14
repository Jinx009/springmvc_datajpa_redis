package com.code.dao.user;

import com.code.entity.user.WebUserStatus;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by 高雄辉 on 2016-05-1815:24:33
 *
 * @description
 */
public interface WebUserStatusDao extends PagingAndSortingRepository<WebUserStatus,Long>,JpaSpecificationExecutor<WebUserStatus> {

	@Query(" select a from WebUserStatus a where a.userId =:userId ")
	public WebUserStatus findByUserId(@Param("userId")Long userId);

    @Modifying(clearAutomatically = true) 
	@Query("update WebUserStatus a set a.investorStatus =1 where a.userId =:id")  
	public void updateInvestorStatus(@Param("id")Long id);
	
}