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

public class DepositActivity extends Activity{

    Button btnBack, btnSubmit;
    EditText amount;

    JSONObject json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        amount = (EditText) findViewById(R.id.amount);

        //creating listener and event for Submit button;
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                //the code bellow can be used to parse a json to an online database for depositing

                MainActivity mainActivity = new MainActivity();
                String amount1 = amount.getText().toString();
                String accno = Integer.toString(mainActivity.getAccount());

                if(amount1.isEmpty() || accno.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter all your details!", Toast.LENGTH_LONG).show();
                }
                else{
                    UserFunctions userFunction = new UserFunctions();

                    json = userFunction.deposit(amount1, accno);

                    // check for login response
                    try {
                        if (json.getString("success")!= null) {
                            String res = json.getString("success");

                            if(Integer.parseInt(res) == 1){
                                Toast.makeText(getApplicationContext(), "The amount Has been deposited!", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                                startActivity(intent);
                                finish();
                            }else{
                                // Error in registration
                                Toast.makeText(getApplicationContext(), "Unable to deposit! please try again later", Toast.LENGTH_LONG).show();
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }*/


                Toast.makeText(getApplicationContext(), "The amount Has been deposited!", Toast.LENGTH_LONG).show();
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
