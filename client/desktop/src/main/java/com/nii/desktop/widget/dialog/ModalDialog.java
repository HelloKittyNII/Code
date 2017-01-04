package com.nii.desktop.widget.dialog;

import javafx.stage.Stage;

/**
 * Created by wzj on 2017/1/2.
 */
public abstract class ModalDialog<R>
{
    /**
     * stage
     */
    protected Stage dialogStage;

    /**
     * is ok
     */
    protected boolean isOkClicked = false;

    /**
     * 构造函数
     */
    public ModalDialog()
    {
        isOkClicked = false;
    }

    /**
     * 设置stage
     * @param stage stage
     */
    public void setDialogStage(Stage stage)
    {
        this.dialogStage = stage;
    }

    /**
     * is ok click
     * @return true 点击了 | false 没有点击
     */
    public boolean isOkClicked()
    {
        return isOkClicked;
    }

    /**
     * set param
     * @param param
     */
    abstract public void setParam(R param);
}

