package frame.starter.swagger.properties.enums;

/**
 * @Auther: 影风
 * @Date: 2018/7/6 上午9:05
 * @Description: 授权路径
 */
public enum PathType {
    /**
     * 所有地址都进行授权
     */
    ANY("any"),
    /**
     * 所有地址都不进行授权
     */
    NONE("none"),
    /**
     * 根据正则进行匹配
     */
    REGEX("regex"),;

    private String path;

    PathType(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
