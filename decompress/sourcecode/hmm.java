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

public final class hmm implements tec
{
    public final Object a;
    public final oas b;
    public final ewl c;
    public wyn d;
    public long e;
    public boolean f;
    public String g;
    public int h;
    private final hqv i;
    private final wym j;
    private String k;
    private final uyi l;
    private final uyi m;
    private final cya n;
    
    public hmm(final hqv i, final wym j, final oas b, final uyi l, final uyi m, final cya n, final ewl c, final byte[] array, final byte[] array2, final byte[] array3) {
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
            final int bt = aqql.bT(reelWatchEndpointOuterClass$ReelWatchEndpoint.c);
            if (bt == 0) {
                return 1;
            }
            return bt;
        }
        else {
            if (iba.z(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
                return 4;
            }
            if (iba.I(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
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
            final wyn d = this.d;
            if (d != null) {
                final hqv i = this.i;
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
                        Collection$_EL.removeIf((Collection)i.b.entrySet(), (Predicate)new fqe(d, 12));
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
            final wyn d = this.d;
            if (d != null) {
                d.c(s);
            }
        }
    }
    
    public final void d(final String s, final long n) {
        if (n > 0L) {
            synchronized (this.a) {
                final wyn d = this.d;
                if (d != null) {
                    d.d(s, n);
                }
            }
        }
    }
    
    public final void f(final String k) {
        synchronized (this.a) {
            if (this.d != null && aexs.f(this.k) && k != null) {
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
    
    public final void j(final int n, int n2, final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint, wyn d, long c, String g) {
        if (this.d != null) {
            this.c.c.f(tme.l, 1);
            synchronized (this.a) {
                final wyn d2 = this.d;
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
                    final hqv i = this.i;
                    synchronized (i.b) {
                        Collection$_EL.removeIf((Collection)i.b.entrySet(), (Predicate)new fqe(d, 11));
                        break Label_0205;
                    }
                }
                d = this.j.c(alku.j);
            }
            d.f(c);
        }
        final agza builder = ((agzi)alki.a).createBuilder();
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            final alkz b = alkz.b;
                            builder.copyOnWrite();
                            final alki alki = (alki)builder.instance;
                            alki.e = b.o;
                            alki.b |= 0x8;
                        }
                        else {
                            final alkz f = alkz.f;
                            builder.copyOnWrite();
                            final alki alki2 = (alki)builder.instance;
                            alki2.e = f.o;
                            alki2.b |= 0x8;
                        }
                    }
                    else {
                        final alkz h = alkz.h;
                        builder.copyOnWrite();
                        final alki alki3 = (alki)builder.instance;
                        alki3.e = h.o;
                        alki3.b |= 0x8;
                    }
                }
                else {
                    final alkz j = alkz.i;
                    builder.copyOnWrite();
                    final alki alki4 = (alki)builder.instance;
                    alki4.e = j.o;
                    alki4.b |= 0x8;
                }
            }
            else {
                final alkz c2 = alkz.c;
                builder.copyOnWrite();
                final alki alki5 = (alki)builder.instance;
                alki5.e = c2.o;
                alki5.b |= 0x8;
            }
        }
        else {
            final alkz d3 = alkz.d;
            builder.copyOnWrite();
            final alki alki6 = (alki)builder.instance;
            alki6.e = d3.o;
            alki6.b |= 0x8;
        }
        int ca;
        if ((ca = aqql.ca(reelWatchEndpointOuterClass$ReelWatchEndpoint.d)) == 0) {
            ca = 1;
        }
        this.h = i(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        final agza builder2 = ((agzi)alkn.a).createBuilder();
        builder2.copyOnWrite();
        final alkn alkn = (alkn)builder2.instance;
        alkn.c = n2 - 1;
        alkn.b |= 0x1;
        n2 = this.h;
        builder2.copyOnWrite();
        final alkn alkn2 = (alkn)builder2.instance;
        if (n2 != 0) {
            alkn2.f = n2 - 1;
            alkn2.b |= 0x8;
            builder2.copyOnWrite();
            final alkn alkn3 = (alkn)builder2.instance;
            alkn3.g = ca - 1;
            alkn3.b |= 0x10;
            builder2.copyOnWrite();
            final alkn alkn4 = (alkn)builder2.instance;
            alkn4.d = 1;
            alkn4.b |= 0x2;
            builder2.copyOnWrite();
            final alkn alkn5 = (alkn)builder2.instance;
            alkn5.e = 0;
            alkn5.b |= 0x4;
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x2000000) != 0x0) {
                if ((n2 = aqql.cb(reelWatchEndpointOuterClass$ReelWatchEndpoint.y)) == 0) {
                    n2 = 1;
                }
                builder2.copyOnWrite();
                final alkn alkn6 = (alkn)builder2.instance;
                alkn6.h = n2 - 1;
                alkn6.b |= 0x20;
            }
            n2 = aqql.dQ(((alkn)builder2.instance).c);
            if (n2 != 0 && n2 == 3) {
                if (this.l.l(45362032L).aG()) {
                    builder2.copyOnWrite();
                    final alkn alkn7 = (alkn)builder2.instance;
                    alkn7.j = 2;
                    alkn7.b |= 0x80;
                }
                else {
                    builder2.copyOnWrite();
                    final alkn alkn8 = (alkn)builder2.instance;
                    alkn8.j = 1;
                    alkn8.b |= 0x80;
                }
            }
            final agza builder3 = ((agzi)alkg.a).createBuilder();
            builder3.copyOnWrite();
            final alkg alkg = (alkg)builder3.instance;
            final alkn p5 = (alkn)builder2.build();
            p5.getClass();
            alkg.P = p5;
            alkg.d |= 0x10;
            builder3.copyOnWrite();
            final alkg alkg2 = (alkg)builder3.instance;
            final alki l = (alki)builder.build();
            l.getClass();
            alkg2.L = l;
            alkg2.c |= 0x800000;
            if (n == 1 || n == 2 || n == 3 || n == 4) {
                final long e = this.e;
                if (e > 0L) {
                    final long n3 = c - e;
                    if (n3 < 2147483647L) {
                        builder3.copyOnWrite();
                        final alkg alkg3 = (alkg)builder3.instance;
                        alkg3.b |= 0x1000000;
                        alkg3.v = (int)n3;
                    }
                }
            }
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x8000000) != 0x0) {
                final agza builder4 = ((agzi)alkm.a).createBuilder();
                final String a = reelWatchEndpointOuterClass$ReelWatchEndpoint.A;
                builder4.copyOnWrite();
                final alkm alkm = (alkm)builder4.instance;
                a.getClass();
                alkm.b |= 0x1;
                alkm.c = a;
                builder3.copyOnWrite();
                final alkg alkg4 = (alkg)builder3.instance;
                final alkm s = (alkm)builder4.build();
                s.getClass();
                alkg4.S = s;
                alkg4.d |= 0x2000;
            }
            if (this.m.cq()) {
                g = this.g;
                builder3.copyOnWrite();
                final alkg alkg5 = (alkg)builder3.instance;
                g.getClass();
                alkg5.b |= 0x10;
                alkg5.i = g;
            }
            d.a((alkg)builder3.build());
            synchronized (this.a) {
                this.d = d;
                this.f = false;
                this.e = c;
                return;
            }
        }
        throw null;
    }
    
    public final void k(final int n, final int n2, final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint, final wyn wyn, final long n3) {
        this.j(n, n2, reelWatchEndpointOuterClass$ReelWatchEndpoint, wyn, n3, "warm");
        this.f(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
    }
    
    public final Class[] ms(Class array, final Object o, final int n) {
        if (n != -1) {
            if (n == 0) {
                final aaly aaly = (aaly)o;
                synchronized (this.a) {
                    if (this.d != null && !TextUtils.isEmpty((CharSequence)aaly.e())) {
                        final agza builder = ((agzi)alkg.a).createBuilder();
                        final String e = aaly.e();
                        builder.copyOnWrite();
                        final alkg alkg = (alkg)builder.instance;
                        e.getClass();
                        alkg.b |= 0x1000;
                        alkg.n = e;
                        this.d.a((alkg)builder.build());
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
        array = new Class[] { aaly.class };
        return array;
    }
}
