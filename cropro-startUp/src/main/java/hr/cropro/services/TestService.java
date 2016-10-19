package hr.cropro.services;

public class TestService {

	public static final String JARO = "Jaro";
	public static final String JARO_MSG = "Poštovanje Jaro, jeste li dobro?";
	
	public TestService() {
	}
	
	public String isJaro (String ime) {
		
		if (ime.equals(JARO)) {
			return JARO_MSG;
		}
		
		return null;
	}
	
}
