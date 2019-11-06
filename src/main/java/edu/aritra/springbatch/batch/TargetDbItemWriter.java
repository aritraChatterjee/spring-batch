package edu.aritra.springbatch.batch;

import edu.aritra.springbatch.target.model.Users;
import edu.aritra.springbatch.target.repository.UsersRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TargetDbItemWriter implements ItemWriter<Users> {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void write(List<? extends Users> users) throws Exception {
        System.out.println("Data saved for users: " + users);
        usersRepository.saveAll(users);
    }
}
