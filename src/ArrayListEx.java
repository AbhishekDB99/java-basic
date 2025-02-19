import java.util.*;

public class ArrayListEx {
    public Collection<String> colors;

    public ArrayListEx(){
        colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Purple");
        colors.add("Gray");
        Iterator<String> itr = colors.iterator();
        System.out.println("inside a constructor"+" "+colors);
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Clearing colors array");
        colors.clear();
        System.out.println("colors:"+" "+colors);
        System.out.println("Is colors empty?"+":"+" "+colors.isEmpty());
    }

}
