package com.alex.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	private String fileName = "/mnt/10A81AF010A81AF0/eclipse-workspace/spring-demo-annotations/src/alternative-fortunes.txt";
	private List<String> theFortunes;
	
	//Create random number generator
	Random random = new Random();
	
	public FileFortuneService() {
		System.out.println(">>FileFortuneService: inside default constructor");
	}
	
	@PostConstruct
	public void loadFortunesFiles() {
		
		System.out.println(">>FileFortuneService: inside loadFortunesFiles()");
		
		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		theFortunes = new ArrayList<String>();
		//read fortunes from files
		try(BufferedReader br = new BufferedReader(new FileReader(theFile))){
			String tempLine;
			while((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		int index = random.nextInt(theFortunes.size());
		String tempFortune = theFortunes.get(index);
		return tempFortune;
	}

}
