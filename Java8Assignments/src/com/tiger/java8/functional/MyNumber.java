package com.tiger.java8.functional;

public class MyNumber {
	private long firstNum;
    private long secondNum;
    public MyNumber(long firstNum, long secondNum) {
	   this.firstNum = firstNum;
	   this.secondNum = secondNum;
    }
    
    public MyNumber(int firstNum2, int secondNum2) {
    	 this.firstNum = firstNum2;
  	   this.secondNum = secondNum2;
	}

	public long process(Calculator calc) {
        return calc.calculate(this.firstNum, this.secondNum);
     }
}
