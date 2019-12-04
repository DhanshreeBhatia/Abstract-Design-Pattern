package com.main.java;

public class MainEntryPoint {

	public static void main(String args[]){
		AbstractSuperClass ab = MainFactoryClassForInteraction.getComputer(new AbstractSubFactoryClass1("2GB", "500GB", "2.5GHZ"));
		AbstractSuperClass ab1 = MainFactoryClassForInteraction.getComputer(new AbstractSubFactoryClass2("3GB", "600GB", "3.5GHZ"));
		System.out.println(ab);
		System.out.println(ab1);

	}
}
