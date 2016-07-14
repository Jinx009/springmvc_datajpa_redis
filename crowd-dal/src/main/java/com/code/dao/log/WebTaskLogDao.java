package com.code.dao.log;

import com.code.entity.log.WebTaskLog;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by 高雄辉 on 2016-05-1815:24:33
 *
 * @description
 */
public interface WebTaskLogDao extends PagingAndSortingRepository<WebTaskLog,Long>,JpaSpecificationExecutor<WebTaskLog> {
}