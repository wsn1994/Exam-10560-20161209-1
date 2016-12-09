package com.hand.test;

public class Exam_1 {
	static int count;

	public static void primeNumber(int i) {
		int j = 2;
		for (; j < i; j++)// 将每个少于它自身的数进行求模
		{
			if (i % j == 0)// 取模为0则不为素数
			{
				break;
			}
		}
		if (j >= i)// 若除数大于或等于被除数，那么被除数就是素数
		{
			count++;
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("所求的素数：");

		for (int i = 101; i >= 101 && i <= 200; i++) {
			primeNumber(i);
		}

		System.out.println("101~200素数的个数为：" + count);
	}
}
