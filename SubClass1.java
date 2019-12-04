package com.main.java;

public class SubClass1 extends AbstractSuperClass{
	String RAM;
	String HDD;
	String CPU;
	
	
	SubClass1(String ram, String hdd, String cpu){
		this.RAM = ram;
		this.CPU = cpu;
		this.HDD = hdd;
	}

	
	@Override
	public String getRAM(){
		return this.RAM;
	}
	
	@Override
	public String getHDD(){
		return this.HDD;
	}
	
	@Override
	public String getCPU(){
		return this.CPU;
	}
}
