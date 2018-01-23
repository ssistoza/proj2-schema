package com.revature.ScrumHub.service;

import java.util.List;

import com.revature.ScrumHub.bean.ScrumUser;

/**
 * 
 * @author Jeffrey Camacho
 *
 */
public interface ScrumUserService {
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	public ScrumUser createNewScrumUser(ScrumUser user);
	/**
	 * 
	 * @param user
	 * @return
	 */
	public ScrumUser retrieveScrumUser(int id);
	/**
	 * 
	 * @param user
	 * @return
	 */
	public ScrumUser updateScrumUser(ScrumUser user);
	/**
	 * 
	 * @return
	 */
	public List<ScrumUser> retrieveAllScrumUsers();
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public ScrumUser validateUser(String username, String password);
	/**
	 * 
	 * @param user
	 * @return
	 */
	public ScrumUser deleteScrumUser(ScrumUser user);

}
