package com.example.springlem.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateUserRequestDTO(
        @NotBlank @Size(min = 0,max = 20) String firstName,
        @NotBlank String lastName

) {
}
