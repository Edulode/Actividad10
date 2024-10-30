import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora extends JFrame {
    private JPanel miPanel;
    private JTextField num1;
    private JTextField num2;
    private JTextField ans;
    private JButton multiplicarButton;
    private JButton dividirButton;
    private JButton restarButton;
    private JButton sumarButton;

    private  void createUIComponents(){
        num1 = new JTextField();
        num2 = new JTextField();
        ans = new JTextField();
        miPanel = new JPanel();
        multiplicarButton = new JButton();
        dividirButton = new JButton();
        sumarButton = new JButton();
        restarButton = new JButton();
    }

    public calculadora() {
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double number1 = Double.parseDouble(num1.getText());
                    double number2 = Double.parseDouble(num2.getText());
                    double suma = number1 + number2;
                    ans.setText("El resultado de la suma es: " + String.valueOf(suma));
                } catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(miPanel, "Introduce dígitos válidos");
                }
            }
        });
        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double number1 = Double.parseDouble(num1.getText());
                    double number2 = Double.parseDouble(num2.getText());
                    double resta = number1 - number2;
                    ans.setText("El resultado de la resta es: " + String.valueOf(resta));
                } catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(miPanel, "Introduce dígitos válidos");
                }
            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double number1 = Double.parseDouble(num1.getText());
                    double number2 = Double.parseDouble(num2.getText());
                    double multi = number1 * number2;
                    ans.setText("El resultado de la multiplicacion es: " + String.valueOf(multi));
                } catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(miPanel, "Introduce dígitos válidos");
                }
            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double number1 = Double.parseDouble(num1.getText());
                    double number2 = Double.parseDouble(num2.getText());
                    double div = number1 / number2;
                    ans.setText("El resultado de la division es: " + String.valueOf(div));
                } catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(miPanel, "Introduce dígitos válidos");
                }
            }
        });
    }

    public static void main(String[] args) {
        calculadora c = new calculadora();
        c.setContentPane(c.miPanel);
        c.setSize(500,500);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}