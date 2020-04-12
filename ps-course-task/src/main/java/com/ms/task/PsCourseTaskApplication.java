package com.ms.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class PsCourseTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsCourseTaskApplication.class, args);
	}

	@Bean
	public ProcessingTask processingTask() {
		return new ProcessingTask();
	}
	
	public class ProcessingTask implements CommandLineRunner {

		@Override
		public void run(String... parameters) throws Exception {
			// TODO Auto-generated method stub
			// parameters are stationId, licencePlate and timestamp
			if(null != parameters) {
				System.out.println("Parameters length: " + parameters.length);
				
				String stationID = parameters[1];
				String licencePlate = parameters[2];
				String timestamp = parameters[3];
				
				System.out.println("StationID: " + stationID);
				System.out.println("LicencePlate: " + licencePlate);
				System.out.println("TimeStamp: " + timestamp);
			}
		}
	}
}
