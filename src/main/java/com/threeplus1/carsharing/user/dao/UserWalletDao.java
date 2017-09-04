package com.threeplus1.carsharing.user.dao;

import com.threeplus1.carsharing.base.dao.BaseDao;
import com.threeplus1.carsharing.base.dao.Filter;
import com.threeplus1.carsharing.user.entity.UserWallet;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userWallet")
public class UserWalletDao extends BaseDao<UserWallet,Long> {

    public UserWallet findByUserId(Long userId) {
        List<UserWallet> list = this.findList(null,null,null,
                new Filter("userId", Filter.Operator.eq,userId)
        );
        if(CollectionUtils.isEmpty(list)){
            return null;
        }else{
            return list.get(0);
        }
    }
}
