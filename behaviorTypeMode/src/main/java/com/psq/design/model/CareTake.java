package com.psq.design.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 备忘录模式
 * @Author psq
 * @Date 2021/2/4/16:01
 */
public class CareTake {
    private List<Memo> memoList = new ArrayList<>();

    public void add(Memo state){
        memoList.add(state);
    }

    public Memo get(int index){
        return memoList.get(index);
    }
}
