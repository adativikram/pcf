package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Log4j2
@SpringBootApplication
public class DemoApplication implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private Environment environment;
    


	//@PostConstruct
	public void init() {
		System.out.println("first :"+environment.getActiveProfiles());
		

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("second");
		FinishingSchoolSteams fs=new FinishingSchoolSteams();
		
		List<String> strList = new ArrayList<>();
		strList.add("test");
		strList.add("abcd");
		strList.add("test2");
		
		System.out.println(strList.stream().filter(data->data.startsWith("a")).collect(Collectors.toList()));
		//fs.example();
	}


	public void afterPropertiesSet()  {
		// TODO Auto-generated method stub
		System.out.println("first :"+environment.getActiveProfiles());
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("THIRD");
		
	}

}
