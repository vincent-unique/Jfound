package org.trump.vincent.sharding.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Recover;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Description:
 * User: vincent
 * Date: 2018/11/7
 **/
@Service
public class BusinessRetryableServiceImpl implements BusinessRetryableService {

    private static Logger logger = LoggerFactory.getLogger(BusinessRetryableServiceImpl.class);

    @Override
    public List<Object> doBusiness(Integer id, String name) {
        Long start = System.currentTimeMillis();
        logger.info(String.format("doBusiness begin: %s", new Date(start).toString()));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }
        Long end = System.currentTimeMillis();

        logger.info(String.format("BusinessRetryableService.doBusiness cost: %s \n", end-start));
        throw new RuntimeException("Mock Runtime Exception.");
    }

    @Recover
    public List<Object> businessRecover1(Exception exception, Integer id, String name) {
        logger.info(String.format("BusinessRetryableServiceImpl.businessRecover1 call with %d, %s ", id, name));

        return new ArrayList<>();
    }

    @Recover
    public List<Object> businessRecover2(RuntimeException exception, Integer id, String name) {
        logger.info(String.format("BusinessRetryableServiceImplbusinessRecover2 call with %d, %s ", id, name));

        return new ArrayList<>();
    }
}
