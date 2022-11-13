import org.chromium.net.UploadDataProvider;
import java.util.HashMap;
import org.chromium.net.UrlRequest$Builder;
import java.util.Collections;
import android.net.Uri;
import java.util.Iterator;
import java.util.Arrays;
import android.os.SystemClock;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest$StatusListener;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import java.io.IOException;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public class bcv extends bbd implements bcf
{
    final UrlRequest$Callback b;
    public final boolean c;
    public final boolean d;
    public UrlRequest e;
    public bbp f;
    public UrlResponseInfo g;
    public IOException h;
    public boolean i;
    public final gpj j;
    private final CronetEngine k;
    private final Executor l;
    private final int m;
    private final int n;
    private final aezs o;
    private boolean p;
    private long q;
    private ByteBuffer r;
    private volatile long s;
    private final bki t;
    
    static {
        ayv.a("media3.datasource.cronet");
    }
    
    protected bcv(final CronetEngine k, final Executor l, final int m, final int n, final boolean c, final aezs o, final boolean d) {
        super(true);
        this.k = k;
        dk.d((Object)l);
        this.l = l;
        this.m = m;
        this.n = n;
        this.c = c;
        this.o = o;
        this.d = d;
        this.b = (UrlRequest$Callback)new bcu(this);
        this.t = new bki((byte[])null);
        this.j = new gpj((byte[])null);
    }
    
    private static int q(final UrlRequest urlRequest) {
        final gpj gpj = new gpj((byte[])null);
        final int[] array = { 0 };
        urlRequest.getStatus((UrlRequest$StatusListener)new bcs(array, gpj, (byte[])null));
        gpj.a();
        return array[0];
    }
    
    private static String r(final Map map, final String s) {
        final List list = map.get(s);
        if (list != null && !list.isEmpty()) {
            return (String)list.get(0);
        }
        return null;
    }
    
    private final ByteBuffer s() {
        if (this.r == null) {
            (this.r = ByteBuffer.allocateDirect(32768)).limit(0);
        }
        return this.r;
    }
    
    private final void t(final ByteBuffer byteBuffer, final bbp bbp) {
        final UrlRequest e = this.e;
        final int a = bax.a;
        e.read(byteBuffer);
        try {
            if (!this.j.c((long)this.n)) {
                throw new SocketTimeoutException();
            }
        }
        catch (final SocketTimeoutException ex) {
            if (byteBuffer == this.r) {
                this.r = null;
            }
            this.h = (IOException)new bcc((IOException)ex, bbp, 2002, 2);
        }
        catch (final InterruptedException ex2) {
            if (byteBuffer == this.r) {
                this.r = null;
            }
            Thread.currentThread().interrupt();
            this.h = new InterruptedIOException();
        }
        final IOException h = this.h;
        if (h == null) {
            return;
        }
        if (h instanceof bcc) {
            throw (bcc)h;
        }
        throw bcc.sM(h, bbp, 2);
    }
    
    public final int a(final byte[] array, final int n, int i) {
        dk.h(this.p);
        if (i == 0) {
            return 0;
        }
        if (this.q == 0L) {
            return -1;
        }
        final ByteBuffer s = this.s();
        if (!s.hasRemaining()) {
            this.j.f();
            s.clear();
            final bbp f = this.f;
            final int a = bax.a;
            this.t(s, f);
            if (this.i) {
                this.q = 0L;
                return -1;
            }
            s.flip();
            dk.h(s.hasRemaining());
        }
        final long[] array2 = new long[3];
        long q;
        if ((q = this.q) == -1L) {
            q = Long.MAX_VALUE;
        }
        array2[0] = q;
        final long n2 = s.remaining();
        final int n3 = 1;
        array2[1] = n2;
        array2[2] = i;
        adkp.H(true);
        long n4 = array2[0];
        long n5;
        long n6;
        for (i = n3; i < 3; ++i, n4 = n6) {
            n5 = array2[i];
            n6 = n4;
            if (n5 < n4) {
                n6 = n5;
            }
        }
        i = (int)n4;
        s.get(array, n, i);
        final long q2 = this.q;
        if (q2 != -1L) {
            this.q = q2 - i;
        }
        this.g(i);
        return i;
    }
    
    public final long b(final bbp f) {
        dk.d((Object)f);
        dk.h(this.p ^ true);
        this.j.f();
        this.p();
        this.f = f;
        boolean c = false;
        try {
            final UrlRequest build = this.o(f).build();
            (this.e = build).start();
            this.i(f);
            try {
                for (long n = SystemClock.elapsedRealtime(); !c && n < this.s; c = this.j.c(this.s - n + 5L), n = SystemClock.elapsedRealtime()) {}
                final IOException h = this.h;
                if (h != null) {
                    final String message = h.getMessage();
                    if (message != null && aevy.b(message).contains("err_cleartext_not_permitted")) {
                        throw new bcb(h, f);
                    }
                    throw new bct(h, f, 2001, q(build));
                }
                else {
                    if (!c) {
                        throw new bct((IOException)new SocketTimeoutException(), f, 2002, q(build));
                    }
                    final UrlResponseInfo g = this.g;
                    dk.d((Object)g);
                    final int httpStatusCode = g.getHttpStatusCode();
                    final Map allHeaders = g.getAllHeaders();
                    long q = -1L;
                    if (httpStatusCode >= 200 && httpStatusCode <= 299) {
                        final aezs o = this.o;
                        final String r = r(allHeaders, "Content-Type");
                        if (r != null && !o.a((Object)r)) {
                            throw new bcd(r, f);
                        }
                        long g2;
                        if (httpStatusCode != 200 || (g2 = f.g) == 0L) {
                            g2 = 0L;
                        }
                        while (true) {
                            for (final Map.Entry<String, V> entry : g.getAllHeadersAsList()) {
                                if (entry.getKey().equalsIgnoreCase("Content-Encoding")) {
                                    if (!((String)entry.getValue()).equalsIgnoreCase("identity")) {
                                        this.q = f.h;
                                        this.p = true;
                                        this.j(f);
                                        if (g2 != 0L) {
                                            final ByteBuffer s = this.s();
                                            while (g2 > 0L) {
                                                try {
                                                    this.j.f();
                                                    s.clear();
                                                    this.t(s, f);
                                                    if (Thread.currentThread().isInterrupted()) {
                                                        throw new InterruptedIOException();
                                                    }
                                                    if (!this.i) {
                                                        s.flip();
                                                        dk.h(s.hasRemaining());
                                                        final int n2 = (int)Math.min(s.remaining(), g2);
                                                        s.position(s.position() + n2);
                                                        g2 -= n2;
                                                        continue;
                                                    }
                                                    throw new bct(f);
                                                }
                                                catch (final IOException ex) {
                                                    if (!(ex instanceof bcc)) {
                                                        int n3;
                                                        if (!(ex instanceof SocketTimeoutException)) {
                                                            n3 = 2001;
                                                        }
                                                        else {
                                                            n3 = 2002;
                                                        }
                                                        throw new bct(ex, f, n3, 14);
                                                    }
                                                    throw (bcc)ex;
                                                }
                                                break;
                                            }
                                        }
                                        return this.q;
                                    }
                                    break;
                                }
                            }
                            final long h2 = f.h;
                            if (h2 != -1L) {
                                this.q = h2;
                                continue;
                            }
                            final long a = bcg.a(r(allHeaders, "Content-Length"), r(allHeaders, "Content-Range"));
                            if (a != -1L) {
                                q = a - g2;
                            }
                            this.q = q;
                            continue;
                        }
                    }
                    else {
                        if (httpStatusCode != 416 || f.g != bcg.b(r(allHeaders, "Content-Range"))) {
                            try {
                                byte[] array = bax.e;
                                final ByteBuffer s2 = this.s();
                                while (!this.i) {
                                    this.j.f();
                                    s2.clear();
                                    this.t(s2, this.f);
                                    s2.flip();
                                    if (s2.remaining() > 0) {
                                        final int length = array.length;
                                        array = Arrays.copyOf(array, s2.remaining() + length);
                                        s2.get(array, length, s2.remaining());
                                    }
                                }
                            }
                            catch (final IOException ex2) {
                                final int a2 = bax.a;
                            }
                            Object o2;
                            if (httpStatusCode == 416) {
                                o2 = new bbm(2008);
                            }
                            else {
                                o2 = null;
                            }
                            g.getHttpStatusText();
                            throw new bce(httpStatusCode, (IOException)o2, allHeaders, f);
                        }
                        this.p = true;
                        this.j(f);
                        final long h3 = f.h;
                        if (h3 != -1L) {
                            return h3;
                        }
                        return 0L;
                    }
                }
            }
            catch (final InterruptedException ex3) {
                Thread.currentThread().interrupt();
                throw new bct((IOException)new InterruptedIOException(), f, 1004, -1);
            }
        }
        catch (final IOException ex4) {
            if (ex4 instanceof bcc) {
                throw (bcc)ex4;
            }
            throw new bct(ex4, f, 2000, 0);
        }
    }
    
    public final Uri c() {
        final UrlResponseInfo g = this.g;
        if (g == null) {
            return null;
        }
        return Uri.parse(g.getUrl());
    }
    
    public final Map d() {
        final UrlResponseInfo g = this.g;
        Map<Object, Object> map;
        if (g == null) {
            map = Collections.emptyMap();
        }
        else {
            map = g.getAllHeaders();
        }
        return map;
    }
    
    public final void f() {
        synchronized (this) {
            final UrlRequest e = this.e;
            if (e != null) {
                e.cancel();
                this.e = null;
            }
            final ByteBuffer r = this.r;
            if (r != null) {
                r.limit(0);
            }
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = false;
            if (this.p) {
                this.p = false;
                this.h();
            }
        }
    }
    
    public final int k() {
        final UrlResponseInfo g = this.g;
        if (g != null && g.getHttpStatusCode() > 0) {
            return this.g.getHttpStatusCode();
        }
        return -1;
    }
    
    public final void l() {
        this.t.e();
    }
    
    public final void m(final String s, final String s2) {
        this.t.f(s, s2);
    }
    
    public final int n(final ByteBuffer byteBuffer) {
        dk.h(this.p);
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Passed buffer is not a direct ByteBuffer");
        }
        final boolean hasRemaining = byteBuffer.hasRemaining();
        boolean b = false;
        if (!hasRemaining) {
            return 0;
        }
        if (this.q == 0L) {
            return -1;
        }
        final int remaining = byteBuffer.remaining();
        final ByteBuffer r = this.r;
        if (r != null) {
            final int min = Math.min(r.remaining(), byteBuffer.remaining());
            final int limit = r.limit();
            r.limit(r.position() + min);
            byteBuffer.put(r);
            r.limit(limit);
            if (min != 0) {
                final long q = this.q;
                if (q != -1L) {
                    this.q = q - min;
                }
                this.g(min);
                return min;
            }
        }
        this.j.f();
        final bbp f = this.f;
        final int a = bax.a;
        this.t(byteBuffer, f);
        if (this.i) {
            this.q = 0L;
            return -1;
        }
        if (remaining > byteBuffer.remaining()) {
            b = true;
        }
        dk.h(b);
        final int n = remaining - byteBuffer.remaining();
        final long q2 = this.q;
        if (q2 != -1L) {
            this.q = q2 - n;
        }
        this.g(n);
        return n;
    }
    
    protected UrlRequest$Builder o(final bbp bbp) {
        final UrlRequest$Builder allowDirectExecutor = this.k.newUrlRequestBuilder(bbp.a.toString(), this.b, this.l).setPriority(3).allowDirectExecutor();
        final HashMap hashMap = new HashMap();
        hashMap.putAll(this.t.d());
        hashMap.putAll(bbp.e);
        for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
            allowDirectExecutor.addHeader((String)entry.getKey(), (String)entry.getValue());
        }
        if (bbp.d != null && !hashMap.containsKey("Content-Type")) {
            throw new bct(bbp, (char[])null);
        }
        final String c = bcg.c(bbp.g, bbp.h);
        if (c != null) {
            allowDirectExecutor.addHeader("Range", c);
        }
        allowDirectExecutor.setHttpMethod(bbp.e());
        final byte[] d = bbp.d;
        if (d != null) {
            allowDirectExecutor.setUploadDataProvider((UploadDataProvider)new bcr(d), this.l);
        }
        return allowDirectExecutor;
    }
    
    public final void p() {
        this.s = SystemClock.elapsedRealtime() + this.m;
    }
}
