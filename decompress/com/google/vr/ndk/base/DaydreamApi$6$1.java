// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.content.IntentSender$SendIntentException;
import android.util.Log;
import android.content.Intent;

class DaydreamApi$6$1 implements Runnable
{
    final /* synthetic */ DaydreamApi$6 this$1;
    
    public DaydreamApi$6$1(final DaydreamApi$6 this$1) {
        this.this$1 = this$1;
    }
    
    @Override
    public void run() {
        try {
            final DaydreamApi$6 this$1 = this.this$1;
            this$1.val$activity.startIntentSenderForResult(this$1.val$pendingIntent.getIntentSender(), this.this$1.val$requestCode, (Intent)null, 0, 0, 0);
        }
        catch (final IntentSender$SendIntentException ex) {
            Log.e("DaydreamApi", "Exception while starting next VR activity: ".concat(ex.toString()));
        }
    }
}
