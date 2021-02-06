package com.psq.design.service;

import com.psq.design.model.Context;

/**
 * @Description 状态模式
 * @Author psq
 * @Date 2021/2/5/14:29
 */
public interface State {
    public void doAction(Context context);
}
