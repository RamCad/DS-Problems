package LinkedList;

public class DoublyLinkedList {

  private DoublyLinkedNode head;

  public void insertNode(int data) {
    DoublyLinkedNode node = new DoublyLinkedNode(data);
    node.setNext(this.head);
    if (this.head != null) {
      this.head.setPrev(node);
    }
    this.head = node;
  }

  public void sort() {
    DoublyLinkedNode current = this.head;
    DoublyLinkedNode position;
    DoublyLinkedNode temp;
    while(current != null) {
      position = current.getPrev();
      temp = current.getNext();
      if(current.getPrev() == null) {
        current = current.getNext();
      } else {
          while(position != null && position.getData() > current.getData()) {
            if(position.getPrev() == null) {
              current.getPrev().setNext(current.getNext());
              if(current.getNext() != null) {
                current.getNext().setPrev(current.getPrev());
              }
              current.setPrev(position.getPrev());
              current.setNext(position);
              current.getNext().setPrev(current);
              this.head = current;
              position = position.getPrev();
            }
            position = position.getPrev();
          }
          if(position != null && position.getNext() != current) {
            current.getPrev().setNext(current.getNext());
            if(current.getNext() != null) {
              current.getNext().setPrev(current.getPrev());
            }
            current.setPrev(position);
            current.setNext(position.getNext());
            current.getPrev().getNext().setPrev(current);
            current.getPrev().setNext(current);
          }
          current = temp;
      }
    }
  }

  public void traversal() {
    DoublyLinkedNode current = this.head;
    DoublyLinkedNode reverse = current;
    while(current != null) {
      System.out.print(current.getData() + " -> ");
      if(current.getNext() == null) {
        reverse = current;
      }
      current = current.getNext();
    }
    System.out.println("null");
    while(reverse != null) {
      System.out.print(reverse.getData() + " -> ");
      reverse = reverse.getPrev();
    }
    System.out.println("null");
  }

  @Override
  public String toString() {
    String result = "{ ";
    DoublyLinkedNode current = this.head;
    while(current != null) {
      result += current.toString();
      current = current.getNext();
    }
    return result + " }";
  }
}
