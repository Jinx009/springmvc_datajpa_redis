package com.code.dao.project;

import java.util.List;

import com.code.entity.project.WebProject;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by 高雄辉 on 2016-05-1815:24:33
 *
 * @description
 */
public interface WebProjectDao extends PagingAndSortingRepository<WebProject,Long>,JpaSpecificationExecutor<WebProject> {

	@Query(" select a from WebProject a where a.isIndexShow =1 order by recommendNum,createTime desc ")
	public List<WebProject> findIndex();

	@Query(" select a from WebProject a where a.isShowPc =1 ")
	public List<WebProject> findAllForPc();

	@Query(" select a from WebProject a where a.isShowWechat =1 ")
	public List<WebProject> findAllForWechat();

	@Query(" select a from WebProject a where a.isShowApp =1 ")
	public List<WebProject> findAllForApp();

	@Query(" select a from WebProject a where a.isShowPc =1 and a.type =:type ")
	public List<WebProject> findTypeForPc(@Param("type")int type);

	@Query(" select a from WebProject a where a.isShowWechat =1 and a.type =:type ")
	public List<WebProject> findTypeForWechat(@Param("type")int type);

	@Query(" select a from WebProject a where a.isShowApp =1 and a.type =:type ")
	public List<WebProject> findTypeForApp(@Param("type")int type);

	@Query(" select a from WebProject a where a.isShowWechat =1 and a.type =:type and (a.status =2 or a.status =3 ) order by recommendNum,createDate desc ")
	public List<WebProject> findWechatIndex(@Param("type")int type);

}