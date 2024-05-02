import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel Ventana;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JList list1;
    private JTextArea textArea1;
    private JButton ENCOLARButton;
    private JButton ORDENARButton;
    private Cola objCola = new Cola();
    private DefaultListModel lm =new DefaultListModel<>();

    public Ventana() {
        ENCOLARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = textField1.getText();
                String nombre= textField2.getText();
                int edad = Integer.parseInt(textField3.getText());

                String gene = comboBox1.getSelectedItem().toString();

                String region = comboBox2.getSelectedItem().toString();
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                //VALIDACION DIALOGO
                if (objCola.dobleCelu(cedula)){

                    return;
                }else{
                    objCola.encolar(cedula,nombre,edad,gene,region);

                }
                textArea1.append("CEDULA: "+cedula+"\n");
                textArea1.append("NOMBRE: "+nombre+"\n");
                textArea1.append("EDAD: "+edad+"\n");
                textArea1.append("GENERO: "+gene+"\n");
                textArea1.append("REGION: "+region+"\n");
                textArea1.append("-----------------------------------------------\n");





            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
