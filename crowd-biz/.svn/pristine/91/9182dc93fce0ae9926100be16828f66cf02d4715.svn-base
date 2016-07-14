package com.code.service.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.project.WebProjectCommentDao;
import com.code.entity.project.WebProjectComment;
import com.code.model.pro.ProjectCommentModel;

@Service
public class WebProjectCommentService {

	@Autowired
	private WebProjectCommentDao webProjectCommentDao;
	
	/**
	 * 获取项目评论列表
	 * @param id
	 * @return
	 */
	public List<ProjectCommentModel> getByParentId(long id){
		List<ProjectCommentModel> result = new ArrayList<ProjectCommentModel>();
		List<WebProjectComment> list = webProjectCommentDao.findByParentId(id,0);
		//有一级评论数据
		if(null!=result&&!list.isEmpty()){
			result = new ArrayList<ProjectCommentModel>();
			for(WebProjectComment webProjectComment:list){
				ProjectCommentModel projectCommentModel = new ProjectCommentModel();
				projectCommentModel.setWebProjectComment(webProjectComment);
				//一级评论有子集
				List<WebProjectComment> sons = webProjectCommentDao.findByParentId(id,webProjectComment.getId());
				if(null!=sons&&!sons.isEmpty()){
					projectCommentModel.setComments(sons);
				}
				result.add(projectCommentModel);
			}
			return result;
		}
		return null;
	}

	/**
	 * 新建评论
	 * @param webProjectComment
	 */
	public void save(WebProjectComment webProjectComment) {
		webProjectComment.setCreateDate(new Date());
		webProjectComment.setLastUpdateDate(new Date());
		webProjectComment.setStatus(0);
		webProjectCommentDao.save(webProjectComment);
	}
	
}
