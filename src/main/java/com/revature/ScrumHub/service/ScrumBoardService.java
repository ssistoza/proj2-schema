package com.revature.ScrumHub.service;

import java.util.List;

import com.revature.ScrumHub.bean.ScrumBoard;

/**
 * Purpose:
 * - Allowable Methods for the Scrumboard.
 * @author     Shane Avery Sistoza
 */
public interface ScrumBoardService {
	
	// Create

	/**
	 * Purpose:
	 *  - Create the new board in to the database.
	 * @author     Shane Avery Sistoza
	 *
	 * @param      sb    The new ScrumBoard to persist.
	 *
	 * @return     The ScrumBoard that was inserted.
	 */
	public ScrumBoard createNewBoard(ScrumBoard sb);

	// Retreive

	/**
	 * Purpose:
	 *  - Return the ScrumBoard.
	 * @author     Shane Avery Sistoza
	 *
	 * @param      bId   The board id.
	 *
	 * @return     The Scrum Board.
	 */
	public ScrumBoard getBoard(int bId);

	/**
	 * Purpose:
	 *   - Return a list of ScrumBoards owned by the user.
	 * @author     Shane Avery Sistoza
	 *
	 * @param      scrumUserId  The scrum user identifier
	 *
	 * @return     All user boards.
	 */
	public List<ScrumBoard> getAllUserBoards(int scrumUserId);

	// Update

	/**
	 * Purpose:
	 *   - Update the name of the scrum board.
	 * @author     Shane Avery Sistoza
	 *
	 * @param      bId      The board id.
	 * @param      newName  The new name of the board.
	 *
	 * @return     The updated ScrumBoard.
	 */
	public ScrumBoard updateName(int bId, String newName);

	// Delete

	/**
	 * Purpose:
	 *  - Delete the board.
	 * @author     Shane Avery Sistoza
	 *
	 * @param      bId    The board id.
	 *
	 * @return     the number of rows deleted.
	 *   - Should be One.
	 */
	public int deleteBoard(int bId);
}
