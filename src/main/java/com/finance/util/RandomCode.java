package com.finance.util;

import java.util.Random;

public class RandomCode {

	// ��������ʱ�����Դ
	private static char[] codeSequence = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 't', 'u', 'v', 'w',
			'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	public static String genNumPassword(int length) {
		
		Random random = new Random();
		
		StringBuffer randomCode = new StringBuffer();
		for (int i = 0; i < length; i++) {
			
			String strRand = String.valueOf(codeSequence[random.nextInt(32)]);
			randomCode.append(strRand);
		}
		return randomCode.toString();
	}
}
