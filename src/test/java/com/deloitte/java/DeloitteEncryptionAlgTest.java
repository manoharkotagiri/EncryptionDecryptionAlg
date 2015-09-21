package com.deloitte.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * @author Manohar
 *
 */
public class DeloitteEncryptionAlgTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public DeloitteEncryptionAlgTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(DeloitteEncryptionAlgTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		System.out.println();
		assertEquals("har#Srid", DeloitteEncryptionAlg.doAlgorithm("Sridhar"));
		System.out.println();
		assertEquals("har#Srid", DeloitteEncryptionAlg.doAlgorithm("Sridhar"));
		System.out.println();
		assertEquals("inAm", DeloitteEncryptionAlg.doAlgorithm("Amin"));
		System.out.println();
		assertEquals("Amin", DeloitteEncryptionAlg.doAlgorithm("inAm"));
	}
}
