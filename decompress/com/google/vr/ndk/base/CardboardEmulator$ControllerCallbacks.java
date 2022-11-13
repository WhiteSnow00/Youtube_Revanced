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
    
    @Override
    public void onControllerEventPacket(final ControllerEventPacket controllerEventPacket) {
        for (int i = 0; i < controllerEventPacket.n; ++i) {
            final ControllerButtonEvent f = controllerEventPacket.f(i);
            if (f.c) {
                final int b = f.b;
                if (b == 1 || b == 3 || b == 7) {
                    arcq.a(this.cardboardTriggerCallback);
                }
            }
        }
    }
    
    @Override
    public void onControllerEventPacket2(final ControllerEventPacket2 controllerEventPacket2) {
        this.onControllerEventPacket(controllerEventPacket2);
    }
    
    @Override
    public void onControllerRecentered(final ControllerOrientationEvent controllerOrientationEvent) {
    }
    
    @Override
    public void onControllerStateChanged(final int n, final int n2) {
    }
    
    @Override
    public void onServiceConnected(final int n) {
    }
    
    @Override
    public void onServiceDisconnected() {
    }
    
    @Override
    public void onServiceFailed() {
    }
    
    @Override
    public void onServiceInitFailed(final int n) {
    }
    
    @Override
    public void onServiceUnavailable() {
    }
}
