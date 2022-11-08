// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.cardboard;

import android.util.Log;
import android.os.Handler$Callback;
import android.os.Handler;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Choreographer$FrameCallback;

public class DisplaySynchronizer implements Choreographer$FrameCallback
{
    public static final long a;
    public volatile long b;
    public aqzv c;
    private volatile Display d;
    private DisplayMetrics e;
    private volatile int f;
    private long g;
    
    static {
        a = TimeUnit.SECONDS.toNanos(1L);
    }
    
    public DisplaySynchronizer(final Context context, final Display display) {
        this.f = -1;
        this.g = 0L;
        this.b = this.nativeCreate(this.getClass().getClassLoader(), context.getApplicationContext());
        if (this.b != 0L) {
            this.d(display);
            final aqzv c = new aqzv((Choreographer$FrameCallback)this);
            this.c = c;
            c.a.start();
            (c.b = new Handler(c.a.getLooper(), (Handler$Callback)c)).sendEmptyMessage(0);
            return;
        }
        throw new IllegalStateException("Native DisplaySynchronizer creation failed, implementation unavailable.");
    }
    
    public final void a() {
        if (this.b != 0L) {
            return;
        }
        throw new IllegalStateException("DisplaySynchronizer has already been shut down.");
    }
    
    public final void b() {
        this.f = -1;
        final DisplayMetrics p = aqzg.p(this.d);
        if (!p.equals(this.e)) {
            if (this.e != null) {
                this.nativeOnMetricsChanged(this.b);
            }
            this.e = p;
        }
    }
    
    public final void c() {
        final aqzv c = this.c;
        if (c != null) {
            c.a();
        }
    }
    
    public final void d(final Display d) {
        this.a();
        this.d = d;
        this.b();
        final float refreshRate = d.getRefreshRate();
        long n;
        if (refreshRate >= 30.0f) {
            n = (long)(TimeUnit.SECONDS.toNanos(1L) / refreshRate);
        }
        else {
            n = 0L;
        }
        this.nativeReset(this.b, n, d.getAppVsyncOffsetNanos());
    }
    
    public final void doFrame(final long g) {
        this.a();
        if (this.f == -1 || g - this.g > DisplaySynchronizer.a) {
            final int rotation = this.d.getRotation();
            Label_0098: {
                if (rotation != 0) {
                    int f;
                    if (rotation != 1) {
                        if (rotation != 2) {
                            if (rotation != 3) {
                                Log.e("DisplaySynchronizer", "Unknown display rotation, defaulting to 0");
                                this.f = 0;
                                break Label_0098;
                            }
                            f = 270;
                        }
                        else {
                            f = 180;
                        }
                    }
                    else {
                        f = 90;
                    }
                    this.f = f;
                }
                else {
                    this.f = 0;
                }
            }
            this.g = g;
        }
        this.nativeUpdate(this.b, g, this.f);
    }
    
    @Override
    protected final void finalize() {
        try {
            if (this.b != 0L) {
                Log.w("DisplaySynchronizer", "DisplaySynchronizer.shutdown() should be called to ensure resource cleanup");
                this.nativeDestroy(this.b);
            }
        }
        finally {
            super.finalize();
        }
    }
    
    protected native long nativeCreate(final ClassLoader p0, final Context p1);
    
    public native void nativeDestroy(final long p0);
    
    protected native void nativeOnMetricsChanged(final long p0);
    
    protected native void nativeReset(final long p0, final long p1, final long p2);
    
    protected native void nativeUpdate(final long p0, final long p1, final int p2);
}
