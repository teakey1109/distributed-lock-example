package com.example.distributed.lock.service;

import com.example.distributed.lock.mapper.StockMapper;
import com.example.distributed.lock.pojo.Stock;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
public class StockServiceImpl implements StockService{

    @Autowired
    private StockMapper stockMapper;
    private static final Logger logger = LoggerFactory.getLogger(StockServiceImpl.class);

    private Stock stock = new Stock();

    private ReentrantLock lock = new ReentrantLock();

    public void deduct() {
        lock.lock();
        try {
            stock.setCount(stock.getCount() - 1);
            logger.info("stock: {}", stock.getCount());
        } finally {
            lock.unlock();
        }
    }

    /**
     * add synchronized keyword to solve the problem.
     */
    public synchronized void checkAndLock() {

        Stock leftAmount = this.stockMapper.selectById(1L);

        if (leftAmount != null && leftAmount.getCount() > 0) {
            leftAmount.setCount(leftAmount.getCount() - 1);
            this.stockMapper.updateById(leftAmount);
        }
    }

}
