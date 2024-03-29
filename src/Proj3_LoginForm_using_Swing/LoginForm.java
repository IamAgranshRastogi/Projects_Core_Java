package Proj3_LoginForm_using_Swing;

//Using Swing Components
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public static boolean checkData(String userName,String password){
        return userName.equals("java") && password.equals("123");
    }
    public static void addComponentsToPanel(JPanel panel) {
        JLabel userLabel = new JLabel("User");
        JTextField userText = new JTextField();
        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordText = new JPasswordField();
//  Buttons
        JButton cancelButton = new JButton("Cancel");
        JButton loginButton = new JButton("Login");

//  Adding Components to Panel
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(cancelButton);
        panel.add(loginButton);

//  Adding action to buttons
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkData(userText.getText(),passwordText.getText()))
                    JOptionPane.showMessageDialog(panel,"Hello "+userText.getText()+
                            ". Welcome to Java Swing. ","Login Message",JOptionPane.INFORMATION_MESSAGE);
                else{
                    JOptionPane.showMessageDialog(panel,"Invalid Username or password",
                            "Login Message",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form Demo ");
        JPanel panel = new JPanel(new GridLayout(3,2,15,15));

//      calling method
        addComponentsToPanel(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(300,150);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
