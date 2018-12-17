package net.amykang.blockunknowns;

import android.content.Context;
import android.content.IntentFilter;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TelephonyManager telephonyManager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);

        PhoneCallListener callStateListener = new PhoneCallListener(this);

        telephonyManager.listen(callStateListener, PhoneStateListener.LISTEN_CALL_STATE);

        final Button startButton = findViewById(R.id.button);

        startButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startButton.setText("Stop");
            }
        });

    }
}


