package cn.zsc.myhome_model.res;

import lombok.Data;

import java.util.List;

/**
 * @author 周思聪
 * @date 2019/7/5 18:09
 */
@Data
public class Result<T> {
    private List<T> list;
    private long total;
}
