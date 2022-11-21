import java.util.EnumSet;
import java.util.Iterator;
import java.util.Collection;
import android.text.TextUtils;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adac
{
    private static final int[] m;
    private static final int n;
    public int a;
    public boolean b;
    public String c;
    public List d;
    public List e;
    public int f;
    public int g;
    public Object h;
    public boolean i;
    public int j;
    public String k;
    public int l;
    private long o;
    private int p;
    private int q;
    private Set r;
    private int s;
    private int t;
    private int[] u;
    private final oco v;
    
    static {
        final int[] array;
        final int[] i = array = new int[20];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        array[6] = (array[5] = 5);
        array[7] = 6;
        array[9] = (array[8] = 6);
        array[10] = 7;
        array[12] = (array[11] = 7);
        array[14] = (array[13] = 7);
        array[15] = 8;
        array[17] = (array[16] = 8);
        array[19] = (array[18] = 8);
        m = i;
        n = i[19] + 1;
    }
    
    public adac(final oco v) {
        this.l = 1;
        this.v = v;
    }
    
    private final int i(final int n) {
        final List e = this.e;
        if (e != null) {
            final int size = e.size();
            if (n >= -1 && n <= size - 1) {
                return n;
            }
            return -1;
        }
        else {
            final List d = this.d;
            int n2;
            if (d == null) {
                n2 = -1;
            }
            else {
                n2 = d.size() - 1;
            }
            if (n >= -1 && n <= n2) {
                return n;
            }
            return -1;
        }
    }
    
    public final albj a(final String a) {
        final adad adad = new adad();
        adad.a(-1);
        adad.f(-1);
        adad.b(0);
        adad.c(-1);
        adad.e(-1);
        adad.i(0);
        adad.h(0);
        adad.l(1);
        adad.d((Set)afkg.a);
        adad.k(false);
        adad.g(0);
        adad.j(0);
        adad.r = null;
        adad.q = null;
        if (!TextUtils.isEmpty((CharSequence)this.k)) {
            adad.r = this.k;
        }
        final List e = this.e;
        if (e != null) {
            adad.g = afgh.o(e);
            adad.d = this.h;
        }
        else {
            final List d = this.d;
            if (d != null) {
                adad.f = d;
                adad.a(this.i(this.g));
            }
        }
        if (a != null) {
            adad.a = a;
            adad.b = this.c;
            adad.f(this.i(this.f));
            int n;
            if (this.b) {
                if (this.a > 1) {
                    n = 3;
                }
                else {
                    n = 1;
                }
            }
            else if (this.a > 0) {
                n = 2;
            }
            else {
                n = 0;
            }
            adad.b(n);
            adad.c(this.p);
            adad.e(this.q);
            adad.i((int)(this.v.d() - this.o));
            adad.l(this.l);
            adad.d(this.r);
            adad.g(this.t);
            adad.j(this.s);
            final StringBuilder sb = new StringBuilder();
            int n2 = 0;
            int n3 = 0;
            while (true) {
                final int[] u = this.u;
                if (n2 >= u.length) {
                    break;
                }
                final long n4 = u[n2];
                if (n4 == 0L) {
                    ++n3;
                }
                else {
                    if (sb.length() > 0) {
                        sb.append("j");
                    }
                    if (n3 == 1) {
                        sb.append("0j");
                    }
                    else if (n3 > 1) {
                        sb.append(n2);
                        sb.append("-");
                    }
                    sb.append(n4);
                    n3 = 0;
                }
                ++n2;
            }
            adad.q = sb.toString();
            adad.k(this.i);
            adad.h(this.j);
            if (adad.s == 1023) {
                final String a2 = adad.a;
                if (a2 != null) {
                    final int t = adad.t;
                    if (t != 0) {
                        final Set n5 = adad.n;
                        if (n5 != null) {
                            final adae adae = new adae(a2, adad.b, adad.c, adad.d, adad.e, adad.f, adad.g, adad.h, adad.i, adad.j, adad.k, adad.l, adad.m, t, n5, adad.o, adad.p, adad.q, adad.r);
                            twd.n(adae.a);
                            final ahcr builder = ((ahcz)albj.a).createBuilder();
                            final String a3 = adae.a;
                            builder.copyOnWrite();
                            final albj albj = (albj)builder.instance;
                            a3.getClass();
                            albj.b |= 0x4;
                            albj.e = a3;
                            final String b = adae.b;
                            if (b != null) {
                                builder.copyOnWrite();
                                final albj albj2 = (albj)builder.instance;
                                albj2.b |= 0x40;
                                albj2.i = b;
                            }
                            final List f = adae.f;
                            if (f != null && !f.isEmpty()) {
                                final int c = adae.c;
                                if (c >= 0) {
                                    final albi a4 = adae.a(adae.f.get(c), adae.c);
                                    builder.copyOnWrite();
                                    final albj albj3 = (albj)builder.instance;
                                    a4.getClass();
                                    albj3.j = a4;
                                    albj3.b |= 0x100;
                                }
                                if (adae.e >= 0) {
                                    for (int i = 0; i <= adae.e; ++i) {
                                        builder.bb(adae.a((adaa)adae.f.get(i), i));
                                    }
                                }
                            }
                            else {
                                final afgh g = adae.g;
                                if (g != null && !g.isEmpty()) {
                                    final Object d2 = adae.d;
                                    if (d2 != null) {
                                        final albi b2 = adae.b(d2);
                                        if (b2 != null) {
                                            builder.copyOnWrite();
                                            final albj albj4 = (albj)builder.instance;
                                            albj4.j = b2;
                                            albj4.b |= 0x100;
                                        }
                                    }
                                    if (adae.e >= 0) {
                                        for (int j = 0; j <= adae.e; ++j) {
                                            final albi b3 = adae.b(adae.g.get(j));
                                            if (b3 != null) {
                                                builder.bb(b3);
                                            }
                                        }
                                    }
                                }
                            }
                            if (adae.h != 0) {
                                final ahcr builder2 = ((ahcz)albg.a).createBuilder();
                                final int h = adae.h;
                                builder2.copyOnWrite();
                                final albg albg = (albg)builder2.instance;
                                albg.b |= 0x4;
                                albg.c = h;
                                builder.copyOnWrite();
                                final albj albj5 = (albj)builder.instance;
                                final albg h2 = (albg)builder2.build();
                                h2.getClass();
                                albj5.h = h2;
                                albj5.b |= 0x20;
                            }
                            final int k = adae.i;
                            if (k >= 0) {
                                builder.copyOnWrite();
                                final albj albj6 = (albj)builder.instance;
                                albj6.b |= 0x4000;
                                albj6.o = k;
                            }
                            final int l = adae.j;
                            if (l >= 0) {
                                builder.copyOnWrite();
                                final albj albj7 = (albj)builder.instance;
                                albj7.b |= 0x8000;
                                albj7.p = l;
                            }
                            final int m = adae.k;
                            builder.copyOnWrite();
                            final albj albj8 = (albj)builder.instance;
                            albj8.b |= 0x2000;
                            albj8.n = m;
                            final boolean l2 = adae.l;
                            builder.copyOnWrite();
                            final albj albj9 = (albj)builder.instance;
                            albj9.b |= 0x200;
                            albj9.l = l2;
                            final int m2 = adae.m;
                            builder.copyOnWrite();
                            final albj albj10 = (albj)builder.instance;
                            albj10.b |= 0x400;
                            albj10.m = m2;
                            builder.copyOnWrite();
                            final albj albj11 = (albj)builder.instance;
                            albj11.c = 4;
                            albj11.b |= 0x1;
                            builder.copyOnWrite();
                            final albj albj12 = (albj)builder.instance;
                            albj12.d = 1;
                            albj12.b |= 0x2;
                            final int s = adae.s;
                            builder.copyOnWrite();
                            final albj albj13 = (albj)builder.instance;
                            if (s != 0) {
                                albj13.f = s - 1;
                                albj13.b |= 0x10;
                                final Set n6 = adae.n;
                                builder.copyOnWrite();
                                final albj albj14 = (albj)builder.instance;
                                final ahdh g2 = albj14.g;
                                if (!g2.c()) {
                                    albj14.g = ahcz.mutableCopy(g2);
                                }
                                final Iterator iterator = n6.iterator();
                                while (iterator.hasNext()) {
                                    albj14.g.g(((albh)iterator.next()).k);
                                }
                                final int o = adae.o;
                                builder.copyOnWrite();
                                final albj albj15 = (albj)builder.instance;
                                albj15.b |= 0x40000;
                                albj15.q = o;
                                final int p = adae.p;
                                builder.copyOnWrite();
                                final albj albj16 = (albj)builder.instance;
                                albj16.b |= 0x80000;
                                albj16.r = p;
                                final String q = adae.q;
                                if (q != null) {
                                    builder.copyOnWrite();
                                    final albj albj17 = (albj)builder.instance;
                                    albj17.b |= 0x100000;
                                    albj17.s = q;
                                }
                                final String r = adae.r;
                                if (r != null) {
                                    builder.copyOnWrite();
                                    final albj albj18 = (albj)builder.instance;
                                    albj18.b |= 0x400000;
                                    albj18.t = r;
                                }
                                return (albj)builder.build();
                            }
                            throw null;
                        }
                    }
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            if (adad.a == null) {
                sb2.append(" clientName");
            }
            if ((0x1 & adad.s) == 0x0) {
                sb2.append(" assistedQueryIndex");
            }
            if ((adad.s & 0x2) == 0x0) {
                sb2.append(" lastVisibleSuggestionIndex");
            }
            if ((adad.s & 0x4) == 0x0) {
                sb2.append(" experimentTriggered");
            }
            if ((adad.s & 0x8) == 0x0) {
                sb2.append(" firstEditTimeMillis");
            }
            if ((adad.s & 0x10) == 0x0) {
                sb2.append(" lastEditTimeMillis");
            }
            if ((adad.s & 0x20) == 0x0) {
                sb2.append(" sessionDurationMillis");
            }
            if ((adad.s & 0x40) == 0x0) {
                sb2.append(" zeroPrefixSuggestionsEnabled");
            }
            if ((adad.s & 0x80) == 0x0) {
                sb2.append(" numZeroPrefixSuggestionsShown");
            }
            if (adad.t == 0) {
                sb2.append(" searchMethod");
            }
            if (adad.n == null) {
                sb2.append(" inputMethods");
            }
            if ((adad.s & 0x100) == 0x0) {
                sb2.append(" maxRoundTripTimeMsec");
            }
            if ((adad.s & 0x200) == 0x0) {
                sb2.append(" totalRoundTripTimeMsec");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        throw new NullPointerException("Null clientName");
    }
    
    public final void b(final String c) {
        this.l = 2;
        this.c = c;
    }
    
    public final void c() {
        final long d = this.v.d();
        final long o = this.o;
        final int p = this.p;
        final int n = (int)(d - o);
        if (p == -1) {
            this.p = n;
        }
        this.q = n;
    }
    
    public final void d() {
        this.r.add(albh.b);
        this.c();
    }
    
    public final void e() {
        this.r.add(albh.f);
        this.c();
    }
    
    public final void f() {
        this.l = 16;
        this.r.add(albh.g);
    }
    
    public final void g(int n) {
        this.s += n;
        if (n > this.t) {
            this.t = n;
        }
        final int[] u = this.u;
        if (u == null) {
            return;
        }
        if (n <= 1999) {
            n /= 100;
            n = adac.m[n];
            ++u[n];
            return;
        }
        n = adac.n;
        ++u[n];
    }
    
    public final void h() {
        this.a = 0;
        this.b = false;
        this.o = this.v.d();
        this.p = -1;
        this.q = -1;
        this.l = 1;
        this.r = EnumSet.noneOf(albh.class);
        this.f = -1;
        this.g = -1;
        this.h = null;
        this.s = 0;
        this.t = 0;
        this.u = new int[adac.n + 1];
        this.i = false;
        this.d = null;
        this.e = null;
    }
}
