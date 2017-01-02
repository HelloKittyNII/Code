package com.nii.desktop.util.ui;

import com.nii.desktop.type.CommonConstant;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;


/**
 * Created by wzj on 2016/12/28.
 */
public final class AlertUtil
{
    private AlertUtil()
    {

    }

    /**
     * info alert
     *
     * @param message 信息
     */
    public static void alertInfoLater(final String message)
    {
        Platform.runLater(new Runnable()
        {
            public void run()
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle(CommonConstant.ALERT_INFO_TITLE);
                alert.setContentText(message);
                alert.setHeaderText(null);
                alert.showAndWait();
            }
        });
    }

    /**
     * alert warning message
     *
     * @param message message
     */
    public static void alertWarningLater(final String message)
    {
        Platform.runLater(new Runnable()
        {
            public void run()
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle(CommonConstant.ALERT_WARN_TITLE);
                alert.setContentText(message);
                alert.setHeaderText(null);
                alert.showAndWait();
            }
        });
    }

    /**
     * alert error message
     *
     * @param message message
     */
    public static void alertErrorLater(final String message)
    {
        Platform.runLater(new Runnable()
        {
            public void run()
            {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle(CommonConstant.ALERT_ERROR_TITLE);
                alert.setContentText(message);
                alert.setHeaderText(null);
                alert.showAndWait();
            }
        });
    }

    /**
     * alert confirm message
     * @param message message
     * @return true 确认 | false 没有确认
     */
    public static boolean alertConfirmLater(final String message)
    {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(CommonConstant.ALERT_CONFIRM_TITLE);
        alert.setContentText(message);
        alert.setHeaderText(null);
        Optional<ButtonType> confirm = alert.showAndWait();

        return  confirm.get() == ButtonType.OK;
    }
}
