import java.util.concurrent.Executor;
import io.grpc.StatusException;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arzq extends asbr
{
    public final asan a;
    public final String b;
    public final AtomicInteger c;
    final arzr d;
    private volatile Status e;
    private Status f;
    private Status g;
    private final xra h;
    
    public arzq(final arzr d, final asan a, final String b) {
        this.d = d;
        this.c = new AtomicInteger(-2147483647);
        this.h = new xra(this);
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    protected final asan a() {
        return this.a;
    }
    
    public final void b() {
        synchronized (this) {
            if (this.c.get() != 0) {
                return;
            }
            final Status f = this.f;
            final Status g = this.g;
            this.f = null;
            this.g = null;
            monitorexit(this);
            if (f != null) {
                super.j(f);
            }
            if (g != null) {
                super.k(g);
            }
        }
    }
    
    @Override
    public final void j(final Status status) {
        status.getClass();
        synchronized (this) {
            if (this.c.get() >= 0) {
                return;
            }
            this.e = status;
            this.c.addAndGet(Integer.MAX_VALUE);
            if (this.c.get() != 0) {
                this.f = status;
                return;
            }
            monitorexit(this);
            super.j(status);
        }
    }
    
    @Override
    public final void k(final Status status) {
        status.getClass();
        synchronized (this) {
            if (this.c.get() < 0) {
                this.e = status;
                this.c.addAndGet(Integer.MAX_VALUE);
            }
            else if (this.g != null) {
                return;
            }
            if (this.c.get() != 0) {
                this.g = status;
                return;
            }
            monitorexit(this);
            super.k(status);
        }
    }
    
    @Override
    public final asac l(final arwo arwo, final arwk arwk, final artx artx, final arva[] array) {
        Object h = artx.h;
        if (h == null) {
            h = null;
        }
        if (h != null) {
            final artv artv = new artv((asaf)this.a, arwo, arwk, artx, this.h, array, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            if (this.c.incrementAndGet() <= 0) {
                try {
                    if (((arxm)h).g == null) {
                        final Class b = arxm.b;
                        if (b == null) {
                            ((arxm)h).g = Boolean.FALSE;
                        }
                        else {
                            ((arxm)h).g = b.isInstance(((arxm)h).d);
                        }
                    }
                    Executor executor;
                    if (!((arxm)h).g || (executor = artx.c) == null) {
                        executor = this.d.a;
                    }
                    final arxd arxd = (arxd)adkp.ac((Object)this.a.m().a(asbu.a), (Object)arxd.a);
                    if (((arxm)h).c && arxd != arxd.c) {
                        artv.a(Status.g.withDescription("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: ".concat(arxd.toString())));
                    }
                    else {
                        final String s = (String)adkp.ac((Object)null, (Object)this.b);
                        try {
                            arxm.H(s, arwo);
                            ((arxm)h).d.b(executor, new aulh((arxm)h, artv));
                        }
                        catch (final StatusException ex) {
                            artv.a(ex.a);
                        }
                    }
                }
                finally {
                    final Throwable t;
                    artv.a(Status.g.withDescription("Credentials should use fail() instead of throwing exceptions").c(t));
                }
                synchronized (artv.f) {
                    asac g = artv.g;
                    if (g == null) {
                        artv.i = new asbc();
                        g = artv.i;
                        artv.g = g;
                        monitorexit(artv.f);
                    }
                    return g;
                }
            }
            this.h.r();
            return (asac)new asbn(this.e, array, (byte[])null, (byte[])null);
        }
        if (this.c.get() >= 0) {
            return (asac)new asbn(this.e, array, (byte[])null, (byte[])null);
        }
        return this.a.l(arwo, arwk, artx, array);
    }
}
