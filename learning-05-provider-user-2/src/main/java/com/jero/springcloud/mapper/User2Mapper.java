package com.jero.springcloud.mapper;

import com.jero.springcloud.pojo.shop.ScUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description TODO
 * @Date 2020-07-01
 * @Author jero
 * @Version 1.0
 * @ModifyNote (add note when you modify)
 * |---modifyText:
 * |---modifyDate:
 * |---modifyAuthor:
 */
@Mapper
public interface User2Mapper {
    ScUser getUserById(Integer id);
    List<ScUser> getAllUser();
}
