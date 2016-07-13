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

public class StopChequeActivity extends Activity{

    Button btnBack, btnSubmit;
    EditText chequeNo;

    JSONObject json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopcheque);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        chequeNo = (EditText) findViewById(R.id.chequeNo);

        //creating listener and event for Submit button;
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                //the code bellow can be used to parse a json to an online database for authentication

                MainActivity mainActivity = new MainActivity();
                String chequeno1 = chequeNo.getText().toString();
                String accno = Integer.toString(mainActivity.getAccount());

                if(chequeno1.isEmpty() || accno.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter all your details!", Toast.LENGTH_LONG).show();
                }
                else{
                    UserFunctions userFunction = new UserFunctions();

                    json = userFunction.stopCheque(chequeno1, accno);

                    // check for login response
                    try {
                        if (json.getString("success")!= null) {
                            String res = json.getString("success");

                            if(Integer.parseInt(res) == 1){
                                Toast.makeText(getApplicationContext(), "Cheque has been stopped!", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                                startActivity(intent);
                                finish();
                            }else{
                                // Error in registration
                                Toast.makeText(getApplicationContext(), "Unable to stop cheque! please try again later", Toast.LENGTH_LONG).show();
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }*/


                Toast.makeText(getApplicationContext(), "Cheque has been stopped!", Toast.LENGTH_LONG).show();
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
