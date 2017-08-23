package com.nii.desktop;

import com.nii.desktop.adb.DeviceManager;
import com.nii.desktop.type.CommonConstant;
import com.nii.desktop.util.ui.ResourceLoader;
import com.nii.desktop.util.ui.UIManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * desktop 的启动类
 * Created by wzj on 2016/12/18.
 */
public class Start extends Application
{
    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     * <p>
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set. The primary stage will be embedded in
     *                     the browser if the application was launched as an applet.
     *                     Applications may create other stages, if needed, but they will not be
     *                     primary stages and will not be embedded in the browser.
     */
    public void start(Stage primaryStage) throws Exception
    {
        UIManager.setPrimaryStage(primaryStage);

        startDeviceManager();

        UIManager.switchLoginUI();
    }

    public static void main(String[] args)
    {
        launch(args);
    }

    private void startDeviceManager()
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                DeviceManager.getInstance().start();
            }
        }).start();
    }
}
