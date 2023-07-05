package com.itheima;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;

/**
 * @author Mendy
 * @create 2023-07-05 11:19
 */
public class Generator {
    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();

        DataSourceConfig dataSource = new DataSourceConfig();
        dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatisplus_db");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        autoGenerator.setDataSource(dataSource);


        autoGenerator.execute();
    }

}
