package com.code.tool;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class BaseDaoImpl implements BaseDao{

	@PersistenceContext
	protected EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Object[]> findBySql(String sql) {
		List<Object[]> list = null;
		EntityManager target = null;
		target = em.getEntityManagerFactory().createEntityManager();
		Session session = target.unwrap(Session.class);
		list = session.createSQLQuery(sql).list();
		if(null!=list&&!list.isEmpty()){
			return list;
		}
		return list;
	}
	
}
