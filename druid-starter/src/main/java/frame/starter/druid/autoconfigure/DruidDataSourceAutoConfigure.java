package frame.starter.druid.autoconfigure;

import com.alibaba.druid.pool.DruidDataSource;
import frame.starter.druid.autoconfigure.properties.DruidStatProperties;
import frame.starter.druid.autoconfigure.stat.DruidFilterConfiguration;
import frame.starter.druid.autoconfigure.stat.DruidSpringAopConfiguration;
import frame.starter.druid.autoconfigure.stat.DruidStatViewServletConfiguration;
import frame.starter.druid.autoconfigure.stat.DruidWebStatFilterConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/**
 * @Auther: 影风
 * @Date: 2018/7/9 14:39
 * @Description:
 */
@Configuration
@ConditionalOnClass(DruidDataSource.class)
@AutoConfigureBefore(DataSourceAutoConfiguration.class)
@EnableConfigurationProperties({DruidStatProperties.class, DataSourceProperties.class})
@Import({DruidSpringAopConfiguration.class,
        DruidStatViewServletConfiguration.class,
        DruidWebStatFilterConfiguration.class,
        DruidFilterConfiguration.class})
@Slf4j
public class DruidDataSourceAutoConfigure {
    @Bean(initMethod = "init")
    @ConditionalOnMissingBean
    public DataSource dataSource() {
        log.info("Init DruidDataSource");
        return new DruidDataSourceWrapper();
    }
}