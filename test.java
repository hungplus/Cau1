import java.util.*;
public class test {
    public static int findMax(int[] arr, int i) {
        if (i == arr.length - 1)
            return arr[i];

        int maxRest = findMax(arr, i + 1);

        if (arr[i] > maxRest)
            return arr[i];

        return maxRest;
    }

    public static int findMin(int[] arr, int i) {
        if (i == arr.length - 1)
            return arr[i];

        int minRest = findMin(arr, i + 1);

        if (arr[i] < minRest)
            return arr[i];

        return minRest;
    }

    public static int countEven(int[] arr, int i) {
        if (i == arr.length)
            return 0;
        
        if (arr[i] % 2 == 0)
            return 1 + countEven(arr, i + 1);

        return countEven(arr, i + 1);
    }

    public static int countOdd(int[] arr, int i) {
        if (i == arr.length)
            return 0;

        if (arr[i] % 2 != 0)
            return 1 + countOdd(arr, i + 1);

        return countOdd(arr, i + 1);
    }

    public static String reverseSentence(String str) {
        Stack<String> stack = new Stack<>();

        String[] words = str.split(" ");

        for (String w : words)
            stack.push(w);

        String result = "";

        while (!stack.isEmpty()) 
            result += stack.pop() + " ";

        return result;
    }

    public static String convertDecimalToBinary(int num) {
        Stack<Integer> stack = new Stack<>();

        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }

        String binary = "";
        
        while (!stack.isEmpty())
            binary += stack.pop();

        return binary;
    }

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++)
            stack.push(str.charAt(i));

        String result = "";
     
        while(!stack.isEmpty())
            result += stack.pop();

        return result.trim();
    }

    public static void main(String[] args) {
        int[] arr = {8, 10 , 1, 6, 5};

        System.out.println("Max: " + findMax(arr, 0));
        System.out.println("Min: "+ findMin(arr, 0));
        System.out.println("Count Even: " + countEven(arr, 0));
        System.out.println("Count Odd: " + countOdd(arr, 0));


        String str = "I Love TDTU";
        System.out.println(reverseSentence(str));

        String str1 = "hello";
        System.out.println(reverseString(str1));

        int num = 11;
        System.out.println(convertDecimalToBinary(num));
    }
}



    // public CharLinkedList() {
    //     head = null;
    // }

    // @Override
    // public Node getHead() {
    //     // code here
    //     return head;
    // }

    // @Override
    // public void addFirst(char data) {
    //     // code here
    //     head = new Node(data, head);

    // }

    // @Override
    // public boolean addAfterFirstKey(char data, char key) {
    //     // code here
    //     Node p = head;
    //     while (p != null) {
    //         if (p.getData() == key) break;

    //         p = p.getNext();
    //     }
        
    //     if (p != null) {
    //         Node t = new Node(data, null);
    //         t.setNext(p.getNext());
    //         p.setNext(t);
    //         return true;
    //     }
    //     return false;
    // }







    // public IntLinkedList() {
    //     head = null;
    // }

    // @Override
    // public void addFirst(int data) {
    //     Node newNode = new Node(data, head);
    //     head = newNode;
    // }

    // @Override
    // public boolean addLast(int data) {
    //     Node newNode = new Node(data, null);

    //     if (head == null) {
    //         head = newNode;
    //         return true;
    //     }

    //     Node temp = head;
    //     while(temp.getNext() != null) {
    //         temp = temp.getNext();
    //     }

    //     temp.setNext(newNode);
    //     return true;
    // }

    // @Override
    // public boolean removeAt(int position) {
    //     if (head == null || position < 0) return false;

    //     if (position == 0) {
    //         head = head.getNext();
    //         return true;
    //     }

    //     Node temp = head;
    //     int index = 0;

    //     while (temp.getNext() != null && index < position - 1) {
    //         temp = temp.getNext();
    //         index++;
    //     }
        
    //     if (temp.getNext() == null) return false;

    //     temp.setNext(temp.getNext().getNext());
    //     return true;
    // }