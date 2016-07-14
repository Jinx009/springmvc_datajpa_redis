package com.code.model.pro;

import java.util.List;

import com.code.entity.project.WebProjectComment;

public class ProjectCommentModel {

	//初级评论
	private WebProjectComment webProjectComment;
	//子集评论
	private List<WebProjectComment> comments;
	
	
	
	
	public WebProjectComment getWebProjectComment() {
		return webProjectComment;
	}
	public void setWebProjectComment(WebProjectComment webProjectComment) {
		this.webProjectComment = webProjectComment;
	}
	public List<WebProjectComment> getComments() {
		return comments;
	}
	public void setComments(List<WebProjectComment> comments) {
		this.comments = comments;
	}
}
