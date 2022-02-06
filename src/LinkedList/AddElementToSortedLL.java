package LinkedList;

public class AddElementToSortedLL {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.insertNode(10);
    linkedList.insertNode(9);
    linkedList.insertNode(6);
    linkedList.insertNode(5);
    linkedList.insertNode(2);
    System.out.println(linkedList);

    linkedList.insertInOrder(8);
    System.out.println(linkedList);
    linkedList.insertInOrder(11);
    System.out.println(linkedList);
  }

}
