package com.gastby.springboot;

import com.gastby.springboot.entities.Part;
import com.gastby.springboot.mapper.PartMapper;
import com.gastby.springboot.pojo.User;
import com.gastby.springboot.utils.Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Autowired
    User user;

    @Autowired
    PartMapper partMapper;

    @Test
    public void contextLoads() {
//        System.out.print(user);

/*        for (int i=0; i<20; i++) {
            Part part = new Part();
            part.setName(Utils.name());
            part.setPid(Utils.Pid());
            part.setPosition(Utils.position());
            part.setBirthDate(new Date());
            partMapper.insertPart(part);
        }*/

        /*List<Part> list = partMapper.queryAllParts();
        for (Part part : list)
            System.out.println(part);*/




    }


}
