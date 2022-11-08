// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.RemoteException;
import android.os.Parcelable;
import android.os.Bundle;
import android.util.Log;
import android.app.PendingIntent;

class DaydreamApi$8 implements Runnable
{
    final /* synthetic */ DaydreamApi this$0;
    final /* synthetic */ String val$exitPromptText;
    final /* synthetic */ Runnable val$onFailureRunnable;
    final /* synthetic */ PendingIntent val$pendingVrExitIntent;
    
    public DaydreamApi$8(final DaydreamApi this$0, final Runnable val$onFailureRunnable, final PendingIntent val$pendingVrExitIntent, final String s) {
        this.this$0 = this$0;
        this.val$onFailureRunnable = val$onFailureRunnable;
        this.val$pendingVrExitIntent = val$pendingVrExitIntent;
        this.val$exitPromptText = null;
    }
    
    @Override
    public void run() {
        if (DaydreamApi.-$$Nest$fgetdaydreamManager(this.this$0) == null) {
            Log.w("DaydreamApi", "Failed to exit VR: Daydream service unavailable.");
            this.val$onFailureRunnable.run();
            return;
        }
        try {
            if (DaydreamApi.-$$Nest$fgetvrCoreApiVersion(this.this$0) >= 23) {
                final Bundle bundle = new Bundle();
                bundle.putParcelable("EXIT_VR_INTENT_KEY", (Parcelable)this.val$pendingVrExitIntent);
                bundle.putString("EXIT_VR_TEXT_KEY", this.val$exitPromptText);
                if (!DaydreamApi.-$$Nest$fgetdaydreamManager(this.this$0).l(bundle)) {
                    Log.w("DaydreamApi", "Failed to exit VR: Invalid request.");
                    this.val$onFailureRunnable.run();
                }
            }
            else if (!DaydreamApi.-$$Nest$fgetdaydreamManager(this.this$0).k(this.val$pendingVrExitIntent)) {
                Log.w("DaydreamApi", "Failed to exit VR: Invalid request.");
                this.val$onFailureRunnable.run();
            }
        }
        catch (final RemoteException ex) {
            Log.e("DaydreamApi", "Failed to exit VR: RemoteException while exiting:".concat(ex.toString()));
            this.val$onFailureRunnable.run();
        }
    }
}
