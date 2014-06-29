package com.chime.codingtest;
import java.text.SimpleDateFormat;

/**
 * �ڼ� ���ϱ� 
 * @author chimeX430
 * 
 */
public class sotsu_AG {

	static int MAX_INT_NUM = 1000;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// �ð� ����  
		elapsedTime();  

		// �ڼ� ���ϱ� 
		calculateSotsu(MAX_INT_NUM);  
		
		// �ð� ���� 
		elapsedTime();  

		
	}
	/**
	 * �Է°���ŭ �ڼ� ���ϱ� 
	 * @param max_num
	 */
	private static void calculateSotsu(int max_num) {
		// �ڼ� ���ϱ� 
		boolean flag = false;  
		for (int i = 2; i <= max_num; i++) {
			for (int j = 2; j <= i; j++) {
				if ((i % j == 0) && (i != j)) {
					flag = true; 
				} 
			}
			if(!flag) { 
				System.out.print(" " + i); 
			}
			flag = false; 
		}
		System.out.println(""); 		
	}
	/**
	 * 
	 */
	private static void elapsedTime() {
		// ���� ���۽ð�
		long startTime = System.currentTimeMillis(); 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS"); 
		String currentTime = sdf.format(startTime); 
		System.out.println(currentTime); 
		
	}
}


