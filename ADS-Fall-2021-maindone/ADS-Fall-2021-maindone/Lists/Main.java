public class Main {

    public static void main(String[] args) {
        ADSFixedArrayList<Integer> numbers = new ADSFixedArrayList<Integer>();
        ADSFixedArrayList<Integer> numbers1 = new ADSFixedArrayList<Integer>();
        ADSArrayList<String> letters = new ADSArrayList<String>();
        ADSArrayList<String> letters1 = new ADSArrayList<String>();
        ADSLinkedList<String> letts = new ADSLinkedList<String>();
        ADSLinkedList<String> letts1 = new ADSLinkedList<String>();
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters1.add("d");
        letters1.add("e");
        numbers.add(10);
        numbers.add(17);
        numbers.add(26);
        numbers.add(2);
        numbers.add(0);
        numbers1.add(5);
        numbers1.add(9);
        numbers1.add(3);
        numbers.concat(numbers1);
        letters.concat(letters1);
        letts.add("f");
        letts.add("g");
        letts.add("h");
        letts.add("i");
        letts1.add("j");
        letts1.add("k");
        letts1.add("l");
        letts1.add("m");
        letts.concat(letts1);
        String s = "";
        for(String k : letts)
        {
        	System.out.println(k);
        }
        for(String j : letters)
        {
        	System.out.println(j);
        }
        System.out.println("It has " + numbers.size() + " elements.");

        System.out.println("Here they are:");
        for ( Integer i : numbers ) {
            System.out.println(i);
        }
        
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

        for ( Integer i : numbers ) {
            System.out.println(i);
        }
    }
}
