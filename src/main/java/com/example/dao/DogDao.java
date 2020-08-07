package com.example.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Dog;
import com.example.interfaces.DogInter;

@Repository("dogDao")
public class DogDao extends HibernateDao implements DogInter
{

	@Override
	public void saveDog(Dog dogDetails) {
		persist(dogDetails);
	}

	@Override
	public List<Dog> findAllDog() {
		Criteria criteria = getSession().createCriteria(Dog.class);
		return (List<Dog>) criteria.list();
	}

	@Override
	public void deleteDogById(int id) {
		Query query = getSession().createSQLQuery("DELETE FROM Dog WHERE id = :dogid");
		query.setLong("dogid", id);
		query.executeUpdate();
	}

	@Override
	public Dog findById(int id) {
		Criteria criteria = getSession().createCriteria(Dog.class);
        criteria.add(Restrictions.eq("id",id));
        return (Dog) criteria.uniqueResult();
	}

	@Override
	public void updateLogin(Dog dogDetails) {
		 getSession().update(dogDetails);		
	}
		
}
