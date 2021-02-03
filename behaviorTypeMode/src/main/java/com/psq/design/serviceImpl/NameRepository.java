package com.psq.design.serviceImpl;

import com.psq.design.service.Container;
import com.psq.design.service.Iterator;

/**
 * @Description 迭代器模式
 * @Author psq
 * @Date 2021/2/3/16:43
 */
public class NameRepository implements Container {
    public String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
