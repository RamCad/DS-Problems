package LinkedList;

public class LLDemo {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.insertNode(10);
    linkedList.insertNode(8);
    linkedList.insertNode(6);
    linkedList.insertNode(4);
    linkedList.insertNode(2);
    linkedList.insertNode(0);

    System.out.println(linkedList);

    linkedList.findLength();
    linkedList.deleteNode();
    System.out.println(linkedList);
    System.out.println(linkedList.searchElement(4));
  }
}
