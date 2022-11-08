// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net.impl;

import java.net.Proxy;
import java.net.URLConnection;
import java.net.URL;
import org.chromium.net.UrlRequest$Builder;
import org.chromium.net.ExperimentalBidirectionalStream$Builder;
import java.util.ArrayList;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.ExperimentalCronetEngine;
import java.net.URLStreamHandlerFactory;
import org.chromium.net.UrlRequest$Callback;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.RequestFinishedInfo$Listener;
import org.chromium.net.ExperimentalBidirectionalStream;
import java.util.Collection;
import java.util.List;
import org.chromium.net.BidirectionalStream$Callback;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import java.util.Iterator;
import android.content.Context;
import android.util.Log;
import java.util.Date;
import J.N;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.ConditionVariable;
import java.util.HashSet;

public class CronetUrlRequestContext extends auch
{
    public static final String b = "CronetUrlRequestContext";
    private static final HashSet h;
    public final Object c;
    public long d;
    public Thread e;
    public final int f;
    public final aucq g;
    private final ConditionVariable i;
    private final AtomicInteger j;
    private final boolean k;
    private final Object l;
    private final Object m;
    private int n;
    private int o;
    private int p;
    private int q;
    private final auan r;
    private final auan s;
    private final Map t;
    private final ConditionVariable u;
    private final String v;
    private boolean w;
    private boolean x;
    private long y;
    private final boolean z;
    
    static {
        h = new HashSet();
    }
    
    public CronetUrlRequestContext(final aucl aucl) {
        Object c = new Object();
        this.c = c;
        this.i = new ConditionVariable(false);
        this.j = new AtomicInteger(0);
        this.l = new Object();
        this.m = new Object();
        this.n = 0;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = new auan();
        this.s = new auan();
        this.t = new HashMap();
        this.u = new ConditionVariable();
        this.y = -1L;
        this.f = this.hashCode();
        this.k = aucl.m;
        CronetLibraryLoader.a(aucl.a, aucl);
        N.MnO2u2DQ(3);
        Label_0227: {
            if (aucl.a() == 1) {
                final String f = aucl.f;
                this.v = f;
                final HashSet h = CronetUrlRequestContext.h;
                synchronized (h) {
                    if (h.add(f)) {
                        break Label_0227;
                    }
                    throw new IllegalStateException("Disk cache storage path already in use");
                }
            }
            this.v = null;
        }
        monitorenter(c);
        try {
            final String e = aucl.e;
            final String f2 = aucl.f;
            final boolean g = aucl.g;
            String string;
            if (g) {
                final Context a = aucl.a;
                final StringBuilder sb = new StringBuilder();
                sb.append(a.getPackageName());
                audx.b(sb);
                string = sb.toString();
            }
            else {
                string = "";
            }
            final boolean h2 = aucl.h;
            final boolean i = aucl.i;
            final boolean f3 = aucl.j.f;
            final int a2 = aucl.a();
            final long k = aucl.k;
            final String l = aucl.l;
            final boolean m = aucl.m;
            final boolean d = aucl.d;
            try {
                final long mb3ntV7V = N.MB3ntV7V(e, f2, g, string, h2, i, f3 ^ true, a2, k, l, 0L, m, d, aucl.b(10));
                if (mb3ntV7V == 0L) {
                    throw new IllegalArgumentException("Experimental options parsing failed.");
                }
                for (final auck auck : aucl.b) {
                    N.MyRIv1Ij(mb3ntV7V, (String)auck.c, auck.a, auck.b);
                }
                for (final aucj aucj : aucl.c) {
                    N.Muq3ic6p(mb3ntV7V, (String)aucj.b, (byte[][])aucj.c, aucj.a, ((Date)aucj.d).getTime());
                }
                final long m135Cu0D = N.M135Cu0D(mb3ntV7V);
                this.d = m135Cu0D;
                if (m135Cu0D != 0L) {
                    final boolean mey_yE9a = N.Mey_yE9a(m135Cu0D, (Object)this);
                    this.z = mey_yE9a;
                    monitorexit(c);
                    if (mey_yE9a) {
                        this.g = aucr.a;
                    }
                    else {
                        final Context a3 = aucl.a;
                        g();
                        this.g = aucr.a(a3);
                    }
                    try {
                        final aucq g2 = this.g;
                        final int f4 = this.f;
                        c = new aucn(aucl);
                        g2.b(f4, (aucn)c, new aucp(this.getVersionString().split("/")[1].split("@")[0]), g());
                    }
                    catch (final RuntimeException ex) {
                        Log.e("cr_".concat(String.valueOf(CronetUrlRequestContext.b)), "Error while trying to log CronetEngine creation: ", (Throwable)ex);
                    }
                    CronetLibraryLoader.c(new auct(this, 8));
                    return;
                }
                throw new NullPointerException("Context Adapter creation failed.");
            }
            finally {}
        }
        finally {}
        monitorexit(c);
        throw;
    }
    
