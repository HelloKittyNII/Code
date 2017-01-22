package com.nii.desktop.model.device;

import com.nii.desktop.signal.manager.ModeManager;
import com.nii.desktop.signal.type.DeviceEventType;

/**
 * Created by wzj on 2017/1/22.
 */
public class AdbDevice extends ModeManager<DeviceEventType>
{
    private int deviceNumber;

    private String deviceName;

    public int getDeviceNumber()
    {
        return deviceNumber;
    }

    public void setDeviceNumber(int deviceNumber)
    {
        this.deviceNumber = deviceNumber;

        //通知监听器
        notifyListener(DeviceEventType.NUMBER_CHANGE,deviceNumber);
    }

    public String getDeviceName()
    {
        return deviceName;
    }

    public void setDeviceName(String deviceName)
    {
        this.deviceName = deviceName;

        notifyListener(DeviceEventType.NAME_CHANGE,deviceName);
    }
}
