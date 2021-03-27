package com.tan.programmingparadigm.function;

public class Sample1 {


    /**
     * 非函数式编程
     */
    int count;
    public void increment(){
        count++;
    }


    /**
     * 函数式编程 不依赖外部数据，也不改变外部数据的值，而是返回一个新值
     * @param count
     * @return
     */
    public int increment(int count){
        return count;
    }
}
