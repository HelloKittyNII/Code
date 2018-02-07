package com.nii.desktop.test;

import com.nii.desktop.util.ui.ResourceLoader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by wzj on 2018/2/7.
 */
public class AutoSizeApplication extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        AnchorPane pane = null;
        try
        {
            pane = FXMLLoader.load(ResourceLoader.getFxmlResource("Container.fxml"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        // 将pane加入到Scen中
        Scene scene = new Scene(pane, 500, 500);

        // 设置stage的scen，然后显示我们的stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();

    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
