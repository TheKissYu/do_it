package com.yuhaoze.do_it.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @author yuhaoze
 * @date 2019-06-19 10:28
 */


public class PropertiesUtil {
    private static Properties properties;
    private static final Logger log = LoggerFactory.getLogger(PropertiesUtil.class);

    static {
        String fileName = "application.properties";
        properties = new Properties();

        try {
            properties.load(new InputStreamReader(PropertiesUtil.class.getClassLoader().getResourceAsStream(fileName), "UTF-8"));
        } catch (IOException e) {
            log.info("配置文件读取异常", e);
        }
    }


    /**
     * 读取配置文件对应值
     *
     * @param key
     * @return
     */
    public static String getProperty(String key) {
        String value = properties.getProperty(key.trim());
        if (StringUtils.isBlank(value)) {
            return null;
        }
        return value.trim();
    }

    /**
     * 读取配置文件值
     *
     * @param key
     * @param defaultValue 默认值
     * @return
     */
    public static String getProperty(String key, String defaultValue) {
        String value = properties.getProperty(key.trim());
        if (StringUtils.isBlank(value)) {
            value = defaultValue;
        }
        return value.trim();
    }


}
