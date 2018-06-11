package com.mall.cms.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * Mybatis plus 自动生成代码文件工具类
 *
 * @author xujiping
 * @date 2018/6/11 10:09
 */
public class MyBatisPlusGeneratorUtil {

    /**
     * 根据表名自动生成
     *
     * @param serviceNameStartWithI user -> UserService, 设置成true: user -> IUserService
     * @param packageName           例如：com.mall.cms
     * @param tableNames            表名
     */
    public static void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://localhost:3306/mybatis-plus?serverTimezone=GMT";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("LiBin150530%*")
                .setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                //修改替换成你需要的表名，多个表名传数组
                .setInclude(tableNames);
        config.setActiveRecord(false)
                .setAuthor("xujiping")
                .setOutputDir("D:\\Project\\tingduoduo\\mall\\cms\\src\\main\\java")
                .setFileOverride(true);
        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }
        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("entity")
                ).execute();
    }

    /**
     * 自动生成
     * @param url 数据源URL
     * @param username 用户名
     * @param password 密码
     * @param driverName 驱动
     * @param author 作者
     * @param outputDir 输出根目录，当前项目src/main/java目录
     * @param packageName 包名
     * @param superEntity 实体类父类
     * @param tableNames 表名，支持多个表名
     */
    public static void generate(String url, String username, String password, String driverName, String author, String
            outputDir, String packageName, String superEntity, String...
            tableNames) {
        System.out.println(">>>自动代码开始");
        AutoGenerator mpg = new AutoGenerator();
        //全局配置
        GlobalConfig gc = new GlobalConfig();
        //生成的文件目录
        gc.setOutputDir(outputDir);
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        //XML 二级缓存
        gc.setEnableCache(true);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(false);
        //作者
        gc.setAuthor(author);
        gc.setServiceName("%sService");
        mpg.setGlobalConfig(gc);
        //数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(url)
                .setUsername(username)
                .setPassword(password)
                .setDriverName(driverName);
        mpg.setDataSource(dataSourceConfig);
        //策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                //修改替换成你需要的表名，多个表名传数组
                .setInclude(tableNames)
                .setSuperEntityClass(superEntity);
        mpg.setStrategy(strategy);
        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(packageName)
                .setController("controller")
                .setEntity("entity");
        mpg.setPackageInfo(pc);
        mpg.execute();
        System.out.println("自动代码结束<<<");
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tingduoduo?serverTimezone=GMT";
        String username = "root";
        String password = "LiBin150530%*";
        String driverName = "com.mysql.jdbc.Driver";
        String author = "xujiping";
        String outputDir = "D:\\Project\\tingduoduo\\mall\\cms\\src\\main\\java";
        String packageName = "com.mall.cms";
        String superEntity = "com.baomidou.mybatisplus.activerecord.Model";
        generate(url, username, password, driverName, author, outputDir, packageName, superEntity, "cms_user");
        System.out.println("代码生成后，记得Entity文件导入Serializable包");
    }
}
