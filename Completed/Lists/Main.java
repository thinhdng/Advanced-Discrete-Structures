public class Main {

    public static void main(String[] args) {
        ADSArrayList<Integer> numbers = new ADSArrayList<Integer>();

        numbers.add(10);
        numbers.add(17);
        numbers.add(26);
        numbers.add(2);
        numbers.add(0);

        System.out.println("It has " + numbers.size() + "elements.");
        System.out.println("Nine is in the list: " +
            numbers.contains(9));

        System.out.println("17 is in the list: " +
            numbers.contains(17));

        System.out.println("Removing 26.");

        numbers.remove(26);

        System.out.println("The list now contains " +
            numbers.size() + " elements");
        System.out.println("26 is in the list: " +
            numbers.contains(26));

        for ( int i = 0 ; i < 50000 ; i++ ) {
            numbers.add(i);
        }

        System.out.println(numbers.get(225));
    }


}