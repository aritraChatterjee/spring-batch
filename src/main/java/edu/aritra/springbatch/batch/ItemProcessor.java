package edu.aritra.springbatch.batch;

import edu.aritra.springbatch.target.model.Users;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ItemProcessor implements org.springframework.batch.item.ItemProcessor<Users, Users> {

    private static final Map<String, String> DEPT_NAMES = new HashMap<>();

    public ItemProcessor() {
        DEPT_NAMES.put("001", "Technology");
        DEPT_NAMES.put("002", "Operations");
        DEPT_NAMES.put("003", "Accounts");
    }

    @Override
    public Users process(Users user) throws Exception {
        String deptCode = user.getDept();
        String dept = DEPT_NAMES.get(deptCode);
        user.setDept(dept);
        System.out.println(String.format("Converted from [%s] to [%s] ", deptCode, dept));
        return user;
    }
}
