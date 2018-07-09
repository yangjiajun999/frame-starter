package frame.starter.druid.autoconfigure.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther: 影风
 * @Date: 2018/7/9 14:41
 * @Description: druid自动配置类
 */
@ConfigurationProperties("spring.datasource.druid")
@Data
public class DruidStatProperties {
    private String[] aopPatterns;
    private StatViewServlet statViewServlet = new StatViewServlet();
    private WebStatFilter webStatFilter = new WebStatFilter();

    @Data
    public static class StatViewServlet {
        /**
         * Enable StatViewServlet.
         */
        private boolean enabled = true;
        private String urlPattern;
        private String allow;
        private String deny;
        private String loginUsername;
        private String loginPassword;
        private String resetEnable;
    }

    @Data
    public static class WebStatFilter {
        /**
         * Enable WebStatFilter.
         */
        private boolean enabled = true;
        private String urlPattern;
        private String exclusions;
        private String sessionStatMaxCount;
        private String sessionStatEnable;
        private String principalSessionName;
        private String principalCookieName;
        private String profileEnable;
    }
}