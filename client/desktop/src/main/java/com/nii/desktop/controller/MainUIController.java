package com.nii.desktop.controller;

import com.nii.desktop.model.device.AdbDevice;
import com.nii.desktop.signal.event.ModeEvent;
import com.nii.desktop.signal.listener.ModeListener;
import com.nii.desktop.signal.type.DeviceEventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.EventListener;
import java.util.ResourceBundle;
import java.util.UUID;

/**
 * Created by wzj on 2017/1/4.
 */
public class MainUIController implements Initializable
{
    private AdbDevice adbDevice = new AdbDevice();

    /**
     * 数字框
     */
    @FXML
    private TextField numTextField;

    /**
     * 名字框
     */
    @FXML
    private TextField nameTextField;

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        registerListener();

        numTextField.setEditable(false);
        adbDevice.setDeviceNumber(0);
    }


    private void registerListener()
    {
        adbDevice.addChangeListener(DeviceEventType.NUMBER_CHANGE, new ModeListener()
        {
            @Override
            public void handleEvent(ModeEvent event)
            {
                numTextField.setText(String.valueOf(adbDevice.getDeviceNumber()));
            }
        });

        adbDevice.addChangeListener(DeviceEventType.NAME_CHANGE, new ModeListener()
        {
            @Override
            public void handleEvent(ModeEvent event)
            {
                nameTextField.setText(event.getSource().toString());
            }
        });
    }

    /**
     * 点击+按钮
     */
    @FXML
    private void upButtonClickAction()
    {
        int num = adbDevice.getDeviceNumber() + 1;
        adbDevice.setDeviceNumber(num);
    }

    /**
     * 点击-按钮
     */
    @FXML
    private void downButtonClickAction()
    {
        int num = adbDevice.getDeviceNumber() - 1;
        adbDevice.setDeviceNumber(num);

        adbDevice.setDeviceName(UUID.randomUUID().toString());
    }

}
