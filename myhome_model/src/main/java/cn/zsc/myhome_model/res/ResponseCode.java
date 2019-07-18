package cn.zsc.myhome_model.res;

/**
 * @author 周思聪
 * @date 2019/7/8 10:06
 */
public interface ResponseCode {
    //操作是否成功
     boolean success();
    //操作代码
     int code();
     //提示信息
     String message();

}
