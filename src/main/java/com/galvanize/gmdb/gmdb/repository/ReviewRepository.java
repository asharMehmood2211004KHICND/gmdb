package com.galvanize.gmdb.gmdb.repository;

import com.galvanize.gmdb.gmdb.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
