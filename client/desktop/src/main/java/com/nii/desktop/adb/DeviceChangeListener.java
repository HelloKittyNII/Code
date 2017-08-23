package com.nii.desktop.adb;

import com.android.ddmlib.AndroidDebugBridge;
import com.android.ddmlib.IDevice;

/**
 * Created by wzj on 2017/8/21.
 */
public class DeviceChangeListener implements AndroidDebugBridge.IDeviceChangeListener
{
    /**
     * Sent when the a device is connected to the {@link AndroidDebugBridge}.
     * <p>
     * This is sent from a non UI thread.
     *
     * @param device the new device.
     */
    @Override
    public void deviceConnected(IDevice device)
    {
        System.out.println("Device connect " + device.getSerialNumber());
    }

    /**
     * Sent when the a device is connected to the {@link AndroidDebugBridge}.
     * <p>
     * This is sent from a non UI thread.
     *
     * @param device the new device.
     */
    @Override
    public void deviceDisconnected(IDevice device)
    {
        System.out.println("Device disconnect " + device.getSerialNumber());
    }

    /**
     * Sent when a device data changed, or when clients are started/terminated on the device.
     * <p>
     * This is sent from a non UI thread.
     *
     * @param device     the device that was updated.
     * @param changeMask the mask describing what changed. It can contain any of the following
     *                   values: {@link IDevice#CHANGE_BUILD_INFO}, {@link IDevice#CHANGE_STATE},
     *                   {@link IDevice#CHANGE_CLIENT_LIST}
     */
    @Override
    public void deviceChanged(IDevice device, int changeMask)
    {
        if (device.isOnline())
        {
            System.out.println("Device change online " + device.getSerialNumber());
        }
        else
        {
            System.out.println("Device change offline " + device.getSerialNumber());
        }
    }
}
