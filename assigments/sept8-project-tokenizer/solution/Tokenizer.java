public class Tokenizer {

	// A String of separator characters
	private String separatorString;

	// A string to be processed into tokens
	private String tokenString;

	// Where to start looking for tokens when getNextToken() is called
	private int processIndex = 0;

	public Tokenizer(String sepString, String tokString) {
		separatorString = sepString;
		tokenString = tokString;
	}

	public String getNextToken() {
		// If processIndex >= tokenString length, there's nothing
		// left to look for tokens in
		
		if(processIndex >= tokenString.length()) {
			return null;
		}

		String token = "";
		int i;
		for(i = processIndex; i < tokenString.length(); i++) {
			if(isSeparatorCharacter(tokenString.charAt(i))) {
				// End of a token
				break;
			} else {
				// Keep adding to the token
				token += tokenString.charAt(i);
			}
		}
		
		// Set processIndex so that next time getNextToken() is called,
		// it will begin after the separator
		processIndex = i + 1;
		
		// Check if the token is blank
		// (cases where separator characters are adjacent)
		if(token.isEmpty()) {
			// We need to try again to find a token
			return getNextToken();
		}

		return token;
	}

	public boolean isSeparatorCharacter(char c) {
		return (separatorString.indexOf(c) != -1);
	}

	public void resetToFirstToken() {
		// All we have to do is reset the processIndex
		// so that getNextToken() starts from the beginning
		// of the tokenString 
		processIndex = 0;
	}

}

