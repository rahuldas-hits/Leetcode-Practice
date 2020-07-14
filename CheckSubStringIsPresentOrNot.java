class CheckSubStringIsPresentOrNot
{
	// Function to implement strstr() function
	public static int strstr(String X, String Y)
	{
		// if X is null or if X's length is less than that of Y's
		if (X == null || Y.length() > X.length()) {
			return -1;
		}

		// if Y is null or is empty
		if (Y == null || Y.length() == 0) {
			return 0;
		}

		for (int i = 0; i <= X.length() - Y.length(); i++)
		{
			int j;
			for (j = 0; j < Y.length(); j++) {
				if (Y.charAt(j) != X.charAt(i + j)) {
					break;
				}
			}

			if (j == Y.length()) {
				return i;
			}
		}

		return -1;
	}

	// Implement strstr function in Java
	public static void main(String[] args)
	{
		String X = "Techie Delight";
		String Y = "light";

		System.out.println("Index of first occurrence of Y in X is "
						+ strstr(X, Y));
	}
}