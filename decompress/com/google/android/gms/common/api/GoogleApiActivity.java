// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import android.content.DialogInterface;
import android.os.Bundle;
import android.content.ActivityNotFoundException;
import android.os.Build;
import com.google.android.gms.common.ConnectionResult;
import android.content.IntentSender$SendIntentException;
import android.util.Log;
import android.os.Parcelable;
import android.content.Intent;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface$OnCancelListener;
import android.app.Activity;

public class GoogleApiActivity extends Activity implements DialogInterface$OnCancelListener
{
    protected int a;
    
    public GoogleApiActivity() {
        this.a = 0;
    }
    
    public static Intent a(final Context context, final PendingIntent pendingIntent, final int n, final boolean b) {
        final Intent intent = new Intent(context, (Class)GoogleApiActivity.class);
        intent.putExtra("pending_intent", (Parcelable)pendingIntent);
        intent.putExtra("failing_client_id", n);
        intent.putExtra("notify_manager", b);
        return intent;
    }
    
    private final void b() {
        final Bundle extras = this.getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            this.finish();
            return;
        }
        final PendingIntent pendingIntent = (PendingIntent)extras.get("pending_intent");
        final Integer n = (Integer)extras.get("error_code");
        if (pendingIntent == null && n == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            this.finish();
            return;
        }
        if (pendingIntent != null) {
            try {
                this.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent)null, 0, 0, 0);
                this.a = 1;
                return;
            }
            catch (final IntentSender$SendIntentException ex) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", (Throwable)ex);
                this.finish();
                return;
            }
            catch (final ActivityNotFoundException ex2) {
                if (extras.getBoolean("notify_manager", true)) {
                    mrg.c((Context)this).d(new ConnectionResult(22, (PendingIntent)null), this.getIntent().getIntExtra("failing_client_id", -1));
                }
                else {
                    final String string = pendingIntent.toString();
                    final StringBuilder sb = new StringBuilder("Activity not found while launching ");
                    sb.append(string);
                    sb.append(".");
                    String s = sb.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        s = s.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", s, (Throwable)ex2);
                }
                this.a = 1;
                this.finish();
                return;
            }
        }
        kgk.aL((Object)n);
        moq.a.f((Activity)this, (int)n, 2, (DialogInterface$OnCancelListener)this);
        this.a = 1;
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 1) {
            final boolean booleanExtra = this.getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            this.setResult(n2, intent);
            if (booleanExtra) {
                final mrg c = mrg.c((Context)this);
                if (n2 != -1) {
                    if (n2 == 0) {
                        c.d(new ConnectionResult(13, (PendingIntent)null), this.getIntent().getIntExtra("failing_client_id", -1));
                    }
                }
                else {
                    c.e();
                }
            }
        }
        else if (n == 2) {
            this.a = 0;
            this.setResult(n2, intent);
        }
        this.finish();
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        this.setResult(this.a = 0);
        this.finish();
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            this.b();
        }
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }
}
