package coding_practice.practice;

import java.util.Stack;

/*
  Fish
   
  You are given two non-empty zero-indexed arrays A and B consisting of N integers. 
  Arrays A and B represent N voracious fish in a river, ordered downstream along the flow of the river.

  The fish are numbered from 0 to N − 1. If P and Q are two fish and P < Q, then fish P is initially upstream of fish Q.
  Initially, each fish has a unique position.
  
  Fish number P is represented by A[P] and B[P]. Array A contains the sizes of the fish.
  All its elements are unique. Array B contains the directions of the fish. It contains only 0s and/or 1s,\
  where:
  0 represents a fish flowing upstream,
  1 represents a fish flowing downstream.
  If two fish move in opposite directions and there are no other (living) fish between them,
  they will eventually meet each other. Then only one fish can stay alive − the larger fish eats the smaller one.
  More precisely, we say that two fish P and Q meet each other when P < Q, B[P] = 1 and B[Q] = 0, and there are no living fish between them. 
  After they meet:
  If A[P] > A[Q] then P eats Q, and P will still be flowing downstream,
  If A[Q] > A[P] then Q eats P, and Q will still be flowing upstream.
  We assume that all the fish are flowing at the same speed.
  That is, fish moving in the same direction never meet.
  The goal is to calculate the number of fish that will stay alive.
  
  For example, consider arrays A and B such that:

  A[0] = 4    B[0] = 0
  A[1] = 3    B[1] = 1
  A[2] = 2    B[2] = 0
  A[3] = 1    B[3] = 0
  A[4] = 5    B[4] = 0
  
  Initially all the fish are alive and all except fish number 1 are moving upstream.
  Fish number 1 meets fish number 2 and eats it, then it meets fish number 3 and eats it too.
  Finally, it meets fish number 4 and is eaten by it. The remaining two fish, number 0 and 4, never meet and therefore stay alive.
  that, given two non-empty zero-indexed arrays A and B consisting of N integers, returns the number of fish that will stay alive.
  For example, given the arrays shown above, the function should return 2, as explained above
  
  문제>
  A배열과 B배열이 주어진다.
  B배열의 값은 0은 위, 1은 아래를 나타낸다.
  A배열의 값은 물고기의 크기를 나타내는 숫자이다.
  물고기들은 같은 공간에 있고 자신보다 작은 다른 물고기를 잡아 먹는다.
  살아남은 물고기의 갯수를 구하여라.
  
  입력>
  A[4,3,2,1,5]
  B[0,1,0,0,0]
  
  출력>
  2
  
  이유>
  1. 위로 간 물고기(4)
  2. 아래로 간 물고기(3)
  3. 위로 간 물고기(2) -> 물고기(4)와 물고기(2)가 만남 -> 물고기(4) 생존
  4. 위로 간 물고기(1) -> 물고기(4)와 물고기(1)이 만남 -> 물고기(4) 생존
  5. 위로 간 물고기(5) -> 물고기(4)와 물고기(5)가 만남 -> 물고기(5) 생존
  
  총 남은 물고기는 물고기(3)과 물고기(5)로 2를 리턴
  
  
 */

public class practice30 {

  public static void main(String[] args) {
    
    int[] A = {4,3,2,1,5};
    int[] B = {0,1,0,0,0};
    System.out.println(fish(A,B));

  }

  public static int fish(int A[], int B[]) {
    int count = A.length; // 전체 물고기 수를 저장.
    Stack<Integer> stack = new Stack<>(); // 스택 생성
    
    for (int i = 0; i < A.length; i++) {
      if (B[i] == 0) {
        if (!stack.empty()) { // 스택에 비어 있지 않다는 것은 기존 물고기가 없다라는 뜻.
          while (!stack.empty()) {
            count--;
            if (stack.peek() > A[i]) {
              break;
            } else {
              stack.pop();
            }
          }
        }
      } else { // 물고기가 없으므로 물고기 추가
        stack.push(A[i]);
      }
    }
    return count;
  }
}

