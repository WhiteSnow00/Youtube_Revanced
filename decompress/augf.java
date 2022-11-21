import java.util.Date;
import org.chromium.net.RequestFinishedInfo$Metrics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class augf extends RequestFinishedInfo$Metrics
{
    public final Long a;
    public final Long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;
    private final long n;
    private final long o;
    private final boolean p;
    private final Long q;
    private final Long r;
    
    public augf(final long c, final long d, final long e, final long f, final long g, final long h, final long i, final long j, final long k, final long l, final long m, final long n, final long o, final boolean p16, final long n2, final long n3) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p16;
        this.a = n2;
        this.b = n3;
        if (c != -1L && n != -1L) {
            this.q = n - c;
        }
        else {
            this.q = null;
        }
        if (c != -1L && o != -1L) {
            this.r = o - c;
            return;
        }
        this.r = null;
    }
    
    private static Date a(final long n) {
        if (n != -1L) {
            return new Date(n);
        }
        return null;
    }
    
    public final Date getConnectEnd() {
        return a(this.g);
    }
    
    public final Date getConnectStart() {
        return a(this.f);
    }
    
    public final Date getDnsEnd() {
        return a(this.e);
    }
    
    public final Date getDnsStart() {
        return a(this.d);
    }
    
    public final Date getPushEnd() {
        return a(this.m);
    }
    
    public final Date getPushStart() {
        return a(this.l);
    }
    
    public final Long getReceivedByteCount() {
        return this.b;
    }
    
    public final Date getRequestEnd() {
        return a(this.o);
    }
    
    public final Date getRequestStart() {
        return a(this.c);
    }
    
    public final Date getResponseStart() {
        return a(this.n);
    }
    
    public final Date getSendingEnd() {
        return a(this.k);
    }
    
    public final Date getSendingStart() {
        return a(this.j);
    }
    
    public final Long getSentByteCount() {
        return this.a;
    }
    
    public final boolean getSocketReused() {
        return this.p;
    }
    
    public final Date getSslEnd() {
        return a(this.i);
    }
    
    public final Date getSslStart() {
        return a(this.h);
    }
    
    public final Long getTotalTimeMs() {
        return this.r;
    }
    
    public final Long getTtfbMs() {
        return this.q;
    }
}
