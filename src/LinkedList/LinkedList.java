package LinkedList;

public class LinkedList {

  private Node head;

  public boolean searchElement(int data) {
    Node current = this.head;
    while(current != null) {
      if(data == current.getData()){
        return true;
      }
      current = current.getNext();
    }
    return false;
  }

  public void findLength() {
    int i = 0;
    Node head = this.head;
    while(head != null) {
      i++;
      head = head.getNext();
    }
    System.out.println("Length : " + i);
  }

  public void insertNode(int data) {
    Node newNode = new Node(data);
    newNode.setNext(this.head);
    this.head = newNode;
  }

  public void insertInOrder(int data) {
    Node newNode = new Node(data);
    Node current = this.head;
    while(current != null) {
      if(current.getNext() == null) {
        current.setNext(newNode);
        return;
      }
      if(current.getNext().getData() > newNode.getData()) {
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        return;
      }
      current = current.getNext();
    }
  }

  public void deleteNode() {
    Node current = this.head.getNext();
    this.head = current;
  }

  @Override
  public String toString() {
    String result = "{ ";
    Node current = this.head;
    while (current != null) {
      result += current.toString();
      current = current.getNext();
    }
    return result + " }";
  }
}
