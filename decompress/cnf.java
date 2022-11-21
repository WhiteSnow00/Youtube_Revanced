import java.util.concurrent.TimeUnit;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cnf
{
    public boolean a;
    public UUID b;
    public crk c;
    public final Set d;
    private final Class e;
    
    public cnf(final Class e) {
        this.e = e;
        final UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        final String string = this.b.toString();
        string.getClass();
        final String name = e.getName();
        name.getClass();
        this.c = new crk(string, 0, name, (String)null, (cml)null, (cml)null, 0L, 0L, 0L, (cmi)null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, (byte[])null);
        final String name2 = e.getName();
        name2.getClass();
        final LinkedHashSet d = new LinkedHashSet(atzg.d(1));
        atyb.o((Object[])new String[] { name2 }, (Collection)d);
        this.d = d;
    }
    
    public abstract eg a();
    
    public final void b(final String s) {
        s.getClass();
        this.d.add(s);
    }
    
    public final void c(final cmi k) {
        k.getClass();
        this.c.k = k;
    }
    
    public final void d(final long n, final TimeUnit timeUnit) {
        timeUnit.getClass();
        this.c.h = timeUnit.toMillis(n);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.h) {
            return;
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }
    
    public final void e(final cml f) {
        f.getClass();
        this.c.f = f;
    }
    
    public final eg f() {
        final eg a = this.a();
        final cmi k = this.c.k;
        final boolean a2 = k.a();
        int n2;
        final int n = n2 = 1;
        if (!a2) {
            n2 = n;
            if (!k.d) {
                n2 = n;
                if (!k.b) {
                    if (k.c) {
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                }
            }
        }
        final crk c = this.c;
        if (c.q) {
            if (n2 != 0) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (c.h > 0L) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        final UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        final String string = randomUUID.toString();
        string.getClass();
        final crk c2 = this.c;
        c2.getClass();
        final String d = c2.d;
        final int t = c2.t;
        final String e = c2.e;
        final cml cml = new cml(c2.f);
        final cml cml2 = new cml(c2.g);
        final long h = c2.h;
        final long i = c2.i;
        final long j = c2.j;
        final cmi l = c2.k;
        l.getClass();
        this.c = new crk(string, t, d, e, cml, cml2, h, i, j, new cmi(l.i, l.b, l.c, l.d, l.e, l.f, l.g, l.h), c2.l, c2.u, c2.m, c2.n, c2.o, c2.p, c2.q, c2.v, c2.r, 524288, (byte[])null);
        return a;
    }
}
