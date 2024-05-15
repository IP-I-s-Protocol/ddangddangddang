package com.ip.ddangddangddang.domain.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {

    private T data;

    public static <T> Response<T> ok(T data) {
        return Response.<T>builder()
            .data(data)
            .build();
    }

}
