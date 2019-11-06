package edu.aritra.springbatch.target.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.aritra.springbatch.target.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
