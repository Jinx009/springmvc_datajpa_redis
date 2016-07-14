package com.code.dao.user;

import com.code.entity.user.WebUserAccount;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by 高雄辉 on 2016-05-1815:24:33
 *
 * @description
 */
public interface WebUserAccountDao extends PagingAndSortingRepository<WebUserAccount,Long>,JpaSpecificationExecutor<WebUserAccount> {


    @Query("select a from WebUserAccount a where a.userId=:userId")
    public WebUserAccount findByUserId(@Param("userId") long userId);
}