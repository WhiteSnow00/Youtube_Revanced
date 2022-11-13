import org.chromium.net.BidirectionalStream$Builder;
import java.nio.Buffer;
import java.util.Collection;
import org.chromium.net.ExperimentalBidirectionalStream$Builder;
import java.nio.charset.Charset;
import org.chromium.net.BidirectionalStream$Callback;
import org.chromium.net.ExperimentalCronetEngine;
import java.util.concurrent.TimeUnit;
import org.chromium.net.BidirectionalStream;
import java.util.Iterator;
import java.nio.ByteBuffer;
import io.grpc.Status;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arzd extends arzh implements asac, asdx
{
    public static final Logger q;
    private final asbt a;
    private arwk b;
    private volatile boolean c;
    
    static {
        q = Logger.getLogger(arzd.class.getName());
    }
    
    protected arzd(final asfr asfr, final arwk b, final artx artx) {
        asby.i(artx);
        this.a = (asbt)new asdy(this, asfr);
        this.b = b;
    }
    
    public final void b(final ascd ascd) {
        ascd.b("remote_addr", this.a().a(aruw.a));
    }
    
    public final void c(final Status w) {
        adkp.I(w.f() ^ true, (Object)"Should not cancel with OK status");
        this.c = true;
        final xra u = this.u();
        final ascb o = ((arza)u.a).o;
        final arwf m = ascb.m;
        final Object r = o.r;
        monitorenter(r);
        try {
            final ascb o2 = ((arza)u.a).o;
            if (o2.u) {
                monitorexit(r);
                return;
            }
            o2.u = true;
            o2.w = w;
            final Iterator iterator = o2.s.iterator();
            while (iterator.hasNext()) {
                ((ByteBuffer)((aryz)iterator.next()).c).clear();
            }
            o2.s.clear();
            final Object a = u.a;
            final BidirectionalStream k = ((arza)a).k;
            if (k != null) {
                k.cancel();
            }
            else {
                ((arza)a).i.a((arza)a, w);
            }
            monitorexit(r);
        }
        finally {
            monitorexit(r);
            while (true) {}
        }
    }
    
    public final void e() {
        if (!this.t().k) {
            this.t().k = true;
            final asdy asdy = (asdy)this.v();
            if (!asdy.f) {
                asdy.f = true;
                final auch j = asdy.j;
                if (j != null && j.o() == 0 && asdy.j != null) {
                    asdy.j = null;
                }
                asdy.b(true, true);
            }
        }
    }
    
    public final void i(final arup arup) {
        this.b.d(asby.a);
        this.b.f(asby.a, (Object)Math.max(0L, arup.b(TimeUnit.NANOSECONDS)));
    }
    
    public final void j(final arur j) {
        final arzg t = this.t();
        adkp.R(t.i == null, (Object)"Already called start");
        j.getClass();
        t.j = j;
    }
    
    public final void k(final int b) {
        ((asdu)this.t().a).b = b;
    }
    
    public final void l(final int a) {
        final asdy asdy = (asdy)this.a;
        adkp.R(asdy.a == -1, (Object)"max size already set");
        asdy.a = a;
    }
    
    public final void m(final asae i) {
        final arzg t = this.t();
        final asae j = t.i;
        int k = 0;
        adkp.R(j == null, (Object)"Already called setListener");
        t.i = i;
        final xra u = this.u();
        ((arza)u.a).j.run();
        final arza arza = (arza)u.a;
        final auch p = arza.p;
        if (p != null) {
            final ExperimentalBidirectionalStream$Builder bidirectionalStreamBuilder = ((ExperimentalCronetEngine)p.a).newBidirectionalStreamBuilder(arza.d, (BidirectionalStream$Callback)new aryy(arza), arza.g);
            if (((arza)u.a).l) {
                ((BidirectionalStream$Builder)bidirectionalStreamBuilder).delayRequestHeadersUntilFirstFlush(true);
            }
            final arza arza2 = (arza)u.a;
            final Object m = arza2.m;
            if (m != null || arza2.n != null) {
                if (m != null) {
                    arza.q(bidirectionalStreamBuilder, m);
                }
                final Collection n = ((arza)u.a).n;
                if (n != null) {
                    final Iterator iterator = n.iterator();
                    while (iterator.hasNext()) {
                        arza.q(bidirectionalStreamBuilder, iterator.next());
                    }
                }
            }
            final Object a = u.a;
            final String a2 = asby.i.a;
            final arza arza3 = (arza)a;
            ((BidirectionalStream$Builder)bidirectionalStreamBuilder).addHeader(a2, arza3.e);
            ((BidirectionalStream$Builder)bidirectionalStreamBuilder).addHeader(asby.g.a, "application/grpc");
            ((BidirectionalStream$Builder)bidirectionalStreamBuilder).addHeader("te", "trailers");
            for (byte[][] a3 = asfx.a(arza3.h); k < a3.length; k += 2) {
                final String s = new String(a3[k], Charset.forName("UTF-8"));
                if (!asby.g.a.equalsIgnoreCase(s) && !asby.i.a.equalsIgnoreCase(s) && !asby.h.a.equalsIgnoreCase(s)) {
                    ((BidirectionalStream$Builder)bidirectionalStreamBuilder).addHeader(s, new String(a3[k + 1], Charset.forName("UTF-8")));
                }
            }
            (((arza)u.a).k = ((BidirectionalStream$Builder)bidirectionalStreamBuilder).build()).start();
        }
        this.b = null;
    }
    
    public final boolean o() {
        return this.p().c() && !this.c;
    }
    
    public /* bridge */ arzg p() {
        throw null;
    }
    
    protected abstract arzg t();
    
    protected abstract xra u();
    
    protected final asbt v() {
        return this.a;
    }
    
    public final void w(final auch auch, final boolean b, final boolean b2) {
        boolean b3 = true;
        if (auch == null) {
            b3 = (b && b3);
        }
        adkp.I(b3, (Object)"null frame before EOS");
        final xra u = this.u();
        final ascb o = ((arza)u.a).o;
        final arwf m = ascb.m;
        synchronized (o.r) {
            if (((arza)u.a).o.u) {
                return;
            }
            Object o2;
            if (auch != null) {
                o2 = auch.a;
                ((Buffer)o2).flip();
            }
            else {
                o2 = arza.a;
            }
            final Object a = u.a;
            final int remaining = ((ByteBuffer)o2).remaining();
            final ascb o3 = ((arza)a).o;
            Object o4 = o3.b;
            synchronized (o4) {
                o3.e += remaining;
                monitorexit(o4);
                o4 = u.a;
                final ascb o5 = ((arza)o4).o;
                if (!o5.t) {
                    o4 = new aryz((ByteBuffer)o2, b, b2);
                    o5.s.add(o4);
                }
                else {
                    ((arza)o4).s((ByteBuffer)o2, b, b2);
                }
            }
        }
    }
}
