
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
	public static void main(String[] args) {
		Collection<Emp> emps = createCollection();

		printCollection(removeDuplicates(emps));
	}

	private static Collection<Emp> createCollection() {
		ArrayList<Emp> emps = new ArrayList<>();
		Collections.addAll(emps, new Emp(1, "Женя"), new Emp(2, "Вася"), new Emp(3, "Юля"), new Emp(4, "Женя"), new Emp(5, "Юля"),
				new Emp(6, "Вася"), new Emp(7, "Женя"), new Emp(8, "Рома"), new Emp(9, "Вася"), new Emp(10, "Юля"));
		return emps;
	}

	private static void printCollection(Collection<Emp> emps) {
		for (Emp e :
				emps) {
			System.out.println(e.id + " " + e.name);
		}
	}

	private static Collection<Emp> removeDuplicates(Collection<Emp> emps) {
		ArrayList<String> listOfNames = new ArrayList<>();
		ArrayList<Emp> empsWC = new ArrayList<>();
		for (Emp e :
				emps) {
			if (!(listOfNames.contains(e.name))) {
				empsWC.add(e);
				listOfNames.add(e.name);
			}
		}
		return empsWC;
	}
}
