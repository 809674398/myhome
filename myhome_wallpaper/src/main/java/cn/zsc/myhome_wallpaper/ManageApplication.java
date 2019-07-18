package cn.zsc.myhome_wallpaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author 周思聪
 * @date 2019/7/5 16:21
 */
@SpringBootApplication
@ComponentScan(basePackages = {"cn.zsc.myhome_wallpaper"})
@ComponentScan(basePackages = {"cn.zsc.myhome_model"})
public class ManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class);
    }
}
