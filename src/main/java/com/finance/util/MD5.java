package com.finance.util;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5 {

	public static String sign(String rawData) {
		return DigestUtils.md5Hex(rawData).toLowerCase();
	}

	public Boolean validate(String rawData, String sign) {
		Boolean result = false;
		String mysign = DigestUtils.md5Hex(rawData).toLowerCase();
		if (mysign.equals(sign.toLowerCase())) {
			result = true;
		}
		return result;
	}
}
