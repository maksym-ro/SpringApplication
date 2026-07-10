package com.uisav.springmvc.dao;

import java.util.List;
import com.uisav.springmvc.model.UserProfile;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * @author maksym-ro on 07.07.2020.
 * @project SpringApplication
 */
@Repository("userProfileDao")
public class UserProfileDaoImpl extends AbstractDao<Integer, UserProfile>implements UserProfileDao{

    public UserProfile findById(int id) {
        return getByKey(id);
    }

    public UserProfile findByType(String type) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("type", type));
        return (UserProfile) crit.uniqueResult();
    }

    @SuppressWarnings("unchecked")
    public List<UserProfile> findAll(){
        Criteria crit = createEntityCriteria();
        crit.addOrder(Order.asc("type"));
        return (List<UserProfile>)crit.list();
    }
}