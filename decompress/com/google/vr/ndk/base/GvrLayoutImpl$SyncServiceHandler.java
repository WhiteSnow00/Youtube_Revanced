// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.Bundle;
import android.os.Message;
import android.os.Looper;
import java.lang.ref.WeakReference;
import android.os.Handler;

class GvrLayoutImpl$SyncServiceHandler extends Handler
{
    private final WeakReference gvrLayout;
    
    public GvrLayoutImpl$SyncServiceHandler(final WeakReference gvrLayout) {
        super(Looper.getMainLooper());
        this.gvrLayout = gvrLayout;
    }
    
    public void handleMessage(final Message message) {
        if (message.what != 0) {
            return;
        }
        try {
            final Bundle data = message.getData();
            data.setClassLoader(this.getClass().getClassLoader());
            final LatchRecord latchRecord = (LatchRecord)data.getParcelable("latchRecord");
            final GvrLayoutImpl gvrLayoutImpl = (GvrLayoutImpl)this.gvrLayout.get();
            if (gvrLayoutImpl != null) {
                GvrLayoutImpl.-$$Nest$monCompositorLatch(gvrLayoutImpl, latchRecord.serializedLatchRecord);
            }
        }
        finally {}
    }
}
