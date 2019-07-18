package cn.zsc.myhome_model.table;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 周思聪
 * @date 2019/7/8 11:20
 */
@Data
public class WallPaper implements Serializable {
    private String id;
    //分类
    private String category;
    //图片地址
    private String picAddress;
    //标题
    private String title;

    private Long disable;

    private String ctime;

}
