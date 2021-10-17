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