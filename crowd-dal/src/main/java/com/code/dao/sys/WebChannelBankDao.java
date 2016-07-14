package com.code.dao.sys;

import com.code.entity.sys.WebChannelBank;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by 高雄辉 on 2016-05-1815:26:18
 *
 * @description
 */
public interface WebChannelBankDao extends PagingAndSortingRepository<WebChannelBank,Long>,JpaSpecificationExecutor<WebChannelBank> {



}