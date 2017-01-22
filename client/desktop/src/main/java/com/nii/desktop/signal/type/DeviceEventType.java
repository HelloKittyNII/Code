package com.nii.desktop.signal.type;

/**
 * Created by wzj on 2017/1/22.
 */
public enum DeviceEventType
{

    /**
     * 数字改变
     */
    NUMBER_CHANGE("Number Change"),

    /**
     * 名字改变
     */
    NAME_CHANGE("Name Change");


    private String desc;

    /**
     * 构造函数
     * @param desc 描述信息
      */
    DeviceEventType(String desc)
    {
        this.desc = desc;
    }

    /**
     * 获取描述信息
     * @return 描述信息
     */
    public String getDesc()
    {
        return desc;
    }
}
