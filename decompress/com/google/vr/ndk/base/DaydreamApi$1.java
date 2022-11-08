// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import java.util.ArrayList;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

class DaydreamApi$1 implements ServiceConnection
{
    final /* synthetic */ DaydreamApi this$0;
    
    public DaydreamApi$1(final DaydreamApi this$0) {
        this.this$0 = this$0;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final DaydreamApi this$0 = this.this$0;
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.vr.vrcore.common.api.IVrCoreSdkService");
            if (queryLocalInterface instanceof araw) {
                o = queryLocalInterface;
            }
            else {
                o = new arav(binder);
            }
        }
        DaydreamApi.-$$Nest$fputvrCoreSdkService(this$0, (araw)o);
        try {
            final DaydreamApi this$2 = this.this$0;
            DaydreamApi.-$$Nest$fputdaydreamManager(this$2, DaydreamApi.-$$Nest$fgetvrCoreSdkService(this$2).a());
        }
        catch (final RemoteException ex) {
            Log.e("DaydreamApi", "RemoteException in onServiceConnected");
        }
        if (DaydreamApi.-$$Nest$fgetdaydreamManager(this.this$0) == null) {
            Log.w("DaydreamApi", "Daydream service component unavailable.");
        }
        final ArrayList -$$Nest$fgetqueuedRunnables = DaydreamApi.-$$Nest$fgetqueuedRunnables(this.this$0);
        for (int size = -$$Nest$fgetqueuedRunnables.size(), i = 0; i < size; ++i) {
            ((Runnable)-$$Nest$fgetqueuedRunnables.get(i)).run();
        }
        DaydreamApi.-$$Nest$fgetqueuedRunnables(this.this$0).clear();
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        DaydreamApi.-$$Nest$fputvrCoreSdkService(this.this$0, (araw)null);
    }
}
