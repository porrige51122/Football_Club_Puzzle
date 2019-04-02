import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FoorballTeams {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("./teams.txt"));
		ArrayList<ArrayList<String>> q = new ArrayList<>();
		for (int i = 0; i < 9; i++)
			q.add(new ArrayList<>());
		while (sc.hasNextLine()) {
			String a = sc.nextLine();
			char[] t = a.toLowerCase().toCharArray();
			int c = 0;
			for (int i = 0; i < t.length; i++) {
				if (t[i] == 'a' || t[i] == 'e' || t[i] == 'i' || t[i] == 'o' || t[i] == 'u')
					break;
				else if (t[i] == ' ' || t[i] == '.') {}
				else
					c++;
			}
			if (c >= q.size())
				c = q.size() - 1;
			q.get(c).add(a);
		}
		sc.close();
		for (int i = 0; i < q.size(); i++) {
			System.out
					.println("There are " + q.get(i).size() + " Team(s) with " + i + " constanants at the beginning: ");
//			if (i >= 4)
//				for (String a : q.get(i))
//					System.out.println(a);
		}
	}
}
