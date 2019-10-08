package com.share;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
 
/**
 *
 * @ClassName: CodeGeneration
 * @Description: 代码生成器
 * @author yixin
 * @date 2019-05-05 下午2:55:14
 */
public class CodeGeneration {
 
    /**
     *
     * @Title: main
     * @Description: 生成
     * @param args
     */
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
 
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("D://zx"); //输出文件路径 D://STS_workspace//shareInformation//shareInformation//src//test//java//com//share//
        gc.setFileOverride(true);
        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setAuthor("yixin");// 作者
 
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        mpg.setGlobalConfig(gc);
 
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        //dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://localhost:3306/booksSharing?serverTimezone=UTC");
        mpg.setDataSource(dsc);
 
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setTablePrefix(new String[] { "book_share_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(new String[] { 
        		"book_share_address"
        		,"book_share_authentication"
				,"book_share_childrensbooks"
				,"book_share_classification"
				,"book_share_pictures"
				,"book_share_shops" 
				,"book_share_users"
        		}); // 需要生成的表
 
        strategy.setSuperServiceClass(null);
        strategy.setSuperServiceImplClass(null);
        strategy.setSuperMapperClass(null);
 
        mpg.setStrategy(strategy);
 
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.zyx.books");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("mapper");
        pc.setEntity("model");
        pc.setXml("mapper");
        mpg.setPackageInfo(pc);
 
        // 执行生成
        mpg.execute();
 
    }
 
}