package com.chime.codingtest;
import java.util.Scanner;

/**
 * 최대공약수/최소공배수 구하기 
 * @author chimeX430
 * 
 */
public class gcd_lcm_AG {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO 입력값이 양의 정수가 아닐 경우 예외 처리 
		// TODO 3개 이상의 수 입력 받아서 동일 결과 나오도록..  
		

		Scanner in = new Scanner(System.in);
		System.out.println("두 수를 입력하시오(양의 정수)");

		int input[] = new int[2];

		for (int i = 0; i < input.length; i++) {
			input[i] = in.nextInt();
			// System.out.println(input[i]);
		}
		
		/*
		 * 최대공약수의 정의
		 * 두 수중 작은 수를 기준으로 1씩 줄여가면서 두 수 모두 나누어 떨어지는 수
		 * 
		 * 최소공배수의 정의 
		 * 두 수의 배수가 일치하는 제일 첫번째 값 
		 *   
		*/
		//  두 수의 최대 공약수 
		long gcdNum = gcd(input[0], input[1]); 
		System.out.println("최대공약수 : " + gcdNum);
		
		// 두 수의 최소공배수 
		long lcmNum = lcm(input[0], input[1]); 
		System.out.println("최소공배수 : " + lcmNum);
		
	} 



	/**
	 * 최소공배수 구하기 
	 * @param i
	 * @param j
	 * @return
	 */
	private static long lcm(long i, long j) {
		
		long gcdNum = gcd(i, j); 
		
		if(gcdNum == 0 ) { 
			return 0; 
		} else { 
			return Math.abs((i*j)/gcdNum); 
		}
		
	}

	/**
	 * 최대공약수 구하기 
	 * @param i
	 * @param j
	 * @return
	 */
	private static long gcd(long i, long j) {
		while(j != 0 ) { 
			long temp = i % j; 
			i = j; 
			j = temp; 
		}
		return Math.abs(i);
		
	}
}
