package io.github.lama9898.miniproject.base.dto;

import io.github.lama9898.miniproject.base.enums.ResultCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ApiResponseDTO<T> {

    private final ResultCode result;
    private final T data;
}


/***
 * Record
    : 값을 담아 전달하는 클래스를 짧게 정의하는 Java 문법, Java16에 도입
 ***/
/*
    public record ApiResponseDTO<T>(ResultCode result, T data){}
 */


// GPT 추천 변수 선언 : var
// Java 10 도입, 초기값으로 지역 변수의 타입을 컴파일 시점에 추론, null/초기값없음 으로 선언 불가