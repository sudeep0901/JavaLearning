package com.sudeep.in18;
import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18NSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String language;
		String country;

		if (args.length != 2) {
			language = "en";
			country = "US";
		} else {
			language = args[0];
			country = args[1];
		}
		
		System.out.println(language);
		System.out.println(country);

		Locale currentLocale;
		ResourceBundle messages;
		
		currentLocale = new Locale(language, country);
		
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		System.out.println(messages.getString("greetings"));
		System.out.println(messages.getString("inquiry"));
		System.out.println(messages.getString("farewell"));
		System.out.println(LocalDate.now());
		
		
	}

}
