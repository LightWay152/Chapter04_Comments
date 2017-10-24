package Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	//Email Regex java
	private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
	private static Pattern emailPattern;
	private Matcher emailMatcher;

	public EmailValidator() {
		emailPattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
	}

	public boolean validateEmail(String email) {
		emailMatcher = emailPattern.matcher(email);
		return emailMatcher.matches();
	}
}
