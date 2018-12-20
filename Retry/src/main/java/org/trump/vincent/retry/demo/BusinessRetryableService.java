package org.trump.vincent.retry.demo;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;

import java.util.List;

/**
 * Description:
 * User: vincent
 * Date: 2018/11/7
 **/
public interface BusinessRetryableService {

    @Retryable(value = {Exception.class}, maxAttempts = 3, backoff = @Backoff(500))
    List<Object> doBusiness(Integer id, String name);
}
