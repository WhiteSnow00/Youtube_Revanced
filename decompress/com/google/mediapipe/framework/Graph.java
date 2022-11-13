// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class Graph
{
    private static final afkk a;
    private long b;
    private final List c;
    private Map d;
    private Map e;
    private boolean f;
    private boolean g;
    private Map h;
    private final Object i;
    
    static {
        a = afkk.m("com/google/mediapipe/framework/Graph");
    }
    
    public Graph() {
        this.c = new ArrayList();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = false;
        this.g = false;
        this.h = new HashMap();
        this.i = new Object();
        this.b = this.nativeCreateGraph();
    }
    
    private static void l(final Map map, final String[] array, final long[] array2) {
        if (map.size() == array.length && map.size() == array2.length) {
            final Iterator iterator = map.entrySet().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final Map.Entry<String, V> entry = (Map.Entry<String, V>)iterator.next();
                array[n] = entry.getKey();
                array2[n] = ((Packet)entry.getValue()).getNativeHandle();
                ++n;
            }
            return;
        }
        throw new RuntimeException("Input array length doesn't match the map size!");
    }
    
    private native void nativeAddMultiStreamCallback(final long p0, final List p1, final PacketListCallback p2, final boolean p3);
    
    private native void nativeAddPacketCallback(final long p0, final String p1, final PacketCallback p2);
    
    private native void nativeAddPacketToInputStream(final long p0, final String p1, final long p2, final long p3);
    
    private native long nativeAddSurfaceOutput(final long p0, final String p1);
    
    private native void nativeCancelGraph(final long p0);
    
    private native void nativeCloseAllInputStreams(final long p0);
    
    private native void nativeCloseAllPacketSources(final long p0);
    
    private native void nativeCloseInputStream(final long p0, final String p1);
    
    private native long nativeCreateGraph();
    
    private native byte[] nativeGetCalculatorGraphConfig(final long p0);
    
    private native long nativeGetProfiler(final long p0);
    
    private native void nativeLoadBinaryGraph(final long p0, final String p1);
    
    private native void nativeLoadBinaryGraphBytes(final long p0, final byte[] p1);
    
    private native void nativeLoadBinaryGraphTemplate(final long p0, final byte[] p1);
    
    private native void nativeMovePacketToInputStream(final long p0, final String p1, final long p2, final long p3);
    
    private native void nativeReleaseGraph(final long p0);
    
    private native void nativeRunGraphUntilClose(final long p0, final String[] p1, final long[] p2);
    
    private native void nativeSetGraphInputStreamBlockingMode(final long p0, final boolean p1);
    
    private native void nativeSetGraphOptions(final long p0, final byte[] p1);
    
    private native void nativeSetGraphType(final long p0, final String p1);
    
    private native void nativeSetParentGlContext(final long p0, final long p1);
    
    private native void nativeStartRunningGraph(final long p0, final String[] p1, final long[] p2, final String[] p3, final long[] p4);
    
    private native void nativeUpdatePacketReference(final long p0, final long p1);
    
    private native void nativeWaitUntilGraphDone(final long p0);
    
    private native void nativeWaitUntilGraphIdle(final long p0);
    
    public final long a() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final void b(final String s, final PacketCallback packetCallback) {
        synchronized (this) {
            final long b = this.b;
            final boolean b2 = true;
            adkp.R(b != 0L, (Object)"Invalid context, tearDown() might have been called already.");
            s.getClass();
            packetCallback.getClass();
            adkp.Q(!this.g && !this.f && b2);
            this.c.add(packetCallback);
            this.nativeAddPacketCallback(this.b, s, packetCallback);
        }
    }
    
    public final void c(final String s, Packet b, final long n) {
        monitorenter(this);
        try {
            adkp.R(this.b != 0L, (Object)"Invalid context, tearDown() might have been called.");
            if (this.g) {
                this.nativeAddPacketToInputStream(this.b, s, b.getNativeHandle(), n);
                monitorexit(this);
                return;
            }
            b = b.b();
            if (!this.h.containsKey(s)) {
                this.h.put(s, new ArrayList());
            }
            final List list = this.h.get(s);
            if (list.size() > 20) {
                for (final Map.Entry<Object, V> entry : this.e.entrySet()) {
                    if (entry.getValue() == null) {
                        ((afki)((afki)((afkg)Graph.a).g()).j("com/google/mediapipe/framework/Graph", "addPacketToBuffer", 571, "Graph.java")).t("Stream: %s might be missing.", entry.getKey());
                    }
                }
                throw new RuntimeException("Graph is not started because of missing streams");
            }
            list.add(new ahdc(b, Long.valueOf(n)));
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void d() {
        synchronized (this) {
            adkp.R(this.b != 0L, (Object)"Invalid context, tearDown() might have been called.");
            this.nativeCloseAllInputStreams(this.b);
        }
    }
    
    public final void e(final byte[] array) {
        synchronized (this) {
            adkp.R(this.b != 0L, (Object)"Invalid context, tearDown() might have been called already.");
            this.nativeLoadBinaryGraphBytes(this.b, array);
        }
    }
    
    public final void f(final Map map) {
        monitorenter(this);
        try {
            final long b = this.b;
            final boolean b2 = true;
            adkp.R(b != 0L, (Object)"Invalid context, tearDown() might have been called.");
            adkp.Q(!this.g && !this.f && b2);
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                this.d.put(entry.getKey(), ((Packet)entry.getValue()).b());
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void g(final long n) {
        synchronized (this) {
            adkp.R(this.b != 0L, (Object)"Invalid context, tearDown() might have been called already.");
            adkp.Q(this.g ^ true);
            this.nativeSetParentGlContext(this.b, n);
        }
    }
    
    public final void h() {
        monitorenter(this);
        try {
            adkp.R(this.b != 0L, (Object)"Invalid context, tearDown() might have been called.");
            this.f = true;
            final Iterator iterator = this.e.entrySet().iterator();
            while (iterator.hasNext()) {
                if (((Map.Entry)iterator.next()).getValue() == null) {
                    ((afki)((afki)((afkg)Graph.a).f()).j("com/google/mediapipe/framework/Graph", "startRunningGraph", 326, "Graph.java")).r("MediaPipe graph won't start until all stream headers are available.");
                    monitorexit(this);
                    return;
                }
            }
            final String[] array = new String[this.d.size()];
            final long[] array2 = new long[this.d.size()];
            l(this.d, array, array2);
            final String[] array3 = new String[this.e.size()];
            final long[] array4 = new long[this.e.size()];
            l(this.e, array3, array4);
            this.nativeStartRunningGraph(this.b, array, array2, array3, array4);
            this.g = true;
            if (!this.h.isEmpty()) {
            Label_0405:
                for (final Map.Entry<K, ArrayList> entry : this.h.entrySet()) {
                    final ArrayList list = entry.getValue();
                    final int size = list.size();
                    int i = 0;
                    while (i < size) {
                        final ahdc ahdc = (ahdc)list.get(i);
                        try {
                            this.nativeMovePacketToInputStream(this.b, (String)entry.getKey(), ((Packet)ahdc.a).getNativeHandle(), (long)ahdc.b);
                            ((Packet)ahdc.a).release();
                            ++i;
                            continue;
                        }
                        catch (final MediaPipeException ex) {
                            ((afki)((afki)((afkg)Graph.a).g()).j("com/google/mediapipe/framework/Graph", "moveBufferedPacketsToInputStream", 590, "Graph.java")).x("AddPacket for stream: %s failed: %s.", (Object)entry.getKey(), (Object)ex.getMessage());
                            throw ex;
                        }
                        break Label_0405;
                    }
                }
                this.h.clear();
                monitorexit(this);
                return;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void i() {
        monitorenter(this);
        try {
            adkp.R(this.b != 0L, (Object)"Invalid context, tearDown() might have been called already.");
            final Iterator iterator = this.d.entrySet().iterator();
            while (iterator.hasNext()) {
                ((Map.Entry<K, Packet>)iterator.next()).getValue().release();
            }
            this.d.clear();
            for (final Map.Entry<K, Packet> entry : this.e.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().release();
                }
            }
            this.e.clear();
            final Iterator iterator3 = this.h.entrySet().iterator();
            while (iterator3.hasNext()) {
                final ArrayList list = ((Map.Entry<K, ArrayList>)iterator3.next()).getValue();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((Packet)((ahdc)list.get(i)).a).release();
                }
            }
            this.h.clear();
            synchronized (this.i) {
                final long b = this.b;
                if (b != 0L) {
                    this.nativeReleaseGraph(b);
                    this.b = 0L;
                }
                monitorexit(this.i);
                this.c.clear();
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void j() {
        synchronized (this) {
            adkp.R(this.b != 0L, (Object)"Invalid context, tearDown() might have been called.");
            this.nativeWaitUntilGraphDone(this.b);
        }
    }
    
    @Deprecated
    public final void k(final long n) {
        synchronized (this) {
            adkp.R(this.b != 0L, (Object)"Invalid context, tearDown() might have been called already.");
            adkp.H(true);
            this.g(n);
        }
    }
}
