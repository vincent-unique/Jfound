package org.trump.vincent.ibatis.exception;

import lombok.Data;

/**
 * Description:
 * User: vincent
 * Date: 2018/12/26
 **/
@Data
public class PersistException extends Exception{
    public static final Integer UNSAFE_ACCESS = new Integer(110);
    public static final Integer ILLEGAL_PARAMETER = new Integer(110);


    private Integer code;
    private String message;

    public PersistException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public PersistException(Integer code, String message, Throwable cause) {
        super(message,cause);
        this.code = code;
    }

    @Override
    public String toString() {
        return
        new StringBuffer("org.trump.vincent.ibatis.exception.PersistException").append("{")
                .append("code:").append(this.code).append(", ")
                .append("message:").append(this.message).append(", ")
                .toString();
    }

}
