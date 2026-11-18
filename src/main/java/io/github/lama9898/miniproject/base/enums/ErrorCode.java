package io.github.lama9898.miniproject.base.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    // 회원/인증
    DUPLICATE_USERNAME  ("U001", "이미 존재하는 사용자입니다.", HttpStatus.CONFLICT),
    USER_NOT_FOUND      ("U002", "사용자를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    INVALID_CREDENTIALS ("A001", "아이디 또는 비밀번호가 올바르지 않습니다.", HttpStatus.UNAUTHORIZED),

    // 토큰
    INVALID_TOKEN       ("T001", "유효하지 않은 토큰입니다.", HttpStatus.UNAUTHORIZED),
    EXPIRED_TOKEN       ("T002", "만료된 토큰입니다.", HttpStatus.UNAUTHORIZED),

    // 인가
    ACCESS_DENIED       ("P001", "접근 권한이 없습니다.", HttpStatus.FORBIDDEN),

    // 기타
    INTERNAL_ERROR      ("E001", "서버 오류가 발생했습니다.", HttpStatus.INTERNAL_SERVER_ERROR);

    private final String code;
    private final String message;
    private final HttpStatus status;

}
