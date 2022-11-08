// 
// Decompiled by Procyon v0.6.0
// 

package com.google.research.xeno.effect;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.Map;

public class Effect
{
    public long a;
    public final Map b;
    public final ReentrantReadWriteLock c;
    
    public Effect(final long a) {
        this.c = new ReentrantReadWriteLock();
        this.a = a;
        this.b = this.nativeGetControls(a);
    }
    
    public static void b(final aqrj aqrj, final Effect effect, final String s) {
        final aecw aecw = new aecw(aqrj, effect, s, 15);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ((Runnable)aecw).run();
            return;
        }
        new Handler(Looper.getMainLooper()).post((Runnable)aecw);
    }
    
    public static void c(final aqrm aqrm, final RemoteAssetManager remoteAssetManager, final aqrj aqrj) {
        final String c = remoteAssetManager.c;
        if (c == null) {
            b(aqrj, null, "RemoteAssetManager sandbox failed to initialize");
            return;
        }
        RemoteAssetManager.a.execute((Runnable)new aghl(remoteAssetManager, new arvv(aqrj, aqrm, c), 12, (byte[])null));
    }
    
    private native Map nativeGetControls(final long p0);
    
    private native int nativeGetMaxFramesInFlight(final long p0);
    
    public static native void nativeLoadWithRemoteAssetManager(final byte[] p0, final long p1, final String p2, final Effect$NativeLoadCallback p3);
    
    private native void nativeRelease(final long p0);
    
    public final Integer a() {
        this.c.readLock().lock();
        try {
            final int nativeGetMaxFramesInFlight = this.nativeGetMaxFramesInFlight(this.a);
            Integer value;
            if (nativeGetMaxFramesInFlight > 0) {
                value = nativeGetMaxFramesInFlight;
            }
            else {
                value = null;
            }
            return value;
        }
        finally {
            this.c.readLock().unlock();
        }
    }
}
