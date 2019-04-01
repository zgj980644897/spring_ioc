package com.qianfeng.spring3;

public class Leader {
    private Water water;

    public Water getWater() {
        return water;
    }
    @Need(value=GTWater.class)
    public void setWater(Water water) {
        this.water = water;
    }
}
