// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

public interface ExtensionManager
{
    void onPause();
    
    void onResume();
    
    void reportTelemetry(final arbq p0);
    
    void setEnabled(final boolean p0);
    
    void shutdown();
}
