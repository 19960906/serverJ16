package com.lovo.servlet.mybaits;

/**
 * 构建普通版本的VN
 */
public class VNBasicBulider implements HeroBuilder {
    //持有英雄
    Hero h=new Hero();

    public void buildPymbol() {
      h.setPymbol("全物理攻击符文");
    }
    public void buildKill() {
        h.setKill("圣银弩箭");
    }
    public void buildKien() {
      h.setKien("系统皮肤");
    }

    @Override
    public Hero createHero() {
        return h;
    }


}
