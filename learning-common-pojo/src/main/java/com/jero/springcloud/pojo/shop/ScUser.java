package com.jero.springcloud.pojo.shop;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
@AllArgsConstructor
public class ScUser {

    private int id;
    private String name;
    private String birthday;
    private int credType;
    private String credNum;
    private String dbName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp updateTime;


}
