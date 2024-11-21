package com.example.umc7th.converter;

import com.example.umc7th.domain.Member;
import com.example.umc7th.domain.Review;
import com.example.umc7th.domain.Store;
import com.example.umc7th.web.dto.ReviewDto.ReviewRequestDTO;
import com.example.umc7th.web.dto.ReviewDto.ReviewResponseDTO;

public class ReviewConverter {

    public static ReviewResponseDTO.ReviewResultDTO toReviewResultDTO(Review review) {
        return ReviewResponseDTO.ReviewResultDTO.builder()
                .reviewId(review.getId())
                .createdAt(review.getCreatedAt())
                .build();
    }


    public static Review toReview(ReviewRequestDTO.ReviewCreateDTO request, Member member, Store store){
        return Review.builder()
                .member(member)
                .store(store)
                .body(request.getContent())
                .score(request.getScore())
                .build();
    }
}
