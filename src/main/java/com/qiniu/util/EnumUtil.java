package com.qiniu.util;

import com.qiniu.model.ProductTypeEnum;

/**
 * Created by lacomw on 2017/10/6.
 */
public class EnumUtil {

    public static ProductTypeEnum getProductEnum(String name){
        ProductTypeEnum productTypeEnum = ProductTypeEnum.valueOf(name);
        System.out.println(productTypeEnum.name());
        return productTypeEnum;
    }

}
