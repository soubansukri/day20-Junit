package com.bridgelabz.junitTesting;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class JunitTestToValidateUserLoginTest {

	static JunitTestToValidateUserLogin test;

	@BeforeClass
	public void init() {

		test = new JunitTestToValidateUserLogin();

	}

	@Test
	public void givenFirstName_whenProper_ShouldReturnTrue() {

		boolean result = test.firstNameValidate("Rajashekhar");
		Assert.assertTrue(result);

	}

	@Test
	public void givenFirstName_whenNotProper_ShouldReturnFalse() {

		boolean result = test.firstNameValidate("Raj");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_whenProper_ShouldReturnTrue() {

		boolean result = test.lastNameValidate("Dhari");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_whenNotProper_ShouldReturnFalse() {

		boolean result = test.lastNameValidate("dha");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmail_whenProper_ShouldReturnTrue() {

		boolean result = test.emailValidate("abc.xyz@bl.co.in");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_whenNotProper_ShouldReturnFalse() {

		boolean result = test.emailValidate("abc.xyz@bl.in");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPhone_whenProper_ShouldReturnTrue() {

		boolean result = test.phoneNumberValidate("91 9561272972");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPhone_whenNotProper_ShouldReturnFalse() {

		boolean result = test.phoneNumberValidate("9561272972");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_whenProper_ShouldReturnTrue() {

		boolean result = test.passwordValidate("Abc12345#");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_whenNotProper_ShouldReturnFalse() {

		boolean result = test.passwordValidate("Raja#%");
		Assert.assertFalse(result);
	}
}