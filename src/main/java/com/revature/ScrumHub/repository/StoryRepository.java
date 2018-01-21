package com.revature.ScrumHub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.revature.ScrumHub.bean.Story;

public interface StoryRepository extends PagingAndSortingRepository<Story, Integer>{

}
