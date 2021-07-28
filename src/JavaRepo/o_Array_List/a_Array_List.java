package o_Array_List;

// Arraylist = more flexible than normal array, as its resizable, and its implement all ( List ) operations ex: add, remove, set ..

import java.util.ArrayList;

public class a_Array_List {

    public static void main(String[] args) {
        a_Array_List obj = new a_Array_List();
       // obj.stringArrayList();
        obj.intArrayList();


    }

    void stringArrayList(){

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Ahmed");
        arrayList.add("Mohamed");
        arrayList.add("Ali");
        arrayList.add("Maged");
        arrayList.add("Mona");


        System.out.println("array list : " + arrayList);

        arrayList.add(0,"Ibrahim");
        arrayList.add(1,"Sally");

        System.out.println("After add in position : " + arrayList);

        arrayList.remove(3);
        arrayList.remove("Mona");

        System.out.println("After remove in position and name : " + arrayList);
    }

    void intArrayList(){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(10);
        arrayList.add(100);
        arrayList.add(40);

        System.out.println("array list : " + arrayList);
        System.out.println("array list : " + arrayList.get(2));

        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        arrayList.add(0,1);
        arrayList.add(1,2);

        System.out.println("After add in position : " + arrayList);

        arrayList.remove(3);
        arrayList.remove(0);

        System.out.println("After remove in position and name : " + arrayList);

    }
}
