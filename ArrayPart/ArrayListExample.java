package ArrayPart;

import java.util.ArrayList;

// we have to use array list, we dont know about the size of array
// Every call had extened the object class
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>(10);
        arrlist.add(152);
        arrlist.add(151);
        arrlist.add(145);
        arrlist.add(185);
        arrlist.add(178);
        arrlist.add(163);
        arrlist.add(189);
        arrlist.add(146);
        arrlist.add(123);
        arrlist.add(185);
        arrlist.add(163);
        // arrlist.set(index, valueToUpdate)
        arrlist.set(0, 152);

        // if nubmer present or not
        boolean ifpresent = arrlist.contains(145);
        System.out.println(ifpresent);

        // remove some element by index
        arrlist.remove(5);

        // get value at any index
        arrlist.get(6);

        System.out.println(arrlist);
    }

}
