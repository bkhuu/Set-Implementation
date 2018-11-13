
public class Main {
	public static <T> void main(String[] args) {
		Set<Integer> set = new Set<Integer>();
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(2);
		System.out.println(set.contains(1));
		System.out.println(set.contains(3));
		System.out.println(set.toString());
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.toString());
		set.add(3);
		set.add(4);
		System.out.println(set.toString());
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.remove(3);
		System.out.println(set.toString());
		System.out.println(set.size());
	}
}
