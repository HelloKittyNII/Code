package com.nii.desktop.decorate;

import com.nii.desktop.controller.TitleController;
import com.nii.desktop.util.ui.ResourceLoader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by wzj on 2017/8/20.
 */
public abstract class StageDecorate
{
    /**
     * 装饰某个面板
     * @param stage stage
     * @param parent
     * @param height title的高度
     */
    public static void decorate(Stage stage, Parent parent,int height)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(ResourceLoader.getFxmlResource("title2.fxml"));
            fxmlLoader.load();

            TitleController controller = fxmlLoader.getController();
            controller.setStage(stage,height);
            controller.addContent(parent);

            Scene scene = new Scene(fxmlLoader.getRoot());
            scene.setFill(Color.TRANSPARENT);
            scene.getStylesheets().add(StageDecorate.class.getResource("/css/default.css").toExternalForm());
            stage.setScene(scene);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
