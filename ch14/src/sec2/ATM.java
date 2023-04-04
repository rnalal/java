package sec2;
//멀티스레드 : 하나의 자원을 공유
public class ATM implements Runnable {
	private long depositeMoney = 10000;	//잔액선언
	//wait() : 비선점형에서 기다림 발생 -> notify() : 쓰레드에서 기다림을 통보
	public void run(){
		synchronized(this) {	//synchronized : 동기화
			for(int i=0;i<10;i++){
				notify();	//wait()을 활용
				try {
					wait();		//쓰레드 대기
					Thread.sleep(1000); 	//쓰레드 일시정지 1초
				} catch (InterruptedException e){
					e.printStackTrace();
				}
				if (getDepositeMoney() <= 0) break;
				withDraw(1000);
			}
		}
	}
	public void withDraw(long howMuch) {	//출금
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.println(Thread.currentThread().getName() + ", ");
			System.out.printf("잔액: %,d 원 %n", getDepositeMoney());
		} else {
			System.out.println(Thread.currentThread().getName() + ", ");
			System.out.println("잔액이 부족합니다.");
		}
	}
	public long getDepositeMoney() {	//잔액 반환
		return depositeMoney;
	}
}
