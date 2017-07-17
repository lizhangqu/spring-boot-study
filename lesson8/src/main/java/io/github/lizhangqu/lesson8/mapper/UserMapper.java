package io.github.lizhangqu.lesson8.mapper;

import io.github.lizhangqu.lesson8.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by lizhangqu on 2017/7/17.
 */
public interface UserMapper {

    @Select("SELECT * FROM my_users")
    @Results({
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userAge", column = "user_age")
    })
    List<User> getAll();

    @Select("SELECT * FROM my_users WHERE id = #{id}")
    @Results({
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userAge", column = "user_age")
    })
    User getOne(Long id);

    @Insert("INSERT INTO my_users(user_name,user_age) VALUES(#{userName}, #{userAge})")
    void insert(User user);

    @Update("UPDATE my_users SET user_name=#{userName},user_age=#{userAge} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM my_users WHERE id =#{id}")
    void delete(Long id);

}
