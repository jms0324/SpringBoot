package com.example.umc7th.web.controller;

import com.example.umc7th.apiPayload.ApiResponse;
import com.example.umc7th.converter.MemberConverter;
import com.example.umc7th.converter.ReviewConverter;
import com.example.umc7th.domain.Member;
import com.example.umc7th.domain.Review;
import com.example.umc7th.service.ReviewService.ReviewCommandService;
import com.example.umc7th.web.dto.MemberDto.MemberRequestDTO;
import com.example.umc7th.web.dto.MemberDto.MemberResponseDTO;
import com.example.umc7th.web.dto.ReviewDto.ReviewRequestDTO;
import com.example.umc7th.web.dto.ReviewDto.ReviewResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewRestController {
    private final ReviewCommandService reviewCommandService;

    @PostMapping("/")
    public ApiResponse<ReviewResponseDTO.ReviewResultDTO> join(@RequestBody @Valid ReviewRequestDTO.ReviewCreateDTO request){
        Review review = reviewCommandService.joinReview(request);
        return ApiResponse.onSuccess(ReviewConverter.toReviewResultDTO(review));

    }

}
