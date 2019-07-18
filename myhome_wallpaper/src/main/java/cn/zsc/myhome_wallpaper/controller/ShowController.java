package cn.zsc.myhome_wallpaper.controller;

import cn.zsc.myhome_model.res.ResponseMessage;
import cn.zsc.myhome_wallpaper.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 展示的controller
 * @author 周思聪
 * @date 2019/7/5 9:54
 */
@CrossOrigin
@RestController
@RequestMapping("/wallpaperShow")
public class ShowController {

    @Autowired
    private ShowService showService;



    @RequestMapping("/allList")
    public ResponseMessage allList(){
        return showService.allList();
    }

}
