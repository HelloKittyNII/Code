package com.nii.desktop.model.student;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by wzj on 2018/1/7.
 */
public class Student
{
    private SimpleStringProperty name = new SimpleStringProperty();

    private SimpleIntegerProperty age = new SimpleIntegerProperty();

    private SimpleStringProperty desc = new SimpleStringProperty();

    public Student(String name, Integer age, String desc)
    {
        setName(name);
        setAge(age);
        setDesc(desc);
    }

    public String getName()
    {
        return name.get();
    }

    public SimpleStringProperty nameProperty()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name.set(name);
    }

    public int getAge()
    {
        return age.get();
    }

    public SimpleIntegerProperty ageProperty()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age.set(age);
    }

    public String getDesc()
    {
        return desc.get();
    }

    public SimpleStringProperty descProperty()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc.set(desc);
    }
}
