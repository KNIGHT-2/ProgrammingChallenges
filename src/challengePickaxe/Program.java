package challengePickaxe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type the matherials you have (separate by commas):");
		String matherial = scan.nextLine();
		String[] stringSplited = matherial.split(", ");
		
		List<String> stoneList = Arrays.asList(stringSplited).stream().filter(s -> s.equals("stone")).toList();
		List<String> stickList = Arrays.asList(stringSplited).stream().filter(s -> s.equals("stick")).collect(Collectors.toList());
		List<String> woodList = Arrays.asList(stringSplited).stream().filter(s -> s.equals("wood")).toList();
		
		for(String s : woodList) {
			for(int i = 0; i < 4; i++) {
				stickList.add("stick");
			}
		}
		
		int stickToPickaxe = stickList.size()/2;
		int stoneToPickaxe = stoneList.size()/3;
		int pickaxes = 0;
		if(stickToPickaxe < stoneToPickaxe) {
			pickaxes = stickToPickaxe;
		}else {
			pickaxes = stoneToPickaxe;
		}
		System.out.println("Number of pickaxes: " + pickaxes);
		
		String[][] string = new String[7][5];
	}
}
