package frame.starter.common.rest;

public enum RestCode {
    OK(20000, "ok"),
    TOKEN_INVALID(60000, "登陆信息已经过期");

    public final int code;
    public final String msg;

    RestCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
