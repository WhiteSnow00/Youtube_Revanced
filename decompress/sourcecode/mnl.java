import android.os.SystemClock;
import java.util.TimeZone;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mnl
{
    public final mnm a;
    public final aeyr b;
    public final arcy c;
    boolean d;
    public afnt e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public final boolean i;
    public String j;
    public String k;
    public mnq l;
    public int m;
    
    public mnl(final mnm a, final agyc agyc, final aeyr b) {
        final arcy g = arcz.g();
        this.c = g;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = true;
        this.a = a;
        this.k = a.j;
        this.j = a.k;
        this.m = a.l;
        final long currentTimeMillis = System.currentTimeMillis();
        g.copyOnWrite();
        arcz.j((arcz)g.instance, currentTimeMillis);
        final int offset = TimeZone.getDefault().getOffset(((arcz)g.instance).d());
        g.copyOnWrite();
        arcz.o((arcz)g.instance, offset / 1000);
        if (ogg.d(a.d)) {
            g.copyOnWrite();
            arcz.i((arcz)g.instance, true);
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime != 0L) {
            g.copyOnWrite();
            arcz.k((arcz)g.instance, elapsedRealtime);
        }
        if (agyc != null) {
            g.copyOnWrite();
            arcz.n((arcz)g.instance, agyc);
        }
        this.b = b;
    }
    
    public final int a() {
        return ((arcz)this.c.instance).a();
    }
    
    public final mpy b() {
        if (!this.d) {
            this.d = true;
            return this.a.e.a(this);
        }
        throw new IllegalStateException("do not reuse LogEventBuilder");
    }
    
    public final void c(final int n) {
        final arcy c = this.c;
        c.copyOnWrite();
        arcz.l((arcz)c.instance, n);
    }
    
    public final void d(final long n) {
        final arcy c = this.c;
        c.copyOnWrite();
        arcz.m((arcz)c.instance, n);
    }
    
    public final void e(final String j) {
        if (this.a.g.contains(mnr.d)) {
            this.j = j;
            return;
        }
        throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ClearcutLogger.LogEventBuilder[uploadAccount: ");
        sb.append(this.j);
        sb.append(", logSourceName: ");
        sb.append(this.k);
        sb.append(", qosTier: ");
        final int m = this.m;
        final String s = null;
        if (m != 0) {
            sb.append(m - 1);
            sb.append(", SourceExtensionByteStringProvider: ");
            sb.append(this.b);
            sb.append(", veMessage: ");
            sb.append(this.e);
            sb.append(", testCodes: ");
            final ArrayList f = this.f;
            String d;
            if (f != null) {
                d = mnm.d(f);
            }
            else {
                d = null;
            }
            sb.append(d);
            sb.append(", mendelPackages: ");
            final ArrayList g = this.g;
            String d2;
            if (g != null) {
                d2 = mnm.d(g);
            }
            else {
                d2 = null;
            }
            sb.append(d2);
            sb.append(", experimentIds: ");
            final ArrayList h = this.h;
            String d3 = s;
            if (h != null) {
                d3 = mnm.d(h);
            }
            sb.append(d3);
            sb.append(", experimentTokens: null, experimentTokensBytes: null, addPhenotype: true, logVerifier: ");
            final String[] a = mnm.a;
            sb.append(this.l);
            sb.append("]");
            return sb.toString();
        }
        throw null;
    }
}
