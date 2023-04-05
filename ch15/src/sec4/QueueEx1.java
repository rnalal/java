package sec4;

import java.util.LinkedList;
import java.util.Queue;

//Queue : 큐는 FIFO 구조를 가지는 인터페이스이다.
//큐는 인터페이스이므로 객체 생성을 하려면, LinkedList로 생성해야함
public class QueueEx1 {
	public static void main(String[] args) {
		//Queue<Integer> q1 = new Queue<>();
		Queue<Integer> q1 = new LinkedList<>();
		Queue<String> q2 = new LinkedList<>();
		q1.add(90);			//queue에 값 90 추가
		q1.add(70);			//queue에 값 70 추가
		q1.offer(100);		//queue에 값 100 추가
		q1.add(80);			//queue에 값 80 추가
		q1.offer(75);		//queue에 값 75 추가
		System.out.println(q1.toString());
		System.out.println(q1.peek()); 		//queue에 첫번째 값인 90을 반환
		System.out.println(q1.poll()); 		//queue에 첫번째 값은 90을 반환하고 제거 비어었다면 null
		q1.remove();		//queue에 첫번째 값인 70을 제거
		System.out.println(q1.toString());
		q2.clear();			//queue 초기화(비우기)
		for(Integer i : q1){	//요소 순회
			System.out.println("요소 값:"+i);
		}
		
	}
}
