package cn.minalz.adapter.loginadapter;

import lombok.Data;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:18
 **/
@Data
public class ResultMsg {

    private int code;
    private String msg;
    private Object data;

    public ResultMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}
