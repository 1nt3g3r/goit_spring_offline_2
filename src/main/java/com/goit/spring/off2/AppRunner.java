package com.goit.spring.off2;

import com.goit.spring.off2.config.DataConfig;
import com.goit.spring.off2.entity.Developer;
import com.goit.spring.off2.repository.DeveloperRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DataConfig.class);

        DeveloperRepository developerRepository = applicationContext.getBean(DeveloperRepository.class);

        List<Developer> developers = developerRepository.nativeSearch("First");// findByFirstName("First Name 1f");// findAll();
        for(Developer developer : developers) {
            System.out.println(developer);
        }
    }
}
