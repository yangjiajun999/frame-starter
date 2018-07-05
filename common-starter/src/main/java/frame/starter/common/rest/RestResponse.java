package frame.starter.common.rest;

import lombok.Data;

@Data
public class RestResponse<T> {
    private int code;
    private String msg;
    private T data;

    public static <T> RestResponse<T> success() {
        return new RestResponse<T>();
    }

    public static <T> RestResponse<T> success(T data) {
        RestResponse response = new RestResponse<T>();
        response.setData(data);
        return response;
    }

    public static <T> RestResponse<T> error(RestCode code) {
        return new RestResponse<T>(code.code, code.msg);
    }

    private RestResponse() {
        this(RestCode.OK.code, RestCode.OK.msg);
    }

    private RestResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
