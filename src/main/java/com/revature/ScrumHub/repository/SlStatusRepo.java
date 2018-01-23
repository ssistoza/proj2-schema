package com.revature.ScrumHub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.revature.ScrumHub.bean.SlStatus;

@Repository
public interface SlStatusRepo extends PagingAndSortingRepository<SlStatus, Integer>{

}
