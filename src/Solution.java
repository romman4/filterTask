import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Collection<Emp> emps = createCollection();
		printCollection(removeDuplicates(emps));
	}

	private static Collection<Emp> createCollection() {
		List<Emp> emps = new LinkedList<>();
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
		Iterator<Emp> itr = emps.iterator();
		while(itr.hasNext()) {
			Emp e = itr.next();
			if (listOfNames.contains(e.name))
				itr.remove();
			else listOfNames.add(e.name);
		}
		return emps;
	}
}
