package spring.exercise.william;

//Author: William McCall

//Import the necessary objects from springframework


import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SuppressWarnings("unused")
public class Main {
   
    public static void main(String areg[]) {
    	//Load in the two xml config files I have created, to guide the job task
        String[] springConfig =
      	  {
      		  "jobContext.xml",
      		  "FieldSetMapperConfig.xml"
      	  };
        
        //Suppresses the warning over the context resource not being closed
        @SuppressWarnings("resource")
        
        //Create the context resource calling the springConfig defined above
  	ApplicationContext context = 
      		  new ClassPathXmlApplicationContext(springConfig);
        
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("runJob");
        	}

}


//When working on this I got stuck with an error "Exception in thread "main" org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'jobRepository': Cannot resolve reference to bean 'dataSource' while setting bean property 'dataSource'; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'dataSource' is defined" within my XML configuration. I was unable to solve this error quickly enough so I am choosing to share the work I have at the moment.