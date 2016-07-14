package com.code.dao.sys;

import java.util.List;

import com.code.entity.sys.WebTemplate;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by 高雄辉 on 2016-05-1815:26:18
 *
 * @description
 */
public interface WebTemplateDao extends PagingAndSortingRepository<WebTemplate,Long>,JpaSpecificationExecutor<WebTemplate> {

	@Query("select a from WebTemplate a where a.status=:status ")
	public List<WebTemplate> findByStatus(@Param("status") int status);
}