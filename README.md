### Simple Java Area Calculation Script- Using Apache NetBeans IDE

- First, in this scenario, there is use of Graphical User Interface (GUI)
- Two key interfaces are Command Line (CLI) and GUI
- In this example, focus is on GUI
- The user hence is allowed in interacting with the system using dialogs, textboxes and buttons

<hr>

- To make this possible, importing useful Java packages becomes useful, one being the swing package
### Java swing
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
### Java Script
<code>
<pre>
package area;
import javax.swing.JOptionPane;
/**
 * @author Danny-votez
 */
public class Area {    
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

### Sample Runtime Screen: Input 12 and 280
<div align="center">

![image](https://user-images.githubusercontent.com/77758884/137625874-f56776ef-c4d8-41ca-ae04-3ccadbf87cdc.png) ![image](https://user-images.githubusercontent.com/77758884/137625909-e1fe0a31-bfef-4aed-86d0-e0f93b718662.png) ![image](https://user-images.githubusercontent.com/77758884/137625891-9c4790d8-c9ed-46ab-bbc3-7316b23ef811.png)
</div>

<hr>

### Summary
- awt and swing forms key aspects of the Java Foundation Class (JFC)
- awt stands for Abstract Windowing Toolkit
- Nonetheless, compared to awt, swing exhibits key advantages
- One is that swing is platform independent, while awt is platform dependent
- Moreover, swing has more components, and its components are lightweight, compared to awt
### Java Swing Classes Hierarchy
- The image below shows the API aspects for Java swing
![swinghierarchy](https://user-images.githubusercontent.com/77758884/137627093-1740b5b8-911f-43f8-890c-45fb3b18bcc0.jpg)

