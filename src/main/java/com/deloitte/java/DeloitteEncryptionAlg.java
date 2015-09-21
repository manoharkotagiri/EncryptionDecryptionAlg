package com.deloitte.java;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 
 * @author Manohar
 *
 */
public class DeloitteEncryptionAlg {
	/**
	 * 
	 */
	private static Map<String, String> cacheMap = new TreeMap<String, String>();

	public static void main(String[] args) {
		String word = "";
		System.out.println(" To exit this program, please enter 'exit or quit' keyword ");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print(" Enter a word for encryption : ");
			if (scanner.hasNext()) {
				word = scanner.next();
				if (!(word.equalsIgnoreCase("exit") || word.equalsIgnoreCase("quit"))) {
					doAlgorithm(word);
				} else {
					break;
				}
			}
		}
	}

	/**
	 * 
	 * @param word
	 * @return
	 */
	protected static String doAlgorithm(String word) {
		String xWord = "";
		boolean decrptionCache = false;
		if (cacheMap.containsValue(word)) {
			System.out.println(" " + word + "  found in cache ");
			xWord = StringUtil.doDecryption(word);
			decrptionCache = true;
		}
		if (decrptionCache) {
			System.out.println(" result = " + xWord);
		} else {
			if (cacheMap.containsKey(word)) {
				System.out.println(" " + word + "  found in cache ");
				xWord = cacheMap.get(word);
				System.out.println(" result = " + xWord);
			} else {
				xWord = StringUtil.doEncryption(word);
				System.out.println(" Adding to cache");
				cacheMap.put(word, xWord);
				System.out.println(" result = " + xWord);
			}
		}
		return xWord;
	}

}
