package frame.starter.swagger.model;

/**
 * @Auther: 影风
 * @Date: 2018/7/6 上午9:13
 * @Description: 方便Swagger 中 @ApiImplicitParam(paramType = DataType.HEADER)
 */
public final class ParamType {
    public final static String QUERY = "query";
    public final static String HEADER = "header";
    public final static String PATH = "path";
    public final static String BODY = "body";
    public final static String FORM = "form";
}
