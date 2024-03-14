package Arrays;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("arrayList.Size() = " + arrayList.size());

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("arrayList.size() = " + arrayList.size());

        System.out.println("arrayList  = " + arrayList);

        arrayList.set(2,100);

        System.out.println("arrayList = " + arrayList);

    }
}
