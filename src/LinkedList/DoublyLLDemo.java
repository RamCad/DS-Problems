package LinkedList;

public class DoublyLLDemo {

  public static void main(String[] args) {
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    doublyLinkedList.insertNode(1);
    doublyLinkedList.insertNode(13);
    doublyLinkedList.insertNode(2);
    doublyLinkedList.insertNode(15);
    doublyLinkedList.insertNode(10);
    System.out.println(doublyLinkedList);
//    doublyLinkedList.traversal();
    doublyLinkedList.sort();
    System.out.println(doublyLinkedList);
  }
}
