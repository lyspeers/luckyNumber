package com.company;

/**
 * Created by ls059 on 10/10/17.
 */
public class randomNum {
    public randomNum(String n){
        name = n;
    }
    public void perfectRandom(){
        rn = (int)(Math.random()*50);
        rn = rn * rn;
    }
    public String name;
    public int rn;
}
