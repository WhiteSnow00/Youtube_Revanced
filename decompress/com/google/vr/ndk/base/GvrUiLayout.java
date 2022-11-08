// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.RemoteException;
import com.google.vr.vrcore.library.api.ObjectWrapper;

public class GvrUiLayout
{
    private final arbi impl;
    
    public GvrUiLayout(final arbi impl) {
        this.impl = impl;
    }
    
    public void setCloseButtonListener(final Runnable runnable) {
        try {
            this.impl.setCloseButtonListener(ObjectWrapper.a((Object)runnable));
        }
        catch (final RemoteException ex) {
            throw new RuntimeException((Throwable)ex);
        }
    }
    
    public void setTransitionViewEnabled(final boolean transitionViewEnabled) {
        try {
            this.impl.setTransitionViewEnabled(transitionViewEnabled);
        }
        catch (final RemoteException ex) {
            throw new RuntimeException((Throwable)ex);
        }
    }
    
    public void setViewerName(final String viewerName) {
        try {
            this.impl.setViewerName(viewerName);
        }
        catch (final RemoteException ex) {
            throw new RuntimeException((Throwable)ex);
        }
    }
}
