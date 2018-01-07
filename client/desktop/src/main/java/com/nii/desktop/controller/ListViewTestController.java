package com.nii.desktop.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by wzj on 2017/11/1.
 */
public class ListViewTestController implements Initializable
{
    /**
     * listview
     */
    @FXML
    private ListView studentListView;

    /**
     * listciew数据
     */
    private ObservableList<String> dataList = FXCollections.observableArrayList();

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        studentListView.setItems(dataList);

        dataList.add("张三");
        dataList.add("李四");
        dataList.add("王五");
        dataList.add("李华");

        dataList.add("张三");
        dataList.add("李四");
        dataList.add("王五");
        dataList.add("李华");

        dataList.add("张三");
        dataList.add("李四");
        dataList.add("王五");
        dataList.add("李华");

    }
}
