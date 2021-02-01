package com.psq.design.service;

/**
 * @Description 实现了 Cloneable 接口的抽象类
 * @Author psq
 * @Date 2021/1/29/14:57
 */
public abstract class PrototypeModeService implements Cloneable{

    private String id;

    protected String type;

    /**
     * 若在同一个目录下,则不需要加public,反之要加，否则子类重写不到该抽象方法
     */
    public abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
