import java.util.Iterator;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayDeque;
import android.os.Build$VERSION;
import android.content.Context;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgq
{
    public final long a;
    public final long b;
    public final adgf c;
    public final Handler d;
    public final adgw e;
    public final Thread f;
    final adgj g;
    public volatile adgk h;
    private final long i;
    private final long j;
    private final int k;
    
    public adgq(final adgw e, final adgf c, final tlq tlq) {
        this.e = e;
        final tmm tmm = (tmm)e.e;
        this.b = tmm.f();
        this.j = Math.max(tmm.e(), 250L);
        this.k = tmm.g();
        final long a = tmm.c();
        this.a = a;
        this.i = tmm.b();
        this.c = c;
        int n = (int)tlq.e(tlq.aD);
        this.d = new Handler(((Context)e.c).getMainLooper());
        final long g = ((oas)e.d).g();
        this.h = new adgk(g, false);
        final int n2 = 10;
        int priority = 0;
        boolean b = false;
        Label_0197: {
            int n3;
            if (n == 1) {
                n3 = 5;
            }
            else if (n == 2) {
                n3 = 1;
            }
            else {
                if (n != 3) {
                    priority = 5;
                    b = false;
                    break Label_0197;
                }
                n = 3;
                n3 = 10;
            }
            b = true;
            priority = n3;
        }
        int n4 = 0;
        Label_0287: {
            if (n == 4) {
                n4 = -1;
            }
            else if (n == 6) {
                n4 = 1;
            }
            else {
                if (n != 5) {
                    if (n == 7) {
                        n4 = -19;
                        break Label_0287;
                    }
                    if (n == 8) {
                        n4 = n2;
                        break Label_0287;
                    }
                    if (n == 9) {
                        n4 = 19;
                        break Label_0287;
                    }
                    if (n == 10) {
                        n4 = -2;
                        break Label_0287;
                    }
                }
                n4 = 0;
            }
        }
        this.g = new adgj(g + a);
        if (b) {
            (this.f = new adgp(this)).setPriority(priority);
            return;
        }
        this.f = new tce(n4, "anrV3", 0).newThread((Runnable)new aaqw(this, n4, 9));
    }
    
    public final void a(final int n) {
        final int a = adgb.a;
        while (true) {
            try {
                Label_0004: {
                    synchronized (this) {
                        final long n2 = this.g.b - ((oas)this.e.d).g();
                        if (n2 > 0L) {
                            this.wait(n2 + 5L);
                        }
                    }
                }
            }
            catch (final InterruptedException ex) {}
            final adgj g = this.g;
            final long g2 = ((oas)this.e.d).g();
            final long i = this.i;
            final adgk h = this.h;
            g.a = g2;
            g.b = g2 + i;
            g.c = h.b;
            g.e = h.a;
            final agza builder = ((agzi)ahso.a).createBuilder();
            final long a2 = this.g.a;
            builder.copyOnWrite();
            final ahso ahso = (ahso)builder.instance;
            ahso.b |= 0x2;
            ahso.d = a2;
            final int g3 = this.g.g;
            final String y = adio.y(g3);
            if (g3 != 0) {
                builder.copyOnWrite();
                final ahso ahso2 = (ahso)builder.instance;
                ahso2.b |= 0x1;
                ahso2.c = y;
                final long f = ((oas)this.e.d).f();
                final adgj g4 = this.g;
                int g5 = g4.g;
                final long a3 = g4.a();
                int g8 = 0;
                Label_1703: {
                    if (g5 == 1) {
                        if (a3 > this.a) {
                            final adgj g6 = this.g;
                            final long a4 = g6.a;
                            final adgf c = this.c;
                            final long c2 = g6.c;
                            final agza builder2 = ((agzi)ahsm.a).createBuilder();
                            final int sdk_INT = Build$VERSION.SDK_INT;
                            builder2.copyOnWrite();
                            final ahsm ahsm = (ahsm)builder2.instance;
                            ahsm.b |= 0x40;
                            ahsm.i = sdk_INT;
                            final int a5 = tsi.a((Context)c.a.c);
                            builder2.copyOnWrite();
                            final ahsm ahsm2 = (ahsm)builder2.instance;
                            ahsm2.b |= 0x80;
                            ahsm2.j = a5;
                            builder2.copyOnWrite();
                            final ahsm ahsm3 = (ahsm)builder2.instance;
                            ahsm3.b |= 0x200;
                            ahsm3.l = c2;
                            final long a6 = c.a.a;
                            builder2.copyOnWrite();
                            final ahsm ahsm4 = (ahsm)builder2.instance;
                            ahsm4.b |= 0x100;
                            ahsm4.k = a6;
                            final int g7 = ((tmm)c.a.e).g();
                            builder2.copyOnWrite();
                            final ahsm ahsm5 = (ahsm)builder2.instance;
                            ahsm5.b |= 0x1000;
                            ahsm5.o = g7;
                            builder2.copyOnWrite();
                            final ahsm ahsm6 = (ahsm)builder2.instance;
                            ahsm6.b |= 0x4000;
                            ahsm6.q = n;
                            c.e = builder2;
                            final agza e = c.e;
                            if (e != null && c.d != 0L) {
                                ahsq ahsq;
                                if ((ahsq = ((ahsm)e.instance).r) == null) {
                                    ahsq = ahsq.a;
                                }
                                final agza builder3 = ((agzi)ahsq).toBuilder();
                                final long d = c.d;
                                builder3.copyOnWrite();
                                final ahsq ahsq2 = (ahsq)builder3.instance;
                                ahsq2.b |= 0x1;
                                ahsq2.c = d;
                                final ahsq r = (ahsq)builder3.build();
                                e.copyOnWrite();
                                final ahsm ahsm7 = (ahsm)e.instance;
                                r.getClass();
                                ahsm7.r = r;
                                ahsm7.b |= 0x8000;
                            }
                            final long n3 = this.i - this.g.a();
                            final ArrayDeque d2 = new ArrayDeque();
                            long n5;
                            if (n3 <= 0L) {
                                final long n4 = -1L + a4;
                                d2.add(n4);
                                this.c.a(n4);
                                n5 = a4;
                            }
                            else if (this.k == 0) {
                                final long n6 = n3 + a4;
                                d2.add(n6);
                                this.c.a(n6);
                                n5 = a4;
                            }
                            else {
                                int n7 = 0;
                                while (true) {
                                    final int k = this.k;
                                    n5 = a4;
                                    if (n7 >= k) {
                                        break;
                                    }
                                    final double n8 = (double)n3;
                                    final double n9 = k;
                                    Double.isNaN(n8);
                                    Double.isNaN(n9);
                                    final double n10 = n8 / n9;
                                    final double n11 = n7;
                                    Double.isNaN(n11);
                                    final double n12 = n11 * n10;
                                    ++n7;
                                    final double nextDouble = ThreadLocalRandom.current().nextDouble();
                                    final double n13 = n7;
                                    Double.isNaN(n13);
                                    final long n14 = a4 + (long)Math.ceil(n12 + nextDouble * (n10 * n13 - n12));
                                    d2.add(n14);
                                    this.c.a(n14);
                                }
                            }
                            this.g.d = d2;
                            final adgf c3 = this.c;
                            final agza e2 = c3.e;
                            if (e2 != null) {
                                ahsq ahsq3;
                                if ((ahsq3 = ((ahsm)e2.instance).r) == null) {
                                    ahsq3 = ahsq.a;
                                }
                                final long c4 = ahsq3.c;
                                final agza e3 = c3.e;
                                ahsq ahsq4;
                                if ((ahsq4 = ((ahsm)e3.instance).r) == null) {
                                    ahsq4 = ahsq.a;
                                }
                                final agza builder4 = ((agzi)ahsq4).toBuilder();
                                builder4.copyOnWrite();
                                final ahsq ahsq5 = (ahsq)builder4.instance;
                                ahsq5.b |= 0x8;
                                ahsq5.g = n5 - c4;
                                final ahsq r2 = (ahsq)builder4.build();
                                e3.copyOnWrite();
                                final ahsm ahsm8 = (ahsm)e3.instance;
                                r2.getClass();
                                ahsm8.r = r2;
                                ahsm8.b |= 0x8000;
                            }
                            g8 = 2;
                            break Label_1703;
                        }
                        g5 = 1;
                    }
                    if (g5 == 2 && a3 <= this.a) {
                        final adgf c5 = this.c;
                        final agza e4 = c5.e;
                        e4.getClass();
                        c5.c(e4);
                        c5.e = null;
                    }
                    else {
                        int n15;
                        if (g5 == 2) {
                            if (a3 > this.i) {
                                final adgf c6 = this.c;
                                final long a7 = this.g.a;
                                final agza e5 = c6.e;
                                if (e5 != null) {
                                    ahsq ahsq6;
                                    if ((ahsq6 = ((ahsm)e5.instance).r) == null) {
                                        ahsq6 = ahsq.a;
                                    }
                                    final long e6 = ahsq6.e;
                                    final agza e7 = c6.e;
                                    ahsq ahsq7;
                                    if ((ahsq7 = ((ahsm)e7.instance).r) == null) {
                                        ahsq7 = ahsq.a;
                                    }
                                    final agza builder5 = ((agzi)ahsq7).toBuilder();
                                    builder5.copyOnWrite();
                                    final ahsq ahsq8 = (ahsq)builder5.instance;
                                    ahsq8.b |= 0x10;
                                    ahsq8.i = a7 - e6;
                                    final ahsq r3 = (ahsq)builder5.build();
                                    e7.copyOnWrite();
                                    final ahsm ahsm9 = (ahsm)e7.instance;
                                    r3.getClass();
                                    ahsm9.r = r3;
                                    ahsm9.b |= 0x8000;
                                }
                                this.c.b();
                                g8 = 3;
                                break Label_1703;
                            }
                            n15 = 2;
                        }
                        else {
                            n15 = g5;
                        }
                        g8 = n15;
                        if (g5 != 3) {
                            break Label_1703;
                        }
                        g8 = n15;
                        if (a3 > this.i) {
                            break Label_1703;
                        }
                        final adgf c7 = this.c;
                        final long n16 = this.g.a + ((tmm)this.e.e).a(tmm.p, 250, 250);
                        final agza e8 = c7.e;
                        if (e8 != null) {
                            e8.copyOnWrite();
                            final ahsm ahsm10 = (ahsm)e8.instance;
                            final ahsm a8 = ahsm.a;
                            ahsm10.b |= 0x800;
                            ahsm10.n = n16;
                            final agza e9 = c7.e;
                            ahsq ahsq9;
                            if ((ahsq9 = ((ahsm)e9.instance).r) == null) {
                                ahsq9 = ahsq.a;
                            }
                            final agza builder6 = ((agzi)ahsq9).toBuilder();
                            builder6.copyOnWrite();
                            final ahsq ahsq10 = (ahsq)builder6.instance;
                            ahsq10.b |= 0x4;
                            ahsq10.f = n16;
                            final ahsq r4 = (ahsq)builder6.build();
                            e9.copyOnWrite();
                            final ahsm ahsm11 = (ahsm)e9.instance;
                            r4.getClass();
                            ahsm11.r = r4;
                            ahsm11.b |= 0x8000;
                            c7.c.add(c7.e);
                            c7.e = null;
                        }
                    }
                    g8 = 1;
                }
                this.g.g = g8;
                final long f2 = ((oas)this.e.d).f();
                this.b(builder, "TRANSITION", f2 - f);
                final adgj g9 = this.g;
                final int g10 = g9.g;
                if (g10 == 1) {
                    g9.c(g9.c + this.a);
                    this.g.f = false;
                }
                else {
                    final adgf c8 = this.c;
                    final long a9 = g9.a();
                    final boolean e10 = this.g.e;
                    final agza e11 = c8.e;
                    if (e11 != null) {
                        adgf.e(e11, a9, e10);
                    }
                    final Long b = this.g.b();
                    if (b != null && b <= this.g.a) {
                        final adgf c9 = this.c;
                        final Thread thread = this.d.getLooper().getThread();
                        final long longValue = b;
                        final agza e12 = c9.e;
                        e12.getClass();
                        if (e12 != null) {
                            final StringBuilder sb = new StringBuilder();
                            for (final StackTraceElement stackTraceElement : thread.getStackTrace()) {
                                if (sb.length() + stackTraceElement.toString().length() > 2000) {
                                    break;
                                }
                                sb.append(stackTraceElement);
                                sb.append('\n');
                            }
                            final String string = sb.toString();
                            final agza builder7 = ((agzi)aitz.a).createBuilder();
                            final agza builder8 = ((agzi)aiua.a).createBuilder();
                            final String name = thread.getName();
                            builder8.copyOnWrite();
                            final aiua aiua = (aiua)builder8.instance;
                            name.getClass();
                            aiua.b |= 0x2;
                            aiua.d = name;
                            builder8.copyOnWrite();
                            final aiua aiua2 = (aiua)builder8.instance;
                            aiua2.b |= 0x1;
                            aiua2.c = string;
                            builder7.copyOnWrite();
                            final aitz aitz = (aitz)builder7.instance;
                            final aiua c10 = (aiua)builder8.build();
                            c10.getClass();
                            aitz.c = c10;
                            aitz.b |= 0x1;
                            final agza builder9 = ((agzi)aity.a).createBuilder();
                            builder9.copyOnWrite();
                            final aity aity = (aity)builder9.instance;
                            aity.b |= 0x1;
                            aity.c = longValue;
                            final aity aity2 = (aity)builder9.build();
                            builder7.copyOnWrite();
                            final aitz aitz2 = (aitz)builder7.instance;
                            aity2.getClass();
                            final agzy d3 = aitz2.d;
                            if (!d3.c()) {
                                aitz2.d = agzi.mutableCopy(d3);
                            }
                            aitz2.d.add(aity2);
                            final aitz aitz3 = (aitz)builder7.build();
                            final agza e13 = c9.e;
                            e13.copyOnWrite();
                            final ahsm ahsm12 = (ahsm)e13.instance;
                            final ahsm a10 = ahsm.a;
                            ahsm12.b |= 0x4;
                            ahsm12.e = string;
                            e13.copyOnWrite();
                            final ahsm ahsm13 = (ahsm)e13.instance;
                            ahsm13.b |= 0x400;
                            ahsm13.m = longValue;
                            aitx aitx;
                            if ((aitx = ((ahsm)c9.e.instance).p) == null) {
                                aitx = aitx.a;
                            }
                            final agza builder10 = ((agzi)aitx).toBuilder();
                            builder10.copyOnWrite();
                            final aitx aitx2 = (aitx)builder10.instance;
                            aitz3.getClass();
                            aitx2.a();
                            aitx2.c.add(aitz3);
                            e13.copyOnWrite();
                            final ahsm ahsm14 = (ahsm)e13.instance;
                            final aitx p = (aitx)builder10.build();
                            p.getClass();
                            ahsm14.p = p;
                            ahsm14.b |= 0x2000;
                        }
                        final adgf c11 = this.c;
                        final long a11 = this.g.a;
                        final agza e14 = c11.e;
                        if (e14 != null) {
                            ahsq ahsq11;
                            if ((ahsq11 = ((ahsm)e14.instance).r) == null) {
                                ahsq11 = ahsq.a;
                            }
                            final agza builder11 = ((agzi)ahsq11).toBuilder();
                            final agza builder12 = ((agzi)ahsp.a).createBuilder();
                            builder12.copyOnWrite();
                            final ahsp ahsp = (ahsp)builder12.instance;
                            ahsp.b |= 0x1;
                            ahsp.c = a11;
                            final ahsp ahsp2 = (ahsp)builder12.build();
                            builder11.copyOnWrite();
                            final ahsq ahsq12 = (ahsq)builder11.instance;
                            ahsp2.getClass();
                            final agzy h2 = ahsq12.h;
                            if (!h2.c()) {
                                ahsq12.h = agzi.mutableCopy(h2);
                            }
                            ahsq12.h.add(ahsp2);
                            final ahsq r5 = (ahsq)builder11.build();
                            e14.copyOnWrite();
                            final ahsm ahsm15 = (ahsm)e14.instance;
                            r5.getClass();
                            ahsm15.r = r5;
                            ahsm15.b |= 0x8000;
                        }
                        final Long n17 = this.g.d.poll();
                    }
                    final Long b2 = this.g.b();
                    if (b2 != null) {
                        this.g.c(b2);
                    }
                    if (g10 == 2) {
                        final adgj g11 = this.g;
                        final long e15 = g11.c + this.i;
                        g11.c(e15);
                        final agza e16 = this.c.e;
                        if (e16 != null) {
                            ahsq ahsq13;
                            if ((ahsq13 = ((ahsm)e16.instance).r) == null) {
                                ahsq13 = ahsq.a;
                            }
                            final agza builder13 = ((agzi)ahsq13).toBuilder();
                            builder13.copyOnWrite();
                            final ahsq ahsq14 = (ahsq)builder13.instance;
                            ahsq14.b |= 0x2;
                            ahsq14.e = e15;
                            final ahsq r6 = (ahsq)builder13.build();
                            e16.copyOnWrite();
                            final ahsm ahsm16 = (ahsm)e16.instance;
                            r6.getClass();
                            ahsm16.r = r6;
                            ahsm16.b |= 0x8000;
                        }
                    }
                    else if (g10 == 3) {
                        this.c.b();
                        final adgj g12 = this.g;
                        g12.c(g12.a + this.j);
                    }
                }
                final long f3 = ((oas)this.e.d).f();
                this.b(builder, "PROCESS", f3 - f2);
                final adgj g13 = this.g;
                int g14 = g13.g;
                final adgf c12 = this.c;
                final long a12 = g13.a;
                while (true) {
                    while (!c12.c.isEmpty()) {
                        final agza agza = c12.c.peek();
                        agza.getClass();
                        final long n18;
                        if ((n18 = ((ahsm)agza.instance).n) <= a12) {
                            final agza agza2 = c12.c.poll();
                            ahsq ahsq15;
                            if ((ahsq15 = ((ahsm)agza2.instance).r) == null) {
                                ahsq15 = ahsq.a;
                            }
                            final agza builder14 = ((agzi)ahsq15).toBuilder();
                            ahsq ahsq16;
                            if ((ahsq16 = ((ahsm)agza2.instance).r) == null) {
                                ahsq16 = ahsq.a;
                            }
                            final long f4 = ahsq16.f;
                            builder14.copyOnWrite();
                            final ahsq ahsq17 = (ahsq)builder14.instance;
                            ahsq17.b |= 0x20;
                            ahsq17.j = a12 - f4;
                            final ahsq r7 = (ahsq)builder14.build();
                            agza2.copyOnWrite();
                            final ahsm ahsm17 = (ahsm)agza2.instance;
                            r7.getClass();
                            ahsm17.r = r7;
                            ahsm17.b |= 0x8000;
                            String.valueOf(agza2.build());
                            c12.c(agza);
                        }
                        else {
                            int n19;
                            if (n18 == Long.MAX_VALUE) {
                                n19 = 1;
                            }
                            else {
                                n19 = 0;
                            }
                            final adgj g15 = this.g;
                            final boolean f5 = g15.f;
                            final adgf c13 = this.c;
                            final long a13 = g15.a();
                            for (final agza agza3 : c13.c) {
                                final boolean b3 = (((ahsm)agza3.instance).b & 0x10) != 0x0;
                                agza3.getClass();
                                adgf.e(agza3, a13, b3);
                                c13.d(agza3, ((ahsm)agza3.instance).l);
                            }
                            boolean f6 = false;
                            Label_3488: {
                                if (!f5) {
                                    if (g14 != 1 || n19 == 0) {
                                        ((tlu)this.e.f).e(tlu.a, 1);
                                        f6 = true;
                                        break Label_3488;
                                    }
                                    n19 = 1;
                                    g14 = 1;
                                }
                                if (f5 && g14 == 1 && n19 != 0) {
                                    ((tlu)this.e.f).e(tlu.a, 0);
                                    f6 = false;
                                }
                                else {
                                    f6 = f5;
                                }
                            }
                            final adgj g16 = this.g;
                            g16.f = f6;
                            g16.c(n18);
                            this.b(builder, "RESOLVE_COOLDOWN", ((oas)this.e.d).f() - f3);
                            final adgf c14 = this.c;
                            final ahso ahso3 = (ahso)builder.build();
                            final agza e17 = c14.e;
                            if (e17 != null) {
                                e17.copyOnWrite();
                                final ahsm ahsm18 = (ahsm)e17.instance;
                                final ahsm a14 = ahsm.a;
                                ahso3.getClass();
                                final agzy s = ahsm18.s;
                                if (!s.c()) {
                                    ahsm18.s = agzi.mutableCopy(s);
                                }
                                ahsm18.s.add(ahso3);
                                continue Label_0004;
                            }
                            continue Label_0004;
                        }
                    }
                    long n18 = Long.MAX_VALUE;
                    continue;
                }
            }
            break;
        }
        throw null;
    }
    
    final void b(final agza agza, final String c, final long f) {
        final agza builder = ((agzi)ahsn.a).createBuilder();
        builder.copyOnWrite();
        final ahsn ahsn = (ahsn)builder.instance;
        ahsn.b |= 0x1;
        ahsn.c = c;
        final int g = this.g.g;
        final String y = adio.y(g);
        if (g != 0) {
            builder.copyOnWrite();
            final ahsn ahsn2 = (ahsn)builder.instance;
            ahsn2.b |= 0x2;
            ahsn2.d = y;
            final long b = this.g.b;
            builder.copyOnWrite();
            final ahsn ahsn3 = (ahsn)builder.instance;
            ahsn3.b |= 0x4;
            ahsn3.e = b;
            builder.copyOnWrite();
            final ahsn ahsn4 = (ahsn)builder.instance;
            ahsn4.b |= 0x8;
            ahsn4.f = f;
            final ahsn ahsn5 = (ahsn)builder.build();
            agza.copyOnWrite();
            final ahso ahso = (ahso)agza.instance;
            final ahso a = ahso.a;
            ahsn5.getClass();
            final agzy e = ahso.e;
            if (!e.c()) {
                ahso.e = agzi.mutableCopy(e);
            }
            ahso.e.add(ahsn5);
            return;
        }
        throw null;
    }
}
