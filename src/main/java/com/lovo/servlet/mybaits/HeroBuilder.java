package com.lovo.servlet.mybaits;

public interface HeroBuilder {
    /**
     *
     * 符文
     */
    public void  buildPymbol();

    /**
     *
     * 技能
     */
    public void buildKill();

    /**
     *
     *  皮肤
     */
    public  void buildKien();

    /**
     *
     * @return 英雄
     */
    public  Hero createHero();
}
