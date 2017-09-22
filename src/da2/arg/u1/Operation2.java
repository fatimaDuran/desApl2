package da2.arg.u1;

import java.io.Serializable;

public class Operation2 implements Serializable {
	private int value1;
	private  int value2;
	
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public int getValue2() {
		return value2;
	}
	public void setValue2(int value2) {
		this.value2 = value2;
	}
	public double getResult() {
		return (value1*((Math.pow(value1, 2)*2)+(3*(value1*value2))+Math.pow(value2, 2)))
				-((Math.pow(value1,2)*5)-(value2*(2*(value1*value2))+Math.pow(value2,2)));
	}
	

}


