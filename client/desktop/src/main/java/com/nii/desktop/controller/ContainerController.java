package com.nii.desktop.controller;

import com.nii.desktop.util.ui.ResourceLoader;
import com.nii.desktop.util.ui.UIManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by wzj on 2018/2/7.
 */
public class ContainerController implements Initializable
{
    /**
     * 日志
     */
    private final static Logger LOGGER = LoggerFactory.getLogger(ContainerController.class);

    /**
     * container pane
     */
    @FXML
    private StackPane containerPane;



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
        SplitPane pane = null;
        try
        {
            pane = FXMLLoader.load(ResourceLoader.getFxmlResource("MainUI.fxml"));
        }
        catch (IOException e)
        {
            LOGGER.error("Switch main UI failed",e);
        }

        containerPane.getChildren().addAll(pane);
    }
}
