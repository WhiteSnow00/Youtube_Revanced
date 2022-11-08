// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.RemoteException;
import android.util.Log;

class DaydreamApi$4 implements Runnable
{
    final /* synthetic */ DaydreamApi this$0;
    final /* synthetic */ arau val$callbacks;
    
    public DaydreamApi$4(final DaydreamApi this$0, final arau val$callbacks) {
        this.this$0 = this$0;
        this.val$callbacks = val$callbacks;
    }
    
    @Override
    public void run() {
        if (DaydreamApi.-$$Nest$fgetdaydreamManager(this.this$0) != null) {
            try {
                if (DaydreamApi.-$$Nest$fgetdaydreamManager(this.this$0).n(this.val$callbacks)) {
                    return;
                }
            }
            catch (final RemoteException ex) {
                Log.e("DaydreamApi", "RemoteException while launching VR transition: ", (Throwable)ex);
            }
        }
        Log.w("DaydreamApi", "Can't launch callbacks via DaydreamManager, sending manually");
        try {
            this.val$callbacks.onTransitionComplete();
        }
        catch (final RemoteException ex2) {}
    }
}
