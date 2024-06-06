package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class FinishingSchoolSteams {

	void example() {
	 List<String> locations=Arrays.asList
				 (new String[] {"Pune","Mumbai","Chennai","Bangalore","Noida","Hyderabad","Kolkata"});
		System.out.println("Word Length for locations");
		locations.stream().map(data->data.length()).forEach(System.out::println);
		locations.stream().map(String::length).forEach(System.out::println);
	}
}
