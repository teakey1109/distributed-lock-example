package com.example.distributed.lock;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: DistributedLockApplication
 * Package: com.example.distributed.lock
 * Description:
 *
 * @Author fangzhan
 * @Create 21/2/2023 上午11:43
 * @Version 1.0
 */

@SpringBootApplication
public class DistributedLockApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributedLockApplication.class, args);
    }
}
