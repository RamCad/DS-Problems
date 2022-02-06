package LinkedList;

public class DoublyLinkedNode {
  private DoublyLinkedNode prev;
  private int data;
  private DoublyLinkedNode next;

  public DoublyLinkedNode(int data) {
    this.data = data;
  }

  public DoublyLinkedNode getPrev() {
    return prev;
  }

  public void setPrev(DoublyLinkedNode prev) {
    this.prev = prev;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public DoublyLinkedNode getNext() {
    return next;
  }

  public void setNext(DoublyLinkedNode next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return "Data: " + data + " ";
  }
}
