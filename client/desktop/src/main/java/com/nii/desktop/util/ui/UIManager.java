package com.nii.desktop.util.ui;

import javafx.stage.Stage;

/**
 * Created by wzj on 2016/12/25.
 */
public final class UIManager
{

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
}
