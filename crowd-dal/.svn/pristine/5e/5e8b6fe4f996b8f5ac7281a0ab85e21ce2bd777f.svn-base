package com.code.dao.sys;

import java.util.List;

import com.code.entity.sys.WebMaterials;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by 高雄辉 on 2016-05-1815:26:18
 *
 * @description
 */
public interface WebMaterialsDao extends PagingAndSortingRepository<WebMaterials,Long>,JpaSpecificationExecutor<WebMaterials> {

	@Query(" select a from WebMaterials a ")
	public List<WebMaterials> findAllItems();

	@Query(" select a.code from WebMaterials a where a.id =:materialsId ")
	public String getCode(@Param("materialsId")long materialsId);

}