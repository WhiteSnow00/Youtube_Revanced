import java.util.Iterator;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayDeque;
import android.os.Build$VERSION;
import android.content.Context;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adis
{
    public final long a;
    public final long b;
    public final adih c;
    public final Handler d;
    public final adiz e;
    public final Thread f;
    final adil g;
    public volatile adim h;
    private final long i;
    private final long j;
    private final int k;
    
    public adis(final adiz e, final adih c, final tnu tnu) {
        this.e = e;
        final tos tos = (tos)e.e;
        this.b = tos.f();
        this.j = Math.max(tos.e(), 250L);
        this.k = tos.g();
        final long a = tos.c();
        this.a = a;
        this.i = tos.b();
        this.c = c;
        int n = (int)tnu.e(tnu.aE);
        this.d = new Handler(((Context)e.c).getMainLooper());
        final long g = ((oby)e.d).g();
        this.h = new adim(g, false);
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
        this.g = new adil(g + a);
        if (b) {
            (this.f = new adir(this)).setPriority(priority);
            return;
        }
        this.f = new tej(n4, "anrV3", 0).newThread((Runnable)new aasq(this, n4, 9));
    }
    
    public final void a(final int n) {
        final int a = adid.a;
        while (true) {
            try {
                Label_0005: {
                    synchronized (this) {
                        final long n2 = this.g.b - ((oby)this.e.d).g();
                        if (n2 > 0L) {
                            this.wait(n2 + 5L);
                        }
                    }
                }
            }
            catch (final InterruptedException ex) {}
            final adil g = this.g;
            final long g2 = ((oby)this.e.d).g();
            final long i = this.i;
            final adim h = this.h;
            g.a = g2;
            g.b = g2 + i;
            g.c = h.b;
            g.e = h.a;
            final ahaz builder = ((ahbh)ahum.a).createBuilder();
            final long a2 = this.g.a;
            builder.copyOnWrite();
            final ahum ahum = (ahum)builder.instance;
            ahum.b |= 0x2;
            ahum.d = a2;
            final int g3 = this.g.g;
            final String d = adkp.D(g3);
            if (g3 != 0) {
                builder.copyOnWrite();
                final ahum ahum2 = (ahum)builder.instance;
                ahum2.b |= 0x1;
                ahum2.c = d;
                final long f = ((oby)this.e.d).f();
                final adil g4 = this.g;
                int g5 = g4.g;
                final long a3 = g4.a();
                int g8 = 0;
                Label_1750: {
                    if (g5 == 1) {
                        if (a3 > this.a) {
                            final adil g6 = this.g;
                            final long a4 = g6.a;
                            final adih c = this.c;
                            final long c2 = g6.c;
                            final long q = n;
                            final ahaz builder2 = ((ahbh)ahuk.a).createBuilder();
                            final int sdk_INT = Build$VERSION.SDK_INT;
                            builder2.copyOnWrite();
                            final ahuk ahuk = (ahuk)builder2.instance;
                            ahuk.b |= 0x40;
                            ahuk.i = sdk_INT;
                            final int a5 = tum.a((Context)c.a.c);
                            builder2.copyOnWrite();
                            final ahuk ahuk2 = (ahuk)builder2.instance;
                            ahuk2.b |= 0x80;
                            ahuk2.j = a5;
                            builder2.copyOnWrite();
                            final ahuk ahuk3 = (ahuk)builder2.instance;
                            ahuk3.b |= 0x200;
                            ahuk3.l = c2;
                            final long a6 = c.a.a;
                            builder2.copyOnWrite();
                            final ahuk ahuk4 = (ahuk)builder2.instance;
                            ahuk4.b |= 0x100;
                            ahuk4.k = a6;
                            final int g7 = ((tos)c.a.e).g();
                            builder2.copyOnWrite();
                            final ahuk ahuk5 = (ahuk)builder2.instance;
                            ahuk5.b |= 0x1000;
                            ahuk5.o = g7;
                            builder2.copyOnWrite();
                            final ahuk ahuk6 = (ahuk)builder2.instance;
                            ahuk6.b |= 0x4000;
                            ahuk6.q = q;
                            c.e = builder2;
                            final ahaz e = c.e;
                            if (e != null && c.d != 0L) {
                                ahuo ahuo;
                                if ((ahuo = ((ahuk)e.instance).r) == null) {
                                    ahuo = ahuo.a;
                                }
                                final ahaz builder3 = ((ahbh)ahuo).toBuilder();
                                final long d2 = c.d;
                                builder3.copyOnWrite();
                                final ahuo ahuo2 = (ahuo)builder3.instance;
                                ahuo2.b |= 0x1;
                                ahuo2.c = d2;
                                final ahuo r = (ahuo)builder3.build();
                                e.copyOnWrite();
                                final ahuk ahuk7 = (ahuk)e.instance;
                                r.getClass();
                                ahuk7.r = r;
                                ahuk7.b |= 0x8000;
                            }
                            final long n3 = this.i - this.g.a();
                            final ArrayDeque d3 = new ArrayDeque();
                            if (n3 <= 0L) {
                                final long n4 = -1L + a4;
                                d3.add(n4);
                                this.c.a(n4);
                            }
                            else if (this.k == 0) {
                                final long n5 = n3 + a4;
                                d3.add(n5);
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
                                    d3.add(n14);
                                    this.c.a(n14);
                                    n6 = n8;
                                }
                            }
                            this.g.d = d3;
                            final adih c3 = this.c;
                            final ahaz e2 = c3.e;
                            if (e2 != null) {
                                ahuo ahuo3;
                                if ((ahuo3 = ((ahuk)e2.instance).r) == null) {
                                    ahuo3 = ahuo.a;
                                }
                                final long c4 = ahuo3.c;
                                final ahaz e3 = c3.e;
                                ahuo ahuo4;
                                if ((ahuo4 = ((ahuk)e3.instance).r) == null) {
                                    ahuo4 = ahuo.a;
                                }
                                final ahaz builder4 = ((ahbh)ahuo4).toBuilder();
                                builder4.copyOnWrite();
                                final ahuo ahuo5 = (ahuo)builder4.instance;
                                ahuo5.b |= 0x8;
                                ahuo5.g = a4 - c4;
                                final ahuo r2 = (ahuo)builder4.build();
                                e3.copyOnWrite();
                                final ahuk ahuk8 = (ahuk)e3.instance;
                                r2.getClass();
                                ahuk8.r = r2;
                                ahuk8.b |= 0x8000;
                            }
                            g8 = 2;
                            break Label_1750;
                        }
                        g5 = 1;
                    }
                    if (g5 == 2 && a3 <= this.a) {
                        final adih c5 = this.c;
                        final ahaz e4 = c5.e;
                        e4.getClass();
                        c5.c(e4);
                        c5.e = null;
                    }
                    else {
                        int n15;
                        if (g5 == 2) {
                            if (a3 > this.i) {
                                final adih c6 = this.c;
                                final long a7 = this.g.a;
                                final ahaz e5 = c6.e;
                                if (e5 != null) {
                                    ahuo ahuo6;
                                    if ((ahuo6 = ((ahuk)e5.instance).r) == null) {
                                        ahuo6 = ahuo.a;
                                    }
                                    final long e6 = ahuo6.e;
                                    final ahaz e7 = c6.e;
                                    ahuo ahuo7;
                                    if ((ahuo7 = ((ahuk)e7.instance).r) == null) {
                                        ahuo7 = ahuo.a;
                                    }
                                    final ahaz builder5 = ((ahbh)ahuo7).toBuilder();
                                    builder5.copyOnWrite();
                                    final ahuo ahuo8 = (ahuo)builder5.instance;
                                    ahuo8.b |= 0x10;
                                    ahuo8.i = a7 - e6;
                                    final ahuo r3 = (ahuo)builder5.build();
                                    e7.copyOnWrite();
                                    final ahuk ahuk9 = (ahuk)e7.instance;
                                    r3.getClass();
                                    ahuk9.r = r3;
                                    ahuk9.b |= 0x8000;
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
                        final adih c7 = this.c;
                        final long n16 = this.g.a + ((tos)this.e.e).a(tos.p, 250, 250);
                        final ahaz e8 = c7.e;
                        if (e8 != null) {
                            e8.copyOnWrite();
                            final ahuk ahuk10 = (ahuk)e8.instance;
                            final ahuk a8 = ahuk.a;
                            ahuk10.b |= 0x800;
                            ahuk10.n = n16;
                            final ahaz e9 = c7.e;
                            ahuo ahuo9;
                            if ((ahuo9 = ((ahuk)e9.instance).r) == null) {
                                ahuo9 = ahuo.a;
                            }
                            final ahaz builder6 = ((ahbh)ahuo9).toBuilder();
                            builder6.copyOnWrite();
                            final ahuo ahuo10 = (ahuo)builder6.instance;
                            ahuo10.b |= 0x4;
                            ahuo10.f = n16;
                            final ahuo r4 = (ahuo)builder6.build();
                            e9.copyOnWrite();
                            final ahuk ahuk11 = (ahuk)e9.instance;
                            r4.getClass();
                            ahuk11.r = r4;
                            ahuk11.b |= 0x8000;
                            c7.c.add(c7.e);
                            c7.e = null;
                        }
                    }
                    g8 = 1;
                }
                this.g.g = g8;
                final long f2 = ((oby)this.e.d).f();
                this.b(builder, "TRANSITION", f2 - f);
                final adil g9 = this.g;
                final int g10 = g9.g;
                if (g10 == 1) {
                    g9.c(g9.c + this.a);
                    this.g.f = false;
                }
                else {
                    final adih c8 = this.c;
                    final long a9 = g9.a();
                    final boolean e10 = this.g.e;
                    final ahaz e11 = c8.e;
                    if (e11 != null) {
                        adih.e(e11, a9, e10);
                    }
                    final Long b = this.g.b();
                    if (b != null && b <= this.g.a) {
                        final adih c9 = this.c;
                        final Thread thread = this.d.getLooper().getThread();
                        final long longValue = b;
                        final ahaz e12 = c9.e;
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
                            final ahaz builder7 = ((ahbh)aiwe.a).createBuilder();
                            final ahaz builder8 = ((ahbh)aiwf.a).createBuilder();
                            final String name = thread.getName();
                            builder8.copyOnWrite();
                            final aiwf aiwf = (aiwf)builder8.instance;
                            name.getClass();
                            aiwf.b |= 0x2;
                            aiwf.d = name;
                            builder8.copyOnWrite();
                            final aiwf aiwf2 = (aiwf)builder8.instance;
                            aiwf2.b |= 0x1;
                            aiwf2.c = string;
                            builder7.copyOnWrite();
                            final aiwe aiwe = (aiwe)builder7.instance;
                            final aiwf c10 = (aiwf)builder8.build();
                            c10.getClass();
                            aiwe.c = c10;
                            aiwe.b |= 0x1;
                            final ahaz builder9 = ((ahbh)aiwd.a).createBuilder();
                            builder9.copyOnWrite();
                            final aiwd aiwd = (aiwd)builder9.instance;
                            aiwd.b |= 0x1;
                            aiwd.c = longValue;
                            final aiwd aiwd2 = (aiwd)builder9.build();
                            builder7.copyOnWrite();
                            final aiwe aiwe2 = (aiwe)builder7.instance;
                            aiwd2.getClass();
                            final ahbx d4 = aiwe2.d;
                            if (!d4.c()) {
                                aiwe2.d = ahbh.mutableCopy(d4);
                            }
                            aiwe2.d.add((Object)aiwd2);
                            final aiwe aiwe3 = (aiwe)builder7.build();
                            final ahaz e13 = c9.e;
                            e13.copyOnWrite();
                            final ahuk ahuk12 = (ahuk)e13.instance;
                            final ahuk a10 = ahuk.a;
                            ahuk12.b |= 0x4;
                            ahuk12.e = string;
                            e13.copyOnWrite();
                            final ahuk ahuk13 = (ahuk)e13.instance;
                            ahuk13.b |= 0x400;
                            ahuk13.m = longValue;
                            aiwc aiwc;
                            if ((aiwc = ((ahuk)c9.e.instance).p) == null) {
                                aiwc = aiwc.a;
                            }
                            final ahaz builder10 = ((ahbh)aiwc).toBuilder();
                            builder10.copyOnWrite();
                            final aiwc aiwc2 = (aiwc)builder10.instance;
                            aiwe3.getClass();
                            aiwc2.a();
                            aiwc2.c.add((Object)aiwe3);
                            e13.copyOnWrite();
                            final ahuk ahuk14 = (ahuk)e13.instance;
                            final aiwc p = (aiwc)builder10.build();
                            p.getClass();
                            ahuk14.p = p;
                            ahuk14.b |= 0x2000;
                        }
                        final adih c11 = this.c;
                        final long a11 = this.g.a;
                        final ahaz e14 = c11.e;
                        if (e14 != null) {
                            ahuo ahuo11;
                            if ((ahuo11 = ((ahuk)e14.instance).r) == null) {
                                ahuo11 = ahuo.a;
                            }
                            final ahaz builder11 = ((ahbh)ahuo11).toBuilder();
                            final ahaz builder12 = ((ahbh)ahun.a).createBuilder();
                            builder12.copyOnWrite();
                            final ahun ahun = (ahun)builder12.instance;
                            ahun.b |= 0x1;
                            ahun.c = a11;
                            final ahun ahun2 = (ahun)builder12.build();
                            builder11.copyOnWrite();
                            final ahuo ahuo12 = (ahuo)builder11.instance;
                            ahun2.getClass();
                            final ahbx h2 = ahuo12.h;
                            if (!h2.c()) {
                                ahuo12.h = ahbh.mutableCopy(h2);
                            }
                            ahuo12.h.add((Object)ahun2);
                            final ahuo r5 = (ahuo)builder11.build();
                            e14.copyOnWrite();
                            final ahuk ahuk15 = (ahuk)e14.instance;
                            r5.getClass();
                            ahuk15.r = r5;
                            ahuk15.b |= 0x8000;
                        }
                        final Long n17 = this.g.d.poll();
                    }
                    final Long b2 = this.g.b();
                    if (b2 != null) {
                        this.g.c(b2);
                    }
                    if (g10 == 2) {
                        final adil g11 = this.g;
                        final long e15 = g11.c + this.i;
                        g11.c(e15);
                        final ahaz e16 = this.c.e;
                        if (e16 != null) {
                            ahuo ahuo13;
                            if ((ahuo13 = ((ahuk)e16.instance).r) == null) {
                                ahuo13 = ahuo.a;
                            }
                            final ahaz builder13 = ((ahbh)ahuo13).toBuilder();
                            builder13.copyOnWrite();
                            final ahuo ahuo14 = (ahuo)builder13.instance;
                            ahuo14.b |= 0x2;
                            ahuo14.e = e15;
                            final ahuo r6 = (ahuo)builder13.build();
                            e16.copyOnWrite();
                            final ahuk ahuk16 = (ahuk)e16.instance;
                            r6.getClass();
                            ahuk16.r = r6;
                            ahuk16.b |= 0x8000;
                        }
                    }
                    else if (g10 == 3) {
                        this.c.b();
                        final adil g12 = this.g;
                        g12.c(g12.a + this.j);
                    }
                }
                final long f3 = ((oby)this.e.d).f();
                this.b(builder, "PROCESS", f3 - f2);
                final adil g13 = this.g;
                int g14 = g13.g;
                final adih c12 = this.c;
                final long a12 = g13.a;
                while (true) {
                    while (!c12.c.isEmpty()) {
                        final ahaz ahaz = c12.c.peek();
                        ahaz.getClass();
                        final long n18 = ((ahuk)ahaz.instance).n;
                        if (n18 > a12) {
                            int n19;
                            if (n18 == Long.MAX_VALUE) {
                                n19 = 1;
                            }
                            else {
                                n19 = 0;
                            }
                            final adil g15 = this.g;
                            final boolean f4 = g15.f;
                            final adih c13 = this.c;
                            final long a13 = g15.a();
                            for (final ahaz ahaz2 : c13.c) {
                                final int b3 = ((ahuk)ahaz2.instance).b;
                                ahaz2.getClass();
                                adih.e(ahaz2, a13, (b3 & 0x10) != 0x0);
                                c13.d(ahaz2, ((ahuk)ahaz2.instance).l);
                            }
                            boolean f5 = false;
                            Label_3364: {
                                if (!f4) {
                                    f5 = true;
                                    if (g14 != 1 || n19 == 0) {
                                        ((tnz)this.e.f).e(tnz.a, 1);
                                        break Label_3364;
                                    }
                                    n19 = 1;
                                    g14 = 1;
                                }
                                if (f4 && g14 == 1 && n19 != 0) {
                                    ((tnz)this.e.f).e(tnz.a, 0);
                                    f5 = false;
                                }
                                else {
                                    f5 = f4;
                                }
                            }
                            final adil g16 = this.g;
                            g16.f = f5;
                            g16.c(n18);
                            this.b(builder, "RESOLVE_COOLDOWN", ((oby)this.e.d).f() - f3);
                            final adih c14 = this.c;
                            final ahum ahum3 = (ahum)builder.build();
                            final ahaz e17 = c14.e;
                            if (e17 != null) {
                                e17.copyOnWrite();
                                final ahuk ahuk17 = (ahuk)e17.instance;
                                final ahuk a14 = ahuk.a;
                                ahum3.getClass();
                                final ahbx s = ahuk17.s;
                                if (!s.c()) {
                                    ahuk17.s = ahbh.mutableCopy(s);
                                }
                                ahuk17.s.add((Object)ahum3);
                                continue Label_0005;
                            }
                            continue Label_0005;
                        }
                        else {
                            final ahaz ahaz3 = c12.c.poll();
                            ahuo ahuo15;
                            if ((ahuo15 = ((ahuk)ahaz3.instance).r) == null) {
                                ahuo15 = ahuo.a;
                            }
                            final ahaz builder14 = ((ahbh)ahuo15).toBuilder();
                            ahuo ahuo16;
                            if ((ahuo16 = ((ahuk)ahaz3.instance).r) == null) {
                                ahuo16 = ahuo.a;
                            }
                            final long f6 = ahuo16.f;
                            builder14.copyOnWrite();
                            final ahuo ahuo17 = (ahuo)builder14.instance;
                            ahuo17.b |= 0x20;
                            ahuo17.j = a12 - f6;
                            final ahuo r7 = (ahuo)builder14.build();
                            ahaz3.copyOnWrite();
                            final ahuk ahuk18 = (ahuk)ahaz3.instance;
                            r7.getClass();
                            ahuk18.r = r7;
                            ahuk18.b |= 0x8000;
                            String.valueOf(ahaz3.build());
                            c12.c(ahaz);
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
    
    final void b(final ahaz ahaz, String d, final long f) {
        final ahaz builder = ((ahbh)ahul.a).createBuilder();
        builder.copyOnWrite();
        final ahul ahul = (ahul)builder.instance;
        ahul.b |= 0x1;
        ahul.c = d;
        final int g = this.g.g;
        d = adkp.D(g);
        if (g != 0) {
            builder.copyOnWrite();
            final ahul ahul2 = (ahul)builder.instance;
            ahul2.b |= 0x2;
            ahul2.d = d;
            final long b = this.g.b;
            builder.copyOnWrite();
            final ahul ahul3 = (ahul)builder.instance;
            ahul3.b |= 0x4;
            ahul3.e = b;
            builder.copyOnWrite();
            final ahul ahul4 = (ahul)builder.instance;
            ahul4.b |= 0x8;
            ahul4.f = f;
            final ahul ahul5 = (ahul)builder.build();
            ahaz.copyOnWrite();
            final ahum ahum = (ahum)ahaz.instance;
            final ahum a = ahum.a;
            ahul5.getClass();
            final ahbx e = ahum.e;
            if (!e.c()) {
                ahum.e = ahbh.mutableCopy(e);
            }
            ahum.e.add((Object)ahul5);
            return;
        }
        throw null;
    }
}
