import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;


    private static final String CORRECT_USERNAME = "testuser";
    private static final String CORRECT_PASSWORD = "password123";

    @FXML
    protected void loginButtonClicked() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("გთხოვთ, შეავსოთ ყველა ველი.");
        } else if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
            messageLabel.setText("ავტორიზაცია წარმატებით დასრულდა!");

        } else {
            messageLabel.setText("მომხმარებლის სახელი ან პაროლი არასწორია.");
        }
    }
}
