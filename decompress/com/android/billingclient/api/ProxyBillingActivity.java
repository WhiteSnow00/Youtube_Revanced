// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import android.os.Parcelable;
import android.content.IntentSender$SendIntentException;
import android.app.PendingIntent;
import android.os.Bundle;
import android.content.Intent;
import android.os.ResultReceiver;
import android.app.Activity;

public class ProxyBillingActivity extends Activity
{
    private ResultReceiver a;
    private ResultReceiver b;
    private boolean c;
    private boolean d;
    
    private final Intent a() {
        final Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(this.getApplicationContext().getPackageName());
        return intent;
    }
    
    protected final void onActivityResult(int i, int n, Intent intent) {
        super.onActivityResult(i, n, intent);
        final Bundle bundle = null;
        final Bundle bundle2 = null;
        if (i != 100 && i != 110) {
            if (i == 101) {
                i = dam.i(intent);
                final ResultReceiver b = this.b;
                if (b != null) {
                    Bundle extras;
                    if (intent == null) {
                        extras = bundle2;
                    }
                    else {
                        extras = intent.getExtras();
                    }
                    b.send(i, extras);
                }
            }
            else {
                final StringBuilder sb = new StringBuilder("Got onActivityResult with wrong requestCode: ");
                sb.append(i);
                sb.append("; skipping...");
                dam.f("ProxyBillingActivity", sb.toString());
            }
        }
        else {
            final int a = dam.c(intent, "ProxyBillingActivity").a;
            Label_0193: {
                int n2;
                if ((n2 = n) == -1) {
                    if (a == 0) {
                        n = 0;
                        break Label_0193;
                    }
                    n2 = -1;
                }
                final StringBuilder sb2 = new StringBuilder("Activity finished with resultCode ");
                sb2.append(n2);
                sb2.append(" and billing's responseCode: ");
                sb2.append(a);
                dam.f("ProxyBillingActivity", sb2.toString());
                n = a;
            }
            final ResultReceiver a2 = this.a;
            if (a2 != null) {
                Bundle extras2;
                if (intent == null) {
                    extras2 = bundle;
                }
                else {
                    extras2 = intent.getExtras();
                }
                a2.send(n, extras2);
            }
            else {
                if (intent != null) {
                    if (intent.getExtras() != null) {
                        final String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                        if (string != null) {
                            intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                            intent.setPackage(this.getApplicationContext().getPackageName());
                            intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                        }
                        else {
                            final Intent a3 = this.a();
                            a3.putExtras(intent.getExtras());
                            intent = a3;
                        }
                    }
                    else {
                        intent = this.a();
                        dam.f("ProxyBillingActivity", "Got null bundle!");
                        intent.putExtra("RESPONSE_CODE", 6);
                        intent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    }
                }
                else {
                    intent = this.a();
                }
                if (i == 110) {
                    intent.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                this.sendBroadcast(intent);
            }
        }
        this.c = false;
        this.finish();
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            final int a = dam.a;
            Label_0179: {
                PendingIntent pendingIntent2;
                if (this.getIntent().hasExtra("BUY_INTENT")) {
                    final PendingIntent pendingIntent = pendingIntent2 = (PendingIntent)this.getIntent().getParcelableExtra("BUY_INTENT");
                    if (this.getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT")) {
                        pendingIntent2 = pendingIntent;
                        if (this.getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                            this.d = true;
                            final int n = 110;
                            pendingIntent2 = pendingIntent;
                            break Label_0179;
                        }
                    }
                }
                else if (this.getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    pendingIntent2 = (PendingIntent)this.getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                    this.a = (ResultReceiver)this.getIntent().getParcelableExtra("result_receiver");
                }
                else {
                    if (this.getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                        pendingIntent2 = (PendingIntent)this.getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                        this.b = (ResultReceiver)this.getIntent().getParcelableExtra("in_app_message_result_receiver");
                        final int n = 101;
                        break Label_0179;
                    }
                    pendingIntent2 = null;
                }
                final int n = 100;
                try {
                    this.c = true;
                    this.startIntentSenderForResult(pendingIntent2.getIntentSender(), n, new Intent(), 0, 0, 0);
                    return;
                }
                catch (final IntentSender$SendIntentException ex) {
                    dam.g("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", (Throwable)ex);
                    final ResultReceiver a2 = this.a;
                    if (a2 != null) {
                        a2.send(6, (Bundle)null);
                    }
                    else {
                        final ResultReceiver b = this.b;
                        if (b != null) {
                            b.send(0, (Bundle)null);
                        }
                        else {
                            final Intent a3 = this.a();
                            if (this.d) {
                                a3.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                            }
                            a3.putExtra("RESPONSE_CODE", 6);
                            a3.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                            this.sendBroadcast(a3);
                        }
                    }
                    this.c = false;
                    this.finish();
                    return;
                }
            }
        }
        final int a4 = dam.a;
        this.c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (bundle.containsKey("result_receiver")) {
            this.a = (ResultReceiver)bundle.getParcelable("result_receiver");
        }
        else if (bundle.containsKey("in_app_message_result_receiver")) {
            this.b = (ResultReceiver)bundle.getParcelable("in_app_message_result_receiver");
        }
        this.d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
    }
    
    protected final void onDestroy() {
        super.onDestroy();
        if (!this.isFinishing()) {
            return;
        }
        if (!this.c) {
            return;
        }
        final Intent a = this.a();
        a.putExtra("RESPONSE_CODE", 1);
        a.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
        this.sendBroadcast(a);
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        final ResultReceiver a = this.a;
        if (a != null) {
            bundle.putParcelable("result_receiver", (Parcelable)a);
        }
        final ResultReceiver b = this.b;
        if (b != null) {
            bundle.putParcelable("in_app_message_result_receiver", (Parcelable)b);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.d);
    }
}
