package com.myproject.restapi.pojo;

public class AddResponse {
	
	private int num1;
	private int num2;
	private int sum;
	
	public AddResponse() {
		
	}
	
	public AddResponse(int num1, int num2, int sum) {
		this.num1 = num1;
		this.num2 = num2;
		this.sum = sum;
	}
	
	public int getNum1() {
		return num1;
		
	}
	
	public void setNum1(int Num1) {
		this.num1 = Num1;
		
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(int Num2) {
		this.num2 = Num2;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void setSum(int Sum) {
		this.sum = Sum;
		
	}
	
	
}