    static int g() {
        if (CronetEngine.class.getClassLoader().equals(CronetUrlRequest.class.getClassLoader())) {
            return 2;
        }
        return 3;
    }
    
    private final void h() {
        if (this.j()) {
            return;
        }
        throw new IllegalStateException("Engine is shut down.");
    }
    
    private static void i(final Executor executor, final Runnable runnable) {
        try {
            executor.execute(runnable);
        }
        catch (final RejectedExecutionException ex) {
            Log.e("cr_".concat(String.valueOf(CronetUrlRequestContext.b)), "Exception posting task to executor", (Throwable)ex);
        }
    }
    
    private void initNetworkThread() {
        this.e = Thread.currentThread();
        this.i.open();
        Thread.currentThread().setName("ChromiumNet");
    }
    
    private final boolean j() {
        return this.d != 0L;
    }
    
    private void onEffectiveConnectionTypeChanged(final int n) {
        synchronized (this.l) {
            this.n = n;
        }
    }
    
    private void onRTTOrThroughputEstimatesComputed(final int o, final int p3, final int q) {
        synchronized (this.l) {
            this.o = o;
            this.p = p3;
            this.q = q;
        }
    }
    
    private void onRttObservation(final int n, final long n2, final int n3) {
        final Object l = this.l;
        monitorenter(l);
        try {
            for (final auea auea : this.r) {
                i(auea.getExecutor(), new aucw(auea, n, n2, n3, 1));
            }
            monitorexit(l);
        }
        finally {
            monitorexit(l);
            while (true) {}
        }
    }
    
    private void onThroughputObservation(final int n, final long n2, final int n3) {
        final Object l = this.l;
        monitorenter(l);
        try {
            for (final aueb aueb : this.s) {
                i(aueb.getExecutor(), new aucw(aueb, n, n2, n3, 0));
            }
            monitorexit(l);
        }
        finally {
            monitorexit(l);
            while (true) {}
        }
    }
    
    @Override
    protected final ExperimentalBidirectionalStream a(final String s, final BidirectionalStream$Callback bidirectionalStream$Callback, final Executor executor, final String s2, final List list, final int n, final boolean b, final Collection collection, final boolean b2, final int n2, final boolean b3, final int n3, long y) {
        if (y == -1L) {
            y = this.y;
        }
        Object c = this.c;
        monitorenter(c);
        Object o2;
        try {
            this.h();
            final Object o = c = c;
            try {
                final CronetBidirectionalStream cronetBidirectionalStream = new CronetBidirectionalStream(this, s, n, bidirectionalStream$Callback, executor, s2, list, b, collection, b2, n2, b3, n3, y);
                c = o;
                monitorexit(o);
                return (ExperimentalBidirectionalStream)cronetBidirectionalStream;
            }
            finally {}
        }
        finally {
            o2 = c;
        }
        monitorexit(o2);
    }
    
    public final void addRequestFinishedListener(final RequestFinishedInfo$Listener requestFinishedInfo$Listener) {
        synchronized (this.m) {
            this.t.put(requestFinishedInfo$Listener, new auec(requestFinishedInfo$Listener));
        }
    }
    
