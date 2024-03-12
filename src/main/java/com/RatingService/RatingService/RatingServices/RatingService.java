package com.RatingService.RatingService.RatingServices;

import com.RatingService.RatingService.Entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingService  {

    //create
    Rating create(Rating rating);
    //get all ratings
    List<Rating> getRatings();
    List<Rating> getRatingByUserId(String userId);
    List<Rating> getRatingByHotelId(String hotelId);


}
