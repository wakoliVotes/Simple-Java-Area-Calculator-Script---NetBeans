### Simple Java Area Calculation Script- Using Apache NetBeans IDE

- First, in this scenario, there is use of Graphical User Interface (GUI)
- Two key interfaces are Command Line (CLI) and GUI
- In this example, focus is on GUI
- The user hence is allowed in interacting with the system using dialogs, textboxes and buttons

<hr>

- To make this possible, importing useful Java packages becomes useful, one being the swing package
#### Java swing
- By explaination; Java swing forms part of Java Foundation Classes (JFC) used in creating window-based applications.
- It is built on the top of AWT (Abstract Windowing Toolkit) API and entirely written in java.
- Unlike AWT, Java Swing provides platform-independent and lightweight components.
- The javax.swing package provides classes for java swing API such as;

          - 1. JButton
          - 2. JTextField
          - 3. JTextArea
          - 4. JRadioButton
          - 5. JCheckbox
          - 6. JMenu
          - 7. JColorChooser



<code>
  <pre>
  
package shapes;
import javax.swing.JOptionPane;
/**
 *
 * @author Danny-votez
 */
public class Shapes {
        public static void main(String[] args){
        float area;
        String length, width;        
        length = JOptionPane.showInputDialog(null,"Enter Length");
        width = JOptionPane.showInputDialog(null,"Enter Width");
        area = Float.parseFloat(length)*Float.parseFloat(width);
        JOptionPane.showMessageDialog(null,"The Area is: " + area);        
        System.exit(0);
    }
}

</pre> 
</code>
