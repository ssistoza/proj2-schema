package com.revature.ScrumHub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.revature.ScrumHub.bean.Swimlane;

public interface SwimlaneRepo extends PagingAndSortingRepository<Swimlane, Integer>{

}
