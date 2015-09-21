package com.deloitte.java;

/**
 * 
 * @author Manohar
 *
 */
public class StringUtil {

	/**
	 * Split the name into two equal parts. if it is an odd number length, then
	 * add a # at the end of the name to make the length even.
	 * 
	 * @param ele
	 * @return
	 */
	protected static String doEncryption(String ele) {
		int a = ele.length();
		String temp = "";
		System.out.println(" encrypting " + ele);
		if ((a % 2) == 0) {
			temp = encryptionAlgorithm(ele);
		} else {
			ele = ele.concat("#");
			temp = encryptionAlgorithm(ele);
		}
		return temp;
	}

	/**
	 * 
	 * @param ele
	 * @return
	 */
	protected static String doDecryption(String ele) {
		String temp = "";
		System.out.println(" decrypting " + ele);
		if (ele.contains("#")) {
			temp = decryptionAlgorithm(ele);
			temp = temp.replace("#", "");
		} else {
			temp = decryptionAlgorithm(ele);
		}
		return temp;
	}

	/**
	 * Reverse the parts and concatenate back into one string
	 * 
	 * @param ele
	 * @return
	 */
	private static String encryptionAlgorithm(String ele) {
		String[] parts = { ele.substring(0, ele.length() / 2), ele.substring(ele.length() / 2) };
		return parts[1] + parts[0];
	}

	/**
	 * 
	 * @param ele
	 * @return
	 */
	private static String decryptionAlgorithm(String ele) {
		String outputVal = ele.substring(ele.length() / 2) + ele.substring(0, ele.length() / 2);
		return outputVal;
	}
}
