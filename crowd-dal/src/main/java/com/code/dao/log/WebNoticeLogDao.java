package com.code.dao.log;

import java.util.List;

import com.code.entity.log.WebNoticeLog;

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
public interface WebNoticeLogDao extends PagingAndSortingRepository<WebNoticeLog,Long>,JpaSpecificationExecutor<WebNoticeLog> {

	@Query(" select a from WebNoticeLog a where a.status = 0 ")
	public List<WebNoticeLog> findNeedSend();

	@Modifying(clearAutomatically = true) 
	@Query("update WebNoticeLog a set a.status =:status,a.remark =:remark,lastUpdateDate =now() where a.id =:id")  
	public void update(@Param("status") int status, @Param("remark") String reamrk,@Param("id")Long id);
	
}