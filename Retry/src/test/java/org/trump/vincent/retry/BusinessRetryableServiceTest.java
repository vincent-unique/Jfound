package org.trump.vincent.retry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.trump.vincent.retry.demo.BusinessRetryableService;

/**
 * Description:
 * User: liwei
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
