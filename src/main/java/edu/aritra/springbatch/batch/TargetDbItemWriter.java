package edu.aritra.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.aritra.springbatch.model.Users;
import edu.aritra.springbatch.repository.UsersRepository;

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
