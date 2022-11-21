import java.util.function.Consumer;
import java.util.concurrent.Future;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import j$.time.Duration;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adte implements adta, adsv
{
    public static final afma a;
    public final odx b;
    public final adtq c;
    protected final adgg d;
    protected final aapu e;
    private volatile boolean f;
    private final afxs g;
    
    static {
        a = afma.m("com/google/android/livesharing/internal/LiveSharingSessionImpl");
    }
    
    public adte(final adtf adtf) {
        this.f = true;
        this.b = adtf.a;
        this.d = adtf.d;
        this.c = adtf.c;
        this.e = adtf.f;
        final adso b = adtf.b;
        final aheu e = adtf.e;
        final afxs g = new afxs(new agpb((byte[])null), null, null, null, null);
        adme.L(true ^ Double.isNaN(0.9), "rate must be positive");
        synchronized (g.a()) {
            g.b(g.e.G());
            final double n = (double)TimeUnit.SECONDS.toMicros(1L);
            Double.isNaN(n);
            g.c = n / 0.9;
            final double b2 = g.b;
            g.b = 0.9;
            if (b2 == Double.POSITIVE_INFINITY) {
                g.a = 0.9;
            }
            else {
                double a = 0.0;
                if (b2 != 0.0) {
                    a = g.a * 0.9 / b2;
                }
                g.a = a;
            }
            monitorexit(g.a());
            this.g = g;
        }
    }
    
    private final void k(final UnaryOperator unaryOperator, final agwc agwc) {
        adfe.S((agvz)((ahcr)unaryOperator.apply(((ahcz)this.c.d().a).toBuilder())).build());
        final adtb adtb = new adtb(this, unaryOperator, agwc, 1);
        this.j();
        adst.d(new adra(this, adtb, 8), "Unexpected error when trying to broadcast an update to peers.");
    }
    
    @Override
    public final void a(final Duration duration) {
        duration.getClass();
        this.k(new adsq(duration, 3), agwc.d);
    }
    
    @Override
    public final void b(final Duration duration) {
        duration.getClass();
        this.j();
        this.k(new adsq(duration, 5), agwc.d);
    }
    
    @Override
    public final void c(final double n, final Duration duration) {
        final ahcf as = adzw.as(duration);
        adme.U(n > 0.0, "Expected 'rate' to be a value greater than zero.");
        this.k(new adsr(n, as), agwc.e);
    }
    
    @Override
    public final void d(final Duration duration) {
        duration.getClass();
        this.k(new adsq(duration, 6), agwc.d);
    }
    
    @Override
    public final void e(final Duration duration) {
        duration.getClass();
        final afxs g = this.g;
        final long max = Math.max(TimeUnit.MICROSECONDS.toMicros(0L), 0L);
        final boolean b = true;
        final int n = 1;
        adme.N(true, "Requested permits (%s) must be positive", 1);
        Object o = g.a();
        monitorenter(o);
        try {
            final long g2 = g.e.G();
            boolean b2 = false;
            Label_0346: {
                if (g.d - max <= g2) {
                    g.b(g2);
                    final long d = g.d;
                    final double min = Math.min(1.0, g.a);
                    final double c = g.c;
                    final long d2 = g.d;
                    final long n2 = (long)((1.0 - min) * c);
                    long d3 = d2 + n2;
                    if (!((d2 ^ d3) >= 0L | (n2 ^ d2) < 0L)) {
                        d3 = (d3 >>> 63 ^ 0x1L) + Long.MAX_VALUE;
                    }
                    g.d = d3;
                    g.a -= min;
                    final long max2 = Math.max(d - g2, 0L);
                    monitorexit(o);
                    b2 = b;
                    if (max2 > 0L) {
                        o = TimeUnit.MICROSECONDS;
                        boolean b3 = false;
                        try {
                            final long nanos = ((TimeUnit)o).toNanos(max2);
                            final long nanoTime = System.nanoTime();
                            int n3 = 0;
                            long nanoTime2 = nanos;
                            try {
                                TimeUnit.NANOSECONDS.sleep(nanoTime2);
                                b2 = b;
                                if (n3 != 0) {
                                    Thread.currentThread().interrupt();
                                    b2 = b;
                                }
                                break Label_0346;
                            }
                            catch (final InterruptedException o) {
                                try {
                                    nanoTime2 = System.nanoTime();
                                    nanoTime2 = nanoTime + nanos - nanoTime2;
                                }
                                finally {
                                    n3 = n;
                                }
                            }
                        }
                        finally {
                            b3 = false;
                        }
                        if (b3) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                else {
                    monitorexit(o);
                    b2 = false;
                }
            }
            adme.W(b2, "Number of seeks per second cannot exceed %s.", 0.9);
            this.k(new adsq(duration, 2), agwc.c);
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    @Override
    public final void f(final String f, final String s, final Duration duration) {
        f.getClass();
        s.getClass();
        duration.getClass();
        final adtq c = this.c;
        synchronized (c.b) {
            c.f = f;
            monitorexit(c.b);
            this.k(new adss(s, duration), agwc.b);
        }
    }
    
    @Override
    public final void g(final Duration duration) {
        duration.getClass();
        this.k(new adsq(duration, 4), agwc.d);
    }
    
    @Override
    public final void h() {
        this.f = false;
        final Object a = this.d.a;
        if (a != null) {
            ((Future)a).cancel(false);
        }
    }
    
    @Override
    public final void i(final agvu agvu) {
        if (!this.f) {
            ((afly)((afly)((aflw)adte.a).g()).j("com/google/android/livesharing/internal/LiveSharingSessionImpl", "handleStateUpdate", 67, "LiveSharingSessionImpl.java")).r("Received incoming update after session ended.");
            return;
        }
        try {
            final aapu e = this.e;
            final afgj h = afgm.h();
            agwd a;
            if (agvu.b == 5) {
                a = (agwd)agvu.c;
            }
            else {
                a = agwd.a;
            }
            for (final Map.Entry<Integer, V> entry : Collections.unmodifiableMap((Map<?, ?>)a.d).entrySet()) {
                agwc agwc;
                if ((agwc = agwc.a((int)entry.getKey())) == null) {
                    agwc = agwc.a;
                }
                h.g(agwc, entry.getValue());
            }
            agwd a2;
            if (agvu.b == 5) {
                a2 = (agwd)agvu.c;
            }
            else {
                a2 = agwd.a;
            }
            agvz agvz;
            if ((agvz = a2.b) == null) {
                agvz = agvz.a;
            }
            final Object a3 = e.a;
            final adto a4 = adto.a(h.c());
            int n;
            if (!agvu.g && !((adso)e.c).f) {
                n = 1;
            }
            else {
                n = 2;
            }
            synchronized (((adtq)a3).b) {
                ((adtq)a3).e = a4;
                final int e2 = ((adtq)a3).e(agvz, n);
                monitorexit(((adtq)a3).b);
                if (e2 == 2) {
                    ((Consumer<agvz>)e.b).accept(agvz);
                }
            }
        }
        catch (final RuntimeException ex) {
            adst.e(ex);
        }
    }
    
    protected final void j() {
        adme.U(this.f, "Illegal call after meeting ended.");
    }
}
