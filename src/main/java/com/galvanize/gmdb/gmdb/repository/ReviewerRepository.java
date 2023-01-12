package com.galvanize.gmdb.gmdb.repository;

import com.galvanize.gmdb.gmdb.entity.Reviewer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReviewerRepository extends JpaRepository<Reviewer,Long> {


    List<Reviewer> findAll();


    Optional <Reviewer> findById(Long id);

}
