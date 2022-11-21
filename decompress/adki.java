import java.util.Iterator;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayDeque;
import android.os.Build$VERSION;
import android.content.Context;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adki
{
    public final long a;
    public final long b;
    public final adjx c;
    public final Handler d;
    public final adkp e;
    public final Thread f;
    final adkb g;
    public volatile adkc h;
    private final long i;
    private final long j;
    private final int k;
    
    public adki(final adkp e, final adjx c, final tov tov) {
        this.e = e;
        final tpt tpt = (tpt)e.e;
        this.b = tpt.f();
        this.j = Math.max(tpt.e(), 250L);
        this.k = tpt.g();
        final long a = tpt.c();
        this.a = a;
        this.i = tpt.b();
        this.c = c;
        int n = (int)tov.e(tov.aE);
        this.d = new Handler(((Context)e.c).getMainLooper());
        final long g = ((oco)e.d).g();
        this.h = new adkc(g, false);
        final int n2 = 1;
        int priority = 0;
        boolean b = false;
        Label_0196: {
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
                    break Label_0196;
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
                n4 = n2;
            }
            else {
                if (n != 5) {
                    if (n == 7) {
                        n4 = -19;
                        break Label_0287;
                    }
                    if (n == 8) {
                        n4 = 10;
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
        this.g = new adkb(g + a);
        if (b) {
            (this.f = new adkh(this)).setPriority(priority);
            return;
        }
        this.f = new tfm(n4, "anrV3", 0).newThread((Runnable)new zuo(this, n4, 10));
    }
    
    public final void a(final int n) {
        final int a = adjt.a;
        while (true) {
            try {
                Label_0005: {
                    synchronized (this) {
                        final long n2 = this.g.b - ((oco)this.e.d).g();
                        if (n2 > 0L) {
                            this.wait(n2 + 5L);
                        }
                    }
                }
            }
            catch (final InterruptedException ex) {}
            final adkb g = this.g;
            final long g2 = ((oco)this.e.d).g();
            final long i = this.i;
            final adkc h = this.h;
            g.a = g2;
            g.b = g2 + i;
            g.c = h.b;
            g.e = h.a;
            final ahcr builder = ((ahcz)ahwf.a).createBuilder();
            final long a2 = this.g.a;
            builder.copyOnWrite();
            final ahwf ahwf = (ahwf)builder.instance;
            ahwf.b |= 0x2;
            ahwf.d = a2;
            final int g3 = this.g.g;
            final String u = adme.u(g3);
            if (g3 != 0) {
                builder.copyOnWrite();
                final ahwf ahwf2 = (ahwf)builder.instance;
                ahwf2.b |= 0x1;
                ahwf2.c = u;
                final long f = ((oco)this.e.d).f();
                final adkb g4 = this.g;
                int g5 = g4.g;
                final long a3 = g4.a();
                int g8 = 0;
                Label_1750: {
                    if (g5 == 1) {
                        if (a3 > this.a) {
                            final adkb g6 = this.g;
                            final long a4 = g6.a;
                            final adjx c = this.c;
                            final long c2 = g6.c;
                            final long q = n;
                            final ahcr builder2 = ((ahcz)ahwd.a).createBuilder();
                            final int sdk_INT = Build$VERSION.SDK_INT;
                            builder2.copyOnWrite();
                            final ahwd ahwd = (ahwd)builder2.instance;
                            ahwd.b |= 0x40;
                            ahwd.i = sdk_INT;
                            final int a5 = tvo.a((Context)c.a.c);
                            builder2.copyOnWrite();
                            final ahwd ahwd2 = (ahwd)builder2.instance;
                            ahwd2.b |= 0x80;
                            ahwd2.j = a5;
                            builder2.copyOnWrite();
                            final ahwd ahwd3 = (ahwd)builder2.instance;
                            ahwd3.b |= 0x200;
                            ahwd3.l = c2;
                            final long a6 = c.a.a;
                            builder2.copyOnWrite();
                            final ahwd ahwd4 = (ahwd)builder2.instance;
                            ahwd4.b |= 0x100;
                            ahwd4.k = a6;
                            final int g7 = ((tpt)c.a.e).g();
                            builder2.copyOnWrite();
                            final ahwd ahwd5 = (ahwd)builder2.instance;
                            ahwd5.b |= 0x1000;
                            ahwd5.o = g7;
                            builder2.copyOnWrite();
                            final ahwd ahwd6 = (ahwd)builder2.instance;
                            ahwd6.b |= 0x4000;
                            ahwd6.q = q;
                            c.e = builder2;
                            final ahcr e = c.e;
                            if (e != null && c.d != 0L) {
                                ahwh ahwh;
                                if ((ahwh = ((ahwd)e.instance).r) == null) {
                                    ahwh = ahwh.a;
                                }
                                final ahcr builder3 = ((ahcz)ahwh).toBuilder();
                                final long d = c.d;
                                builder3.copyOnWrite();
                                final ahwh ahwh2 = (ahwh)builder3.instance;
                                ahwh2.b |= 0x1;
                                ahwh2.c = d;
                                final ahwh r = (ahwh)builder3.build();
                                e.copyOnWrite();
                                final ahwd ahwd7 = (ahwd)e.instance;
                                r.getClass();
                                ahwd7.r = r;
                                ahwd7.b |= 0x8000;
                            }
                            final long n3 = this.i - this.g.a();
                            final ArrayDeque d2 = new ArrayDeque();
                            if (n3 <= 0L) {
                                final long n4 = -1L + a4;
                                d2.add(n4);
                                this.c.a(n4);
                            }
                            else if (this.k == 0) {
                                final long n5 = n3 + a4;
                                d2.add(n5);
                                this.c.a(n5);
                            }
                            else {
                                int n6 = 0;
                                while (true) {
                                    final int k = this.k;
                                    if (n6 >= k) {
                                        break;
                                    }
                                    final double n7 = (double)n3;
                                    final int n8 = n6 + 1;
                                    final double nextDouble = ThreadLocalRandom.current().nextDouble();
                                    final double n9 = n6;
                                    final double n10 = k;
                                    Double.isNaN(n7);
                                    Double.isNaN(n10);
                                    final double n11 = n7 / n10;
                                    final double n12 = n8;
                                    Double.isNaN(n12);
                                    Double.isNaN(n9);
                                    final double n13 = n11 * n9;
                                    final long n14 = (long)Math.ceil(n13 + nextDouble * (n12 * n11 - n13)) + a4;
                                    d2.add(n14);
                                    this.c.a(n14);
                                    n6 = n8;
                                }
                            }
                            this.g.d = d2;
                            final adjx c3 = this.c;
                            final ahcr e2 = c3.e;
                            if (e2 != null) {
                                ahwh ahwh3;
                                if ((ahwh3 = ((ahwd)e2.instance).r) == null) {
                                    ahwh3 = ahwh.a;
                                }
                                final long c4 = ahwh3.c;
                                final ahcr e3 = c3.e;
                                ahwh ahwh4;
                                if ((ahwh4 = ((ahwd)e3.instance).r) == null) {
                                    ahwh4 = ahwh.a;
                                }
                                final ahcr builder4 = ((ahcz)ahwh4).toBuilder();
                                builder4.copyOnWrite();
                                final ahwh ahwh5 = (ahwh)builder4.instance;
                                ahwh5.b |= 0x8;
                                ahwh5.g = a4 - c4;
                                final ahwh r2 = (ahwh)builder4.build();
                                e3.copyOnWrite();
                                final ahwd ahwd8 = (ahwd)e3.instance;
                                r2.getClass();
                                ahwd8.r = r2;
                                ahwd8.b |= 0x8000;
                            }
                            g8 = 2;
                            break Label_1750;
                        }
                        g5 = 1;
                    }
                    if (g5 == 2 && a3 <= this.a) {
                        final adjx c5 = this.c;
                        final ahcr e4 = c5.e;
                        e4.getClass();
                        c5.c(e4);
                        c5.e = null;
                    }
                    else {
                        int n15;
                        if (g5 == 2) {
                            if (a3 > this.i) {
                                final adjx c6 = this.c;
                                final long a7 = this.g.a;
                                final ahcr e5 = c6.e;
                                if (e5 != null) {
                                    ahwh ahwh6;
                                    if ((ahwh6 = ((ahwd)e5.instance).r) == null) {
                                        ahwh6 = ahwh.a;
                                    }
                                    final long e6 = ahwh6.e;
                                    final ahcr e7 = c6.e;
                                    ahwh ahwh7;
                                    if ((ahwh7 = ((ahwd)e7.instance).r) == null) {
                                        ahwh7 = ahwh.a;
                                    }
                                    final ahcr builder5 = ((ahcz)ahwh7).toBuilder();
                                    builder5.copyOnWrite();
                                    final ahwh ahwh8 = (ahwh)builder5.instance;
                                    ahwh8.b |= 0x10;
                                    ahwh8.i = a7 - e6;
                                    final ahwh r3 = (ahwh)builder5.build();
                                    e7.copyOnWrite();
                                    final ahwd ahwd9 = (ahwd)e7.instance;
                                    r3.getClass();
                                    ahwd9.r = r3;
                                    ahwd9.b |= 0x8000;
                                }
                                this.c.b();
                                g8 = 3;
                                break Label_1750;
                            }
                            n15 = 2;
                        }
                        else {
                            n15 = g5;
                        }
                        g8 = n15;
                        if (g5 != 3) {
                            break Label_1750;
                        }
                        g8 = n15;
                        if (a3 > this.i) {
                            break Label_1750;
                        }
                        final adjx c7 = this.c;
                        final long n16 = this.g.a + ((tpt)this.e.e).a(tpt.p, 250, 250);
                        final ahcr e8 = c7.e;
                        if (e8 != null) {
                            e8.copyOnWrite();
                            final ahwd ahwd10 = (ahwd)e8.instance;
                            final ahwd a8 = ahwd.a;
                            ahwd10.b |= 0x800;
                            ahwd10.n = n16;
                            final ahcr e9 = c7.e;
                            ahwh ahwh9;
                            if ((ahwh9 = ((ahwd)e9.instance).r) == null) {
                                ahwh9 = ahwh.a;
                            }
                            final ahcr builder6 = ((ahcz)ahwh9).toBuilder();
                            builder6.copyOnWrite();
                            final ahwh ahwh10 = (ahwh)builder6.instance;
                            ahwh10.b |= 0x4;
                            ahwh10.f = n16;
                            final ahwh r4 = (ahwh)builder6.build();
                            e9.copyOnWrite();
                            final ahwd ahwd11 = (ahwd)e9.instance;
                            r4.getClass();
                            ahwd11.r = r4;
                            ahwd11.b |= 0x8000;
                            c7.c.add(c7.e);
                            c7.e = null;
                        }
                    }
                    g8 = 1;
                }
                this.g.g = g8;
                final long f2 = ((oco)this.e.d).f();
                this.b(builder, "TRANSITION", f2 - f);
                final adkb g9 = this.g;
                final int g10 = g9.g;
                if (g10 == 1) {
                    g9.c(g9.c + this.a);
                    this.g.f = false;
                }
                else {
                    final adjx c8 = this.c;
                    final long a9 = g9.a();
                    final boolean e10 = this.g.e;
                    final ahcr e11 = c8.e;
                    if (e11 != null) {
                        adjx.e(e11, a9, e10);
                    }
                    final Long b = this.g.b();
                    if (b != null && b <= this.g.a) {
                        final adjx c9 = this.c;
                        final Thread thread = this.d.getLooper().getThread();
                        final long longValue = b;
                        final ahcr e12 = c9.e;
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
                            final ahcr builder7 = ((ahcz)aiyc.a).createBuilder();
                            final ahcr builder8 = ((ahcz)aiyd.a).createBuilder();
                            final String name = thread.getName();
                            builder8.copyOnWrite();
                            final aiyd aiyd = (aiyd)builder8.instance;
                            name.getClass();
                            aiyd.b |= 0x2;
                            aiyd.d = name;
                            builder8.copyOnWrite();
                            final aiyd aiyd2 = (aiyd)builder8.instance;
                            aiyd2.b |= 0x1;
                            aiyd2.c = string;
                            builder7.copyOnWrite();
                            final aiyc aiyc = (aiyc)builder7.instance;
                            final aiyd c10 = (aiyd)builder8.build();
                            c10.getClass();
                            aiyc.c = c10;
                            aiyc.b |= 0x1;
                            final ahcr builder9 = ((ahcz)aiyb.a).createBuilder();
                            builder9.copyOnWrite();
                            final aiyb aiyb = (aiyb)builder9.instance;
                            aiyb.b |= 0x1;
                            aiyb.c = longValue;
                            final aiyb aiyb2 = (aiyb)builder9.build();
                            builder7.copyOnWrite();
                            final aiyc aiyc2 = (aiyc)builder7.instance;
                            aiyb2.getClass();
                            final ahdp d3 = aiyc2.d;
                            if (!d3.c()) {
                                aiyc2.d = ahcz.mutableCopy(d3);
                            }
                            aiyc2.d.add((Object)aiyb2);
                            final aiyc aiyc3 = (aiyc)builder7.build();
                            final ahcr e13 = c9.e;
                            e13.copyOnWrite();
                            final ahwd ahwd12 = (ahwd)e13.instance;
                            final ahwd a10 = ahwd.a;
                            ahwd12.b |= 0x4;
                            ahwd12.e = string;
                            e13.copyOnWrite();
                            final ahwd ahwd13 = (ahwd)e13.instance;
                            ahwd13.b |= 0x400;
                            ahwd13.m = longValue;
                            aiya aiya;
                            if ((aiya = ((ahwd)c9.e.instance).p) == null) {
                                aiya = aiya.a;
                            }
                            final ahcr builder10 = ((ahcz)aiya).toBuilder();
                            builder10.copyOnWrite();
                            final aiya aiya2 = (aiya)builder10.instance;
                            aiyc3.getClass();
                            aiya2.a();
                            aiya2.c.add((Object)aiyc3);
                            e13.copyOnWrite();
                            final ahwd ahwd14 = (ahwd)e13.instance;
                            final aiya p = (aiya)builder10.build();
                            p.getClass();
                            ahwd14.p = p;
                            ahwd14.b |= 0x2000;
                        }
                        final adjx c11 = this.c;
                        final long a11 = this.g.a;
                        final ahcr e14 = c11.e;
                        if (e14 != null) {
                            ahwh ahwh11;
                            if ((ahwh11 = ((ahwd)e14.instance).r) == null) {
                                ahwh11 = ahwh.a;
                            }
                            final ahcr builder11 = ((ahcz)ahwh11).toBuilder();
                            final ahcr builder12 = ((ahcz)ahwg.a).createBuilder();
                            builder12.copyOnWrite();
                            final ahwg ahwg = (ahwg)builder12.instance;
                            ahwg.b |= 0x1;
                            ahwg.c = a11;
                            final ahwg ahwg2 = (ahwg)builder12.build();
                            builder11.copyOnWrite();
                            final ahwh ahwh12 = (ahwh)builder11.instance;
                            ahwg2.getClass();
                            final ahdp h2 = ahwh12.h;
                            if (!h2.c()) {
                                ahwh12.h = ahcz.mutableCopy(h2);
                            }
                            ahwh12.h.add((Object)ahwg2);
                            final ahwh r5 = (ahwh)builder11.build();
                            e14.copyOnWrite();
                            final ahwd ahwd15 = (ahwd)e14.instance;
                            r5.getClass();
                            ahwd15.r = r5;
                            ahwd15.b |= 0x8000;
                        }
                        final Long n17 = this.g.d.poll();
                    }
                    final Long b2 = this.g.b();
                    if (b2 != null) {
                        this.g.c(b2);
                    }
                    if (g10 == 2) {
                        final adkb g11 = this.g;
                        final long e15 = g11.c + this.i;
                        g11.c(e15);
                        final ahcr e16 = this.c.e;
                        if (e16 != null) {
                            ahwh ahwh13;
                            if ((ahwh13 = ((ahwd)e16.instance).r) == null) {
                                ahwh13 = ahwh.a;
                            }
                            final ahcr builder13 = ((ahcz)ahwh13).toBuilder();
                            builder13.copyOnWrite();
                            final ahwh ahwh14 = (ahwh)builder13.instance;
                            ahwh14.b |= 0x2;
                            ahwh14.e = e15;
                            final ahwh r6 = (ahwh)builder13.build();
                            e16.copyOnWrite();
                            final ahwd ahwd16 = (ahwd)e16.instance;
                            r6.getClass();
                            ahwd16.r = r6;
                            ahwd16.b |= 0x8000;
                        }
                    }
                    else if (g10 == 3) {
                        this.c.b();
                        final adkb g12 = this.g;
                        g12.c(g12.a + this.j);
                    }
                }
                final long f3 = ((oco)this.e.d).f();
                this.b(builder, "PROCESS", f3 - f2);
                final adkb g13 = this.g;
                int g14 = g13.g;
                final adjx c12 = this.c;
                final long a12 = g13.a;
                while (true) {
                    while (!c12.c.isEmpty()) {
                        final ahcr ahcr = c12.c.peek();
                        ahcr.getClass();
                        final long n18 = ((ahwd)ahcr.instance).n;
                        if (n18 > a12) {
                            int n19;
                            if (n18 == Long.MAX_VALUE) {
                                n19 = 1;
                            }
                            else {
                                n19 = 0;
                            }
                            final adkb g15 = this.g;
                            final boolean f4 = g15.f;
                            final adjx c13 = this.c;
                            final long a13 = g15.a();
                            for (final ahcr ahcr2 : c13.c) {
                                final int b3 = ((ahwd)ahcr2.instance).b;
                                ahcr2.getClass();
                                adjx.e(ahcr2, a13, (b3 & 0x10) != 0x0);
                                c13.d(ahcr2, ((ahwd)ahcr2.instance).l);
                            }
                            boolean f5 = false;
                            Label_3364: {
                                if (!f4) {
                                    f5 = true;
                                    if (g14 != 1 || n19 == 0) {
                                        ((toz)this.e.f).e(toz.a, 1);
                                        break Label_3364;
                                    }
                                    n19 = 1;
                                    g14 = 1;
                                }
                                if (f4 && g14 == 1 && n19 != 0) {
                                    ((toz)this.e.f).e(toz.a, 0);
                                    f5 = false;
                                }
                                else {
                                    f5 = f4;
                                }
                            }
                            final adkb g16 = this.g;
                            g16.f = f5;
                            g16.c(n18);
                            this.b(builder, "RESOLVE_COOLDOWN", ((oco)this.e.d).f() - f3);
                            final adjx c14 = this.c;
                            final ahwf ahwf3 = (ahwf)builder.build();
                            final ahcr e17 = c14.e;
                            if (e17 != null) {
                                e17.copyOnWrite();
                                final ahwd ahwd17 = (ahwd)e17.instance;
                                final ahwd a14 = ahwd.a;
                                ahwf3.getClass();
                                final ahdp s = ahwd17.s;
                                if (!s.c()) {
                                    ahwd17.s = ahcz.mutableCopy(s);
                                }
                                ahwd17.s.add((Object)ahwf3);
                                continue Label_0005;
                            }
                            continue Label_0005;
                        }
                        else {
                            final ahcr ahcr3 = c12.c.poll();
                            ahwh ahwh15;
                            if ((ahwh15 = ((ahwd)ahcr3.instance).r) == null) {
                                ahwh15 = ahwh.a;
                            }
                            final ahcr builder14 = ((ahcz)ahwh15).toBuilder();
                            ahwh ahwh16;
                            if ((ahwh16 = ((ahwd)ahcr3.instance).r) == null) {
                                ahwh16 = ahwh.a;
                            }
                            final long f6 = ahwh16.f;
                            builder14.copyOnWrite();
                            final ahwh ahwh17 = (ahwh)builder14.instance;
                            ahwh17.b |= 0x20;
                            ahwh17.j = a12 - f6;
                            final ahwh r7 = (ahwh)builder14.build();
                            ahcr3.copyOnWrite();
                            final ahwd ahwd18 = (ahwd)ahcr3.instance;
                            r7.getClass();
                            ahwd18.r = r7;
                            ahwd18.b |= 0x8000;
                            String.valueOf(ahcr3.build());
                            c12.c(ahcr);
                        }
                    }
                    final long n18 = Long.MAX_VALUE;
                    continue;
                }
            }
            break;
        }
        throw null;
    }
    
    final void b(final ahcr ahcr, final String c, final long f) {
        final ahcr builder = ((ahcz)ahwe.a).createBuilder();
        builder.copyOnWrite();
        final ahwe ahwe = (ahwe)builder.instance;
        ahwe.b |= 0x1;
        ahwe.c = c;
        final int g = this.g.g;
        final String u = adme.u(g);
        if (g != 0) {
            builder.copyOnWrite();
            final ahwe ahwe2 = (ahwe)builder.instance;
            ahwe2.b |= 0x2;
            ahwe2.d = u;
            final long b = this.g.b;
            builder.copyOnWrite();
            final ahwe ahwe3 = (ahwe)builder.instance;
            ahwe3.b |= 0x4;
            ahwe3.e = b;
            builder.copyOnWrite();
            final ahwe ahwe4 = (ahwe)builder.instance;
            ahwe4.b |= 0x8;
            ahwe4.f = f;
            final ahwe ahwe5 = (ahwe)builder.build();
            ahcr.copyOnWrite();
            final ahwf ahwf = (ahwf)ahcr.instance;
            final ahwf a = ahwf.a;
            ahwe5.getClass();
            final ahdp e = ahwf.e;
            if (!e.c()) {
                ahwf.e = ahcz.mutableCopy(e);
            }
            ahwf.e.add((Object)ahwe5);
            return;
        }
        throw null;
    }
}
