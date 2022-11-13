// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.install;

final class NativeInstallStateUpdateListener implements aebu
{
    public final /* bridge */ void i(final Object o) {
        this.onStateUpdate((InstallState)o);
    }
    
    public native void onStateUpdate(final InstallState p0);
}
