	

	if( CONDITION_1 ) {
		// Do something
	} else if ( CONDITION_2 ) {
		// Do something
	} else {
		// Do something else
	}


	while ( CONDITION ) {
		// Do some cool stuff
	}


	do {
		// Operations on things
	} while ( CONDITION );


	switch ( letter ) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
		case 'c':
		case 'D':
			System.out.println("D");
			break;
		default:
			System.out.println("Some other letter");
			break;
	}

	for(int i = 0; i < 10; i++) {
		System.out.println("Number: " + i);
	}


	class ExampleClass {

		public static void main(String[] args) {
			System.out.println(getRandomNumberBetween(1, 50));
		}

		private int getRandomNumberBetween(int min, int max) {
			return (Math.random() * (max - min)) + min;
		}

	}

