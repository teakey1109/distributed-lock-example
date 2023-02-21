package com.example.distributed.lock.service;

/**
 * ClassName: StockService
 * Package: com.example.distributed.lock.service
 * Description:
 *
 * @Author fangzhan
 * @Create 21/2/2023 上午11:30
 * @Version 1.0
 */
public interface StockService {

    /**
     * this method means that we want to reduce stock
     * @author zhanfang
     * date: 21/2/2023
     */
    void deduct();
}
