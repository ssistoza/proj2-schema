package com.revature.ScrumHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.revature.ScrumHub.bean.Story;

public interface StoryRepo extends JpaRepository<Story, Integer>{

}
