package com.nii.desktop.signal.manager;

import com.nii.desktop.signal.event.ModeEvent;
import com.nii.desktop.signal.listener.ModeListener;

import java.util.*;

/**
 * Created by wzj on 2017/1/22.
 */
public class ModeManager<T>
{
    /**
     * 事件监听器的存储Map
     */
    private Map<T, List<ModeListener>> listenerMap =
            new HashMap<T, List<ModeListener>>();

    /**
     * 注册监听器
     * @param type 类型
     * @param listener 监听器类型
     */
    public void addChangeListener(T type,ModeListener listener)
    {
        List<ModeListener> listenerList = listenerMap.get(type);

        //如果暂时没有该类型的监听器
        if (listenerList == null)
        {
            listenerList = new ArrayList<ModeListener>();
            listenerList.add(listener);
            listenerMap.put(type,listenerList);

            return;
        }

        listenerList.add(listener);
    }

    /**
     * 是否成功移除
     * @param type 类型
     * @param listener 监听器
     * @return 移除结果 true 成功 | false 不存在或者移除失败
     */
    public boolean removeChangeListener(T type,ModeListener listener)
    {
        List<ModeListener> listenerList = listenerMap.get(type);

        if (listenerList == null)
        {
            return false;
        }

        return listenerList.remove(listener);
    }

    /**
     * 通知所有的监听器
     * @param type
     * @param source
     */
    protected void notifyListener(T type, Object source)
    {
        List<ModeListener> listenerList = listenerMap.get(type);

        if (listenerList == null)
        {
            return;
        }

        for (ModeListener listener : listenerList)
        {
            listener.handleEvent(new ModeEvent(source));
        }
    }
}
