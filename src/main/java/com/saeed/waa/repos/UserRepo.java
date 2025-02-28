package com.saeed.waa.repos;
import com.saeed.waa.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {}
