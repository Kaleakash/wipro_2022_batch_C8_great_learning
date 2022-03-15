package com;
interface Operation {
	public int add(int x, int y);
}
//class OperationImp implements Operation {
//	public int add(int x, int y) {
//		return x+y;
//	}
//}
interface FindLargest {
	public boolean find(int x, int y);
}
public class LambdaExpression {
	public static void main(String[] args) {
		Operation op1 = (x,y)->x+y;
		System.out.println(op1.add(100, 200));
		Operation op2 = (a,b)->a+b;
		System.out.println(op2.add(100, 200));
		Operation op3 = (int x, int y)->x+y;
		System.out.println(op3.add(100, 300));
		Operation op4 = (x,y)-> {
			int sum = x+y;
			return sum;
		};
		System.out.println(op4.add(1, 2));
		FindLargest fl1 = (x,y)-> x>y;
		System.out.println(fl1.find(10, 20));
		FindLargest fl2 = (x,y)-> {
				if(x>y) {
					return true;
				}else {
					return false;
				}
		};
		System.out.println(fl1.find(100, 50));
	}

}
