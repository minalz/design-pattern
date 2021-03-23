package cn.minalz.strategy.pay;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-18 22:46
 **/
public class MsgResult {

    private int code;
    private String msg;
    private Object data;

    public MsgResult(int code, String msg, Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
