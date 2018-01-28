package com.revature.ScrumHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.revature.ScrumHub.bean.Board;
import com.revature.ScrumHub.bean.BoardMember;
import com.revature.ScrumHub.bean.BoardMemberId;

@Repository
public interface BoardMemberRepo extends JpaRepository<BoardMember, BoardMemberId>{
	
	@Modifying(clearAutomatically = true)
    @Query("DELETE FROM BoardMember bm WHERE bm.sboard = :BID AND bm.boardMemberId = :UID")
    int deleteMember(@Param("BID") Board BID, @Param("UID") int UID);
}
