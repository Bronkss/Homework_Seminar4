package org.example.homework2;
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Example 1 : " + isValidCondition("()"));
        System.out.println("Example 2 : " + isValidCondition("()[]{}"));
        System.out.println("Example 3 : " + isValidCondition("(]"));
        System.out.println("Example 4 : " + isValidCondition("[{]}"));
        System.out.println("Example 5 : " + isValidCondition("([)]")); // true. Почему то в leetcode пишет что должно выводить false....
    }

    /**
     *
     * @param path - исходную строку
     * @return - закрыты скобки или нет.
     */
    public  static boolean isValidCondition(String path){
        char[] charArray = new char[path.length()];
        charArray = path.toCharArray();
        charArray = path.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(' && charArray[i + 1] == ')') return true;
            else if (charArray[i] == '[' && charArray[i + 1] == ']') return true;
            else if (charArray[i] == '{' && charArray[i + 1] == '}') return true;
        }
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == '(' && charArray[charArray.length- 1] == ')') return true;
            else if (charArray[i] == '[' && charArray[charArray.length- 1] == ']') return true;
            else if (charArray[i] == '{' && charArray[charArray.length- 1] == '}') return true;
        }
        return false;
    }
}
