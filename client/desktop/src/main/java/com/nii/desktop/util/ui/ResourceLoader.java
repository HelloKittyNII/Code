package com.nii.desktop.util.ui;

import java.net.URL;

/**
 * Created by wzj on 2016/12/25.
 */
public final class ResourceLoader
{
    /**
     * 私有构造函数
     */
    private ResourceLoader()
    {

    }

    public static URL getFxmlResource(String fxmlName)
    {
        String resourcePath = "/fxml/" + fxmlName;
        return ResourceLoader.class.getResource(resourcePath);
    }
}
