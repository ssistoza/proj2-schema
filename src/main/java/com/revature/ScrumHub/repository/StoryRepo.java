package com.revature.ScrumHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.revature.ScrumHub.bean.Story;

public interface StoryRepo extends JpaRepository<Story, Integer> {

	@Modifying(clearAutomatically = true)
	@Query("UPDATE Story st SET st.storyOrder = :ORDER WHERE st.storyId = :ID")
	int reorderStory(@Param("ORDER") int ORDER, @Param("ID") int ID);

	@Modifying(clearAutomatically = true)
	@Query("UPDATE Story st SET st.storyOrder = :ORDER, st.slId = :SWIMLANEID WHERE st.storyId = :ID")
	int moveStoryToSwimlane(@Param("ORDER") int ORDER, @Param("SWIMLANEID") int SWIMLANEID, @Param("ID") int ID);
}
