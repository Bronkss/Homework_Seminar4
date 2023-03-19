package org.example.homework1;

import java.util.LinkedList;

/**
 * Это вариант я оставил для себя. Немного поигрался. Жалко удалять. Правильное решение в Task1new!
 * Если вдруг вы увидите это, можете оставить какие нибудь советы или комментарии.
 * Вообшем, хотел реализовать другое решение, но забрёл в дебри и запутался, но скорее всего пошёл не тем путём.
 */

public class Task1test {
    public static void main(String[] args) {
        LinkedList<Integer> numList = new LinkedList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);


        System.out.println("Исходный вариант : " + numList);
        for (int i = 0; i < numList.size(); i++) {
            numList.add(numList.size() , numList.get(i));
            for (int j = 1; j < numList.size(); j++) {
                numList.add(numList.size() - 1 , numList.get(j));
                numList.removeFirst();
                numList.removeFirst();
                break;
            }
            int temp = numList.get(i + 1);
            numList.addFirst(temp);
            numList.remove(2);
            break;
        }

        for (int i = 0; i < numList.size() / 2; i++) {
            int temp = numList.get(i);
//            numList.get(i) = numList.get(numList.size() - 1 - i);
//            numList.get(numList.size() - 1 - i) = temp;




//        for (int i = 0; i < numList.size(); i++) {
//           int current = numList.get(i + 1);
//           int pred = numList.get(i).ne;
//           numList.add(current);
//           numList.add(pred);
//        }
//        numList.addFirst(numList.peekLast());
//        numList.removeLast();
//        numList.addFirst(numList.peekLast());
//        numList.removeLast();
        System.out.println("Итоговый вариант : " + numList);




    }
}
}

