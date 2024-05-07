package a03152023;

//JAVA program for implementation of KMP pattern
//searching algorithm

class KMP_String_Matching {
	void KMPSearch(String pat, String txt)
	{
		int M = pat.length();
		int N = txt.length();

		int lps[] = new int[M];
		int j = 0; // index for pat[]

		computeLPSArray(pat, M, lps);

		int i = 0; // index for txt[]
		while ((N - i) >= (M - j)) {
			if (pat.charAt(j) == txt.charAt(i)) {
				j++;
				i++;
			}
			if (j == M) {
				System.out.println("Found pattern "
								+ "at index " + (i - j));
				j = lps[j - 1];
			}


			else if (i < N
					&& pat.charAt(j) != txt.charAt(i)) {
			
				if (j != 0)
					j = lps[j - 1];
				else
					i = i + 1;
			}
		}
	}

	void computeLPSArray(String pat, int M, int lps[])
	{

		int len = 0;
		int i = 1;
		lps[0] = 0;

		while (i < M) {
			if (pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}
			else 
			{
				if (len != 0) {
					len = lps[len - 1];

					// Also, note that we do not increment
					// i here
				}
				else // if (len == 0)
				{
					lps[i] = len;
					i++;
				}
			}
		}
	}
	static void KMPSearchForLoop(String pat, String txt)
	{
	    int M = pat.length();
	    int N = txt.length();

	    int[] lps = new int[M];
	    int j = 0; // index for pat[]
	  //  computeLPSArray(pat, M, lps);

	    for (int i = 0; (N - i) >= (M - j); i++) {
	        if (pat.charAt(j) == txt.charAt(i)) {
	            j++;
	            if (j == M) {
	                System.out.println("Found pattern at index " + (i - j + 1));
	                j = lps[j - 1];
	            }
	        } else {
	            if (j != 0) {
	                j = lps[j - 1];
	                i--;
	            }
	        }
	    }
	}

	// Driver code
	public static void main(String args[])
	{
		String txt = "ABABDABACDABABCABAB";
		String pat = "ABAB";
		new KMP_String_Matching().KMPSearch(pat, txt);
		KMPSearchForLoop(pat, txt);
	}
}
