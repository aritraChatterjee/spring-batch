package edu.aritra.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.aritra.springbatch.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
