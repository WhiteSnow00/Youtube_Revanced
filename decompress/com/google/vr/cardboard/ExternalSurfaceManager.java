// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.cardboard;

import android.view.Surface;
import android.os.Handler;
import android.util.Log;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

public class ExternalSurfaceManager
{
    private static final String b = "ExternalSurfaceManager";
    public final aqzo a;
    private final Object c;
    private int d;
    private boolean e;
    private volatile aseo f;
    
    public ExternalSurfaceManager(final long n) {
        final aqzo a = new aqzo(n);
        this.c = new Object();
        this.f = new aseo();
        this.d = 1;
        this.a = a;
    }
    
    private final int a(final int n, final int n2, final aqzs aqzs, final boolean b) {
        synchronized (this.c) {
            final aseo f = new aseo(this.f, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            final int n3 = this.d++;
            ((HashMap<Integer, Object>)f.b).put(n3, new aqzr(n3, n, n2, aqzs, b));
            this.f = f;
            return n3;
        }
    }
    
    private final void b(final aqzt aqzt) {
        final aseo f = this.f;
        if (this.e && !((HashMap)f.b).isEmpty()) {
            for (final aqzr aqzr : ((HashMap)f.b).values()) {
                aqzr.a();
                aqzt.a(aqzr);
            }
        }
        if (!((HashMap)f.a).isEmpty()) {
            final Iterator iterator2 = ((HashMap)f.a).values().iterator();
            while (iterator2.hasNext()) {
                ((aqzr)iterator2.next()).c(this.a);
            }
        }
    }
    
    public static native void nativeCallback(final long p0);
    
    public static native void nativeUpdateSurface(final long p0, final int p1, final int p2, final long p3, final float[] p4);
    
    public void consumerAttachToCurrentGLContext() {
        this.e = true;
        final aseo f = this.f;
        if (!((HashMap)f.b).isEmpty()) {
            final Iterator iterator = ((HashMap)f.b).values().iterator();
            while (iterator.hasNext()) {
                ((aqzr)iterator.next()).a();
            }
        }
    }
    
    public void consumerAttachToCurrentGLContext(final Map map) {
        this.e = true;
        final aseo f = this.f;
        if (!((HashMap)this.f.b).isEmpty()) {
            for (final Integer n : ((HashMap)this.f.b).keySet()) {
                if (!map.containsKey(n)) {
                    Log.e(ExternalSurfaceManager.b, String.format("Surface %d's texture ID is not provided, abandoning attaching to current GL context.", n));
                    return;
                }
            }
        }
        if (!map.isEmpty()) {
            for (final Map.Entry<Object, V> entry : map.entrySet()) {
                if (((HashMap)f.b).containsKey(entry.getKey())) {
                    ((HashMap<K, aqzr>)f.b).get(entry.getKey()).b((int)entry.getValue());
                }
                else {
                    Log.e(ExternalSurfaceManager.b, String.format("Surface %d doesn't exist, skip attaching to current GL context.", entry.getKey()));
                }
            }
        }
    }
    
    public void consumerDetachFromCurrentGLContext() {
        this.e = false;
        final aseo f = this.f;
        if (!((HashMap)f.b).isEmpty()) {
            for (final aqzr aqzr : ((HashMap)f.b).values()) {
                if (aqzr.i) {
                    final aqzs b = aqzr.b;
                    if (b != null) {
                        b.a();
                    }
                    aqzr.g.detachFromGLContext();
                    aqzr.i = false;
                }
            }
        }
    }
    
    public void consumerUpdateManagedSurfaces() {
        this.b((aqzt)new aqzn(this, 1));
    }
    
    public void consumerUpdateManagedSurfacesSequentially() {
        this.b((aqzt)new aqzn(this, 0));
    }
    
    public int createExternalSurface() {
        return this.a(-1, -1, null, false);
    }
    
    public int createExternalSurface(final int n, final int n2, final Runnable runnable, final Runnable runnable2, final Handler handler) {
        if (runnable != null && handler != null) {
            return this.a(n, n2, (aqzs)new aqzp(runnable, runnable2, handler), false);
        }
        throw new IllegalArgumentException("Surface listener and handler must both be non-null for external Surface creation for Java callbacks.");
    }
    
    public int createExternalSurfaceWithNativeCallback(final int n, final int n2, final long n3, final long n4, final boolean b) {
        return this.a(n, n2, (aqzs)new aqzu(n3, n4), b);
    }
    
    public Surface getSurface(final int n) {
        final aseo f = this.f;
        final Object b = f.b;
        final Integer value = n;
        if (!((HashMap)b).containsKey(value)) {
            final String b2 = ExternalSurfaceManager.b;
            final StringBuilder sb = new StringBuilder("Surface with ID ");
            sb.append(n);
            sb.append(" does not exist, returning null");
            Log.e(b2, sb.toString());
            return null;
        }
        final aqzr aqzr = ((HashMap)f.b).get(value);
        if (!aqzr.i) {
            return null;
        }
        return aqzr.h;
    }
    
    public void releaseExternalSurface(final int n) {
        synchronized (this.c) {
            final aseo f = new aseo(this.f, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            final Object b = f.b;
            final Integer value = n;
            final aqzr aqzr = ((HashMap<K, aqzr>)b).remove(value);
            if (aqzr != null) {
                ((HashMap)f.a).put(value, aqzr);
                this.f = f;
            }
            else {
                final String b2 = ExternalSurfaceManager.b;
                final StringBuilder sb = new StringBuilder("Not releasing nonexistent surface ID ");
                sb.append(n);
                Log.e(b2, sb.toString());
            }
        }
    }
    
    public void shutdown() {
        final Object c = this.c;
        monitorenter(c);
        try {
            final aseo f = this.f;
            this.f = new aseo();
            if (!((HashMap)f.b).isEmpty()) {
                final Iterator iterator = ((HashMap)f.b).entrySet().iterator();
                while (iterator.hasNext()) {
                    ((Map.Entry<K, aqzr>)iterator.next()).getValue().c(this.a);
                }
            }
            if (!((HashMap)f.a).isEmpty()) {
                final Iterator iterator2 = ((HashMap)f.a).entrySet().iterator();
                while (iterator2.hasNext()) {
                    ((Map.Entry<K, aqzr>)iterator2.next()).getValue().c(this.a);
                }
            }
            monitorexit(c);
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
}
