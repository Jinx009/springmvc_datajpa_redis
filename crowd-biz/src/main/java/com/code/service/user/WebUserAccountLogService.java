package com.code.service.user;

import com.code.dao.user.WebUserAccountLogDao;
import com.code.entity.user.WebUserAccountLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by BABAI HOLDINGS on 2016/5/23.
 */
@Service
@Transactional(readOnly = true)
public class WebUserAccountLogService {
    @Autowired
    private WebUserAccountLogDao webUserAccountLogDao;

    /**
     * 新建用户资金日志
     * @param webUserAccountLog
     * @return
     */
    public WebUserAccountLog save(WebUserAccountLog webUserAccountLog){
        webUserAccountLog.setLastUpdateDate(new Date());
        return webUserAccountLogDao.save(webUserAccountLog);
    }

    /**
     * 获取用户资金日志
     * @param type 类型
     *             充值 recharge
     *             提现  cash
     *             投资相关 invest
     * @param lastId 从哪条记录开始获取
     * @return
     */
    public List<WebUserAccountLog> list(long userId,String type,long lastId){
        List<WebUserAccountLog> list=null;
        String[] types=new String[]{};
        if(type.equals("recharge")){
            types=new String[]{"online_recharge","off_rechage"};
        }else if(type.equals("cash")){
            types=new String[]{"cash_frost","cash_success"};
        }else if(type.equals("invest")){
            types=new String[]{"invest"};
        }
        if(lastId>0){
            list=webUserAccountLogDao.findTop20ByUserIdAndTypeInAndIdBeforeOrderByIdDesc(userId,types,lastId);
        }else{
            list=webUserAccountLogDao.findTop20ByUserIdAndTypeInOrderByIdDesc(userId,types);
        }
        return list;
    }
}
