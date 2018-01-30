package com.example.st1drawermenu;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018-01-26.
 */

public class LoginRequest extends StringRequest {

    final static private String URL = "http://givetest.cafe24.com/usermain/UserLogin.php";
    private Map<String, String> parameters;

    public LoginRequest(String userID, String userPassword, Response.Listener<String> listener) {
        super(Method.POST,URL,listener,null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);

    }



    public Map<String, String> getParams() {
        return parameters;
    }

}