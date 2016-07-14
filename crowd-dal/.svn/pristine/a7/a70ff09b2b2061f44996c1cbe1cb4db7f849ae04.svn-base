package com.code.dao.user;

import com.code.entity.user.WebUserBank;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by 高雄辉 on 17/05/2016.18:23
 *
 * @description
 */
public interface WebUserBankDao extends PagingAndSortingRepository<WebUserBank,Long>,JpaSpecificationExecutor<WebUserBank>{

    public List<WebUserBank> findByUserIdAndStatus(long userId,int status);

}
