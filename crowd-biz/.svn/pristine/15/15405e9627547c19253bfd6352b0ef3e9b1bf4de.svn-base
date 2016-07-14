package com.code.service.user;

import com.code.dao.user.WebUserBankDao;
import com.code.entity.user.WebUserBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by BABAI HOLDINGS on 2016/5/23.
 */
@Service
@Transactional(readOnly = true)
public class WebUserBankService {
    @Autowired
    private WebUserBankDao webUserBankDao;

    public WebUserBank save(WebUserBank webUserBank){
        webUserBank.setLastUpdateDate(new Date());
        return webUserBankDao.save(webUserBank);
    }

    public WebUserBank findById(long id){
        return webUserBankDao.findOne(id);
    }

    public List<WebUserBank> findByUserId(long userId){
        return webUserBankDao.findByUserIdAndStatus(userId,1);
    }
}
