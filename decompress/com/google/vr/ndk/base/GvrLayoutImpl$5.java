// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.RemoteException;
import android.util.Log;
import android.os.Message;
import android.os.Messenger;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

class GvrLayoutImpl$5 implements ServiceConnection
{
    final GvrLayoutImpl this$0;
    
    public GvrLayoutImpl$5(final GvrLayoutImpl this$0) {
        this.this$0 = this$0;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        GvrLayoutImpl.-$$Nest$fputsyncServiceSender(this.this$0, new Messenger(binder));
        final Message message = new Message();
        message.what = 0;
        message.replyTo = GvrLayoutImpl.-$$Nest$fgetsyncServiceReceiver(this.this$0);
        try {
            GvrLayoutImpl.-$$Nest$fgetsyncServiceSender(this.this$0).send(message);
        }
        catch (final RemoteException ex) {
            Log.e("GvrLayoutImpl", "Failed to register latch listener");
        }
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        GvrLayoutImpl.-$$Nest$fputsyncServiceSender(this.this$0, (Messenger)null);
    }
}
