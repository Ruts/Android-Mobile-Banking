package mbank.com.m_banking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity{

    // initialise parameters to be used
    Button btnDeposit, btnBalanceEnq, btnStopCheque, btnChangePin, btnFinTip, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //lining parameters to values on xml
        btnDeposit = (Button) findViewById(R.id.btnDeposit);
        btnBalanceEnq = (Button) findViewById(R.id.btnBalanceEnq);
        btnStopCheque = (Button) findViewById(R.id.btnStopCheque);
        btnChangePin = (Button) findViewById(R.id.btnChangePin);
        btnFinTip = (Button) findViewById(R.id.btnFinTip);
        btnBack = (Button) findViewById(R.id.btnBack);

        //creating listener and event for Deposit button;
        btnDeposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DepositActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //creating listener and event for Balance Enq button;
        btnBalanceEnq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BalanceEnqActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //creating listener and event for Stop Cheque button;
        btnStopCheque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StopChequeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //creating listener and event for Change Pin button;
        btnChangePin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChangePinActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //creating listener and event for Financial Tips button;
        btnFinTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FinTipActivity.class);
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
