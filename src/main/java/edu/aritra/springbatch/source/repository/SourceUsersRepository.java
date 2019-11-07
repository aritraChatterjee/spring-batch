package edu.aritra.springbatch.source.repository;

import edu.aritra.springbatch.source.model.SourceUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SourceUsersRepository extends JpaRepository<SourceUsers, Integer> {

}
