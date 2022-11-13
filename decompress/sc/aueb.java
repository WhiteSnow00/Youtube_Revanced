import java.nio.ByteBuffer;
import java.util.concurrent.RejectedExecutionException;
import android.util.Log;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.CronetException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;
import org.chromium.net.UrlRequest$StatusListener;
import org.chromium.net.UrlResponseInfo;
import java.util.Iterator;
import android.net.TrafficStats;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import org.chromium.net.UrlRequest$Callback;
import java.util.concurrent.atomic.AtomicBoolean;
import java.net.HttpURLConnection;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aueb extends auek
{
    public static final String a = "aueb";
    public final audz b;
    public final Executor c;
    public final String d;
    public final Map e;
    public final List f;
    public final AtomicInteger g;
    public final boolean h;
    public String i;
    public aueu j;
    public Executor k;
    public volatile int l;
    public String m;
    public ReadableByteChannel n;
    public auen o;
    public String p;
    public HttpURLConnection q;
    public final int r;
    public final audh s;
    public audv t;
    private final AtomicBoolean u;
    
    public aueb(final audr audr, final UrlRequest$Callback urlRequest$Callback, final Executor executor, final Executor executor2, final String m, final String d, final boolean h, final boolean b, int threadStatsTag, final boolean b2, final int n) {
        this.e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.f = new ArrayList();
        this.g = new AtomicInteger(0);
        this.u = new AtomicBoolean(false);
        this.l = -1;
        this.h = h;
        this.b = new audz(this, urlRequest$Callback, executor2);
        if (!b) {
            threadStatsTag = TrafficStats.getThreadStatsTag();
        }
        this.c = new auea(new audw(executor, threadStatsTag, b2, n));
        this.r = audr.b;
        this.s = audr.c;
        this.m = m;
        this.d = d;
    }
    
    static long b(final Map map) {
        final Iterator iterator = map.entrySet().iterator();
        long n = 0L;
        while (iterator.hasNext()) {
            final Map.Entry<String, V> entry = (Map.Entry<String, V>)iterator.next();
            final String s = entry.getKey();
            long n2 = n;
            if (s != null) {
                n2 = n + s.length();
            }
            final String s2 = (String)entry.getValue();
            n = n2;
            if (s2 != null) {
                n = n2 + s2.length();
            }
        }
        return n;
    }
    
    static long c(final Map map) {
        long n = 0L;
        if (map == null) {
            return 0L;
        }
        for (final Map.Entry<String, List> entry : map.entrySet()) {
            final String s = entry.getKey();
            long n2 = n;
            if (s != null) {
                n2 = n + s.length();
            }
            if (entry.getValue() == null) {
                n = n2;
            }
            else {
                final Iterator iterator2 = entry.getValue().iterator();
                while (true) {
                    n = n2;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    final String s2 = (String)iterator2.next();
                    if (s2 == null) {
                        continue;
                    }
                    n2 += s2.length();
                }
            }
        }
        return n;
    }
    
    private final void p() {
        final int value = this.g.get();
        if (value == 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Request is already started. State is: ");
        sb.append(value);
        throw new IllegalStateException(sb.toString());
    }
    
    public final void a(final String s, final String s2) {
        this.p();
        int i = 0;
    Label_0214:
        while (true) {
            while (i < s.length()) {
                final char char1 = s.charAt(i);
                if (char1 != ',' && char1 != '/' && char1 != '{' && char1 != '}') {
                    switch (char1) {
                        default: {
                            switch (char1) {
                                default: {
                                    switch (char1) {
                                        default: {
                                            if (!Character.isISOControl(char1) && !Character.isWhitespace(char1)) {
                                                ++i;
                                                continue;
                                            }
                                            break Label_0214;
                                        }
                                        case 91:
                                        case 92:
                                        case 93: {
                                            break Label_0214;
                                        }
                                    }
                                    break;
                                }
                                case 58:
                                case 59:
                                case 60:
                                case 61:
                                case 62:
                                case 63:
                                case 64: {
                                    break Label_0214;
                                }
                            }
                            break;
                        }
                        case 39:
                        case 40:
                        case 41: {
                            break;
                        }
                    }
                }
                final StringBuilder sb = new StringBuilder("Invalid header ");
                sb.append(s);
                sb.append("=");
                sb.append(s2);
                throw new IllegalArgumentException(sb.toString());
            }
            if (!s2.contains("\r\n")) {
                if (this.e.containsKey(s)) {
                    this.e.remove(s);
                }
                this.e.put(s, s2);
                return;
            }
            continue Label_0214;
        }
    }
    
    public final void cancel() {
        final int andSet = this.g.getAndSet(8);
        if (andSet != 1 && andSet != 2 && andSet != 3 && andSet != 4 && andSet != 5) {
            return;
        }
        this.l();
        this.k();
        final audz b = this.b;
        final auen o = this.o;
        b.d.f();
        b.b.execute(new asfa(b, o, 14));
    }
    
    public final Runnable d(final auec auec) {
        return new asfa(this, auec, 12);
    }
    
    public final Runnable e(final auec auec) {
        return new asfa(this, auec, 9);
    }
    
    public final void f() {
        this.c.execute(new audk(this, 7));
    }
    
    public final void followRedirect() {
        this.o(3, 1, new audk(this, 9));
    }
    
    public final void g(final String i) {
        this.p();
        if (!"OPTIONS".equalsIgnoreCase(i) && !"GET".equalsIgnoreCase(i) && !"HEAD".equalsIgnoreCase(i) && !"POST".equalsIgnoreCase(i) && !"PUT".equalsIgnoreCase(i) && !"DELETE".equalsIgnoreCase(i) && !"TRACE".equalsIgnoreCase(i) && !"PATCH".equalsIgnoreCase(i)) {
            throw new IllegalArgumentException("Invalid http method ".concat(i));
        }
        this.i = i;
    }
    
    public final void getStatus(final UrlRequest$StatusListener urlRequest$StatusListener) {
        final int value = this.g.get();
        int l = this.l;
        while (true) {
            switch (value) {
                default: {
                    final StringBuilder sb = new StringBuilder("Switch is exhaustive: ");
                    sb.append(value);
                    throw new IllegalStateException(sb.toString());
                }
                case 1: {
                    this.b.b.execute(new audx(new VersionSafeCallbacks$UrlRequestStatusListener(urlRequest$StatusListener), l, 0));
                    return;
                }
                case 5: {
                    l = 14;
                    continue;
                }
                case 2:
                case 3:
                case 4: {
                    l = 0;
                    continue;
                }
                case 0:
                case 6:
                case 7:
                case 8: {
                    l = -1;
                    continue;
                }
            }
            break;
        }
    }
    
    public final void h(final UploadDataProvider uploadDataProvider, final Executor k) {
        if (!this.e.containsKey("Content-Type")) {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
        this.p();
        if (this.i == null) {
            this.i = "POST";
        }
        this.j = new aueu(uploadDataProvider);
        if (this.h) {
            this.k = k;
            return;
        }
        this.k = (Executor)new nqr(k, 3);
    }
    
    public final void i(CronetException ex) {
        int value;
        do {
            value = this.g.get();
            if (value == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            }
            if (value != 6 && value != 7 && value != 8) {
                continue;
            }
            return;
        } while (!this.g.compareAndSet(value, 6));
        this.l();
        this.k();
        final audz b = this.b;
        final auen o = this.o;
        b.d.f();
        ex = (CronetException)new arfj(b, (UrlResponseInfo)o, ex, 7);
        try {
            b.b.execute((Runnable)ex);
        }
        catch (final InlineExecutionProhibitedException ex2) {
            final Executor c = b.c;
            if (c != null) {
                c.execute((Runnable)ex);
            }
        }
    }
    
    public final boolean isDone() {
        final int value = this.g.get();
        return value == 7 || value == 6 || value == 8;
    }
    
    public final void j(final Throwable t) {
        this.i((CronetException)new aucv("Exception received from UploadDataProvider", t));
    }
    
    public final void k() {
        if (this.j != null && this.u.compareAndSet(false, true)) {
            try {
                this.k.execute(this.e(new audt(this, 5)));
            }
            catch (final RejectedExecutionException ex) {
                Log.e(aueb.a, "Exception when closing uploadDataProvider", (Throwable)ex);
            }
        }
    }
    
    public final void l() {
        this.c.execute(new audk(this, 6));
    }
    
    public final void m() {
        this.l = 13;
        this.c.execute(this.d(new audt(this, 4)));
    }
    
    public final void n() {
        this.c.execute(this.d(new audt(this, 6)));
    }
    
    public final void o(final int n, int value, final Runnable runnable) {
        if (this.g.compareAndSet(n, value)) {
            runnable.run();
            return;
        }
        value = this.g.get();
        if (value != 8 && value != 6) {
            final StringBuilder sb = new StringBuilder("Invalid state transition - expected ");
            sb.append(n);
            sb.append(" but was ");
            sb.append(value);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public final void read(final ByteBuffer byteBuffer) {
        atny.b(byteBuffer);
        atny.c(byteBuffer);
        this.o(4, 5, new asfa(this, byteBuffer, 10));
    }
    
    public final void start() {
        this.l = 10;
        this.o(0, 1, new audk(this, 8));
    }
}
