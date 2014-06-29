package com.chime.codingtest;
import java.util.Scanner;

/**
 * �ִ�����/�ּҰ���� ���ϱ� 
 * @author chimeX430
 * 
 */
public class gcd_lcm_AG {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO �Է°��� ���� ������ �ƴ� ��� ���� ó�� 
		// TODO 3�� �̻��� �� �Է� �޾Ƽ� ���� ��� ��������..  
		

		Scanner in = new Scanner(System.in);
		System.out.println("�� ���� �Է��Ͻÿ�(���� ����)");

		int input[] = new int[2];

		for (int i = 0; i < input.length; i++) {
			input[i] = in.nextInt();
			// System.out.println(input[i]);
		}
		
		/*
		 * �ִ������� ����
		 * �� ���� ���� ���� �������� 1�� �ٿ����鼭 �� �� ��� ������ �������� ��
		 * 
		 * �ּҰ������ ���� 
		 * �� ���� ����� ��ġ�ϴ� ���� ù��° �� 
		 *   
		*/
		//  �� ���� �ִ� ����� 
		long gcdNum = gcd(input[0], input[1]); 
		System.out.println("�ִ����� : " + gcdNum);
		
		// �� ���� �ּҰ���� 
		long lcmNum = lcm(input[0], input[1]); 
		System.out.println("�ּҰ���� : " + lcmNum);
		
	} 



	/**
	 * �ּҰ���� ���ϱ� 
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
	 * �ִ����� ���ϱ� 
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
