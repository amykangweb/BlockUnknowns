package net.amykang.blockunknowns;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class PhoneCallListener extends PhoneStateListener {

    private Context context;

    public PhoneCallListener(Context context) {
        this.context = context;
    }

    public void onCallStateChanged(int state, String incomingNumber) {
        if (state == TelephonyManager.CALL_STATE_RINGING) {
            Toast.makeText(this.context, "Phone is Ringing Now", Toast.LENGTH_LONG).show();
        }
    }
}
