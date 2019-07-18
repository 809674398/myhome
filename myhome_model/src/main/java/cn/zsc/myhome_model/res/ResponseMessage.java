package cn.zsc.myhome_model.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * 接口统一返回值
 * @author 周思聪
 * @date 2019/7/5 16:42
 */
@Data
@ToString
@AllArgsConstructor
public class ResponseMessage {
    Result result;
    ResponseCode code;
}
