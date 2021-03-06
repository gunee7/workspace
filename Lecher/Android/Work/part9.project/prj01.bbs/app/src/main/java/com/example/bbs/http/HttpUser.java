package com.example.bbs.http;

import com.example.bbs.*;
import com.example.bbs.inf.IUser;
import com.example.bbs.model.*;
import com.google.gson.Gson;

import org.apache.commons.lang3.NotImplementedException;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.*;


public class HttpUser implements IUser {

    private final static String HTTP_URL_LOGIN          = AppConstants.HTT_URL_BASE + "/rest/login";
    private final static String HTTP_URL_LOGOUT         = AppConstants.HTT_URL_BASE + "/rest/logout";
    private static final String HTTP_URL_CHECKUSERID    = AppConstants.HTT_URL_BASE + "/rest/checkuserid";
    private static final String HTTP_URL_SELECTUSERONE  = AppConstants.HTT_URL_BASE + "/rest/selectuserone";
    private static final String HTTP_URL_INSERTUSER     = AppConstants.HTT_URL_BASE + "/rest/insertuser";
    private static final String HTTP_URL_UPDATEPASSWD   = AppConstants.HTT_URL_BASE + "/rest/updatepasswd";
    private static final String HTTP_URL_CHECKPASSWORD  = AppConstants.HTT_URL_BASE + "/rest/checkpassword";
    private static final String HTTP_URL_UPDATEUSERINFO = AppConstants.HTT_URL_BASE + "/rest/updateuserinfo";
    private static final String HTTP_URL_UPDATERETIRE   = AppConstants.HTT_URL_BASE + "/rest/updateretire";

    @Override
    public int logout(String userid) {
        return 0;
    }

    @Override
    public ModelUser login(String userid, String passwd) {
        return null;
    }

    @Override
    public int checkuserid(String userid) {
        return 0;
    }

    @Override
    public int updatePasswd(String userid, String currentPasswd, String newPasswd) {
        return 0;
    }

    @Override
    public List<ModelUser> selectUserList(ModelUser user) {
        return null;
    }

    @Override
    public ModelUser selectUserOne(ModelUser user) {
        return null;
    }

    @Override
    public int insertUser(ModelUser user) {
        return 0;
    }

    @Override
    public int updateUserInfo(ModelUser setValue, ModelUser whereValue) {
        return 0;
    }

    @Override
    public int updateRetire(ModelUser user) {
        return 0;
    }

    @Override
    public int checkpassword(String id, String curpw) {
        return 0;
    }
}
