// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.app.Activity;
import android.util.Log;
import android.content.Context;

class GvrUiLayoutImpl$CloseButtonListenerWrapper implements Runnable
{
    private Runnable activeCloseButtonListener;
    private final Context context;
    private final Runnable defaultCloseButtonListener;
    private boolean invokingCloseButton;
    private final Runnable passiveCloseButtonListener;
    
    public GvrUiLayoutImpl$CloseButtonListenerWrapper(final Context context, final Runnable passiveCloseButtonListener, final DaydreamUtilsWrapper daydreamUtilsWrapper) {
        this.invokingCloseButton = false;
        this.context = context;
        this.passiveCloseButtonListener = passiveCloseButtonListener;
        final Runnable -$$Nest$smcreateDefaultCloseButtonListener = GvrUiLayoutImpl.-$$Nest$smcreateDefaultCloseButtonListener(context, daydreamUtilsWrapper);
        this.defaultCloseButtonListener = -$$Nest$smcreateDefaultCloseButtonListener;
        this.activeCloseButtonListener = -$$Nest$smcreateDefaultCloseButtonListener;
    }
    
    @Override
    public void run() {
        if (this.invokingCloseButton) {
            Log.w("GvrUiLayoutImpl", "GVR close behavior invoked recursively.");
            final Activity t = arbu.t(this.context);
            if (t != null) {
                t.finish();
            }
            return;
        }
        this.invokingCloseButton = true;
        try {
            final Runnable passiveCloseButtonListener = this.passiveCloseButtonListener;
            if (passiveCloseButtonListener != null) {
                passiveCloseButtonListener.run();
            }
            final Runnable activeCloseButtonListener = this.activeCloseButtonListener;
            if (activeCloseButtonListener != null) {
                activeCloseButtonListener.run();
            }
        }
        finally {
            this.invokingCloseButton = false;
        }
    }
    
    public void setClientCloseButtonListener(final Runnable runnable) {
        Runnable defaultCloseButtonListener = runnable;
        if (runnable == null) {
            defaultCloseButtonListener = this.defaultCloseButtonListener;
        }
        this.activeCloseButtonListener = defaultCloseButtonListener;
    }
}
