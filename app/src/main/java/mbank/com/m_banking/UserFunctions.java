package mbank.com.m_banking;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class UserFunctions {

    private JSONParser jsonParser;

    private static String loginURL = "Link to php script for login";
    private static String registerURL = "Link to php script for registration";
    private static String balanceURL = "Link to php script to check balance";
    private static String depositURL = "Link to php script for depositing";
    private static String stopChequeURL = "Link to php script for stopping cheque";
    private static String changingPinURL = "Link to php script for changing pin";

    // constructor
    public UserFunctions(){
        jsonParser = new JSONParser();
    }

    //function for logIn
    public JSONObject logIn(String accno, String pin){
        // Building Parameters
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("tag", "Log In"));
        params.add(new BasicNameValuePair("Account Number", accno));
        params.add(new BasicNameValuePair("Pin", pin));
        JSONObject json = jsonParser.getJSONFromUrl(loginURL, params);

        return json;
    }

    //function for registration
    public JSONObject register(String fName, String lName, String accno, String pin){
        // Building Parameters
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("tag", "Register"));
        params.add(new BasicNameValuePair("First Name", fName));
        params.add(new BasicNameValuePair("Last Name", lName));
        params.add(new BasicNameValuePair("Account Number", accno));
        params.add(new BasicNameValuePair("Pin", pin));
        JSONObject json = jsonParser.getJSONFromUrl(registerURL, params);

        return json;
    }

    //function for checking balance
    public JSONObject balance(String accno){
        // Building Parameters
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("tag", "BalanceEnq"));
        params.add(new BasicNameValuePair("Account Number", accno));
        JSONObject json = jsonParser.getJSONFromUrl(registerURL, params);

        return json;
    }

    //function for stopping cheque
    public JSONObject stopCheque(String accno, String chequeNo){
        // Building Parameters
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("tag", "Stop Cheque"));
        params.add(new BasicNameValuePair("Account Number", accno));
        params.add(new BasicNameValuePair("First Name", chequeNo));
        JSONObject json = jsonParser.getJSONFromUrl(registerURL, params);

        return json;
    }

    //function for changing pin
    public JSONObject changePin(String accno, String oldPin, String newPin){
        // Building Parameters
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("tag", "Change Pin"));
        params.add(new BasicNameValuePair("Account No", accno));
        params.add(new BasicNameValuePair("First Name", oldPin));
        params.add(new BasicNameValuePair("Last Name", newPin));
        JSONObject json = jsonParser.getJSONFromUrl(registerURL, params);

        return json;
    }

    //function for deposit
    public JSONObject deposit(String accno, String amount){
        // Building Parameters
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("tag", "Deposit"));
        params.add(new BasicNameValuePair("Account No", accno));
        params.add(new BasicNameValuePair("First Name", amount));
        JSONObject json = jsonParser.getJSONFromUrl(registerURL, params);

        return json;
    }
}
