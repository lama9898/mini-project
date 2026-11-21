package io.github.lama9898.miniproject.base.exception;

import io.github.lama9898.miniproject.base.dto.ErrorResponseDTO;
import io.github.lama9898.miniproject.base.enums.ErrorCode;
import io.github.lama9898.miniproject.base.enums.ResultCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    /*
         * controller가 service를 호출하다 예외 발생 시, 그 예외가 controller까지 전파되면 공통으로 받아서 HTTP 상태와 에러 JSON으로 바꿔줌
         * throw new ApiException(ErrorCode.---);
     */

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ErrorResponseDTO> handleApiException(ApiException exception){
        ErrorCode errorCode = exception.getErrorCode();

        ErrorResponseDTO response = new ErrorResponseDTO(
                ResultCode.ERROR, errorCode.getCode(), errorCode.getMessage()
        );

        return ResponseEntity
                .status(errorCode.getStatus())
                .body(response);
    }
}
