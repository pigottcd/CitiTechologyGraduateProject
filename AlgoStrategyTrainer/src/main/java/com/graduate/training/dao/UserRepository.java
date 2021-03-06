package com.graduate.training.dao;

import com.graduate.training.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//using crud repository for database accesses,
@Repository
@Transactional(propagation = Propagation.REQUIRED)
public interface UserRepository extends CrudRepository<User,Integer> {
}

