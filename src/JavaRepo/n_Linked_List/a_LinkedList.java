package n_Linked_List;

// Linked list = same as array but more dynamic, the advantages are:
//                  - can contain duplicate elements
//                  - maintains insertion order, insert fist/ insert last...
//                  - is non synchronized
//                  - manipulation is fast
//                  - can be ( List ) or ( Stack ) or ( Queue )


import java.util.LinkedList;

public class a_LinkedList {

    public static void main(String[] args) {

        //LinkedList declaration
        LinkedList<String> linkedList = new LinkedList<String>();

        // add string element in the list

        linkedList.add("Item 1");
        linkedList.add("Item 5");
        linkedList.add("Item 3");
        linkedList.add("Item 6");
        linkedList.add("Item 2");
        System.out.println("Linked list content : " + linkedList);


        //  Add First & Last Item

        linkedList.addFirst("First Item");
        linkedList.addLast("Last Item");
        System.out.println("updated list  : " + linkedList);

        // Get values

        Object firstVar = linkedList.get(0);
        System.out.println("First element : " + firstVar);

        // Set values

        linkedList.set(0, "New First Item");
        firstVar = linkedList.get(0);
        System.out.println("Updated First element : " + firstVar);

        // Remove values
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Updated list after remove first & last items : " + linkedList);

        // add to position & remove from position

        linkedList.add(0, "New item");
        linkedList.remove(2);
        System.out.println("Add & removed from position: " + linkedList);


    }

}
