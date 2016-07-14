package com.code.dao.home;

import com.code.entity.home.HomeMenu;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by 高雄辉 on 2016-05-1815:24:18
 *
 * @description
 */
public interface HomeMenuDao extends PagingAndSortingRepository<HomeMenu,Long>,JpaSpecificationExecutor<HomeMenu> {
}