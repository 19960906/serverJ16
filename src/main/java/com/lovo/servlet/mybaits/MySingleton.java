package com.lovo.servlet.mybaits;

public class MySingleton {
    //私有的构造方法
    private  MySingleton(){}
    private static MySingleton mySingleton=null;


    public synchronized static MySingleton getMySingleton(){

        if(null==mySingleton){
            try {
                Thread.sleep(1000*2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mySingleton=new MySingleton();
        }
        return  mySingleton;
    }

}
