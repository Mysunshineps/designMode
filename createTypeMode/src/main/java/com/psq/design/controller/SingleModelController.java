package com.psq.design.controller;

import com.psq.design.model.SingleModel;

/**
 * @Description 单例模式 客户端
 * @Author psq
 * @Date 2021/1/26/15:33
 */
public class SingleModelController {

    /**
     *      优点：
     *          1、在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例（比如管理学院首页页面缓存）。
     *          2、避免对资源的多重占用（比如写文件操作）。
     *      缺点：没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。
     *
     *      使用场景：
     *          1、要求生产唯一序列号。
     *          2、WEB 中的计数器，不用每次刷新都在数据库里加一次，用单例先缓存起来。
     *          3、创建的一个对象需要消耗的资源过多，比如 I/O 与数据库的连接等。
     *      注意事项：getInstance() 方法中需要使用同步锁 synchronized (Singleton.class) 防止多线程同时进入造成 instance 被多次实例化。
     * @param args
     */
    public static void main(String[] args){
//        不合法的调用，构造函数是私有的，编译时错误，构造函数SingleModel()不可见
//        SingleModel singleModel = new SingleModel();

        //调用的正确方式
        SingleModel instance = SingleModel.getInstance();
        //单列模式类下方法的正确调用
        instance.showMessage();
    }
}
