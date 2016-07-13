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

public class ChangePinActivity extends Activity{

    Button btnBack, btnSubmit;
    EditText oldPin, newPin, newPinCon;

    JSONObject json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepin);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        oldPin = (EditText) findViewById(R.id.oldPin);
        newPin = (EditText) findViewById(R.id.newPin);
        newPinCon = (EditText) findViewById(R.id.newPinCon);

        //creating listener and event for Submit button;
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                //the code bellow can be used to parse a json to change pin

                MainActivity mainActivity = new MainActivity();
                String oldPin1 = oldPin.getText().toString();
                String newPin1 = newPin.getText().toString();
                String newPin1Con = newPinCon.getText().toString();
                String accno = Integer.toString(mainActivity.getAccount());

                if(oldPin1.isEmpty() || newPin1.isEmpty() || accno.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter all your details!", Toast.LENGTH_LONG).show();
                }
                else{
                    UserFunctions userFunction = new UserFunctions();

                    if(newPin1.equals(newPin1Con)){
                        json = userFunction.changePin(accno, oldPin1, newPin1);


                    // check for login response
                    try {
                        if (json.getString("success")!= null) {
                            String res = json.getString("success");

                            if(Integer.parseInt(res) == 1){
                                Toast.makeText(getApplicationContext(), "Your pin has been changed!", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                                startActivity(intent);
                                finish();
                            }else{
                                // Error in registration
                                Toast.makeText(getApplicationContext(), "Unable to change pin! please try again later", Toast.LENGTH_LONG).show();
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your new pins do not match", Toast.LENGTH_LONG).show();
                    }
                }*/

                Toast.makeText(getApplicationContext(),"Your Pin Has Been Changed!",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //creating listener and event for back button;
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
