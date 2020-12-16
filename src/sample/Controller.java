package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button sendButton;
    @FXML
    private TextArea chatHistory;
    @FXML
    private TextField sendText;

    @FXML
    private void sendMessage() {
        chatHistory.appendText(sendText.getText() + '\n');
        chatHistory.appendText(System.lineSeparator());
        sendText.clear();
    }
}
