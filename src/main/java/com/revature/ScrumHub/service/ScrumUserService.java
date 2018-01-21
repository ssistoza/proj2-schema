package com.revature.ScrumHub.service;

import java.util.List;

import com.revature.ScrumHub.bean.Scrumhub_User;

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
	public Scrumhub_User createNewScrumUser(Scrumhub_User user);
	/**
	 * 
	 * @param user
	 * @return
	 */
	public Scrumhub_User retrieveScrumUser(int id);
	/**
	 * 
	 * @param user
	 * @return
	 */
	public Scrumhub_User updateScrumUser(Scrumhub_User user);
	/**
	 * 
	 * @param user
	 * @return
	 */
	public List<Scrumhub_User> retrieveAllScrumUsers();
	/**
	 * 
	 * @param user
	 * @return
	 */
	public Scrumhub_User deleteScrumUser(Scrumhub_User user);
	
	

}
