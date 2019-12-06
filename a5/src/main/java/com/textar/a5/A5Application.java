package com.textar.a5;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;

@SpringBootApplication(scanBasePackages= {"com.textar"})
//@EnableJpaRepositories(basePackages="com.textar.dao")
@EntityScan(basePackages="com.textar.pojo")
@MapperScan(basePackages="com.textar",annotationClass= Repository.class)
//@MapperScan(basePackages="com.textar.*")
public class A5Application {

    public static void main(String[] args) {
        SpringApplication.run(A5Application.class, args);
    }
    @Autowired
    SqlSessionFactory sqlSessionFactory = null;
}
