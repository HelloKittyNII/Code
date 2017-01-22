package com.nii.desktop.signal.listener;

import com.nii.desktop.signal.event.ModeEvent;

import java.util.EventListener;

/**
 * Created by wzj on 2017/1/23.
 */
public interface ModeListener extends java.util.EventListener
{
    //必须实现的接口
    void handleEvent(ModeEvent event);
}
