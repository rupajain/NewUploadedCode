package com.mywork.java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Filesinjava8 {
	public static void main(String[] args) throws IOException {
		Files.list(Paths.get(".")).map(Path::getFileName).map(Path::toString).map(String::toUpperCase)
				.filter(name -> name.endsWith(".TXT")).forEach(name -> doSomeAction(name));
	}

	public static void doSomeAction(String fileName) {
		System.out.println("do some action here.." + fileName);

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			br.lines().filter(str -> str.equals("Exilant")).forEach(System.out::print);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
