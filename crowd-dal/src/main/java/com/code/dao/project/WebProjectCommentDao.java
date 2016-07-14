package com.code.dao.project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.code.entity.project.WebProjectComment;

public interface WebProjectCommentDao extends PagingAndSortingRepository<WebProjectComment,Long>,JpaSpecificationExecutor<WebProjectComment> {

	@Query(" select a from WebProjectComment a where a.projectId =:id and a.parentId =:parentId and status =1 ")
	public List<WebProjectComment> findByParentId(@Param("id")long id,@Param("parentId")long parentId);

}
