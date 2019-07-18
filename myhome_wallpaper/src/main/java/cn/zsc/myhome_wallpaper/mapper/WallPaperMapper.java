package cn.zsc.myhome_wallpaper.mapper;

import cn.zsc.myhome_model.table.WallPaper;
import cn.zsc.myhome_model.vo.WallPaperVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 周思聪
 * @date 2019/7/8 11:57
 */
@Mapper
public interface WallPaperMapper {
    List<WallPaper> findAll();
    Integer allNum();
}
