// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks;
import android.content.Context;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;

class CardboardEmulator
{
    private static final String TAG = "CardboardEmulator";
    private final ControllerServiceBridge controllerServiceBridge;
    private boolean resumed;
    
    public CardboardEmulator(final Context context, final Runnable runnable) {
        this.controllerServiceBridge = this.createServiceBridge(context, (ControllerServiceBridge$Callbacks)new CardboardEmulator$ControllerCallbacks(runnable));
    }
    
    protected ControllerServiceBridge createServiceBridge(final Context context, final ControllerServiceBridge$Callbacks controllerServiceBridge$Callbacks) {
        return new ControllerServiceBridge(context, controllerServiceBridge$Callbacks, 0);
    }
    
    public void onPause() {
        if (this.resumed) {
            this.resumed = false;
            this.controllerServiceBridge.requestUnbind();
        }
    }
    
    public void onResume() {
        if (!this.resumed) {
            this.resumed = true;
            this.controllerServiceBridge.requestBind();
        }
    }
}
