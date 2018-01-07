package com.nii.desktop.decorate;

import javafx.application.Platform;
import javafx.scene.effect.Light;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by wzj on 2016-03-03.
 */
public class StageMove
{

    private Stage stage;
    private Light.Point point = new Light.Point();

    public StageMove(Stage stage)
    {
        this.stage = stage;
    }

    public void bindDrag(Pane control)
    {
        control.setOnMousePressed(event ->
        {
            point.setX(stage.getX() - event.getScreenX());
            point.setY(stage.getY() - event.getScreenY());
        });

        control.setOnMouseReleased(event ->
        {
            if (stage.getY() < 0)
            {
                stage.setY(0);
            }
        });

        control.setOnMouseDragged(event ->
        {
            if (stage.isFullScreen())
            {
                return;
            }

            double x = (event.getScreenX() + point.getX());
            double y = (event.getScreenY() + point.getY());

            Platform.runLater(() ->
            {
                stage.setX(x);
                stage.setY(y);
            });

        });
    }
}
