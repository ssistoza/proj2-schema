package com.revature.ScrumHub.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.revature.ScrumHub.bean.Swimlane;

public interface SwimlaneRepo extends PagingAndSortingRepository<Swimlane, Integer>{
	
	@Modifying(clearAutomatically = true)
    @Query("UPDATE Swimlane SW SET SW.slOrder = :SL_ORDER WHERE SW.slId = :SL_ID")
    int updateSlOrder(@Param("SL_ORDER") int SL_ORDER, @Param("SL_ID") int SL_ID);
}
