package com.example.tasksintake.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tasksintake.TaskProcessor;

@RestController
public class TaskController {

	@Autowired
	private TaskProcessor t;
	
	@RequestMapping(path="/tasks", method=RequestMethod.POST)
	public @ResponseBody String launchTask(@RequestBody String s) {
		t.publishRequest(s);
		System.out.println("Task Request Made");
		return "Success";
	}
}
