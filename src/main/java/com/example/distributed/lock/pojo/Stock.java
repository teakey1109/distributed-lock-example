package com.example.distributed.lock.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * ClassName: Stock
 * Package: com.example.distributed.lock.pojo
 * Description:
 *
 * @Author fangzhan
 * @Create 21/2/2023 上午11:31
 * @Version 1.0
 */
@Data
@TableName("db_stock")
public class Stock {

    @TableId
    private Long id;

    private String productCode;

    private String stockCode;

    /**
     * This is 5000 stock.
     */
    private Integer count = 5000;

}
