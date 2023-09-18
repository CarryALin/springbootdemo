package com.testencrypt.project.springbootdemo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author codvision
 */
public class DataSourceContextHolder {
    public static final Logger log = LoggerFactory.getLogger(com.testencrypt.project.springbootdemo.config.DataSourceContextHolder.class);

    /**
     * 默认数据源
     */
    public static final String DEFAULT_DS = "write";

    /**
     * 指示当前数据库，负责当前使用数据库的切换
     */
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDb(String dbType) {
        // 设置数据源名
        log.debug("切换到{}数据源", dbType);
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDb() {
        // 获取数据源名
        return (CONTEXT_HOLDER.get());
    }

    public static void clearDb() {
        // 清除数据源名
        CONTEXT_HOLDER.remove();
    }
}
