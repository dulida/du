package com.lida.du.mapper;

import com.lida.du.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: 杜利达
 * @date: 2020/4/6 20:02
 */
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}