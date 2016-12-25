package com.nii.desktop;

import com.nii.desktop.type.CommonConstant;
import com.nii.desktop.util.ui.ResourceLoader;
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
        primaryStage.setTitle(CommonConstant.LOGIN_WINDOW_TITLE);


        Pane pane = (Pane) FXMLLoader.load(ResourceLoader.getFxmlResource("LoginUI.fxml"));
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
