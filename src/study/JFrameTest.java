package study;


//창제목표시줄에 "계산기"라고 출력하고 
//창의 크기는 가로300, 세로200인 창을 출력하는 클래스를 만들고 객체를 생성 해 봅니다.

import javax.swing.JFrame;
import javax.swing.JButton;
//<< 팀별연습문제 >>
//이벤트처리를 "익명클래스"를 이용해 봅니다.
//1에서 10까지 합을 누적하여 출력하는 기능도 구현 해 봅니다.


import java.awt.event.*;

class MyCalc extends JFrame {
	public MyCalc(){
		super("계산기");
		JButton btn_sum = new JButton("1에서 10까지 더하기");
		add(btn_sum);	
		btn_sum.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int total =  0;
				for(int i=1; i<=10; i++){
					total += i;
				}
				System.out.println("1에서 10까지의 합은 " + total);
			}
		});
		setSize(300,200);
		setVisible(true);
	}	
}
class JFrameTest04 {
	public static void main(String[] args){
		MyCalc cal = new MyCalc();
	}
}
