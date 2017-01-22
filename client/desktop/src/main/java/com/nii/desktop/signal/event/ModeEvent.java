package com.nii.desktop.signal.event;

import java.util.EventObject;

/**
 * Created by wzj on 2017/1/22.
 */
public class ModeEvent extends EventObject
{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ModeEvent(Object source)
    {
        super(source);
    }
}
