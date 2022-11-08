// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net.impl;

import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest$StatusListener;
import java.util.Iterator;
import java.io.Serializable;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.RequestFinishedInfo$Metrics;
import j$.time.Duration;
import java.util.Map;
import java.util.Collections;
import J.N;
import org.chromium.net.InlineExecutionProhibitedException;
import java.nio.ByteBuffer;
import java.util.concurrent.RejectedExecutionException;
import android.util.Log;
import java.util.AbstractMap;
import java.util.ArrayList;
import org.chromium.net.RequestFinishedInfo$Listener;
import org.chromium.net.UrlRequest$Callback;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.CronetException;

public final class CronetUrlRequest extends audt
{
    private final long A;
    private final int B;
    private final aucq C;
    private int D;
    private aucs E;
    private boolean F;
    private boolean G;
    private aucv H;
    public long a;
    public boolean b;
    public final Object c;
    public final auee d;
    public final auec e;
    public CronetUploadDataStream f;
    public audw g;
    public CronetException h;
    private final boolean i;
    private boolean j;
    private boolean k;
    private final CronetUrlRequestContext l;
    private final Executor m;
    private final List n;
    private final String o;
    private final int p;
    private final int q;
    private String r;
    private final aucu s;
    private final Collection t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final int x;
    private final boolean y;
    private final int z;
    
    public CronetUrlRequest(final CronetUrlRequestContext l, final String o, int q, final UrlRequest$Callback urlRequest$Callback, final Executor m, final Collection t, final boolean u, final boolean v, final boolean i, final boolean w, final int x, final boolean y, final int z, final RequestFinishedInfo$Listener requestFinishedInfo$Listener, final int n, final long a) {
        this.c = new Object();
        final ArrayList n2 = new ArrayList();
        this.n = n2;
        this.s = new aucu();
        this.i = i;
        this.l = l;
        this.B = l.f;
        this.C = l.g;
        n2.add(this.o = o);
        final int n3 = 2;
        int p16;
        if (q != 0) {
            if (q != 1) {
                p16 = 3;
                if (q != 2) {
                    if (q != 3 && q == 4) {
                        p16 = 5;
                    }
                    else {
                        p16 = 4;
                    }
                }
            }
            else {
                p16 = 2;
            }
        }
        else {
            p16 = 1;
        }
        this.p = p16;
        this.d = new auee(urlRequest$Callback);
        this.m = m;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        auec e;
        if (requestFinishedInfo$Listener != null) {
            e = new auec(requestFinishedInfo$Listener);
        }
        else {
            e = null;
        }
        this.e = e;
        Label_0258: {
            if (n != 0) {
                if (n == 1) {
                    q = 1;
                    break Label_0258;
                }
                q = n3;
                if (n == 2) {
                    break Label_0258;
                }
            }
            q = 0;
        }
        this.q = q;
        this.A = a;
    }
    
    private final audw l(final int n, final String s, final String[] array, final boolean b, final String s2, final String s3, final long n2) {
        final aucu aucu = new aucu();
        for (int i = 0; i < array.length; i += 2) {
            aucu.add(new AbstractMap.SimpleImmutableEntry<String, String>(array[i], array[i + 1]));
        }
        return new audw(new ArrayList(this.n), n, s, aucu, b, s2, s3, n2);
    }
    
    private final void m() {
        synchronized (this.c) {
            if (!this.j && !this.j()) {
                return;
            }
            throw new IllegalStateException("Request is already started.");
        }
    }
    
    private final void n(final CronetException h) {
        synchronized (this.c) {
            if (this.j()) {
                return;
            }
            this.h = h;
            this.c(1);
        }
    }
    
    private final void o(final Runnable runnable) {
        try {
            this.m.execute(runnable);
        }
        catch (final RejectedExecutionException ex) {
            Log.e("cr_".concat(String.valueOf(CronetUrlRequestContext.b)), "Exception posting task to executor", (Throwable)ex);
            this.n(new aucm("Exception posting task to executor", ex));
        }
    }
    
    private void onCanceled() {
        this.o(new auct(this, 6));
    }
    
