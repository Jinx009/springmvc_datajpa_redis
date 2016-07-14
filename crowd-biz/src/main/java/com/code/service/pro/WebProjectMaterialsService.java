package com.code.service.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.project.WebProjectMaterialsDao;
import com.code.dao.sys.WebMaterialsDao;
import com.code.entity.project.WebProjectMaterials;
import com.code.model.pro.ProjectMaterialsModel;

@Service
public class WebProjectMaterialsService {
   
	@Autowired
	private WebProjectMaterialsDao webProjectMaterialsDao;
	@Autowired
	private WebMaterialsDao webMaterialsDao;
	
	/**
	 * 新建素材
	 * @param webProjectMaterials
	 * @return
	 */
	public WebProjectMaterials save(WebProjectMaterials webProjectMaterials){
		webProjectMaterials.setCreateDate(new Date());
		webProjectMaterials.setLastUpdateDate(new Date());
		webProjectMaterials.setStatus(1);
		return webProjectMaterialsDao.save(webProjectMaterials);
	}

	/**
	 * 获取banner
	 * @param i
	 * @return
	 */
	public List<WebProjectMaterials> getBanner(int type) {
		if(1==type)
			return webProjectMaterialsDao.getBanner("pc_banner");
		else if(2==type)
			return webProjectMaterialsDao.getBanner("wechat_banner");
		else
			return webProjectMaterialsDao.getBanner("app_banner");
	}

	/**
	 * 获取项目素材模型
	 * @param id
	 * @return
	 */
	public List<ProjectMaterialsModel> findByProjectId(Long id) {
		List<WebProjectMaterials> list = webProjectMaterialsDao.findByProjectId(id);
		List<ProjectMaterialsModel> res = null;
		if(null!=list&&!list.isEmpty()){
			res = new ArrayList<ProjectMaterialsModel>();
			for(WebProjectMaterials webProjectMaterials : list){
				ProjectMaterialsModel projectMaterialsModel = new ProjectMaterialsModel();
				projectMaterialsModel.setContent(webProjectMaterials.getContent());
				projectMaterialsModel.setLink(webProjectMaterials.getLink());
				projectMaterialsModel.setName(webProjectMaterials.getName());
				projectMaterialsModel.setCode(webMaterialsDao.getCode(webProjectMaterials.getMaterialsId()));
				res.add(projectMaterialsModel);
			}
			return res;
		}
		return null;
	}
	
}
