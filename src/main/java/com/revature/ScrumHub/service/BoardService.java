package com.revature.ScrumHub.service;

import java.util.List;

import com.revature.ScrumHub.bean.Board;

/**
 * Purpose:
 * - Allowable Methods for the Scrumboard.
 * @author     Shane Avery Sistoza
 */
public interface BoardService {
	
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
	public Board createNewBoard(Board sb);

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
	public Board getBoard(int bId);

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
	public Board updateName(int bId, String newName);

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
