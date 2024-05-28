package leetcode.algorithm.RemovingStarsFromAString;

public class BasicSolution extends Solution {

    public class Node {
        char data;
        Node next;
        Node prev;

        Node(char data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public class LinkedList {
        Node head;
        Node last;

        LinkedList() {
            this.head = null;
            this.last = null;
        }

        public void add(char data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                last.next = newNode;
                newNode.prev = last;
            }
            last = newNode;
        }

        public void pop() {

            if (last == null) {
                return;
            }
            if (last.prev == null) {
                head = null;
                last = head;
                return;
            }
            last.prev.next = null;
            last = last.prev;
            return;
        }

        public String toString() {
            StringBuilder result = new StringBuilder("");
            Node cur = head;
            while (cur != null) {
                result.append(cur.data);
                cur = cur.next;
            }
            return result.toString();
        }
    }

    @Override
    public String removingStarsFromAString(String s) {

        // turns to linked list
        // time complexity: O(n)
        LinkedList linkedList = new LinkedList();
        for (char c : s.toCharArray()) {
            // when it find '*' then pop the last node
            if (c == '*') {
                linkedList.pop();
            } else {
                linkedList.add(c);
            }
        }
        return linkedList.toString();
    }

}
