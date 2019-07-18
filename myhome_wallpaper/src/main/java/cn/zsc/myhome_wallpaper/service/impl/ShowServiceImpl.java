package cn.zsc.myhome_wallpaper.service.impl;

import cn.zsc.myhome_model.res.CommonCode;
import cn.zsc.myhome_model.res.ResponseMessage;
import cn.zsc.myhome_model.res.Result;
import cn.zsc.myhome_model.table.WallPaper;
import cn.zsc.myhome_model.vo.WallPaperVo;
import cn.zsc.myhome_wallpaper.mapper.WallPaperMapper;
import cn.zsc.myhome_wallpaper.service.ShowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 周思聪
 * @date 2019/7/8 11:43
 */
@Service
public class ShowServiceImpl implements ShowService {


    @Autowired
    private WallPaperMapper wallPaperMapper;

    @Override
    public ResponseMessage allList() {
        try {
            List<WallPaper> papers = wallPaperMapper.findAll();
            Integer num = wallPaperMapper.allNum();
            Result<WallPaper> result = new Result<>();
            result.setList(papers);
            result.setTotal((long)num);
            return new ResponseMessage(result, CommonCode.SUCCESS);
        } catch (Exception e) {
           return new ResponseMessage(null,CommonCode.SERVER_ERROR);
        }
    }
}
