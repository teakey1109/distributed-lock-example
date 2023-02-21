package com.example.distributed.lock.controller;

import com.example.distributed.lock.service.StockService;
import com.example.distributed.lock.service.StockServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: StockController
 * Package: com.example.distributed.lock.controller
 * Description:
 *
 * @Author fangzhan
 * @Create 21/2/2023 上午11:26
 * @Version 1.0
 */
@RestController
@MapperScan("com.example.distributed.lock.mapper")
public class StockController {

    @Autowired
    private StockServiceImpl stockService;

    @GetMapping("stock/deduct")
    public String deduct() {
        this.stockService.deduct();
        return "hello stock deduct!!";
    }

    @GetMapping("check/lock")
    public String checkAndLock() {
        this.stockService.checkAndLock();
        return "check and lock stock success!";
    }

}
