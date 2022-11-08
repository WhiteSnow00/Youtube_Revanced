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

public final class adpl implements adpi, adpc
{
    public static final afik a;
    protected final ocb b;
    public final adpx c;
    protected final adcr d;
    protected final auip e;
    private volatile boolean f;
    private final aftz g;
    
    static {
        a = afik.m("com/google/android/livesharing/internal/LiveSharingSessionImpl");
    }
    
    public adpl(final adpm adpm) {
        this.f = true;
        this.b = adpm.a;
        this.d = adpm.e;
        this.c = adpm.c;
        this.e = adpm.f;
        final adov b = adpm.b;
        final aeim d = adpm.d;
        final aftz g = new aftz(new adcr((byte[])null, (char[])null), (byte[])null, (byte[])null);
        agot.v(Double.isNaN(0.9) ^ true, (Object)"rate must be positive");
        synchronized (g.a()) {
            g.b(g.e.K());
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
    
    private final void k(final UnaryOperator unaryOperator, final agsl agsl) {
        adwd.H((agsi)((agza)unaryOperator.apply(((agzi)this.c.d().a).toBuilder())).build());
        final adpj adpj = new adpj(this, unaryOperator, agsl, 1);
        this.j();
        adpa.d((Runnable)new adpd(this, (Supplier)adpj, 4), "Unexpected error when trying to broadcast an update to peers.");
    }
    
    public final void a(final Duration duration) {
        duration.getClass();
        this.k((UnaryOperator)new adox(duration, 3), agsl.d);
    }
    
    public final void b(final Duration duration) {
        duration.getClass();
        this.j();
        this.k((UnaryOperator)new adox(duration, 5), agsl.d);
    }
    
    public final void c(final double n, final Duration duration) {
        final agyo aj = aeda.aj(duration);
        agot.E(n > 0.0, (Object)"Expected 'rate' to be a value greater than zero.");
        this.k((UnaryOperator)new adoy(n, aj), agsl.e);
    }
    
    public final void d(final Duration duration) {
        duration.getClass();
        this.k((UnaryOperator)new adox(duration, 6), agsl.d);
    }
    
    public final void e(final Duration duration) {
        duration.getClass();
        final aftz g = this.g;
        final long max = Math.max(TimeUnit.MICROSECONDS.toMicros(0L), 0L);
        final boolean b = true;
        final int n = 1;
        agot.x(true, "Requested permits (%s) must be positive", 1);
        Object o = g.a();
        monitorenter(o);
        try {
            final long k = g.e.K();
            boolean b2 = false;
            Label_0317: {
                if (g.d - max <= k) {
                    g.b(k);
                    final long d = g.d;
                    final double min = Math.min(1.0, g.a);
                    final long n2 = (long)((1.0 - min) * g.c);
                    final long d2 = g.d;
                    long d3 = d2 + n2;
                    if (!((n2 ^ d2) < 0L | (d2 ^ d3) >= 0L)) {
                        d3 = (d3 >>> 63 ^ 0x1L) + Long.MAX_VALUE;
                    }
                    g.d = d3;
                    g.a -= min;
                    final long max2 = Math.max(d - k, 0L);
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
                                break Label_0317;
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
            agot.G(b2, "Number of seeks per second cannot exceed %s.", (Object)0.9);
            this.k((UnaryOperator)new adox(duration, 2), agsl.c);
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    public final void f(final String f, final String s, final Duration duration) {
        f.getClass();
        s.getClass();
        duration.getClass();
        final adpx c = this.c;
        synchronized (c.b) {
            c.f = f;
            monitorexit(c.b);
            this.k((UnaryOperator)new adoz(s, duration), agsl.b);
        }
    }
    
    public final void g(final Duration duration) {
        duration.getClass();
        this.k((UnaryOperator)new adox(duration, 4), agsl.d);
    }
    
    public final void h() {
        this.f = false;
        final Object a = this.d.a;
        if (a != null) {
            ((Future)a).cancel(false);
        }
    }
    
    public final void i(final agsd agsd) {
        if (!this.f) {
            ((afii)((afii)((afig)adpl.a).g()).j("com/google/android/livesharing/internal/LiveSharingSessionImpl", "handleStateUpdate", 67, "LiveSharingSessionImpl.java")).r("Received incoming update after session ended.");
            return;
        }
        try {
            final auip e = this.e;
            final afct h = afcw.h();
            agsm a;
            if (agsd.b == 5) {
                a = (agsm)agsd.c;
            }
            else {
                a = agsm.a;
            }
            for (final Map.Entry<Integer, V> entry : Collections.unmodifiableMap((Map<?, ?>)a.d).entrySet()) {
                agsl agsl;
                if ((agsl = agsl.a(entry.getKey())) == null) {
                    agsl = agsl.a;
                }
                h.g((Object)agsl, (Object)entry.getValue());
            }
            agsm a2;
            if (agsd.b == 5) {
                a2 = (agsm)agsd.c;
            }
            else {
                a2 = agsm.a;
            }
            agsi agsi;
            if ((agsi = a2.b) == null) {
                agsi = agsi.a;
            }
            final Object a3 = e.a;
            final adpv a4 = adpv.a(h.c());
            int n;
            if (!agsd.g && !((adov)e.c).f) {
                n = 1;
            }
            else {
                n = 2;
            }
            synchronized (((adpx)a3).b) {
                ((adpx)a3).e = a4;
                final int e2 = ((adpx)a3).e((Object)agsi, n);
                monitorexit(((adpx)a3).b);
                if (e2 == 2) {
                    ((Consumer<agsi>)e.b).accept(agsi);
                }
            }
        }
        catch (final RuntimeException ex) {
            adpa.e((Throwable)ex);
        }
    }
    
    protected final void j() {
        agot.E(this.f, (Object)"Illegal call after meeting ended.");
    }
}
