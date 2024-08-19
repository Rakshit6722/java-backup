import java.util.*;

class myGenerics<T>{
    int val
}

public class generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        // arrayList.add("st1");
        arrayList.add(54);
        arrayList.add(643);

        int a = arrayList.get(2);
        // System.out.println(arrayList.get(2));
        
    }
}
