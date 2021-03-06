package com.xiaoyong.dao;

import com.xiaoyong.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Create By dongxiaoyong on /2021/3/5
 * description: 用户dao
 *
 * @author dongxiaoyong
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}