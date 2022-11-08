// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import com.google.vr.vrcore.controller.api.ControllerOrientationEvent;
import com.google.vr.vrcore.controller.api.ControllerEventPacket2;
import com.google.vr.vrcore.controller.api.ControllerButtonEvent;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks;

class CardboardEmulator$ControllerCallbacks implements ControllerServiceBridge$Callbacks
{
    private final Runnable cardboardTriggerCallback;
    
    public CardboardEmulator$ControllerCallbacks(final Runnable cardboardTriggerCallback) {
        this.cardboardTriggerCallback = cardboardTriggerCallback;
    }
    
    public void onControllerEventPacket(final ControllerEventPacket controllerEventPacket) {
        for (int i = 0; i < controllerEventPacket.n; ++i) {
            final ControllerButtonEvent f = controllerEventPacket.f(i);
            if (f.c) {
                final int b = f.b;
                if (b == 1 || b == 3 || b == 7) {
                    arac.a(this.cardboardTriggerCallback);
                }
            }
        }
    }
    
    public void onControllerEventPacket2(final ControllerEventPacket2 controllerEventPacket2) {
        this.onControllerEventPacket(controllerEventPacket2);
    }
    
    public void onControllerRecentered(final ControllerOrientationEvent controllerOrientationEvent) {
    }
    
    public void onControllerStateChanged(final int n, final int n2) {
    }
    
    public void onServiceConnected(final int n) {
    }
    
    public void onServiceDisconnected() {
    }
    
    public void onServiceFailed() {
    }
    
    public void onServiceInitFailed(final int n) {
    }
    
    public void onServiceUnavailable() {
    }
}
