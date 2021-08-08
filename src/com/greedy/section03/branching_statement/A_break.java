package com.greedy.section03.branching_statement;

public class A_break {
	
	public void testSimpleBreakStatement() {
		
		/* break문은 반복문 내에서 사용한다.
		 * 일반적으로 if(조건식) {break;} 처럼 사용된다. 
		 * 단, switch문은 반복문이 아니지만 예외적으로 사용된다.
		 * */
		
		int sum = 0;
		
		int i = 1;
		while(true) {
			
			sum += i;
			
			if(i == 100) {
				break;
			}
			
			i++;
		}
		
		System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
		
	}
	
	public void testSimpleBreakStatement2() {
		
		/* 중첩 반복문 내에서의 분기문의 흐름 */
		/* break는 모든 반복문을 종료하는 것이 아닌, 자신에게 가장 인접한 반복문만 실행을 멈춘다. */
		
		for(int dan = 2; dan < 10; dan++) {
			
			for(int su = 1; su < 10; su++) {
				
				if(su > 5) {
					break;
				}
				
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
			System.out.println();
		}
		
		
	}
	
	public void testJumpBreak() {
		
		label:
		for(;;) {
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
				
				if(i == 3) {
					break label;
				}
			}
		}
		
	}
	
}















