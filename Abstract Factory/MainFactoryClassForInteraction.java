package com.main.java;

public class MainFactoryClassForInteraction {

	
	public static AbstractSuperClass getComputer(AbstractMainFactoryClass factory){
		return factory.createComputer();
	}
}
