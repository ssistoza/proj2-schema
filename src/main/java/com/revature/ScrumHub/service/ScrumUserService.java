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
	 * @param user
	 * @return
	 */
<<<<<<< HEAD
	public Scrumhub_User deleteScrumUser(Scrumhub_User user);
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public Scrumhub_User validateUser(String username, String password);
	/**
	 * 
	 * @param user
	 * @return
	 */
	public Scrumhub_User registration(Scrumhub_User user);
=======
	public ScrumUser deleteScrumUser(ScrumUser user);
	
>>>>>>> e7c8e04188824d4770335994c3144aabbcaef192
	

}
