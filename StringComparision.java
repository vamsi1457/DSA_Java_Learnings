public class StringComparision {
    public static void main(String[] args) {
        String a = "vamsi";
        String b = "vamsi";
        // == operator checks the referecne of the objecsts
        // if the variables poits to the same object it returns true otherwise false
        System.out.println(a==b);
        System.out.println(a.equals(b));  // It gives true because the values are same

        // .equals() method checks the value is equal or not
        String name1 = new String("kunal");
        String name2 = new String("kunal");  // these are two new objects with same value
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));


        
    }
}
