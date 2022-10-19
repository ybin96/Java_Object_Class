package study;


import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


class MyFrame extends JFrame{
	public MyFrame(){
		super("마우스 이벤트");		
		addMouseListener( new MouseListener(){
			public void	mouseClicked(MouseEvent e){
				System.out.println("마우스 클릭함");
			}
			public void	mouseEntered(MouseEvent e){
				System.out.println("마우스 들어옴");
			}
			public void	mouseExited(MouseEvent e){
				System.out.println("마우스 나감");		
			}
			public void	mousePressed(MouseEvent e){
				System.out.println("마우스 누름");		
			}
			public void	mouseReleased(MouseEvent e){
				System.out.println("마우스 손을뗌");
			}
		} );

		setSize(400,300);
		setVisible(true);
	}
}

class MouseEventTest02
{
	public static void main(String[] args) 
	{
		new MyFrame();
	}
}
