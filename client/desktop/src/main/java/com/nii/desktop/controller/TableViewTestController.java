package com.nii.desktop.controller;

import com.nii.desktop.core.task.TaskExecutor;
import com.nii.desktop.model.student.Student;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by wzj on 2018/1/7.
 */
public class TableViewTestController implements Initializable
{

    /**
     * 表格
     */
    @FXML
    private TableView<Student> studentTableView;


    /**
     * 数据
     */
    ObservableList<Student> data = FXCollections.observableArrayList();

    /**
     * name列
     */
    @FXML
    TableColumn<Student,String> nameCol;

    /**
     * name列
     */
    @FXML
    TableColumn<Student,Integer> ageCol;

    /**
     * name列
     */
    @FXML
    TableColumn<Student,String> descCol;


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
        nameCol.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        ageCol.setCellValueFactory(new PropertyValueFactory<Student, Integer>("age"));
        descCol.setCellValueFactory(new PropertyValueFactory<Student, String>("desc"));

        studentTableView.setItems(data);

        Platform.runLater(new Runnable()
        {
            @Override
            public void run()
            {
                initData();
            }
        });

    }

    /**
     * 初始化表格数据
     */
    private void initData()
    {
        data.add(new Student("张三",10,"数学好"));
        data.add(new Student("李四",13,"学习非常努力"));
        data.add(new Student("王五",16,"好学生"));
    }
}
