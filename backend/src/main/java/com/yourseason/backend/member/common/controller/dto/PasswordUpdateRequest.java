package com.yourseason.backend.member.common.controller.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PasswordUpdateRequest {

    private String beforePassword;
    private String afterPassword;
}
