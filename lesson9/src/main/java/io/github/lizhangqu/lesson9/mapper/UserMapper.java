package io.github.lizhangqu.lesson9.mapper;

import io.github.lizhangqu.lesson9.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lizhangqu on 2017/7/17.
 */
@Repository
public interface UserMapper {

    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);

}
