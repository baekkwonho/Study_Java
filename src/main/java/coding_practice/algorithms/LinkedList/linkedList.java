package coding_practice.algorithms.LinkedList;

public class linkedList {
  Node head;
  Node tail;
  int count;
  
  public linkedList() {
    head = new Node();
    tail = head;
  }
  
  
  //순차적으로 다음 Node에 값 넣기.
  public void add(Object value) {
    tail.value = value;
    tail.next = new Node();
    tail = tail.next;
    count++;
  }
  
  //특정인덱스에 추가하기
  public void insert(int index, Object value) {
    if (index < 0 || index >= count) {
      throw new RuntimeException("인덱스 범위를 벗어났습니다.");
    }
    
    Node currNode = head;
    Node temp;
    
    int currIndex = index;
    while (--currIndex > 0) {
      currNode = currNode.next;
    }
    
    temp = new Node(value);
    if (index == 0) {
      temp.next = head;
      head = temp;
    } else {
      temp.next = currNode.next;
      currNode.next = temp;
    }
    count++;
    
  }
  
  public Object remove(int index) {
    if (index < 0 || index >= count) {
      throw new RuntimeException("인덱스의 범위를 벗어났습니다.");
    }
    
    Node currNode = head;
    Node prevNode = null;
    
    for (int i = 0; i < index; i++) {
      prevNode = currNode;
      currNode = currNode.next;
    }
    
    if (index == 0) {
      head = head.next;
    } else {
      prevNode.next = currNode.next;
    }
    count--;
    return currNode.value;
  }
  
  
  public Object get(int index) {
    if (index < 0 || index >= count) {
      throw new RuntimeException("인덱스의 범위를 벗어났습니다.");
    }
    Node currNode = head;
    
    for (int i = 0; i < index; i++) {
      currNode = currNode.next;
    }
    return currNode.value;
  }
  
  public int size() {
    return count;
  }
  
  public void display() {
    Node currNode = head;
    while (currNode != null && currNode != tail) {
      System.out.printf("%d - ", currNode.value);
      currNode = currNode.next;
    }
    System.out.println();
  }
  
  
  class Node {
    Object value;
    Node next;
    
    public Node() {}
    
    public Node(Object value) {
      this.value = value;
    }
  }

}
