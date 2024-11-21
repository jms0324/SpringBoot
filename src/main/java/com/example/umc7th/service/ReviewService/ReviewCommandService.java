
package com.example.umc7th.service.ReviewService;


import com.example.umc7th.domain.Review;
import com.example.umc7th.web.dto.ReviewDto.ReviewRequestDTO;
import org.springframework.stereotype.Service;


public interface ReviewCommandService {

    Review joinReview(ReviewRequestDTO.ReviewCreateDTO request);


}
