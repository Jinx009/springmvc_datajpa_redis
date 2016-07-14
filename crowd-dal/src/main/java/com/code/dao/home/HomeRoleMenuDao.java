package com.code.dao.home;

import com.code.entity.home.HomeRoleMenu;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by 高雄辉 on 2016-05-1815:24:33
 *
 * @description
 */
public interface HomeRoleMenuDao extends PagingAndSortingRepository<HomeRoleMenu,Long>,JpaSpecificationExecutor<HomeRoleMenu> {
}