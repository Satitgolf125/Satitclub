package appewtc.masterung.ungrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Explicit
    private EditText userEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private String userString, passwordString;
    private  MyManage myManage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bineWidget();

        //Request Database
        myManage = new MyManage(this);

        //Button Controller
        buttonController();
    } // Main Method นี่คือ คลาสรอง

    private void buttonController() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            //Receive Value From Edit Text
                userString = userEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();

                //check Spack
                if (userString.equals("") || passwordString.equals("")){
                    //Have Space
                    MyAlertDialog myAlertDialog = new MyAlertDialog();
                    myAlertDialog.myDialog(MainActivity.this,
                    "มีช่องว่าง","กรุณากรอกทุกช่อง");
                } else {

                }



                 //onClick
            }
        });
    } // buttonController

    private void bineWidget() {


        userEditText = (EditText) findViewById(R.id.editText);
        passwordEditText = (EditText) findViewById(R.id.editText2);
        loginButton = (Button) findViewById(R.id.button);
    }
} // Main Class นี่คือ คลาสหลัก
