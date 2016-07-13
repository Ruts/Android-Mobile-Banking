package mbank.com.m_banking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class BalanceEnqActivity extends Activity{

    Button btnBack;
    TextView balance, accno, name;

    JSONObject json;
    private String URL_Account_Details = "link to PHP script to get account details";

    private ArrayList<AccountModel> accountModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balanceenq);

        balance = (TextView) findViewById(R.id.balance);
        accno = (TextView) findViewById(R.id.accno);
        name = (TextView) findViewById(R.id.name);
        btnBack = (Button) findViewById(R.id.btnBack);

        /*
        // used for getting account details
        ServiceHandler jsonParser = new ServiceHandler();
        String json = jsonParser.makeServiceCall(URL_Account_Details, ServiceHandler.GET);

        Log.e("Response: ", "> " + json);

        if (json != null) {
            try {
                JSONObject jsonObj = new JSONObject(json);
                if (jsonObj != null) {
                    JSONArray chapters = jsonObj
                            .getJSONArray("chapters");

                    for (int i = 0; i < chapters.length(); i++) {
                        JSONObject chapterObj = (JSONObject) chapters.get(i);
                        AccountModel cat = new AccountModel(chapterObj.getInt("id"),chapterObj.getString("name"));
                        accountModels.add(cat);
                    }
                }

            } catch (JSONException e) {
                e.printStackTrace();
            }

        } else {
            Log.e("JSON Data", "Didn't receive any data from server!");
        }*/

        accno.setText("Account Number here");
        name.setText("Name here");
        balance.setText("Balance will go here");
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
