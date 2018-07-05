package frame.starter.swagger;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author yangjiajun
 * Create date ：2017/8/7
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({SwaggerAutoConfiguration.class})
public @interface EnableSwagger2Doc {
}
