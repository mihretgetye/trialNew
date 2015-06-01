package myPackage;

import java.io.File;

public class MyClass {
	public static void main(String[] args){

		int number = 30*5000/3;
		System.out.println(number);
		File file = new File("./DirTrial");
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
		}else{
			System.out.println("Directory already exists!");
		}
	}

}

