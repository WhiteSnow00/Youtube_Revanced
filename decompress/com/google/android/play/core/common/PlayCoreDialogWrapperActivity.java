// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.common;

import android.os.Parcelable;
import android.content.IntentSender$SendIntentException;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.app.Activity;

public class PlayCoreDialogWrapperActivity extends Activity
{
    private ResultReceiver a;
    
    private final void a() {
        final ResultReceiver a = this.a;
        if (a != null) {
            a.send(3, new Bundle());
        }
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 0) {
            final ResultReceiver a = this.a;
            if (a != null) {
                if (n2 == -1) {
                    a.send(1, new Bundle());
                }
                else if (n2 == 0) {
                    a.send(2, new Bundle());
                }
            }
        }
        this.finish();
    }
    
    protected final void onCreate(Bundle extras) {
        final int intExtra = this.getIntent().getIntExtra("window_flags", 0);
        Intent intent;
        if (intExtra != 0) {
            this.getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        }
        else {
            intent = null;
        }
        super.onCreate(extras);
        if (extras == null) {
            this.a = (ResultReceiver)this.getIntent().getParcelableExtra("result_receiver");
            extras = this.getIntent().getExtras();
            if (extras == null) {
                this.a();
                this.finish();
                return;
            }
            final PendingIntent pendingIntent = (PendingIntent)extras.get("confirmation_intent");
            try {
                this.startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
                return;
            }
            catch (final IntentSender$SendIntentException ex) {
                this.a();
                this.finish();
                return;
            }
        }
        this.a = (ResultReceiver)extras.getParcelable("result_receiver");
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        bundle.putParcelable("result_receiver", (Parcelable)this.a);
    }
}
