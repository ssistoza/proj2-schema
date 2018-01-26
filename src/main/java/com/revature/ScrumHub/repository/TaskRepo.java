package com.revature.ScrumHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ScrumHub.bean.Task;

public interface TaskRepo extends JpaRepository<Task, Integer>{

}
