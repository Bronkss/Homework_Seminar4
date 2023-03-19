package org.example.homework1;

import java.util.LinkedList;

public class Task1new {
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedli = new LinkedList<>();
        linkedli.add(1);
        linkedli.add(2);
        linkedli.add(3);
        linkedli.add(4);
        System.out.print("Элементы до реверса : " + linkedli);
        linkedli = reverseLinkedList(linkedli);
        System.out.print("\nЭлементы после реверса: " + linkedli);
    }

    /**
     *
     * @param llist - принимает на вход исходный массив
     * @return - перевернутый массив
     */
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
    {
        LinkedList<Integer> revLinkedList = new LinkedList<>();
        for (int i = llist.size() - 1; i >= 0; i--) revLinkedList.add(llist.get(i));
        return revLinkedList;
    }
}
