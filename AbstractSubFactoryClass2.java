package com.main.java;

public class AbstractSubFactoryClass2 implements AbstractMainFactoryClass{
	String RAM;
	String HDD;
	String CPU;
	
	
	AbstractSubFactoryClass2(String ram, String hdd, String cpu){
		this.RAM = ram;
		this.CPU = cpu;
		this.HDD = hdd;
	}

	@Override
	public AbstractSuperClass createComputer() {
		return new SubClass2(RAM, HDD, CPU);
	}
	
}
