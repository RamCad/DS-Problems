package LinkedList;

public class LinkedListGeneric<T> {
  private NodeGeneric<T> head;

  private void insertNode(T data) {
    NodeGeneric<T> current = new NodeGeneric<>(data);
    current.setNext(this.head);
    this.head = current;
  }

  private void deleteNode() {
    this.head = this.head.getNext();
  }
}
