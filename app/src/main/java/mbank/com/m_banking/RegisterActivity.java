package mbank.com.m_banking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends Activity{

    // initialise parameters to be used
    Button btnSubmit, btnBack;
    EditText fName, lName,accno, pin;

    JSONObject json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //lining parameters to values on xml
        accno = (EditText) findViewById(R.id.accno);
        pin = (EditText) findViewById(R.id.pin);
        fName = (EditText) findViewById(R.id.fName);
        lName = (EditText) findViewById(R.id.lName);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        //creating listener and event for Submit button;
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                //the code bellow can be used to parse a json to an online database for authentication
                String accno1 = accno.getText().toString();
                String pin1 = pin.getText().toString();
                String fName1 = fName.getText().toString();
                String lName1 = lName.getText().toString();

                if(accno1.isEmpty() || pin1.isEmpty() || fName1.isEmpty() || lName1.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter all your details!", Toast.LENGTH_LONG).show();
                }
                else{
                    UserFunctions userFunction = new UserFunctions();

                    json = userFunction.register(fName1, lName1, accno1, pin1);

                    // check for login response
                    try {
                        if (json.getString("success")!= null) {
                            String res = json.getString("success");

                            if(Integer.parseInt(res) == 1){
                                Toast.makeText(getApplicationContext(), "You have been registered! PLease logIn", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                                startActivity(intent);
                                finish();
                            }else{
                                // Error in registration
                                Toast.makeText(getApplicationContext(), "Unable to Register! please try again later", Toast.LENGTH_LONG).show();
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }*/

                Toast.makeText(getApplicationContext(), "You have been registered! PLease logIn", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //creating listener and event for back button;
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
