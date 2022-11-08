// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.util.Log;
import android.app.PendingIntent;

class DaydreamApi$7 implements Runnable
{
    final /* synthetic */ PendingIntent val$pendingVrExitIntent;
    
    public DaydreamApi$7(final DaydreamApi daydreamApi, final PendingIntent val$pendingVrExitIntent) {
        this.val$pendingVrExitIntent = val$pendingVrExitIntent;
    }
    
    @Override
    public void run() {
        try {
            this.val$pendingVrExitIntent.send(0);
        }
        catch (final Exception ex) {
            Log.e("DaydreamApi", "Couldn't launch PendingIntent: ".concat(ex.toString()));
        }
    }
}
