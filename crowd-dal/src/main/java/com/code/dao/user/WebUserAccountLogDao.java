package com.code.dao.user;

import com.code.entity.user.WebUserAccountLog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by 高雄辉 on 2016-05-1815:24:33
 *
 * @description
 */
public interface WebUserAccountLogDao extends PagingAndSortingRepository<WebUserAccountLog,Long>,JpaSpecificationExecutor<WebUserAccountLog> {


    public List<WebUserAccountLog> findTop20ByUserIdAndTypeInAndIdBeforeOrderByIdDesc(long userId,String[] types,long lastId);

   public List<WebUserAccountLog> findTop20ByUserIdAndTypeInOrderByIdDesc(long userId,String[] types);


}