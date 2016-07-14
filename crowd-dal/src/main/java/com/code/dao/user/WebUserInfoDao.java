package com.code.dao.user;

import com.code.entity.user.WebUserInfo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by 高雄辉 on 17/05/2016.18:39
 *
 * @description
 */
public interface WebUserInfoDao extends PagingAndSortingRepository<WebUserInfo,Long>,JpaSpecificationExecutor<WebUserInfo> {

    @Query("select a from WebUserInfo a where a.userId=:userId")
    public WebUserInfo findByUserId(@Param(value="userId")long  userId);

    @Query(" select a from WebUserInfo a where a.userId =:userId ")
	public WebUserInfo get(@Param("userId")long userId);

    @Modifying(clearAutomatically = true) 
	@Query("update WebUserInfo a set a.nickName =:nickName where a.id =:id")  
	public void updateNickName(@Param("id")long id,@Param("nickName")String nickName);

    @Modifying(clearAutomatically = true) 
	@Query("update WebUserInfo a set a.idCard =:idCard,a.realName =:realName where a.id =:id")  
	public void updateRealNameStatus(@Param("idCard")String idCard,@Param("realName")String realName,@Param("id")long id);
}
