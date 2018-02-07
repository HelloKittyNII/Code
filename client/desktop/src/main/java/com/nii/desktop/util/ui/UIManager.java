package com.nii.desktop.util.ui;

import com.nii.desktop.decorate.StageDecorate;
import com.nii.desktop.type.CommonConstant;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by wzj on 2016/12/25.
 */
public final class UIManager
{
    /**
     * 日志
     */
    private final static Logger LOGGER = LoggerFactory.getLogger(UIManager.class);

    /**
     * title的个高度
     */
    private final static int MAIN_TITLE_HEIGHT = 70;

    /**
     * 系统stage
     */
    private static Stage primaryStage;

    /**
     * 私有构造函数
     */
    private UIManager()
    {

    }

    public static Stage getPrimaryStage()
    {
        return primaryStage;
    }

    public static void setPrimaryStage(Stage stage)
    {
        primaryStage = stage;
    }

    /**
     * 切换到登录界面
     */
    public static void switchLoginUI()
    {
        primaryStage.setTitle(CommonConstant.LOGIN_WINDOW_TITLE);

        //隐藏标题栏
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        Pane pane = null;
        try
        {
            pane = (Pane) FXMLLoader.load(ResourceLoader.getFxmlResource("LoginUI.fxml"));
        }
        catch (IOException e)
        {
            LOGGER.error("Switch login UI failed",e);
        }

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    /**
     * 切换到主窗口页面
     */
    public static void switchMainUI()
    {
        primaryStage.setTitle(CommonConstant.LOGIN_WINDOW_TITLE);


        AnchorPane pane = null;
        try
        {
            pane = FXMLLoader.load(ResourceLoader.getFxmlResource("Container.fxml"));
        }
        catch (IOException e)
        {
            LOGGER.error("Switch main UI failed",e);
        }

        StageDecorate.decorate(primaryStage,pane,MAIN_TITLE_HEIGHT);

        setStageOnCenter();
        primaryStage.show();
    }

    private static void setStageOnCenter()
    {
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
        primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);
    }
}
