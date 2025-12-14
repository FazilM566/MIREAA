package ПР20;

import java.io.Serializable;


public class Generic<T extends Comparable,V extends Animal & Serializable,K> {
    public  T one;
    public V second;
    public K third;

    public Generic(T one, V second, K third) {
        this.one = one;
        this.second = second;
        this.third = third;
    }

    public void out_class(){
        System.out.println(one.getClass());
        System.out.println(second.getClass());
        System.out.println(third.getClass());
    }
}
