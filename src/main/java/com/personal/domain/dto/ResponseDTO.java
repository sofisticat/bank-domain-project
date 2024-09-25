package com.personal.domain.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(
    name = "Success Response",
    description = "Response for no return type requests."
)
public class ResponseDTO {
    private long statusCode;
    private String statusMessage;
}