    private void onError(int n, final int n2, final int n3, final String s, final long n4) {
        final audw g = this.g;
        if (g != null) {
            g.a(n4);
        }
        int n5;
        if ((n5 = n) != 10) {
            if (n != 3) {
                switch (n) {
                    default: {
                        final String b = CronetUrlRequestContext.b;
                        final StringBuilder sb = new StringBuilder("Unknown error code: ");
                        sb.append(n);
                        Log.e("cr_".concat(String.valueOf(b)), sb.toString());
                        break;
                    }
                    case 11: {
                        n = 11;
                        break;
                    }
                    case 10: {
                        n = 10;
                        break;
                    }
                    case 9: {
                        n = 9;
                        break;
                    }
                    case 8: {
                        n = 8;
                        break;
                    }
                    case 7: {
                        n = 7;
                        break;
                    }
                    case 6: {
                        n = 6;
                        break;
                    }
                    case 5: {
                        n = 5;
                        break;
                    }
                    case 4: {
                        n = 4;
                        break;
                    }
                    case 3: {
                        n = 3;
                        break;
                    }
                    case 2: {
                        n = 2;
                        break;
                    }
                    case 1: {
                        n = 1;
                        break;
                    }
                }
                this.n((CronetException)new audp("Exception in CronetUrlRequest: ".concat(String.valueOf(s)), n, n2));
                return;
            }
            n5 = 3;
        }
        this.n((CronetException)new audr("Exception in CronetUrlRequest: ".concat(String.valueOf(s)), n5, n2, n3));
    }
    
    private void onMetricsCollected(final long n, final long n2, final long n3, final long n4, final long n5, final long n6, final long n7, final long n8, final long n9, final long n10, final long n11, final long n12, final long n13, final boolean b, final long n14, final long n15, final boolean f, final boolean g) {
        synchronized (this.c) {
            if (this.E == null) {
                this.E = new aucs(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, b, n14, n15);
                this.F = f;
                this.G = g;
                return;
            }
            throw new IllegalStateException("Metrics collection should only happen once.");
        }
    }
    
    private void onNativeAdapterDestroyed() {
        Object c = this.c;
        synchronized (c) {
            if (this.h == null) {
                return;
            }
            monitorexit(c);
            c = new auct(this, 7);
            try {
                this.m.execute((Runnable)c);
            }
            catch (final RejectedExecutionException c) {
                Log.e("cr_".concat(String.valueOf(CronetUrlRequestContext.b)), "Exception posting task to executor", (Throwable)c);
            }
        }
    }
    
    private void onReadCompleted(final ByteBuffer a, final int n, final int n2, final int n3, final long n4) {
        this.g.a(n4);
        if (a.position() == n2 && a.limit() == n3) {
            if (this.H == null) {
                this.H = new aucv(this);
            }
            final ByteBuffer byteBuffer = (ByteBuffer)a.position(n2 + n);
            final aucv h = this.H;
            h.a = a;
            this.o(h);
            return;
        }
        this.n(new aucm("ByteBuffer modified externally during read", null));
    }
    
    private void onRedirectReceived(final String s, final int n, final String s2, final String[] array, final boolean b, final String s3, final String s4, final long n2) {
        final audw l = this.l(n, s2, array, b, s3, s4, n2);
        this.n.add(s);
        this.o(new arzk(this, l, s, 4));
    }
    
    private void onResponseStarted(final int n, final String s, final String[] array, final boolean b, final String s2, final String s3, final long n2) {
        this.g = this.l(n, s, array, b, s2, s3, n2);
        this.o(new auct(this, 4));
    }
    
    private void onStatus(final VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, final int n) {
        this.o(new audg(versionSafeCallbacks$UrlRequestStatusListener, n, 1));
    }
    
    private void onSucceeded(final long n) {
        this.g.a(n);
        this.o(new auct(this, 5));
    }
    
    public final void a(final String s, final String s2) {
        this.m();
        if (s == null) {
            throw new NullPointerException("Invalid header name.");
        }
        if (s2 != null) {
            this.s.add(new AbstractMap.SimpleImmutableEntry<String, String>(s, s2));
            return;
        }
        throw new NullPointerException("Invalid header value.");
    }
    
