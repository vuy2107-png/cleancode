//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 10);

        System.out.println("List size: " + list.size()); // 4
        System.out.println("Element at index 1: " + list.get(1)); // 10
        System.out.println("Contains 3: " + list.contains(3)); // true
        list.remove(2);
        System.out.println("After remove, size: " + list.size()); // 3
    }
}