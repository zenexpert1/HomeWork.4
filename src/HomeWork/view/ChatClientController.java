package HomeWork.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;


public class ChatClientController implements Initializable {

    @FXML
    public TextField MessageTextField;
    @FXML
    public Button SendButton;
    @FXML
    private TextArea ChatTextArea;


    public ChatClientController(){}

    @FXML
    private void SendButtonOnClick(ActionEvent e){


        System.out.println("нажали кнопку, текст сообщения: "+ MessageTextField.getText());


        ShowMessage(  "Me:  " + MessageTextField.getText());


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void ShowMessage(String s){

        ChatTextArea.setEditable(false);
        ChatTextArea.appendText(s +"\n\n");

    }
}
