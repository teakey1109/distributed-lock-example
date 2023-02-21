package com.example.distributed.lock.service;

import com.example.distributed.lock.pojo.Stock;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: StockService
 * Package: com.example.distributed.lock.service
 * Description:
 *
 * @Author fangzhan
 * @Create 21/2/2023 上午11:28
 * @Version 1.0
 */
@Service
@Slf4j
public class StockServiceImpl {

    private static final Logger logger = LoggerFactory.getLogger(StockServiceImpl.class);

    private Stock stock = new Stock();

    private ReentrantLock lock = new ReentrantLock();

    public void deduct() {
        lock.lock();
        try {
            stock.setStock(stock.getStock() - 1);
            logger.info("stock: " + stock.getStock());
        } finally {
            lock.unlock();
        }
    }
}
