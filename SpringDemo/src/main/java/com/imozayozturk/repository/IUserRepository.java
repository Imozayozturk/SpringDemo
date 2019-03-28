package com.imozayozturk.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.imozayozturk.entity.UserEntity;

@Repository
public interface IUserRepository extends CrudRepository<UserEntity, Long> {

}
