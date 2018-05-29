import java.util.ArrayList;

public class ArrayListMagnet {
    public static void printAl(ArrayList<String> al){

        System.out.print(al);

        for (String element : al){
            if (al.contains("two")){
                al.remove(2);
                System.out.print(al);
            }
            if (al.contains("three")){
                al.add("four");
            }

            if (al.indexOf("four") != 4){
                al.add(4,"4.2");
            }

            System.out.print(al);
        }

    }

    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();
        a.add(0,"zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");

        printAl(a);

    }
}
