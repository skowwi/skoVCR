package com.skowwi.skoVCR;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skowwi.skoVCR.model.Series;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Long> {

	List<Series> findByTitleLike(String title);
	
}
