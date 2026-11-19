package io.github.lama9898.miniproject.base.dto;

import io.github.lama9898.miniproject.base.enums.ResultCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ErrorResponseDTO {

    private final ResultCode result;
    private final String code;
    private final String message;

}


/*
    public record ErrorResponseDTO(ResultCode result, String code, String message){}
 */