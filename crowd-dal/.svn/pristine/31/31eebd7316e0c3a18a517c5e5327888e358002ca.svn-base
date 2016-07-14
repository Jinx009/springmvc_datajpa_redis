package com.code.dao.project;

import java.util.List;

import com.code.entity.project.WebProjectMaterials;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by 高雄辉 on 2016-05-1815:24:33
 *
 * @description
 */
public interface WebProjectMaterialsDao extends PagingAndSortingRepository<WebProjectMaterials,Long>,JpaSpecificationExecutor<WebProjectMaterials> {

	@Query(" select a from WebProjectMaterials a where a.projectId =:id ")
	public List<WebProjectMaterials> findByProjectId(@Param("id")Long id);

	@Query(" select a from WebProjectMaterials a,WebMaterials b where b.code =:code and a.materialsId = b.id and a.status = 1 ")
	public List<WebProjectMaterials> getBanner(@Param("code")String code);

	@Query(" select a from WebProjectMaterials a where a.projectId =:id and a.materialsId = (select b.id from WebMaterials b where b.code =:code) and a.status =1 ")
	public WebProjectMaterials findIndexPic(@Param("id")Long id,@Param("code")String code);
}