    public final void addRttListener(final NetworkQualityRttListener networkQualityRttListener) {
        if (this.k) {
            synchronized (this.l) {
                if (this.r.b()) {
                    synchronized (this.c) {
                        this.h();
                        N.MpnFLFF2(this.d, (Object)this, true);
                    }
                }
                this.r.d((Object)new auea(networkQualityRttListener));
                return;
            }
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }
    
    public final void addThroughputListener(final NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (this.k) {
            synchronized (this.l) {
                if (this.s.b()) {
                    synchronized (this.c) {
                        this.h();
                        N.MnPUhNKP(this.d, (Object)this, true);
                    }
                }
                this.s.d((Object)new aueb(networkQualityThroughputListener));
                return;
            }
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }
    
    public final audt b(final String s, final UrlRequest$Callback urlRequest$Callback, final Executor executor, final int n, final Collection collection, final boolean b, final boolean b2, final boolean b3, final boolean b4, final int n2, final boolean b5, final int n3, final RequestFinishedInfo$Listener requestFinishedInfo$Listener, final int n4, long y) {
        if (y == -1L) {
            y = this.y;
        }
        Object c = this.c;
        monitorenter(c);
        Object o2;
        try {
            this.h();
            final Object o = c = c;
            try {
                final CronetUrlRequest cronetUrlRequest = new CronetUrlRequest(this, s, n, urlRequest$Callback, executor, collection, b, b2, b3, b4, n2, b5, n3, requestFinishedInfo$Listener, n4, y);
                c = o;
                monitorexit(o);
                return cronetUrlRequest;
            }
            finally {}
        }
        finally {
            o2 = c;
        }
        monitorexit(o2);
    }
    
    public final void bindToNetwork(final long y) {
        this.y = y;
    }
    
    public final long c() {
        synchronized (this.c) {
            this.h();
            return this.d;
        }
    }
    
    public final void configureNetworkQualityEstimatorForTesting(final boolean b, final boolean b2, final boolean b3) {
        if (this.k) {
            synchronized (this.c) {
                this.h();
                N.M6sIJDgy_ForTesting(this.d, (Object)this, b, b2, b3);
                return;
            }
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }
    
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new aueq(this);
    }
    
    final void d() {
        this.j.decrementAndGet();
    }
    
    final void e() {
        this.j.incrementAndGet();
    }
    
    final void f(final RequestFinishedInfo requestFinishedInfo) {
        Object m = this.m;
        monitorenter(m);
        try {
            if (this.t.isEmpty()) {
                monitorexit(m);
                return;
            }
            final ArrayList list = new ArrayList(this.t.values());
            monitorexit(m);
            for (int size = list.size(), i = 0; i < size; ++i) {
                final auec auec = (auec)list.get(i);
                m = new atyo(auec, requestFinishedInfo, 6);
                i(auec.getExecutor(), (Runnable)m);
            }
        }
        finally {
            monitorexit(m);
            while (true) {}
        }
    }
    
    public final int getDownstreamThroughputKbps() {
        if (this.k) {
            synchronized (this.l) {
                int q;
                if ((q = this.q) == -1) {
                    q = -1;
                }
                return q;
            }
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }
    
    public final int getEffectiveConnectionType() {
        if (this.k) {
            synchronized (this.l) {
                final int n = this.n;
                int n2;
                if (n != 0) {
                    n2 = 1;
                    if (n != 1) {
                        n2 = 2;
                        if (n != 2) {
                            n2 = 3;
                            if (n != 3) {
                                n2 = 4;
                                if (n != 4) {
                                    n2 = 5;
                                    if (n != 5) {
                                        final StringBuilder sb = new StringBuilder("Internal Error: Illegal EffectiveConnectionType value ");
                                        sb.append(n);
                                        throw new RuntimeException(sb.toString());
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    n2 = 0;
                }
                return n2;
            }
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }
    
    public final byte[] getGlobalMetricsDeltas() {
        return N.M7CZ_Klr();
    }
    
    public final int getHttpRttMs() {
        if (this.k) {
            synchronized (this.l) {
                int o;
                if ((o = this.o) == -1) {
                    o = -1;
                }
                return o;
            }
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }
    
    public final int getTransportRttMs() {
        if (this.k) {
            synchronized (this.l) {
                int p;
                if ((p = this.p) == -1) {
                    p = -1;
                }
                return p;
            }
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }
    
    public final String getVersionString() {
        return "Cronet/".concat(aubt.a());
    }
    
    public final ExperimentalBidirectionalStream$Builder newBidirectionalStreamBuilder(final String s, final BidirectionalStream$Callback bidirectionalStream$Callback, final Executor executor) {
        return new aucb(s, bidirectionalStream$Callback, executor, this);
    }
    
    public final URLConnection openConnection(final URL url) {
        return this.openConnection(url, Proxy.NO_PROXY);
    }
    
    public final URLConnection openConnection(final URL url, final Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        final String protocol = url.getProtocol();
        if (!"http".equals(protocol) && !"https".equals(protocol)) {
            throw new UnsupportedOperationException("Unexpected protocol:".concat(String.valueOf(protocol)));
        }
        return new auem(url, (CronetEngine)this);
    }
    
    public final void removeRequestFinishedListener(final RequestFinishedInfo$Listener requestFinishedInfo$Listener) {
        synchronized (this.m) {
            this.t.remove(requestFinishedInfo$Listener);
        }
    }
    
    public final void removeRttListener(final NetworkQualityRttListener networkQualityRttListener) {
        if (this.k) {
            synchronized (this.l) {
                if (this.r.c((Object)new auea(networkQualityRttListener)) && this.r.b()) {
                    synchronized (this.c) {
                        this.h();
                        N.MpnFLFF2(this.d, (Object)this, false);
                    }
                }
                return;
            }
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }
    
    public final void removeThroughputListener(final NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (this.k) {
            synchronized (this.l) {
                if (this.s.c((Object)new aueb(networkQualityThroughputListener)) && this.s.b()) {
                    synchronized (this.c) {
                        this.h();
                        N.MnPUhNKP(this.d, (Object)this, false);
                    }
                }
                return;
            }
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }
    
    public final void shutdown() {
        if (this.v != null) {
            final HashSet h = CronetUrlRequestContext.h;
            synchronized (h) {
                h.remove(this.v);
            }
        }
        synchronized (this.c) {
            this.h();
            if (this.j.get() == 0) {
                if (Thread.currentThread() != this.e) {
                    monitorexit(this.c);
                    this.i.block();
                    synchronized (this.c) {
                        this.h();
                        Label_0158: {
                            if (this.w) {
                                if (!this.x) {
                                    N.MKFm_qQ7(this.d, (Object)this);
                                    this.x = true;
                                    monitorexit(this.c);
                                    this.u.block();
                                    this.u.close();
                                    synchronized (this.c) {
                                        this.x = false;
                                        this.w = false;
                                        break Label_0158;
                                    }
                                }
                            }
                            monitorexit(this.c);
                        }
                        synchronized (this.c) {
                            if (this.j()) {
                                N.MeBvNXm5(this.d, (Object)this);
                                this.d = 0L;
                            }
                            return;
                        }
                    }
                }
                throw new IllegalThreadStateException("Cannot shutdown from network thread.");
            }
            throw new IllegalStateException("Cannot shutdown with active requests.");
        }
    }
    
    public final void startNetLogToDisk(final String s, final boolean b, final int n) {
        synchronized (this.c) {
            this.h();
            if (!this.w) {
                N.MTULt02u(this.d, (Object)this, s, b, n);
                this.w = true;
            }
        }
    }
    
    public final void startNetLogToFile(final String s, final boolean b) {
        synchronized (this.c) {
            this.h();
            if (this.w) {
                return;
            }
            if (N.MgwJQAH1(this.d, (Object)this, s, b)) {
                this.w = true;
                return;
            }
            throw new RuntimeException("Unable to start NetLog");
        }
    }
    
    public final void stopNetLog() {
        synchronized (this.c) {
            this.h();
            if (this.w) {
                if (!this.x) {
                    N.MKFm_qQ7(this.d, (Object)this);
                    this.x = true;
                    monitorexit(this.c);
                    this.u.block();
                    this.u.close();
                    final Object c = this.c;
                    synchronized (this.c) {
                        this.x = false;
                        this.w = false;
                    }
                }
            }
        }
    }
    
    public void stopNetLogCompleted() {
        this.u.open();
    }
}
