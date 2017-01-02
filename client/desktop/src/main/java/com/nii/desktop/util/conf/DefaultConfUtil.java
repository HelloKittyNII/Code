package com.nii.desktop.util.conf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.URL;
import java.util.Properties;

/**
 * Created by wzj on 2017/1/1.
 */
public final class DefaultConfUtil
{
    /**
     * 日志
     */
    private final static Logger LOGGER = LoggerFactory.getLogger(DefaultConfUtil.class);

    /**
     * 私有构造函数
     */
    private DefaultConfUtil()
    {

    }

    /**
     * 获取默认的properties
     * @return Properties
     */
    public static Properties getDefaultProperties()
    {
        Properties defaultProperties = new Properties();

        InputStream inStream = DefaultConfUtil.class.getResourceAsStream("/conf/default.properties");

        try
        {
            defaultProperties.load(inStream);
        }
        catch (IOException e)
        {
            LOGGER.error("Get default properties error.",e);
        }

        return defaultProperties;
    }

    /**
     * get String vale
     * @param key key
     * @return 结果
     */
    public static String getStringValue(String key)
    {
        Properties defaultProperties = getDefaultProperties();
        return defaultProperties.getProperty(key);
    }

    /**
     * 往文件里面写入内容
     * @param key key
     * @param value value
     * @return true 成功 | false 失败
     */
    public static boolean writeKeyValue(String key, String value)
    {
        Properties defaultProperties = getDefaultProperties();
        defaultProperties.setProperty(key,value);

        try
        {
            FileOutputStream outputStream = new FileOutputStream("d:/test.properties");
            defaultProperties.store(outputStream,"save");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            return false;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
