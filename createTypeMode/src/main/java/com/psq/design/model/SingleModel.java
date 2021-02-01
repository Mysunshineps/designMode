package com.psq.design.model;

/**
 * @Description 单例设计模式 ：
 * 说明：就是只有一个实例，并且他自己负责创建自己的对象，这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象
 * 5种主要写法：1懒汉式（包含线程安全和线程不安全两种方式）都比较少用；2饿汉式和3双检锁都可以使用，可根据具体情况自主选择；在要明确实现 lazy loading 效果时，可以考虑4静态内部类的实现方式；若涉及到反序列化创建对象时，大家也可以尝试使用5枚举方式
 * @Author psq
 * @Date 2021/1/26/15:36
 */
public class SingleModel {

    /** 1.懒汉式 实例在用到的时候才去创建，“比较懒”，用的时候才去检查有没有实例，如果有则返回，没有则新建。有线程安全和线程不安全两种写法，区别就是有无synchronized关键字。
    private static SingleModel instance;

    private SingleModel() {
    }

    public static synchronized SingleModel getInstance() {
        if (instance == null){
            instance = new SingleModel();
        }
        return instance;
    }
     */

    /** 2.饿汉式 实例在初始化的时候就已经建好了，不管你有没有用到，都先建好了再说。好处是没有线程安全的问题，坏处是浪费内存空间。
    private static SingleModel instance = new SingleModel();

    private SingleModel() {
    }

    public static SingleModel getInstance() {
        return instance;
    }
     */

    /**
     * 3.双检锁(推荐)双检锁，又叫双重校验锁，综合了懒汉式和饿汉式两者的优缺点整合而成。看下面代码实现中，特点是在synchronized关键字内外都加了一层 if 条件判断，这样既保证了线程安全，又比直接上锁提高了执行效率，还节省了内存空间
     */
    private static SingleModel instance;

    private SingleModel() {
    }

    public static SingleModel getInstance() {
        if (instance == null){
            synchronized (SingleModel.class){
                if (instance == null){
                    instance = new SingleModel();
                }
            }
        }
        return instance;
    }

    /** 4.静态内部类 效果类似双检锁，但实现更简单。但这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
    private static class SingleModelHolder{
        private  static final SingleModel INSTANCE = new SingleModel();
    }

    private SingleModel() {
    }

    public static final SingleModel getInstance(){
        return SingleModelHolder.INSTANCE;
    }
     */

    /** 5.枚举-->通过SingleModel.INSTANCE调用 是比较少见的一种实现方式，但是看上面的代码实现，却更简洁清晰。并且她还自动支持序列化机制，绝对防止多次实例化
    public enum SingleModel{
        INSTANCE;
        public void anyMethod(){
        }
    }
     */

    public void showMessage(){
        System.out.println("Hello SingleModel");
    }

    /**
     * 总结下，一般情况下，懒汉式（包含线程安全和线程不安全梁总方式）都比较少用；饿汉式和双检锁都可以使用，可根据具体情况自主选择；在要明确实现 lazy loading 效果时，可以考虑静态内部类的实现方式；若涉及到反序列化创建对象时，大家也可以尝试使用枚举方式。
     */
}
