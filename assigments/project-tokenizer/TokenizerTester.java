public class TokenizerTester {

	public static void main(String[] args) {

		// Single separator char tests
		System.out.println("Test 1: Single character separator String");
		System.out.println("Using separator string: \"e\" and token string: \"Tokenizers are useful\"");

		Tokenizer singleTokenizer = new Tokenizer("e", "Tokenizers are useful");

		System.out.print("Testing isSeparatorChar('e'): ");
		System.out.println( singleTokenizer.isSeparatorChar('e') ? "PASSED" : "FAILED" );
		System.out.print("Testing isSeparatorChar('a'): ");
		System.out.println( !singleTokenizer.isSeparatorChar('a') ? "PASSED" : "FAILED" );

		testGetNextToken(singleTokenizer, "Tok");
		testGetNextToken(singleTokenizer, "niz");
		testGetNextToken(singleTokenizer, "rs ar");
		testGetNextToken(singleTokenizer, " us");
		testGetNextToken(singleTokenizer, "ful");
		testGetNextToken(singleTokenizer, null);

		System.out.print("Testing resetToFirst(): ");
		singleTokenizer.resetToFirst();
		System.out.println(singleTokenizer.getNextToken().equals("Tok") ? "PASSED" : "FAILED");

		// Multiple character separator tests
		System.out.println("\nTest 2: Multiple character separator String");
		System.out.println("Using separator string: \"arged\" and token string: \"Tokenizers are useful\"");

		Tokenizer multipleTokenizer = new Tokenizer("arged", "Tokenizers are useful");

		System.out.print("Testing isSeparatorChar('e'): ");
		System.out.println( multipleTokenizer.isSeparatorChar('e') ? "PASSED" : "FAILED" );
		System.out.print("Testing isSeparatorChar('a'): ");
		System.out.println( !multipleTokenizer.isSeparatorChar('a') ? "PASSED" : "FAILED" );

		testGetNextToken(multipleTokenizer, "Tok");
		testGetNextToken(multipleTokenizer, "niz");
		testGetNextToken(multipleTokenizer, "s ");
		testGetNextToken(multipleTokenizer, " us");
		testGetNextToken(multipleTokenizer, "ful");
		testGetNextToken(multipleTokenizer, null);

		System.out.print("Testing resetToFirst(): ");
		multipleTokenizer.resetToFirst();
		System.out.println(multipleTokenizer.getNextToken().equals("Tok") ? "PASSED" : "FAILED");
		
		
		System.out.println("\n\nCommon errors:\n\t* Not returning null when there are no more tokens and getNextToken() is called");
		System.out.println("\tUsing the String.split() improperly (remember that each individual character in the separator String needs to be considered to be a separator");
		System.out.println("\tNot properly checking every character in the separator string when isSeparatorChar('e') is called");
	}

	private static void testGetNextToken(Tokenizer tokenizer, String expected) {
		System.out.print("Testing getNextToken(), expecting \"" + expected + "\": ");
		String token = null;
		
		try {
			token = tokenizer.getNextToken();
		} catch (Exception e) {
			System.out.println("FAILED, exception thrown (Tokenizer may be going past the end of an array or String)");
			return;
		}

		if( (token == null && expected == null) || token.equals(expected) ) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED: getNextToken() returned \"" + token + "\"");
		}
	}

}

