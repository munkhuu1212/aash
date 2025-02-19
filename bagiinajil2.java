import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class FaultyLoginSystem {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel statusLabel;

    private HashMap<String, String> userDatabase;

    public FaultyLoginSystem() {
        frame = new JFrame("Login System");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        JLabel userLabel = new JLabel("Username: ");
        frame.add(userLabel);
        usernameField = new JTextField();
        frame.add(usernameField);

        JLabel passLabel = new JLabel("Password: ");
        frame.add(passLabel);
        passwordField = new JPasswordField();
        frame.add(passwordField);

        loginButton = new JButton("Login");
        frame.add(loginButton);
        
        statusLabel = new JLabel("");
        frame.add(statusLabel);

        // Dummy user database
        userDatabase = new HashMap<>();
        userDatabase.put("admin", "12345");
        userDatabase.put("user", "password");
        userDatabase.put("guest", "guest");

        loginButton.addActionListener(new LoginListener());
        frame.setVisible(true);
    }

    private class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            String password = passwordField.getText();  // ❌ Алдаа: JPasswordField-д getText() хэрэглэхгүй
            
            if (username.isEmpty() || password.isEmpty()) {
                statusLabel.setText("Fields cannot be empty!");
                return;
            }

            if (userDatabase.containsKey(username)) {
                if (userDatabase.get(username) == password) {  // ❌ Алдаа: String харьцуулахдаа == хэрэглэхгүй
                    statusLabel.setText("Login successful!");
                } else {
                    statusLabel.setText("Wrong password!");
                }
            } else {
                statusLabel.setText("User not found!");
            }
        }
    }

    public static void main(String[] args) {
        new FaultyLoginSystem();
    }
}
