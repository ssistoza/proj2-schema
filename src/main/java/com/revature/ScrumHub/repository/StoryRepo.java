package com.revature.ScrumHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.ScrumHub.bean.Story;

public interface StoryRepo extends JpaRepository<Story, Integer>{

}
