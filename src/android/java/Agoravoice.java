package com.realidfarm.agoravoice;

import java.io.File;
import android.app.Activity;
import android.content.Intent;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.text.TextUtils;
import android.util.Log;
import com.realidfarm.agoravoice.VoiceChatViewActivity;
import com.realidfarm.agoravoice.VideoChatViewActivity;

public class Agoravoice extends CordovaPlugin{

    private String fromUname,targetUname;
	
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        Activity activity = this.cordova.getActivity();
        fromUname = args.getString(0);
        targetUname = args.getString(1);
        if (action.equals("voiceCall")) {
            Intent intent = new Intent(activity, VoiceChatViewActivity.class);
            intent.putExtra("fromUname", fromUname);
            intent.putExtra("targetUname", targetUname);
            activity.startActivity(intent);
            return true;
        }else if (action.equals("videoCall")) {
            Intent intent = new Intent(activity, VideoChatViewActivity.class);
            intent.putExtra("fromUname", fromUname);
            intent.putExtra("targetUname", targetUname);
            activity.startActivity(intent);
            return true;
        }
        return false;
    }

}
