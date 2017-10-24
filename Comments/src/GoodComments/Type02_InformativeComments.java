package GoodComments;

import Utils.EmailValidator;

public class Type02_InformativeComments {

	// list of valid email addresses
	private static final String[] validEmailIds = new String[] { 
			"ty@yahoo.com", "teo@gmail.com",
			"bin@hotmail.com", "bun@journaldev.com" };

	// list of invalid email addresses
	private static final String[] invalidEmailIds = new String[] { 
			"ty@.com", "teo.gmail.com",
			"bin@*hotmail.com", "bun@%journaldev.com" };

	private static EmailValidator emailValidator;

	public static void main(String args[]) {
		emailValidator = new EmailValidator();
		for (String temp : validEmailIds) {
			boolean valid = emailValidator.validateEmail(temp);
			System.out.println("Email ID " + temp + " is valid? " + valid);
		}
		System.out.println();
		for (String temp : invalidEmailIds) {
			boolean valid = emailValidator.validateEmail(temp);
			System.out.println("Email ID " + temp + " is valid? " + valid);
		}
	}
}
