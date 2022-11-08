// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.RemoteException;
import android.util.Log;

class DaydreamApi$5 implements Runnable
{
    final /* synthetic */ DaydreamApi this$0;
    
    public DaydreamApi$5(final DaydreamApi this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        if (DaydreamApi.-$$Nest$fgetdaydreamManager(this.this$0) == null) {
            Log.e("DaydreamApi", "Can't launch VR homescreen via DaydreamManager. Giving up trying to leave current VR activity...");
            return;
        }
        try {
            if (DaydreamApi.-$$Nest$fgetdaydreamManager(this.this$0).m()) {
                return;
            }
            Log.e("DaydreamApi", "There is no VR homescreen installed.");
        }
        catch (final RemoteException ex) {
            Log.e("DaydreamApi", "RemoteException while launching VR homescreen: ".concat(ex.toString()));
        }
    }
}
