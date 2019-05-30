package com.lovo.servlet.mybaits;

public class VNVIPBuilder implements HeroBuilder{
    //持有英雄
    Hero h=new Hero();
    public void buildPymbol() {
        h.setPymbol("全物理暴击符文");
    }
    public void buildKill() {
        h.setKill("终极时刻");
    }
    public void buildKien() {
        h.setKien("烈焰美人");
    }
    public Hero createHero() {
        return h;
    }

}
