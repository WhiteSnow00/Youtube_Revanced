import java.util.concurrent.Executor;
import io.grpc.StatusException;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aryd extends asai
{
    public final arze a;
    public final String b;
    public final AtomicInteger c;
    final /* synthetic */ arye d;
    private volatile Status e;
    private Status f;
    private Status g;
    private final xpb h;
    
    public aryd(final arye d, final arze a, final String b) {
        this.d = d;
        this.c = new AtomicInteger(-2147483647);
        this.h = new xpb(this);
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    protected final arze a() {
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
    public final aryt m(final aruk aruk, final arug arug, final arrk arrk, final arxi[] array) {
        Object h = arrk.h;
        if (h == null) {
            h = null;
        }
        if (h != null) {
            final arri arri = new arri((aryw)this.a, aruk, arug, arrk, this.h, array, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            if (this.c.incrementAndGet() <= 0) {
                try {
                    if (((arvq)h).g == null) {
                        final Class b = arvq.b;
                        if (b == null) {
                            ((arvq)h).g = Boolean.FALSE;
                        }
                        else {
                            ((arvq)h).g = b.isInstance(((arvq)h).d);
                        }
                    }
                    Executor executor;
                    if (!((arvq)h).g || (executor = arrk.c) == null) {
                        executor = this.d.a;
                    }
                    final arvc arvc = (arvc)agot.P((Object)this.a.n().a(asal.a), (Object)arvc.a);
                    if (((arvq)h).c && arvc != arvc.c) {
                        arri.a(Status.g.withDescription("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: ".concat(arvc.toString())));
                    }
                    else {
                        final String s = (String)agot.P((Object)null, (Object)this.b);
                        try {
                            arvq.R(s, aruk);
                            ((arvq)h).d.b(executor, new aukr((arvq)h, arri));
                        }
                        catch (final StatusException ex) {
                            arri.a(ex.a);
                        }
                    }
                }
                finally {
                    final Throwable t;
                    arri.a(Status.g.withDescription("Credentials should use fail() instead of throwing exceptions").c(t));
                }
                synchronized (arri.f) {
                    Object g = arri.g;
                    if (g == null) {
                        arri.i = new arzu();
                        g = arri.i;
                        arri.g = (aryt)g;
                        monitorexit(arri.f);
                    }
                    return (aryt)g;
                }
            }
            this.h.y();
            return (aryt)new asae(this.e, array, (byte[])null, (byte[])null, (byte[])null);
        }
        if (this.c.get() >= 0) {
            return (aryt)new asae(this.e, array, (byte[])null, (byte[])null, (byte[])null);
        }
        return this.a.m(aruk, arug, arrk, array);
    }
}
