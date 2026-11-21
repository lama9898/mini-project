package io.github.lama9898.miniproject.base.exception;

import io.github.lama9898.miniproject.base.enums.ErrorCode;
import lombok.Getter;

@Getter
public class ApiException extends RuntimeException{
    /*
        * 서비스에서 에러 발생 시 만들어둔 Error Code를 담아서 예외 처리기로 전달
        * throw 할 수 있는 예외가 됨
        * throw new ApiException(ErrorCode.---);
    */

    private final ErrorCode errorCode;

    public ApiException(ErrorCode errorCode){
        super(errorCode.getMessage());  //exception.getMessage() 로도 읽을 수 있음
        this.errorCode = errorCode;
    }
}
