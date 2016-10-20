package hr.cropro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Autowired
	MessageSource messageSource;

	public static final String JARO = "Jaro";
	public static final String JARO_MSG = "Poštovanje Jaro, jeste li dobro?";
	
	public TestService() {
	}
	
	public String isJaro (String ime) {
		
		String test = messageSource.getMessage("text", null, null);
		
		if (ime.equals(JARO)) {
			return test;
		}
		
		return null;
	}
	
}
