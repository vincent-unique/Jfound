package org.trump.vincent.sharding;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.trump.vincent.sharding.demo.BusinessRetryableService;

/**
 * Description:
 * User: vincent
 * Date: 2018/11/7
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessRetryableServiceTest {

    @Autowired
    private BusinessRetryableService retryableService;

    @Test
    public void doBusinessTest() {
        retryableService.doBusiness(1001, "hello world");
    }
}
