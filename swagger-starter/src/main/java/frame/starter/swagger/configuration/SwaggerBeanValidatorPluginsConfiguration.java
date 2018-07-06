package frame.starter.swagger.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;

/**
 * @Auther: 影风
 * @Date: 2018/7/6 上午9:25
 * @Description: 
 */
@Configuration
@ConditionalOnProperty(name = {"spring.swagger.enabled", "spring.swagger.validator-plugin"}, havingValue = "true")
public class SwaggerBeanValidatorPluginsConfiguration extends BeanValidatorPluginsConfiguration {
}
