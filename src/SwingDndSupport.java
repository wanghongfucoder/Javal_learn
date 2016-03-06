import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.awt.dnd.*;
import javax.swing.*;
public class SwingDndSupport
{
	JFrame jf=new JFrame("swing 的拖放支持");
	JTextArea srcTxt=new JTextArea(8,30);
	JTextField jtf=new JTextField(34);
	public void init()
	{
		srcTxt.append("AWT 的拖放支持.\n");
		srcTxt.append("将该文本域的内容拖入其他程序。\n");
		//启动文本域和单行文本框的拖放支持
		srcTxt.setDragEnabled(true);
		jtf.setDragEnabled(true);
		jf.add(new JScrollPane(srcTxt));
		jf.add(jtf,BorderLayout.SOUTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SwingDndSupport().init();
	}
}