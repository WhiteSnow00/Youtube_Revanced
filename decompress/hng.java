import android.text.TextUtils;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.Map;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hng implements tgg
{
    public final Object a;
    public final oby b;
    public final ewp c;
    public xan d;
    public long e;
    public boolean f;
    public String g;
    public int h;
    private final hrp i;
    private final xam j;
    private String k;
    private final vai l;
    private final vai m;
    private final cyb n;
    
    public hng(final hrp i, final xam j, final oby b, final vai l, final vai m, final cyb n, final ewp c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new Object();
        this.h = 1;
        this.i = i;
        this.j = j;
        this.b = b;
        this.l = l;
        this.m = m;
        this.n = n;
        this.c = c;
    }
    
    public static int i(final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x1) != 0x0) {
            final int bu = aqsx.bU(reelWatchEndpointOuterClass$ReelWatchEndpoint.c);
            if (bu == 0) {
                return 1;
            }
            return bu;
        }
        else {
            if (hko.p(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
                return 4;
            }
            if (hko.y(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
                return 3;
            }
            return 2;
        }
    }
    
    public final Optional a() {
        return Optional.ofNullable((Object)this.d);
    }
    
    public final void b() {
        final Object a = this.a;
        monitorenter(a);
        try {
            final xan d = this.d;
            if (d != null) {
                final hrp i = this.i;
                synchronized (i.a) {
                    final Iterator iterator = i.a.entrySet().iterator();
                    while (iterator.hasNext()) {
                        if (((Map.Entry)iterator.next()).getValue() == d) {
                            iterator.remove();
                        }
                    }
                    monitorexit(i.a);
                    final Map b = i.b;
                    synchronized (i.a) {
                        Collection$_EL.removeIf((Collection)i.b.entrySet(), (Predicate)new fqn(d, 12));
                        monitorexit(i.a);
                        this.d = null;
                        this.k = null;
                        this.h = 1;
                    }
                }
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void c(final String s) {
        synchronized (this.a) {
            final xan d = this.d;
            if (d != null) {
                d.c(s);
            }
        }
    }
    
    public final void d(final String s, final long n) {
        if (n > 0L) {
            synchronized (this.a) {
                final xan d = this.d;
                if (d != null) {
                    d.d(s, n);
                }
            }
        }
    }
    
    public final void f(final String k) {
        synchronized (this.a) {
            if (this.d != null && aezr.f(this.k) && k != null) {
                this.k = k;
            }
        }
    }
    
    public final void g(final String s, final long n) {
        synchronized (this.a) {
            if (this.d != null && this.h(s)) {
                if (n != 0L) {
                    this.d.d("r_vtc", n);
                }
                else {
                    this.d.c("r_vtc");
                }
            }
        }
    }
    
    public final boolean h(final String s) {
        if (this.d == null) {
            return false;
        }
        final String k = this.k;
        return k == null || k.equals(s);
    }
    
    public final void j(final int n, int n2, final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint, xan d, long c, String g) {
        if (this.d != null) {
            this.c.c.f(tok.l, 1);
            synchronized (this.a) {
                final xan d2 = this.d;
                if (d2 != null && !this.f) {
                    d2.c("aa");
                    this.f = true;
                }
                monitorexit(this.a);
                this.b();
            }
        }
        this.g = g;
        if (c == 0L) {
            c = this.b.c();
        }
        if (d == null) {
            Label_0205: {
                if (this.n.m()) {
                    d = this.i.a(reelWatchEndpointOuterClass$ReelWatchEndpoint);
                    final hrp i = this.i;
                    synchronized (i.b) {
                        Collection$_EL.removeIf((Collection)i.b.entrySet(), (Predicate)new fqn(d, 11));
                        break Label_0205;
                    }
                }
                d = this.j.c(almx.j);
            }
            d.f(c);
        }
        final ahaz builder = ((ahbh)alml.a).createBuilder();
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            final alnc b = alnc.b;
                            builder.copyOnWrite();
                            final alml alml = (alml)builder.instance;
                            alml.e = b.o;
                            alml.b |= 0x8;
                        }
                        else {
                            final alnc f = alnc.f;
                            builder.copyOnWrite();
                            final alml alml2 = (alml)builder.instance;
                            alml2.e = f.o;
                            alml2.b |= 0x8;
                        }
                    }
                    else {
                        final alnc h = alnc.h;
                        builder.copyOnWrite();
                        final alml alml3 = (alml)builder.instance;
                        alml3.e = h.o;
                        alml3.b |= 0x8;
                    }
                }
                else {
                    final alnc j = alnc.i;
                    builder.copyOnWrite();
                    final alml alml4 = (alml)builder.instance;
                    alml4.e = j.o;
                    alml4.b |= 0x8;
                }
            }
            else {
                final alnc c2 = alnc.c;
                builder.copyOnWrite();
                final alml alml5 = (alml)builder.instance;
                alml5.e = c2.o;
                alml5.b |= 0x8;
            }
        }
        else {
            final alnc d3 = alnc.d;
            builder.copyOnWrite();
            final alml alml6 = (alml)builder.instance;
            alml6.e = d3.o;
            alml6.b |= 0x8;
        }
        int cb;
        if ((cb = aqsx.cb(reelWatchEndpointOuterClass$ReelWatchEndpoint.d)) == 0) {
            cb = 1;
        }
        this.h = i(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        final ahaz builder2 = ((ahbh)almq.a).createBuilder();
        builder2.copyOnWrite();
        final almq almq = (almq)builder2.instance;
        almq.c = n2 - 1;
        almq.b |= 0x1;
        n2 = this.h;
        builder2.copyOnWrite();
        final almq almq2 = (almq)builder2.instance;
        if (n2 != 0) {
            almq2.f = n2 - 1;
            almq2.b |= 0x8;
            builder2.copyOnWrite();
            final almq almq3 = (almq)builder2.instance;
            almq3.g = cb - 1;
            almq3.b |= 0x10;
            builder2.copyOnWrite();
            final almq almq4 = (almq)builder2.instance;
            almq4.d = 1;
            almq4.b |= 0x2;
            builder2.copyOnWrite();
            final almq almq5 = (almq)builder2.instance;
            almq5.e = 0;
            almq5.b |= 0x4;
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x2000000) != 0x0) {
                if ((n2 = aqsx.cc(reelWatchEndpointOuterClass$ReelWatchEndpoint.y)) == 0) {
                    n2 = 1;
                }
                builder2.copyOnWrite();
                final almq almq6 = (almq)builder2.instance;
                almq6.h = n2 - 1;
                almq6.b |= 0x20;
            }
            n2 = aqsx.dR(((almq)builder2.instance).c);
            if (n2 != 0 && n2 == 3) {
                if (this.l.l(45362032L).aM()) {
                    builder2.copyOnWrite();
                    final almq almq7 = (almq)builder2.instance;
                    almq7.j = 2;
                    almq7.b |= 0x80;
                }
                else {
                    builder2.copyOnWrite();
                    final almq almq8 = (almq)builder2.instance;
                    almq8.j = 1;
                    almq8.b |= 0x80;
                }
            }
            final ahaz builder3 = ((ahbh)almj.a).createBuilder();
            builder3.copyOnWrite();
            final almj almj = (almj)builder3.instance;
            final almq p5 = (almq)builder2.build();
            p5.getClass();
            almj.P = p5;
            almj.d |= 0x10;
            builder3.copyOnWrite();
            final almj almj2 = (almj)builder3.instance;
            final alml l = (alml)builder.build();
            l.getClass();
            almj2.L = l;
            almj2.c |= 0x800000;
            if (n == 1 || n == 2 || n == 3 || n == 4) {
                final long e = this.e;
                if (e > 0L) {
                    final long n3 = c - e;
                    if (n3 < 2147483647L) {
                        builder3.copyOnWrite();
                        final almj almj3 = (almj)builder3.instance;
                        almj3.b |= 0x1000000;
                        almj3.v = (int)n3;
                    }
                }
            }
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x8000000) != 0x0) {
                final ahaz builder4 = ((ahbh)almp.a).createBuilder();
                final String a = reelWatchEndpointOuterClass$ReelWatchEndpoint.A;
                builder4.copyOnWrite();
                final almp almp = (almp)builder4.instance;
                a.getClass();
                almp.b |= 0x1;
                almp.c = a;
                builder3.copyOnWrite();
                final almj almj4 = (almj)builder3.instance;
                final almp s = (almp)builder4.build();
                s.getClass();
                almj4.S = s;
                almj4.d |= 0x2000;
            }
            if (this.m.cs()) {
                final String g2 = this.g;
                builder3.copyOnWrite();
                final almj almj5 = (almj)builder3.instance;
                g2.getClass();
                almj5.b |= 0x10;
                almj5.i = g2;
            }
            d.a((almj)builder3.build());
            synchronized (this.a) {
                this.d = d;
                this.f = false;
                this.e = c;
                return;
            }
        }
        throw null;
    }
    
    public final void k(final int n, final int n2, final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint, final xan xan, final long n3) {
        this.j(n, n2, reelWatchEndpointOuterClass$ReelWatchEndpoint, xan, n3, "warm");
        this.f(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
    }
    
    public final Class[] ms(Class array, final Object o, final int n) {
        if (n != -1) {
            if (n == 0) {
                final aans aans = (aans)o;
                synchronized (this.a) {
                    if (this.d != null && !TextUtils.isEmpty((CharSequence)aans.e())) {
                        final ahaz builder = ((ahbh)almj.a).createBuilder();
                        final String e = aans.e();
                        builder.copyOnWrite();
                        final almj almj = (almj)builder.instance;
                        e.getClass();
                        almj.b |= 0x1000;
                        almj.n = e;
                        this.d.a((almj)builder.build());
                    }
                    monitorexit(this.a);
                    array = null;
                    return array;
                }
            }
            final StringBuilder sb = new StringBuilder("unsupported op code: ");
            sb.append(n);
            throw new IllegalStateException(sb.toString());
        }
        array = new Class[] { aans.class };
        return array;
    }
}
