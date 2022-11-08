// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.RemoteException;
import android.util.Log;
import android.app.PendingIntent;
import android.content.ComponentName;

class DaydreamApi$3 implements Runnable
{
    final /* synthetic */ DaydreamApi this$0;
    final /* synthetic */ ComponentName val$component;
    final /* synthetic */ PendingIntent val$pendingIntent;
    
    public DaydreamApi$3(final DaydreamApi this$0, final PendingIntent val$pendingIntent, final ComponentName val$component) {
        this.this$0 = this$0;
        this.val$pendingIntent = val$pendingIntent;
        this.val$component = val$component;
    }
    
    @Override
    public void run() {
        if (DaydreamApi.-$$Nest$fgetdaydreamManager(this.this$0) != null) {
            try {
                DaydreamApi.-$$Nest$fgetdaydreamManager(this.this$0).o(this.val$pendingIntent, this.val$component);
                return;
            }
            catch (final RemoteException ex) {
                Log.e("DaydreamApi", "RemoteException while launching PendingIntent in VR.", (Throwable)ex);
                return;
            }
        }
        Log.w("DaydreamApi", "Can't launch PendingIntent via DaydreamManager: not available.");
        try {
            this.val$pendingIntent.send();
        }
        catch (final Exception ex2) {
            Log.e("DaydreamApi", "Couldn't launch PendingIntent: ", (Throwable)ex2);
        }
    }
}
