/* 주제: 스레드 - 개요 */
package step18.exam02;

public class Test01 {

  public static void main(String[] args) {
    // JVM은 기본적으로 여러 개의 스레드를 가동하고 있다.
    // main() 메서드를 호출하는 스레드를 알아내기
    Thread t = Thread.currentThread();
    System.out.println(t.getName());

  }

}

/* 멀티 태스킹(multi-tasking)?
 * - 동시에 여러 개의 프로세스를 실행하는 것.
 * 
 * CPU 스케줄링 또는 프로세스 스케줄링?
 * - 여러 개의 프로세스를 동시에 처리하기 위해 CPU를 배정하는 정책
 * - 유닉스 계열 
 *   => priority + aging 방식
 *   => 우선 순위가 높은 프로세스에 더 많이 CPU를 배정한다.
 *   => 우선 순위가 낮은 프로세스는 실행 기회를 빼앗기게 되는 문제가 있다. 
 *      그 문제를 해결하기 위해 CPU 배정에 밀릴 때 마다 우선 순위를 높이는 방법을 사용한다.
 * - 윈도 OS 
 *   => round-robin 방식
 *   => 우선 순위에 크게 영향을 받지 않는다.
 *   => 보통 순환 방식으로 CPU를 배정한다.
 * 
 * 컨텍스트 스위칭(context-switching)?
 * - 프로세스에 CPU를 배정할 때, 
 *   실행한 프로세스의 실행 정보는 메모리에 저장해야 하고,
 *   실행할 프로세스의 실행 정보는 메모리에서 CPU 캐시와 레지스터로 로딩해야 한다.
 *   이 과정을 "컨텍스트 스위칭"이라고 한다.
 *   
 * 작업을 동시에 처리하는 기법
 * 1) 멀티 프로세싱
 *    => 프로세스를 복제하여 실행
 *    => 프로세스가 사용한 메모리까지 그대로 복제되기 때문에 메모리 낭비가 심하다.
 *    => 복제된 각 프로세는 독립적으로 관리된다.
 * 2) 멀티 스레딩  
 *    => 프로세스의 코드 일부를 분리하여 실행.
 *    => 프로세스가 사용하는 메모리는 스레드와 공유한다. => 메모리 낭비가 덜 하다.
 *    => 스레드는 프로세스에 종속된다. => 프로세스가 종료될 때 같이 종료된다.
 */












