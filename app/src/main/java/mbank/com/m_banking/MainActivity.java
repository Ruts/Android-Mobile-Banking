package mbank.com.m_banking;

import android.content.Intent;
import android.graphics.Region;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends Activity {

    // initialise parameters to be used
    Button btnLogin, btnRegister, btnExit;
    EditText accno, pin;
    private int account;

    JSONObject json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //lining parameters to values on xml
        accno = (EditText) findViewById(R.id.accno);
        pin = (EditText) findViewById(R.id.pin);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnRegister = (Button) findViewById(R.id.btnRegister);

        //creating listener and event for register button;
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //creating listener and event for login button;
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                //the code bellow can be used to parse a json to an online database for authentication
                String accno1 = accno.getText().toString();
                String pin1 = pin.getText().toString();

                if(accno1.isEmpty() || pin1.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter all your details!", Toast.LENGTH_LONG).show();
                }
                else{
                    UserFunctions userFunction = new UserFunctions();

                    json = userFunction.logIn(accno1, pin1);

                    // check for login response
                    try {
                        if (json.getString("success")!= null) {
                            String res = json.getString("success");

                            if(Integer.parseInt(res) == 1){
                                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                                startActivity(intent);
                                finish();
                            }else{
                                // Error in registration
                                Toast.makeText(getApplicationContext(), "Unable to log in! please try again later", Toast.LENGTH_LONG).show();
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }*/

                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //creating listener and event for exit button;
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void setAccNo(int inaccno){

        account = inaccno;
    }

    public int getAccount(){
        return account;
    }
}