    public final void b() {
        if (!this.i && Thread.currentThread() == this.l.e) {
            throw new InlineExecutionProhibitedException();
        }
    }
    
    public final void c(final int d) {
        this.D = d;
        if (this.a == 0L) {
            return;
        }
        this.l.d();
        N.M4znfYdB(this.a, (Object)this, d == 2);
        this.a = 0L;
    }
    
    public final void cancel() {
        synchronized (this.c) {
            if (!this.j() && this.j) {
                this.c(2);
            }
        }
    }
    
    public final void d() {
        Serializable s = "cr_";
        if (this.E != null) {
            Serializable s2 = s;
            Label_0735: {
                try {
                    final aucq c = this.C;
                    s2 = s;
                    final int b = this.B;
                    s2 = s;
                    final audw g = this.g;
                    int i = 0;
                    Map<Object, Object> map;
                    boolean b2;
                    if (g != null) {
                        s2 = s;
                        map = g.getAllHeaders();
                        s2 = s;
                        final audw g2 = this.g;
                        s2 = s;
                        final String c2 = g2.c;
                        s2 = s;
                        final int a = g2.a;
                        s2 = s;
                        b2 = g2.b;
                    }
                    else {
                        s2 = s;
                        map = Collections.emptyMap();
                        final String c2 = "";
                        b2 = false;
                        final int a = 0;
                    }
                    s2 = s;
                    final long longValue = this.E.a;
                    if (b2 && longValue == 0L) {
                        final long n;
                        final long max = n = 0L;
                    }
                    else {
                        s2 = s;
                        final aucu s3 = this.s;
                        s2 = s;
                        final int size = s3.size();
                        long n2 = 0L;
                        while (i < size) {
                            s2 = s;
                            final Map.Entry<String, V> entry = s3.get(i);
                            s2 = s;
                            final String s4 = entry.getKey();
                            long n3 = n2;
                            if (s4 != null) {
                                s2 = s;
                                n3 = n2 + s4.length();
                            }
                            n2 = n3;
                            s2 = s;
                            if (entry.getValue() != null) {
                                s2 = s;
                                n2 = n3 + ((String)entry.getValue()).length();
                            }
                            ++i;
                        }
                        s2 = s;
                        final long max = Math.max(0L, longValue - n2);
                        final long n = n2;
                    }
                    s2 = s;
                    final long longValue2 = this.E.b;
                Label_0357_Outer:
                    while (true) {
                        if (b2 && longValue2 == 0L) {
                            s2 = "cr_";
                            final long max2 = 0L;
                            final long n4 = 0L;
                            break Label_0523;
                        }
                        Label_0510: {
                            if (map == null) {
                                s2 = "cr_";
                                final long n4 = 0L;
                                break Label_0510;
                            }
                            s2 = s;
                            final Iterator<Map.Entry<Object, Object>> iterator = map.entrySet().iterator();
                            long n4 = 0L;
                            final String c2;
                            final int a;
                            final long n;
                            final long max;
                            long max2;
                            Map.Entry<String, List> entry2;
                            String s5;
                            long n5;
                            Iterator iterator2;
                            Duration duration;
                            Duration duration2;
                            auco auco;
                            Block_20_Outer:Label_0649_Outer:Block_23_Outer:
                            while (true) {
                                s2 = s;
                                Label_0508: {
                                    if (!iterator.hasNext()) {
                                        break Label_0508;
                                    }
                                    s2 = s;
                                    entry2 = iterator.next();
                                    s2 = s;
                                    s5 = entry2.getKey();
                                    if (s5 != null) {
                                        s2 = s;
                                        n4 += s5.length();
                                    }
                                    s2 = (s = s);
                                    try {
                                        if (entry2.getValue() == null) {
                                            n5 = n4;
                                        }
                                        else {
                                            s = s2;
                                            iterator2 = entry2.getValue().iterator();
                                            while (true) {
                                                n5 = n4;
                                                s = s2;
                                                if (!iterator2.hasNext()) {
                                                    break;
                                                }
                                                s = s2;
                                                n4 += ((String)iterator2.next()).length();
                                            }
                                        }
                                        s = s2;
                                        n4 = n5;
                                        continue Block_20_Outer;
                                        while (true) {
                                            Block_22: {
                                                while (true) {
                                                Label_0649:
                                                    while (true) {
                                                        while (true) {
                                                            s = s2;
                                                            iftrue(Label_0578:)(this.E.getResponseStart() == null);
                                                            break Label_0649;
                                                            Label_0641: {
                                                                s = s2;
                                                            }
                                                            duration = Duration.ofSeconds(0L);
                                                            break Label_0649;
                                                            s = s2;
                                                            iftrue(Label_0578:)(this.E.getRequestStart() == null);
                                                            continue Label_0649_Outer;
                                                        }
                                                        s = s2;
                                                        s = s2;
                                                        auco = new auco(n, max, n4, max2, a, duration2, duration, c2, this.F, this.G);
                                                        s = s2;
                                                        c.a(b, auco);
                                                        s = s2;
                                                        break Label_0735;
                                                        s = s2;
                                                        iftrue(Label_0641:)(this.E.getRequestStart() == null);
                                                        break Block_22;
                                                        s = s2;
                                                        duration = Duration.ofMillis(this.E.getRequestEnd().getTime() - this.E.getRequestStart().getTime());
                                                        continue Label_0649;
                                                    }
                                                    s = s2;
                                                    duration2 = Duration.ofMillis(this.E.getResponseStart().getTime() - this.E.getRequestStart().getTime());
                                                    continue Block_23_Outer;
                                                }
                                                s2 = s;
                                                break Label_0510;
                                            }
                                            s = s2;
                                            iftrue(Label_0641:)(this.E.getRequestEnd() == null);
                                            continue;
                                        }
                                        s = s2;
                                        max2 = Math.max(0L, longValue2 - n4);
                                        continue Label_0357_Outer;
                                        Label_0578: {
                                            s = s2;
                                        }
                                        duration2 = Duration.ofSeconds(0L);
                                    }
                                    catch (final RuntimeException s2) {}
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
                catch (final RuntimeException ex) {
                    s = s2;
                    s2 = ex;
                }
                Log.e(((String)s).concat(String.valueOf(CronetUrlRequestContext.b)), "Error while trying to log CronetTrafficInfo: ", (Throwable)s2);
            }
            final auds auds = new auds(this.o, this.t, this.E, this.D, this.g, this.h);
            this.l.f(auds);
            final auec e = this.e;
            if (e != null) {
                try {
                    e.getExecutor().execute((Runnable)new atyo(this, (RequestFinishedInfo)auds, 5));
                }
                catch (final RejectedExecutionException ex2) {
                    Log.e(((String)s).concat(String.valueOf(CronetUrlRequestContext.b)), "Exception posting task to executor", (Throwable)ex2);
                }
            }
        }
    }
    
    public final void e(final Exception ex) {
        final aucd aucd = new aucd("Exception received from UrlRequest.Callback", ex);
        Log.e("cr_".concat(String.valueOf(CronetUrlRequestContext.b)), "Exception in CalledByNative method", (Throwable)ex);
        this.n((CronetException)aucd);
    }
    
    final void f(final Throwable t) {
        final aucd aucd = new aucd("Exception received from UploadDataProvider", t);
        Log.e("cr_".concat(String.valueOf(CronetUrlRequestContext.b)), "Exception in upload method", t);
        this.n((CronetException)aucd);
    }
    
    public final void followRedirect() {
        synchronized (this.c) {
            if (!this.b) {
                throw new IllegalStateException("No redirect to follow.");
            }
            this.b = false;
            if (!this.j()) {
                N.Mhp54Oqs(this.a, (Object)this);
            }
        }
    }
    
    public final void g(final String r) {
        this.m();
        this.r = r;
    }
    
    public final void getStatus(final UrlRequest$StatusListener urlRequest$StatusListener) {
        final VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = new VersionSafeCallbacks$UrlRequestStatusListener(urlRequest$StatusListener);
        synchronized (this.c) {
            final long a = this.a;
            if (a != 0L) {
                N.MgIIMpT9(a, (Object)this, (Object)versionSafeCallbacks$UrlRequestStatusListener);
                return;
            }
            monitorexit(this.c);
            this.o(new auct(versionSafeCallbacks$UrlRequestStatusListener, 3));
        }
    }
    
    public final void h(final UploadDataProvider uploadDataProvider, final Executor executor) {
        if (this.r == null) {
            this.r = "POST";
        }
        this.f = new CronetUploadDataStream(uploadDataProvider, executor, this);
    }
    
    public final void i() {
        N.MabZ5m6r(this.a, (Object)this);
    }
    
    public final boolean isDone() {
        synchronized (this.c) {
            return this.j();
        }
    }
    
    public final boolean j() {
        return this.j && this.a == 0L;
    }
    
    public final void read(final ByteBuffer byteBuffer) {
        auet.c(byteBuffer);
        auet.b(byteBuffer);
        synchronized (this.c) {
            if (!this.k) {
                throw new IllegalStateException("Unexpected read attempt.");
            }
            this.k = false;
            if (this.j()) {
                return;
            }
            if (N.MfCxA8r3(this.a, (Object)this, (Object)byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                return;
            }
            this.k = true;
            throw new IllegalArgumentException("Unable to call native read");
        }
    }
    
    public final void start() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        org/chromium/net/impl/CronetUrlRequest.c:Ljava/lang/Object;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: invokespecial   org/chromium/net/impl/CronetUrlRequest.m:()V
        //    11: aload_0        
        //    12: getfield        org/chromium/net/impl/CronetUrlRequest.l:Lorg/chromium/net/impl/CronetUrlRequestContext;
        //    15: invokevirtual   org/chromium/net/impl/CronetUrlRequestContext.c:()J
        //    18: lstore_2       
        //    19: aload_0        
        //    20: getfield        org/chromium/net/impl/CronetUrlRequest.o:Ljava/lang/String;
        //    23: astore          4
        //    25: aload_0        
        //    26: getfield        org/chromium/net/impl/CronetUrlRequest.p:I
        //    29: istore          5
        //    31: aload_0        
        //    32: getfield        org/chromium/net/impl/CronetUrlRequest.u:Z
        //    35: istore          6
        //    37: aload_0        
        //    38: getfield        org/chromium/net/impl/CronetUrlRequest.v:Z
        //    41: istore          7
        //    43: aload_0        
        //    44: getfield        org/chromium/net/impl/CronetUrlRequest.w:Z
        //    47: istore          8
        //    49: aload_0        
        //    50: getfield        org/chromium/net/impl/CronetUrlRequest.x:I
        //    53: istore          9
        //    55: aload_0        
        //    56: getfield        org/chromium/net/impl/CronetUrlRequest.y:Z
        //    59: istore          10
        //    61: aload_0        
        //    62: getfield        org/chromium/net/impl/CronetUrlRequest.z:I
        //    65: istore          11
        //    67: aload_0        
        //    68: getfield        org/chromium/net/impl/CronetUrlRequest.q:I
        //    71: istore          12
        //    73: aload_1        
        //    74: astore          13
        //    76: aload           13
        //    78: astore          14
        //    80: aload_0        
        //    81: aload_0        
        //    82: lload_2        
        //    83: aload           4
        //    85: iload           5
        //    87: iload           6
        //    89: iload           7
        //    91: iload           8
        //    93: iload           9
        //    95: iload           10
        //    97: iload           11
        //    99: iload           12
        //   101: aload_0        
        //   102: getfield        org/chromium/net/impl/CronetUrlRequest.A:J
        //   105: invokestatic    J/N.MuOIsMvf:(Ljava/lang/Object;JLjava/lang/String;IZZZIZIIJ)J
        //   108: putfield        org/chromium/net/impl/CronetUrlRequest.a:J
        //   111: aload           13
        //   113: astore          14
        //   115: aload_0        
        //   116: getfield        org/chromium/net/impl/CronetUrlRequest.l:Lorg/chromium/net/impl/CronetUrlRequestContext;
        //   119: invokevirtual   org/chromium/net/impl/CronetUrlRequestContext.e:()V
        //   122: aload           13
        //   124: astore          14
        //   126: aload_0        
        //   127: getfield        org/chromium/net/impl/CronetUrlRequest.r:Ljava/lang/String;
        //   130: astore          4
        //   132: aload           4
        //   134: ifnull          230
        //   137: aload           13
        //   139: astore          14
        //   141: aload_0        
        //   142: getfield        org/chromium/net/impl/CronetUrlRequest.a:J
        //   145: aload_0        
        //   146: aload           4
        //   148: invokestatic    J/N.M51RPBJe:(JLjava/lang/Object;Ljava/lang/String;)Z
        //   151: ifeq            157
        //   154: goto            230
        //   157: aload           13
        //   159: astore          14
        //   161: new             Ljava/lang/IllegalArgumentException;
        //   164: astore          15
        //   166: aload           13
        //   168: astore          14
        //   170: aload_0        
        //   171: getfield        org/chromium/net/impl/CronetUrlRequest.r:Ljava/lang/String;
        //   174: astore          4
        //   176: aload           13
        //   178: astore          14
        //   180: new             Ljava/lang/StringBuilder;
        //   183: astore          16
        //   185: aload           13
        //   187: astore          14
        //   189: aload           16
        //   191: ldc_w           "Invalid http method "
        //   194: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   197: aload           13
        //   199: astore          14
        //   201: aload           16
        //   203: aload           4
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: pop            
        //   209: aload           13
        //   211: astore          14
        //   213: aload           15
        //   215: aload           16
        //   217: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   220: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   223: aload           13
        //   225: astore          14
        //   227: aload           15
        //   229: athrow         
        //   230: aload           13
        //   232: astore          14
        //   234: aload_0        
        //   235: getfield        org/chromium/net/impl/CronetUrlRequest.s:Laucu;
        //   238: invokevirtual   aucu.iterator:()Ljava/util/Iterator;
        //   241: astore          4
        //   243: iconst_0       
        //   244: istore          5
        //   246: aload           13
        //   248: astore          14
        //   250: aload           4
        //   252: invokeinterface java/util/Iterator.hasNext:()Z
        //   257: ifeq            502
        //   260: aload           13
        //   262: astore          14
        //   264: aload           4
        //   266: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   271: checkcast       Ljava/util/Map$Entry;
        //   274: astore          16
        //   276: iload           5
        //   278: istore          9
        //   280: aload           13
        //   282: astore          14
        //   284: aload           16
        //   286: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   291: checkcast       Ljava/lang/String;
        //   294: ldc_w           "Content-Type"
        //   297: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   300: ifeq            330
        //   303: iload           5
        //   305: istore          9
        //   307: aload           13
        //   309: astore          14
        //   311: aload           16
        //   313: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   318: checkcast       Ljava/lang/String;
        //   321: invokevirtual   java/lang/String.isEmpty:()Z
        //   324: ifne            330
        //   327: iconst_1       
        //   328: istore          9
        //   330: aload           13
        //   332: astore          14
        //   334: aload_0        
        //   335: getfield        org/chromium/net/impl/CronetUrlRequest.a:J
        //   338: aload_0        
        //   339: aload           16
        //   341: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   346: checkcast       Ljava/lang/String;
        //   349: aload           16
        //   351: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   356: checkcast       Ljava/lang/String;
        //   359: invokestatic    J/N.MvHusd1J:(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z
        //   362: ifeq            372
        //   365: iload           9
        //   367: istore          5
        //   369: goto            246
        //   372: aload           13
        //   374: astore          14
        //   376: new             Ljava/lang/IllegalArgumentException;
        //   379: astore          4
        //   381: aload           13
        //   383: astore          14
        //   385: aload           16
        //   387: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   392: checkcast       Ljava/lang/String;
        //   395: astore          15
        //   397: aload           13
        //   399: astore          14
        //   401: aload           16
        //   403: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   408: checkcast       Ljava/lang/String;
        //   411: astore          17
        //   413: aload           13
        //   415: astore          14
        //   417: new             Ljava/lang/StringBuilder;
        //   420: astore          16
        //   422: aload           13
        //   424: astore          14
        //   426: aload           16
        //   428: invokespecial   java/lang/StringBuilder.<init>:()V
        //   431: aload           13
        //   433: astore          14
        //   435: aload           16
        //   437: ldc_w           "Invalid header "
        //   440: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   443: pop            
        //   444: aload           13
        //   446: astore          14
        //   448: aload           16
        //   450: aload           15
        //   452: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   455: pop            
        //   456: aload           13
        //   458: astore          14
        //   460: aload           16
        //   462: ldc_w           "="
        //   465: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   468: pop            
        //   469: aload           13
        //   471: astore          14
        //   473: aload           16
        //   475: aload           17
        //   477: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   480: pop            
        //   481: aload           13
        //   483: astore          14
        //   485: aload           4
        //   487: aload           16
        //   489: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   492: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   495: aload           13
        //   497: astore          14
        //   499: aload           4
        //   501: athrow         
        //   502: aload           13
        //   504: astore          14
        //   506: aload_0        
        //   507: getfield        org/chromium/net/impl/CronetUrlRequest.f:Lorg/chromium/net/impl/CronetUploadDataStream;
        //   510: astore          4
        //   512: aload           4
        //   514: ifnull          603
        //   517: iload           5
        //   519: ifeq            575
        //   522: aload           13
        //   524: astore          14
        //   526: aload_0        
        //   527: iconst_1       
        //   528: putfield        org/chromium/net/impl/CronetUrlRequest.j:Z
        //   531: aload           13
        //   533: astore          14
        //   535: new             Lauct;
        //   538: astore          15
        //   540: aload           13
        //   542: astore          14
        //   544: aload           15
        //   546: aload_0        
        //   547: iconst_2       
        //   548: invokespecial   auct.<init>:(Lorg/chromium/net/impl/CronetUrlRequest;I)V
        //   551: aload           13
        //   553: astore          14
        //   555: aload           4
        //   557: aload           15
        //   559: invokevirtual   org/chromium/net/impl/CronetUploadDataStream.c:(Ljava/lang/Runnable;)V
        //   562: aload           13
        //   564: astore          14
        //   566: aload           13
        //   568: monitorexit    
        //   569: return         
        //   570: astore          13
        //   572: goto            639
        //   575: aload           13
        //   577: astore          14
        //   579: new             Ljava/lang/IllegalArgumentException;
        //   582: astore          4
        //   584: aload           13
        //   586: astore          14
        //   588: aload           4
        //   590: ldc_w           "Requests with upload data must have a Content-Type."
        //   593: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   596: aload           13
        //   598: astore          14
        //   600: aload           4
        //   602: athrow         
        //   603: aload           13
        //   605: astore          14
        //   607: aload_0        
        //   608: iconst_1       
        //   609: putfield        org/chromium/net/impl/CronetUrlRequest.j:Z
        //   612: aload           13
        //   614: astore          14
        //   616: aload_0        
        //   617: invokevirtual   org/chromium/net/impl/CronetUrlRequest.i:()V
        //   620: aload           13
        //   622: astore          14
        //   624: aload           13
        //   626: monitorexit    
        //   627: return         
        //   628: astore          14
        //   630: goto            635
        //   633: astore          14
        //   635: aload           14
        //   637: astore          13
        //   639: aload_1        
        //   640: astore          14
        //   642: aload_0        
        //   643: iconst_1       
        //   644: invokevirtual   org/chromium/net/impl/CronetUrlRequest.c:(I)V
        //   647: aload_1        
        //   648: astore          14
        //   650: aload           13
        //   652: athrow         
        //   653: astore          14
        //   655: aload           14
        //   657: astore          13
        //   659: aload_1        
        //   660: astore          14
        //   662: aload_1        
        //   663: monitorexit    
        //   664: aload           13
        //   666: athrow         
        //   667: astore          13
        //   669: aload           14
        //   671: astore_1       
        //   672: goto            659
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      11     653    659    Any
        //  11     73     633    635    Ljava/lang/RuntimeException;
        //  11     73     653    659    Any
        //  80     111    628    633    Ljava/lang/RuntimeException;
        //  80     111    667    675    Any
        //  115    122    628    633    Ljava/lang/RuntimeException;
        //  115    122    667    675    Any
        //  126    132    628    633    Ljava/lang/RuntimeException;
        //  126    132    667    675    Any
        //  141    154    628    633    Ljava/lang/RuntimeException;
        //  141    154    667    675    Any
        //  161    166    628    633    Ljava/lang/RuntimeException;
        //  161    166    667    675    Any
        //  170    176    628    633    Ljava/lang/RuntimeException;
        //  170    176    667    675    Any
        //  180    185    628    633    Ljava/lang/RuntimeException;
        //  180    185    667    675    Any
        //  189    197    628    633    Ljava/lang/RuntimeException;
        //  189    197    667    675    Any
        //  201    209    628    633    Ljava/lang/RuntimeException;
        //  201    209    667    675    Any
        //  213    223    628    633    Ljava/lang/RuntimeException;
        //  213    223    667    675    Any
        //  227    230    628    633    Ljava/lang/RuntimeException;
        //  227    230    667    675    Any
        //  234    243    628    633    Ljava/lang/RuntimeException;
        //  234    243    667    675    Any
        //  250    260    628    633    Ljava/lang/RuntimeException;
        //  250    260    667    675    Any
        //  264    276    628    633    Ljava/lang/RuntimeException;
        //  264    276    667    675    Any
        //  284    303    628    633    Ljava/lang/RuntimeException;
        //  284    303    667    675    Any
        //  311    327    628    633    Ljava/lang/RuntimeException;
        //  311    327    667    675    Any
        //  334    365    628    633    Ljava/lang/RuntimeException;
        //  334    365    667    675    Any
        //  376    381    628    633    Ljava/lang/RuntimeException;
        //  376    381    667    675    Any
        //  385    397    628    633    Ljava/lang/RuntimeException;
        //  385    397    667    675    Any
        //  401    413    628    633    Ljava/lang/RuntimeException;
        //  401    413    667    675    Any
        //  417    422    628    633    Ljava/lang/RuntimeException;
        //  417    422    667    675    Any
        //  426    431    628    633    Ljava/lang/RuntimeException;
        //  426    431    667    675    Any
        //  435    444    628    633    Ljava/lang/RuntimeException;
        //  435    444    667    675    Any
        //  448    456    628    633    Ljava/lang/RuntimeException;
        //  448    456    667    675    Any
        //  460    469    628    633    Ljava/lang/RuntimeException;
        //  460    469    667    675    Any
        //  473    481    628    633    Ljava/lang/RuntimeException;
        //  473    481    667    675    Any
        //  485    495    628    633    Ljava/lang/RuntimeException;
        //  485    495    667    675    Any
        //  499    502    628    633    Ljava/lang/RuntimeException;
        //  499    502    667    675    Any
        //  506    512    628    633    Ljava/lang/RuntimeException;
        //  506    512    667    675    Any
        //  526    531    570    575    Ljava/lang/RuntimeException;
        //  526    531    667    675    Any
        //  535    540    570    575    Ljava/lang/RuntimeException;
        //  535    540    667    675    Any
        //  544    551    570    575    Ljava/lang/RuntimeException;
        //  544    551    667    675    Any
        //  555    562    570    575    Ljava/lang/RuntimeException;
        //  555    562    667    675    Any
        //  566    569    667    675    Any
        //  579    584    570    575    Ljava/lang/RuntimeException;
        //  579    584    667    675    Any
        //  588    596    570    575    Ljava/lang/RuntimeException;
        //  588    596    667    675    Any
        //  600    603    570    575    Ljava/lang/RuntimeException;
        //  600    603    667    675    Any
        //  607    612    667    675    Any
        //  616    620    667    675    Any
        //  624    627    667    675    Any
        //  642    647    667    675    Any
        //  650    653    667    675    Any
        //  662    664    667    675    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0157:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
