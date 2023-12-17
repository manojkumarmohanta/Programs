import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList <Integer> c1 = new ArrayList <Integer>(4);
        c1.add(12);
        c1.add(18);
        c1.add(19);
        c1.add(21);
        c1.add(33);

        System.out.println(c1);
        System.out.println(c1.contains(19));
        System.out.println(c1.isEmpty());
        System.out.println(c1.size());
       
        System.out.println(c1.indexOf(21));
        c1.add(2,88);
        System.out.println(c1);

    }
    
}
