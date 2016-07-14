package com.code.dao.user;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.code.entity.user.WebUser;

public interface WebUserDao extends PagingAndSortingRepository<WebUser,Long>,JpaSpecificationExecutor<WebUser>{

	@Query("select a from WebUser a where a.userName=:userName")
	public WebUser findByUserName(@Param(value="userName")String userName);

	@Query("select a from WebUser a where a.inviteCode=:inviteCode")
	public WebUser findByInviteCode(@Param(value="inviteCode")String inviteCode);

	@Query(" select a from WebUser a where a.userName =:userName and pwd =:pwd ")
	public WebUser login(@Param("userName")String userName,@Param("pwd")String pwd);
	
}
