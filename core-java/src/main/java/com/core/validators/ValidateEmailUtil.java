package com.core.validators;

public class ValidateEmailUtil {
	
/*	public static final String EMAIL_REGEX = "^[a-zA-Z0-9](\\.?[a-zA-Z0-9_-]){0,}@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,}$";	
	
	public static void main(String[] args) {

		String indEmail = "info@vvi.edu.in";
		//String[] blockedChars = { "!", "#", "$", "%", "*", "/", "?", "^", "`", "{", "|", "}", "~"};
		String indEmail1 = "inp?fo_____b.\" \".c@vvi.edu.in";
		String chineseEmail = "用户@例子.广告"; // Chinese
		String hindiEmail = "जीतेन्द्र.कुमार@डाटा.भारत"; // Hindi
		String ukranianEmail = "квіточка@пошта.укр"; // Ukrain
		String greekEmail = "θσερ@εχαμπλε.ψομ"; // Greek
		String russianEmail = "аджай@экзампл.рус"; // Russian
		String russian2Email = "дерек@екзампил.ком";
		String german1Email = "Emailinfo@new-delhi.diplo.de"; //German
		String german2Email = "info@newd.diplo.de"; //German
		String japanese1Email = "jpembjic@nd.mofa.go.jp"; // Japanese
		String japanese2Email = "jpemb-cons@nd.mofa.go.jp"; // Japanese
		String uaeEmail = "NewDelhiCVO@mofaic.gov.ae"; // UAE
		String a = "ema____il@domain.co.jp";
		String b = "ema&il@domain.com.co.co.jp";
		String c = "email.@dom@ain.com";
		String d = "email..email@domain..com";
		String e = ".email@domain.com.com";
		String f = "email@dom ain.com";
		String g = "em++ail@domain.com";
		String h = "$$!#$%&'*+.-/=?^`{|}~@gmail.com";
		
		System.out.println("++++++++++++++++++++++++++++++Regex++++++++++++++++++++++++++++++\n");
		
		System.out.println(String.format("India.isValidEmail(%s): %s", indEmail, isValidEmail(indEmail)));
		System.out.println(String.format("India.isValidEmailAddress(%s): %s", indEmail1, isValidEmail(indEmail1)));
		System.out.println(String.format("German.isValidEmail(%s): %s", german1Email, isValidEmail(german1Email)));
		System.out.println(String.format("German.isValidEmail(%s): %s", german2Email, isValidEmail(german2Email)));
		System.out.println(String.format("Japanese.isValidEmail(%s): %s", japanese1Email, isValidEmail(japanese1Email)));
		System.out.println(String.format("Japanese.isValidEmail(%s): %s", japanese2Email, isValidEmail(japanese2Email)));
		System.out.println(String.format("Chinese.isValidEmail(%s): %s", chineseEmail, isValidEmail(chineseEmail)));
		System.out.println(String.format("Hindi.isValidEmail(%s): %s", hindiEmail, isValidEmail(hindiEmail)));
		System.out.println(String.format("Ukrain.isValidEmail(%s): %s", ukranianEmail, isValidEmail(ukranianEmail)));
		System.out.println(String.format("Greek.isValidEmail(%s): %s", greekEmail, isValidEmail(greekEmail)));
		System.out.println(String.format("Russian.isValidEmail(%s): %s", russianEmail, isValidEmail(russianEmail)));
		System.out.println(String.format("Russian.isValidEmail(%s): %s", russian2Email, isValidEmail(russian2Email)));
		System.out.println(String.format("UAE.isValidEmail(%s): %s", uaeEmail, isValidEmail(uaeEmail)));

		System.out.println("\n++++++++++++++++++++++++++++++InternetAddress++++++++++++++++++++++++++++++\n");

		System.out.println(String.format("India.isValidEmailAddress(%s): %s", indEmail, isValidEmailAddress(indEmail)));
		System.out.println(String.format("India.isValidEmailAddress(%s): %s", indEmail1, isValidEmailAddress(indEmail1)));
		System.out.println(String.format("German.isValidEmailAddress(%s): %s", german1Email, isValidEmailAddress(german1Email)));		
		System.out.println(String.format("German.isValidEmailAddress(%s): %s", german2Email, isValidEmailAddress(german2Email)));
		System.out.println(String.format("Japanes.isValidEmailAddress(%s): %s", japanese1Email, isValidEmailAddress(japanese1Email)));
		System.out.println(String.format("Japanes.isValidEmailAddress(%s): %s", japanese2Email, isValidEmailAddress(japanese2Email)));
		System.out.println(String.format("Chinese.isValidEmailAddress(%s): %s", chineseEmail, isValidEmailAddress(chineseEmail)));
		System.out.println(String.format("Hindi.isValidEmailAddress(%s): %s", hindiEmail, isValidEmailAddress(hindiEmail)));
		System.out.println(String.format("Ukrain.isValidEmailAddress(%s): %s", ukranianEmail, isValidEmailAddress(ukranianEmail)));
		System.out.println(String.format("Greek.isValidEmailAddress(%s): %s", greekEmail, isValidEmailAddress(greekEmail)));
		System.out.println(String.format("Russian.isValidEmailAddress(%s): %s", russianEmail, isValidEmailAddress(russianEmail)));
		System.out.println(String.format("Russian.isValidEmailAddress(%s): %s", russian2Email, isValidEmailAddress(russian2Email)));
		System.out.println(String.format("UAE.isValidEmailAddress(%s): %s", uaeEmail, isValidEmailAddress(uaeEmail)));
		
		System.out.println("\n++++++++++++++++++++++++++++++Apache Commons++++++++++++++++++++++++++++++\n");

		System.out.println(String.format("India.isValidEmailAddress(%s): %s", indEmail, isValidEmailID(indEmail)));
		System.out.println(String.format("India.isValidEmailAddress(%s): %s", indEmail1, isValidEmailID(indEmail1)));
		System.out.println(String.format("German.isValidEmailAddress(%s): %s", german1Email, isValidEmailID(german1Email)));
		System.out.println(String.format("German.isValidEmailAddress(%s): %s", german2Email, isValidEmailID(german2Email)));
		System.out.println(String.format("Japanes.isValidEmailAddress(%s): %s", japanese1Email, isValidEmailID(japanese1Email)));
		System.out.println(String.format("Japanes.isValidEmailAddress(%s): %s", japanese2Email, isValidEmailID(japanese2Email)));
		System.out.println(String.format("Chinese.isValidEmailAddress(%s): %s", chineseEmail, isValidEmailID(chineseEmail)));
		System.out.println(String.format("Hindi.isValidEmailAddress(%s): %s", hindiEmail, isValidEmailID(hindiEmail)));
		System.out.println(String.format("Ukrain.isValidEmailAddress(%s): %s", ukranianEmail, isValidEmailID(ukranianEmail)));
		System.out.println(String.format("Greek.isValidEmailAddress(%s): %s", greekEmail, isValidEmailID(greekEmail)));
		System.out.println(String.format("Russian.isValidEmailAddress(%s): %s", russianEmail, isValidEmailID(russianEmail)));
		System.out.println(String.format("Russian.isValidEmailAddress(%s): %s", russian2Email, isValidEmailID(russian2Email)));
		System.out.println(String.format("UAE.isValidEmailAddress(%s): %s", uaeEmail, isValidEmailID(uaeEmail)));
		
		System.out.println(String.format("a.isValidEmailAddress(%s): %s", a, isValidEmailID(a)));
		System.out.println(String.format("b.isValidEmailAddress(%s): %s", b, isValidEmailID(b)));
		System.out.println(String.format("c.isValidEmailAddress(%s): %s", c, isValidEmailID(c)));
		System.out.println(String.format("d.isValidEmailAddress(%s): %s", d, isValidEmailID(d)));
		System.out.println(String.format("e.isValidEmailAddress(%s): %s", e, isValidEmailID(e)));
		System.out.println(String.format("f.isValidEmailAddress(%s): %s", f, isValidEmailID(f)));
		System.out.println(String.format("g.isValidEmailAddress(%s): %s", g, isValidEmailID(g)));
		System.out.println(String.format("h.isValidEmailAddress(%s): %s", h, isValidEmailID(h)));
		
		System.out.println("\n++++++++++++++++++++++++++++++Custom++++++++++++++++++++++++++++++\n");
		
		System.out.println(String.format("h.isValidEmailAddress(%s): %s", h, isValidEmailCustom(h)));
		System.out.println(String.format("India.isValidEmailAddress(%s): %s", indEmail, isValidEmailCustom(indEmail)));
		System.out.println(String.format("India.isValidEmailAddress(%s): %s", indEmail1, isValidEmailCustom(indEmail1)));
		System.out.println(String.format("German.isValidEmailAddress(%s): %s", german1Email, isValidEmailCustom(german1Email)));
		System.out.println(String.format("German.isValidEmailAddress(%s): %s", german2Email, isValidEmailCustom(german2Email)));
		System.out.println(String.format("Japanes.isValidEmailAddress(%s): %s", japanese1Email, isValidEmailCustom(japanese1Email)));
		System.out.println(String.format("Japanes.isValidEmailAddress(%s): %s", japanese2Email, isValidEmailCustom(japanese2Email)));
		System.out.println(String.format("Chinese.isValidEmailAddress(%s): %s", chineseEmail, isValidEmailCustom(chineseEmail)));
		System.out.println(String.format("Hindi.isValidEmailAddress(%s): %s", hindiEmail, isValidEmailCustom(hindiEmail)));
		System.out.println(String.format("Ukrain.isValidEmailAddress(%s): %s", ukranianEmail, isValidEmailCustom(ukranianEmail)));
		System.out.println(String.format("Greek.isValidEmailAddress(%s): %s", greekEmail, isValidEmailCustom(greekEmail)));
		System.out.println(String.format("Russian.isValidEmailAddress(%s): %s", russianEmail, isValidEmailCustom(russianEmail)));
		System.out.println(String.format("Russian.isValidEmailAddress(%s): %s", russian2Email, isValidEmailCustom(russian2Email)));
		System.out.println(String.format("UAE.isValidEmailAddress(%s): %s", uaeEmail, isValidEmailCustom(uaeEmail)));

		System.out.println(String.format("a.isValidEmailAddress(%s): %s", a, isValidEmailCustom(a)));
		System.out.println(String.format("b.isValidEmailAddress(%s): %s", b, isValidEmailCustom(b)));
		System.out.println(String.format("c.isValidEmailAddress(%s): %s", c, isValidEmailCustom(c)));
		System.out.println(String.format("d.isValidEmailAddress(%s): %s", d, isValidEmailCustom(d)));
		System.out.println(String.format("e.isValidEmailAddress(%s): %s", e, isValidEmailCustom(e)));
		System.out.println(String.format("f.isValidEmailAddress(%s): %s", f, isValidEmailCustom(f)));
		System.out.println(String.format("g.isValidEmailAddress(%s): %s", g, isValidEmailCustom(g)));
		
	}
	
	public static boolean isValidEmail(String email){
		boolean isValid = false;
		try {
			Pattern pattern = Pattern.compile(EMAIL_REGEX);
			Matcher matcher = pattern.matcher(email);
			if(matcher.matches()) {
				isValid = true;
			}
		} catch (Exception e) {
			isValid = false;
		}
		return isValid;
	}
	
	public static boolean isValidEmailAddress(String email) {
		boolean result = false;
		try {
				InternetAddress emailAddress = new InternetAddress(email);
				emailAddress.validate();
				result = true;
		   } catch (AddressException ex) {
		      result = false;
		   }
		return result;
	}
	
	public static boolean isValidEmailID(String email){
		return EmailValidator.getInstance().isValid(email);		
	}
	
	*//**
	 * email validation rules:
	 * 1. should not be null
	 * 2. should not start and end with .
	 * 3. should only have one @ character
	 * 4. first part and second parts should not be null
	 * 5. first and second parts should not start and end with .
	 * 6. first part and second parts should not have consecutive ..  
	 * 7. first part, second part and each of it's sub domain parts should not have blocked characters
	 * 8. first part can contain space, \ and " only in double quotes
	 * 
	 * @param email
	 * @return
	 *//*
	public static boolean isValidEmailCustom(String email) {
		
		String restrictedCharsStr = "(),:;<>@[\\] ";
		
		char[] restrictedChars = restrictedCharsStr.toCharArray();

		char[] allowedChars = ".!#$%&'*+-/=?^`{|}~".toCharArray();
		
		if(email == null)
			return false;
		
		String[] emailSplitArray = email.split("@");
		if(emailSplitArray.length != 2)
			return false;
		
		String emailFirstPart = emailSplitArray[0];
		String emailSecondPart = emailSplitArray[1];
		
		if(emailFirstPart == null || emailSecondPart == null)
			return false;
		
		if( hasConsecutiveChars(email, allowedChars) )
			return false;
		
		if( hasAnyCharsStartsOrEndsWith(emailFirstPart, allowedChars) || hasAnyCharsStartsOrEndsWith(emailSecondPart, allowedChars))
			return false;
		
		if(hasCharsWithoutDoubleQuotes(emailFirstPart, restrictedChars) || hasCharsWithoutDoubleQuotes(emailSecondPart, restrictedChars))
			return false;
		
		if(hasDoubleQoutesWithoutPeriod(emailFirstPart) || hasDoubleQoutesWithoutPeriod(emailSecondPart))
			return false;
		
		return true;
	}

	private static boolean hasDoubleQoutesWithoutPeriod(String emailPart) {
		
		int indexOfQuote1 = emailPart.indexOf('\"');
		
		if(indexOfQuote1 == -1)
			return false;
		
		if(indexOfQuote1 == 0 || indexOfQuote1 == emailPart.length()-1)
			return true;
		
		String doubleQuoteFirstPart = emailPart.substring(0, indexOfQuote1);
		String doubleQuoteSecondPart = emailPart.substring(indexOfQuote1+1, emailPart.length());
		
		int indexOfQuote2 = doubleQuoteSecondPart.indexOf('\"');
		
		if(indexOfQuote2 == -1)
			return false;
		
		return ! ( doubleQuoteFirstPart.charAt(indexOfQuote1-1) == '.' 
				&& doubleQuoteSecondPart.charAt(indexOfQuote2+1) == '.' );
	}

	private static boolean hasCharsWithoutDoubleQuotes(String emailPart, char[] restrictedChars) {
		
		for(char a : restrictedChars) {
			int indexOf = emailPart.indexOf(a);
			
			if(indexOf == -1)
				continue;
			
			if(indexOf == 0)
				return true;
			
			return !(emailPart.substring(0, indexOf).contains("\"") && emailPart.substring(indexOf+1, emailPart.length()).contains("\""));
		}
		return false;
	}

	private static boolean hasAnyCharsStartsOrEndsWith(String emailPart, char[] allowedChars) {
		for(char a : allowedChars) {
			if(emailPart.indexOf(a) == 0 || emailPart.lastIndexOf(a) == emailPart.length()-1)
				return true;
		}
		return false;
	}

	private static boolean hasConsecutiveChars(String emailPart, char[] charPattern) {
		for (char c : charPattern) {
			if(emailPart.indexOf(c) == 0 && emailPart.charAt(1) != c)
				continue;
			for(String s : emailPart.split("\\"+c)) {
				if(s == null || s.trim().length() == 0)
					return true;
			}
		}
		return false;
	}*/

}