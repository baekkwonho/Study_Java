package coding_practice.algorithms.LinkedList;

public class test_linkedList {
  
  public static void main(String[] args) {
    linkedList linkedList = new linkedList();
    
    linkedList.add(100);
    linkedList.add(200);
    linkedList.add(300);
    linkedList.add(400);
    linkedList.add(500);
    linkedList.insert(4, 501);
    linkedList.remove(3);
    
    linkedList.display();
    
    
    for (int i = 0; i < linkedList.size(); i++) {
      System.out.println(linkedList.get(i));
    }
    
  }

}
