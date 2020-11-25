package com.fengxuechao.example.hive.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fengxuechao
 * @date 2020/11/25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultBean<T> {

    public int code;

    private String msg;

    private T data;

    public static ResultBean ok(Object data) {
        return new ResultBean<>(200, "ok", data);
    }
}
