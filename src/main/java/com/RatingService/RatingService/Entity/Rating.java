package com.RatingService.RatingService.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="rating")
public class Rating {

    @Id
    @Column(name ="ratingId")
    private String ratingId;
    @Column(name="userId")
    private String userId;
    @Column(name="hotelId")
    private String hotelId;
    @Column(name="rating")
    private  int rating;
    @Column(name="feedback")
    private String feedback;
}
