package com.example.umc7th.web.dto.ReviewDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

public class ReviewRequestDTO {
    @Getter
    public static class ReviewCreateDTO {
        @NotNull
        Long memberId;
        @NotNull
        Long storeId;
        String content;
        @NotNull
        float score;

    }

}
