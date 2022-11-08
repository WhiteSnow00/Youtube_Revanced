// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

public interface ControllerServiceBridge$Callbacks
{
    void onControllerEventPacket(final ControllerEventPacket p0);
    
    void onControllerEventPacket2(final ControllerEventPacket2 p0);
    
    void onControllerRecentered(final ControllerOrientationEvent p0);
    
    void onControllerStateChanged(final int p0, final int p1);
    
    void onServiceConnected(final int p0);
    
    void onServiceDisconnected();
    
    void onServiceFailed();
    
    void onServiceInitFailed(final int p0);
    
    void onServiceUnavailable();
}
