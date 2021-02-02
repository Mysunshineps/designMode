package com.psq.design.controller;

import com.psq.design.model.FacadeShapeMaker;

/**
 * @Description 外观模式 客户端
 * @Author psq
 * @Date 2021/2/2/16:14
 */
public class FacadeModeController {
    /**
     * 优点： 1、减少系统相互依赖。 2、提高灵活性。 3、提高了安全性。
     * 缺点：不符合开闭原则，如果要改东西很麻烦，继承重写都不合适。
     *
     * 使用场景： 1、为复杂的模块或子系统提供外界访问的模块。 2、子系统相对独立。 3、预防低水平人员带来的风险。
     * 注意事项：在层次化结构中，可以使用外观模式定义系统中每一层的入口。
     * @param args
     */
    public static void main(String[] args) {
        FacadeShapeMaker facadeShapeMaker = new FacadeShapeMaker();

        facadeShapeMaker.drawRectangle();
        facadeShapeMaker.drawSquare();
    }
}
