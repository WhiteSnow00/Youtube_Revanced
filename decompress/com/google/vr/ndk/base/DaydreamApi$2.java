// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.RemoteException;
import android.util.Log;
import android.app.PendingIntent;

class DaydreamApi$2 implements Runnable
{
    final /* synthetic */ DaydreamApi this$0;
    final /* synthetic */ PendingIntent val$intent;
    
    public DaydreamApi$2(final DaydreamApi this$0, final PendingIntent val$intent) {
        this.this$0 = this$0;
        this.val$intent = val$intent;
    }
    
    @Override
    public void run() {
        if (DaydreamApi.-$$Nest$fgetdaydreamManager(this.this$0) == null) {
            Log.w("DaydreamApi", "Can't register/unregister daydream intent: no DaydreamManager.");
            return;
        }
        try {
            if (this.val$intent != null) {
                DaydreamApi.-$$Nest$fgetdaydreamManager(this.this$0).i(this.val$intent);
                return;
            }
            DaydreamApi.-$$Nest$fgetdaydreamManager(this.this$0).j();
        }
        catch (final RemoteException ex) {
            Log.e("DaydreamApi", "Error when attempting to register/unregister daydream intent: ", (Throwable)ex);
        }
    }
}
