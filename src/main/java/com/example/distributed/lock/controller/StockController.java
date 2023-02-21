package com.example.distributed.lock.controller;

import com.example.distributed.lock.service.StockService;
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
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("stock/deduct")
    public String deduct() {
        this.stockService.deduct();
        return "hello stock deduct!!";
    }
}
