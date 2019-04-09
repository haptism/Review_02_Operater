package com.rjm.operator.example;

import java.util.Scanner;

public class OperatorTest {
	public void sample1() {

		Scanner sc = new Scanner(System.in);
		Score sr = new Score();
		int select = sc.nextInt();

		System.out.println("국어");
		sr.kor = sc.nextInt();
		System.out.println("영어");
		sr.eng = sc.nextInt();
		System.out.println("수학");
		sr.math = sc.nextInt();
		sr.total = sr.kor + sr.eng + sr.math;
		sr.avg = sr.total / 3;
	}

//		System.out.println("총점" + sr.getTotal());
//		System.out.println("평균" + sr.getAvg());

	public void sample2() {
	}

	public void sample3() {
	}

	public void sample4() {
	}

	public void sample5() {
	}

}
