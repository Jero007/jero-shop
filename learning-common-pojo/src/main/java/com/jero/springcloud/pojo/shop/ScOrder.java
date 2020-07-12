package com.jero.springcloud.pojo.shop;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Description TODO
 * @Date 2020-07-12
 * @Author jero
 * @Version 1.0
 * @ModifyNote (add note when you modify)
 * |---modifyText:
 * |---modifyDate:
 * |---modifyAuthor:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScOrder {

    private int id;
    private BigDecimal totalAmount;
    private BigDecimal payAmount;
    private int status;
    private String dbName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp updateTime;

}
