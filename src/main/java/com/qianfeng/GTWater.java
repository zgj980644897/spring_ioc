package com.qianfeng;

import org.springframework.stereotype.Component;

@Component
public class GTWater implements IWater{


    @Override
    public String getName() {
        return "绿茶";
    }
}
