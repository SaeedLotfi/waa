package com.saeed.waa.repos;
import com.saeed.waa.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE SIZE(u.posts) > :minPostCount")
    List<User> findUsersByPostsCountGreaterThan(@Param("minPostCount") int minPostCount);
}
