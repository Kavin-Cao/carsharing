package com.threeplus1.carsharing.user.dao;

import com.threeplus1.carsharing.base.dao.BaseDao;
import com.threeplus1.carsharing.base.dao.Filter;
import com.threeplus1.carsharing.user.entity.User;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDao extends BaseDao<User,Long> {

    public User findByUserName(String userName){
        List<User> list = this.findList(null,null,null,
                new Filter("userName", Filter.Operator.eq,userName)
        );
        if(CollectionUtils.isEmpty(list)){
            return null;
        }else{
            return list.get(0);
        }
    }

}
