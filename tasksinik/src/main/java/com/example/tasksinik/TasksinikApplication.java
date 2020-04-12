package com.example.tasksinik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class TasksinikApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksinikApplication.class, args);
	}

}
