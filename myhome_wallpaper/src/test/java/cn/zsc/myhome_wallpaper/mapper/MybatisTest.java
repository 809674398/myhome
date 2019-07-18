package cn.zsc.myhome_wallpaper.mapper;

import cn.zsc.myhome_model.table.WallPaper;
import cn.zsc.myhome_model.vo.WallPaperVo;
import cn.zsc.myhome_wallpaper.mapper.WallPaperMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 周思聪
 * @date 2019/7/8 13:28
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisTest {

    @Autowired
    private WallPaperMapper wallPaperMapper;

    @Test
    public void testMybatis(){
        List<WallPaper> paper = wallPaperMapper.findAll();
        Integer num = wallPaperMapper.allNum();
        System.out.println(paper);
    }
}
