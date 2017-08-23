package com.nii.desktop.dialog;

import com.nii.desktop.widget.dialog.ModalDialog;
import com.nii.desktop.model.host.HostServer;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Created by wzj on 2017/1/2.
 */
public class HostServerDialog<R> extends ModalDialog
{
    @FXML
    private TextField serverTextField;

    private HostServer hostServer;

    /**
     * click ok button
     */
    @FXML
    private void okButtonClickAction()
    {
        hostServer.setServerName(serverTextField.getText());

        isOkClicked = true;
        dialogStage.close();


    }

    /**
     * click cancel button
     */
    @FXML
    private void cancelButtonClickAction()
    {
        isOkClicked = false;
        dialogStage.close();
    }

    /**
     * set param
     *
     * @param param
     */
    @Override
    public void setParam(Object param)
    {
        this.hostServer = (HostServer) param;
        serverTextField.setText(hostServer.getServerName());
    }
}
