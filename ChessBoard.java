import javax.swing.*; 
import java.awt.*; 
class ChessBoard
{
	JFrame fr;
	JButton btn[] = new JButton[64];
	JPanel pa;
	GridLayout gl;
	public ChessBoard()
	{
		fr = new JFrame("Registration From");
		fr.setSize(600,600);
		pa = new JPanel();
		gl = new GridLayout(8,8);
		pa.setLayout(gl);
		fr.add(pa);
		int x=0;
		for(int b=0;b<64;b++)
		{
			btn[b] = new JButton();
			pa.add(btn[b]);
			if(b%8==0)
			{
				x=1-x;
			}
			if(b%2==x)
			{
				btn[b].setBackground(Color.white);
			}
			else
			{
				btn[b].setBackground(Color.black);
			}
			
		}
		
		fr.setVisible(true);
	}
	public static void main(String dd[])
	{
		ChessBoard cb = new ChessBoard();
	}
}