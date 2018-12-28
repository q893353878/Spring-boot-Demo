package com.lst.mapper;

import com.lst.domain.entit.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lst
 * @date  2018-12-28
 *
 */
public interface UserMapper extends JpaRepository<User, Long> {

    User findById(long id);

    Long deleteById(long id);
}
