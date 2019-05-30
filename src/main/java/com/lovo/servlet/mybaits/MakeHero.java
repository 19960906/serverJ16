package com.lovo.servlet.mybaits;

/**
 * 英雄制作
 */
public class MakeHero {

       private HeroBuilder heroBuilder;

       public MakeHero(HeroBuilder heroBuilder){
           this.heroBuilder=heroBuilder;
       }
       //开始构建
       public  void build(){
           heroBuilder.buildPymbol();
          // heroBuilder.buildKien();
           heroBuilder.buildKill();
       }


       public  Hero getHero(){
           return heroBuilder.createHero();
       }

}
