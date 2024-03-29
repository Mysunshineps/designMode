package com.psq.design.controller;

import com.psq.design.model.FactoryMethod;
import com.psq.design.service.FactoryMethodService;

/**
 * @Description 工厂方法模式 客户端
 * @Author psq
 * @Date 2021/1/26/17:03
 */
public class FactoryMethodController {

    /**
     *  优点：
     *      1、一个调用者想创建一个对象，只要知道其名称就可以了。 2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。 3、屏蔽产品的具体实现，调用者只关心产品的接口。
     *  缺点：每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
     *
     *  使用场景： 1、日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。 2、数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。 3、设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。
     *  注意事项：作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。
     *
     * @param args
     */
    public static void main(String[] args){
        FactoryMethod factoryMethod = new FactoryMethod();

        FactoryMethodService implV1 = factoryMethod.getFactory("FactoryMethodServiceImplV1");
        implV1.draw();

        FactoryMethodService implV2 = factoryMethod.getFactory("FactoryMethodServiceImplV2");
        implV2.draw();
    }
}
