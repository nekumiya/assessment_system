package com.kexie.academic_early_warning.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 欲隐君。 on 2021/3/13
 */

@Configuration
@MapperScan({"com.kexie.academic_early_warning.mbg.mapper","com.kexie.academic_early_warning.dao"})
public class MybatisGeneratorConfig {
}
