package challengeBlockLetterPrinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlockLetterPrinter {
	
	public String[][] letterA = new String[][] {
		{" ", "A", "A", "A", " "},
		{"A", " ", " ", " ", "A"},
		{"A", " ", " ", " ", "A"},
		{"A", "A", "A", "A", "A"},
		{"A", " ", " ", " ", "A"},
		{"A", " ", " ", " ", "A"},
		{"A", " ", " ", " ", "A"}
	};
	
	public String[][] letterB = new String[][] {
		{"B", "B", "B", "B", " "},
		{"B", " ", " ", " ", "B"},
		{"B", " ", " ", " ", "B"},
		{"B", "B", "B", "B", " "},
		{"B", " ", " ", " ", "B"},
		{"B", " ", " ", " ", "B"},
		{"B", "B", "B", "B", " "}
	};
	
	public String[][] letterC = new String[][] {
		{" ", "C", "C", "C", "C"},
		{"C", " ", " ", " ", " "},
		{"C", " ", " ", " ", " "},
		{"C", " ", " ", " ", " "},
		{"C", " ", " ", " ", " "},
		{"C", " ", " ", " ", " "},
		{" ", "C", "C", "C", "C"}
	};
	
	public String[][] letterD = new String[][] {
		{"D", "D", "D", "D", " "},
		{"D", " ", " ", " ", "D"},
		{"D", " ", " ", " ", "D"},
		{"D", " ", " ", " ", "D"},
		{"D", " ", " ", " ", "D"},
		{"D", " ", " ", " ", "D"},
		{"D", "D", "D", "D", " "}
	};
	
	private List<String[][]> letters = new ArrayList<>();
	
	public void wordPrint(String word) {
		
		String[] substrings = new String[word.length()];
		
		for(int i = 0; i < word.length(); i++) {
			substrings[i] = word.substring(i, i + 1);
		}
		
		for(int i = 0; i < substrings.length; i++) {
			if(substrings[i].equals("a")) {
				letters.add(letterA);
			}else if(substrings[i].equals("b")) {
				letters.add(letterB);
			}else if(substrings[i].equals("c")) {
				letters.add(letterC);
			}else if(substrings[i].equals("d")) {
				letters.add(letterD);
			}
		}
		/*for(String[][] s : letters) {
			for(int i = 0; i < s.length; i++) {
				for(int j = 0; j < s[i].length; j++) {
					System.out.print(s[i][j]);
				}
				System.out.println();
			}
		}
		System.out.println(); 
		*/
		for(int i = 0; i < letters.get(0).length; i++) {
	        for(String[][] s : letters) {
	            for(int j = 0; j < s[i].length; j++) {
	                System.out.print(s[i][j]);
	            }
	            System.out.print("  ");
	        }
	        System.out.println();
	    }
	    System.out.println();
	}
	
}

