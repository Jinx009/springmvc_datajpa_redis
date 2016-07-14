package com.code.entity;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

public class EntityListener{
	
    @PrePersist
    public void prePersist(CommenEntity ce){
        ce.setCreateDate(new Date());
        ce.setLastUpdateDate(new Date());
    }
    @PreUpdate
    public void preUpdate(CommenEntity ce){
        ce.setLastUpdateDate(new Date());
    }
}