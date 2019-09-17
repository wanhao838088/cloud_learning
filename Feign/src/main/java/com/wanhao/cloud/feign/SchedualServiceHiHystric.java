package com.wanhao.cloud.feign;

import org.springframework.stereotype.Component;

/**
 * Created by LiuLiHao on 2019/9/17 0017 下午 07:19
 * @author : LiuLiHao
 * 描述：调用失败执行这个类
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return name+"调用失败!!!";
    }
}
