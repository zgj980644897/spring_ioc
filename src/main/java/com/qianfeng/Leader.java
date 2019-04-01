package com.qianfeng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Leader {
    private IWater water;

    public IWater getWater() {
        return water;
    }
    @Autowired
    public void setWater(IWater water) {
        this.water = water;
    }
}
