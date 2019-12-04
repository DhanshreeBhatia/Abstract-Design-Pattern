package com.main.java;

public class AbstractSubFactoryClass1 implements AbstractMainFactoryClass{
	
	String RAM;
	String HDD;
	String CPU;
	
	
	AbstractSubFactoryClass1(String ram, String hdd, String cpu){
		this.RAM = ram;
		this.CPU = cpu;
		this.HDD = hdd;
	}
	
	@Override
	public AbstractSuperClass createComputer() {
		// TODO Auto-generated method stub
		return new SubClass1(RAM,HDD,CPU);
	}

}
