package com.nii.desktop.controller;

import com.nii.desktop.util.ui.AlertUtil;
import com.nii.desktop.util.ui.ResourceBundleUtil;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Created by wzj on 2016/12/25.
 */
public class LoginUIController implements Initializable
{
    private final static Logger LOGGER = LoggerFactory.getLogger(LoginUIController.class);

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    public void initialize(URL location, ResourceBundle resources)
    {

    }

    /**
     * Click Entry Button
     */
    @FXML
    private void entryButtonClickAction()
    {
        AlertUtil.alertErrorLater(ResourceBundleUtil.getStringValue("login.failed"));
    }

    /**
     * Click Clear Button
     */
    @FXML
    private void clearButtonClickAction()
    {


        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println(AlertUtil.alertConfirmLater(ResourceBundleUtil.getStringValue("login.failed")));
            }
        }).start();
    }
}
