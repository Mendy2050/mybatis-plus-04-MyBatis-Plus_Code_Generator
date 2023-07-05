package com.itheima;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

import java.util.Set;

/**
 * @author Mendy
 * @create 2023-07-05 11:50
 */
public class CodeGenerator {
    public static void main(String[] args) {
        //1.get code generator object
        AutoGenerator autoGenerator = new AutoGenerator();

        // set database configuration
        DataSourceConfig dataSource = new DataSourceConfig();
        dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatisplus_db");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        autoGenerator.setDataSource(dataSource);

        // set global configuration
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/mybatis-plus-04-MyBatis-Plus_Code_Generator/src/main/java");    //Set code generation location
        globalConfig.setOpen(false);     //Set whether to open the directory of generated code after completion
        globalConfig.setAuthor("Heima programmer");    //Set author
        globalConfig.setFileOverride(true);      //Set whether to override original generated files
        globalConfig.setMapperName("%sDao");     //Set data layer interface name, %s is a placeholder, referring to the module name
        globalConfig.setIdType(IdType.ASSIGN_ID);    //Set Id generation strategy
        autoGenerator.setGlobalConfig(globalConfig);

        // set package configuration
        PackageConfig packageInfo = new PackageConfig();
        packageInfo.setParent("com.aaa");    //Set the generated package name； does not conflict with the code location；the two are superimposed to form a complete path
        packageInfo.setEntity("domain");     //Set entity class package name
        packageInfo.setMapper("dao");    //Set data layer package name
        autoGenerator.setPackageInfo(packageInfo);

        // strategy configuration
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("tbl_user");  //Set the table names currently participating in generation, the parameter is variable
        strategyConfig.setTablePrefix("tbl_");    //Set the prefix name of the database table, module name = database table name - prefix name  For example: User = tbl_user - tbl_
        strategyConfig.setRestControllerStyle(true);      //Set whether to enable Rest style
        strategyConfig.setVersionFieldName("version");   //Set optimistic lock field name
        strategyConfig.setLogicDeleteFieldName("deleted");   //Set logical deletion field name
        strategyConfig.setEntityLombokModel(true);   //Set whether to enable lombok
        autoGenerator.setStrategy(strategyConfig);


        //2.Execute generation operation
        autoGenerator.execute();
    }
}

