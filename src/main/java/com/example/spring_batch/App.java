package com.example.spring_batch;

import javax.batch.runtime.JobExecution;

import org.springframework.batch.core.Job;
//import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String[] springConfig = { "spring/batch/jobs/batch-job-hello-world.xml" };

		ApplicationContext context = new ClassPathXmlApplicationContext(
				springConfig);

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("helloWorldBatchJob");

		try {
			JobExecution execution = (javax.batch.runtime.JobExecution) jobLauncher.run(job, new JobParameters());
			System.out.println("Batch Job status--" + execution.getExecutionId());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Batch complete");
        
    }
}
