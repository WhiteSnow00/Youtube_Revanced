import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkf implements adpo, adle, tgg
{
    public static final String a;
    private static final afeq l;
    public final tgd b;
    public final zmf c;
    public final vdr d;
    public final adld e;
    public final adpp f;
    public final Map g;
    public final Object h;
    public String i;
    public apij j;
    public volatile boolean k;
    private final oby m;
    private final adku n;
    
    static {
        a = vgl.f(apik.b.a(), "com.google.android.libraries.youtube.upload.upload_status_entity");
        l = afeq.s((Object)admt.b, (Object)admt.f);
    }
    
    public adkf(final oby m, final tgd b, final zmf c, final vdr d, final adku n, final adld e, final adpp f) {
        this.g = new HashMap();
        this.h = new Object();
        this.k = false;
        this.m = m;
        this.b = b;
        this.c = c;
        this.d = d;
        this.n = n;
        this.e = e;
        this.f = f;
    }
    
    private final void u() {
        final Object h = this.h;
        monitorenter(h);
        try {
            final int size = this.g.size();
            final Iterator iterator = this.g.values().iterator();
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            float n4 = 0.0f;
            while (iterator.hasNext()) {
                final adke adke = (adke)iterator.next();
                final int d = adke.d;
                float n5 = 1.0f;
                if (d != 3) {
                    if (d == 4) {
                        n5 = n5;
                    }
                    else {
                        n5 = adke.a * 0.12f + adke.b * 0.68f + adke.c * 0.2f;
                    }
                }
                n4 += n5 / size;
                final int n6 = d - 1;
                if (d == 0) {
                    throw null;
                }
                if (n6 != 1) {
                    if (n6 != 2) {
                        if (n6 != 3) {
                            continue;
                        }
                        ++n2;
                    }
                    else {
                        ++n;
                    }
                }
                else {
                    ++n3;
                }
            }
            final vdq b = this.d.b();
            final apih d2 = apii.d(adkf.a);
            final ahaz a = d2.a;
            final float floatValue = n4;
            a.copyOnWrite();
            final apik apik = (apik)a.instance;
            final apik a2 = apik.a;
            apik.c |= 0x2;
            apik.e = floatValue;
            final ahaz a3 = d2.a;
            final int intValue = n3;
            a3.copyOnWrite();
            final apik apik2 = (apik)a3.instance;
            apik2.c |= 0x4;
            apik2.f = intValue;
            final ahaz a4 = d2.a;
            final int intValue2 = n2;
            a4.copyOnWrite();
            final apik apik3 = (apik)a4.instance;
            apik3.c |= 0x8;
            apik3.g = intValue2;
            final ahaz a5 = d2.a;
            final int intValue3 = n;
            a5.copyOnWrite();
            final apik apik4 = (apik)a5.instance;
            apik4.c |= 0x10;
            apik4.h = intValue3;
            final apij b2 = d2.b();
            final apij j = this.j;
            if (j == null || !b2.equals((Object)j)) {
                this.j = b2;
                final apih c = b2.c();
                final long c2 = this.m.c();
                final ahaz a6 = c.a;
                final long longValue = c2;
                a6.copyOnWrite();
                final apik apik5 = (apik)a6.instance;
                apik5.c |= 0x20;
                apik5.i = longValue;
                final apij b3 = c.b();
                final veb e = ((vdw)b).e();
                ((vfw)e).d((vfn)b3);
                ((vfw)e).b();
                b3.toString();
            }
            monitorexit(h);
        }
        finally {
            monitorexit(h);
            while (true) {}
        }
    }
    
    private final void v(final admv admv, final boolean b) {
        synchronized (this.h) {
            if (admv.w && !admv.x) {
                return;
            }
            final afeq l = adkf.l;
            admt admt;
            if ((admt = admt.a(admv.l)) == null) {
                admt = admt.a;
            }
            if (!l.contains((Object)admt)) {
                return;
            }
            final String i = this.i;
            if (i != null && i.equals(admv.e)) {
                final adke adke = new adke();
                Label_0417: {
                    if (admv.ai) {
                        this.g.remove(admv.k);
                    }
                    else {
                        if (!admv.aj) {
                            final afeq a = adkq.a;
                            admu admu;
                            if ((admu = admu.a(admv.ad)) == null) {
                                admu = admu.a;
                            }
                            if (!a.contains((Object)admu)) {
                                adke.d = 2;
                                final boolean d = admv.D;
                                final float n = 0.0f;
                                if (d) {
                                    adms adms;
                                    if ((adms = admv.E) == null) {
                                        adms = adms.a;
                                    }
                                    float n2;
                                    if (!adet.y(adms)) {
                                        n2 = 0.0f;
                                    }
                                    else {
                                        n2 = 1.0f;
                                    }
                                    adke.a(n2);
                                }
                                else {
                                    adke.a(1.0f);
                                }
                                adms adms2;
                                if ((adms2 = admv.N) == null) {
                                    adms2 = adms.a;
                                }
                                float n3;
                                if (!adet.y(adms2)) {
                                    n3 = 0.0f;
                                }
                                else {
                                    n3 = 1.0f;
                                }
                                adke.c(n3);
                                adms adms3;
                                if ((adms3 = admv.ae) == null) {
                                    adms3 = adms.a;
                                }
                                float n4;
                                if (!adet.y(adms3)) {
                                    n4 = n;
                                }
                                else {
                                    n4 = 1.0f;
                                }
                                adke.b(n4);
                                if (b || this.g.containsKey(admv.k)) {
                                    this.g.put(admv.k, adke);
                                }
                                break Label_0417;
                            }
                        }
                        adke.d = 4;
                        if (b || this.g.containsKey(admv.k)) {
                            this.g.put(admv.k, adke);
                        }
                    }
                }
                this.u();
            }
        }
    }
    
    public final void a(final String s, final boolean b, final boolean b2) {
    }
    
    public final void b(final String s, final long n, final long n2) {
        final Object h = this.h;
        monitorenter(h);
        if (n2 == 0L) {
            return;
        }
        try {
            final adke adke = this.g.get(s);
            if (adke != null) {
                adke.a(n / (float)n2);
                this.u();
            }
        }
        finally {
            monitorexit(h);
        }
    }
    
    public final void c(final String s, final admz admz) {
    }
    
    public final void d(final String s, final annh annh) {
        synchronized (this.h) {
            final adke adke = this.g.get(s);
            if (adke != null) {
                adke.b((float)annh.b);
                this.u();
            }
        }
    }
    
    public final void e(final String s, final double n) {
    }
    
    public final void f(final String s, final long n, final long n2, final double n3) {
        final Object h = this.h;
        monitorenter(h);
        if (n2 == 0L) {
            return;
        }
        try {
            final adke adke = this.g.get(s);
            if (adke != null) {
                adke.c(n / (float)n2);
                this.u();
            }
        }
        finally {
            monitorexit(h);
        }
    }
    
    public final void g(final String s, final adms adms) {
    }
    
    public final void h(final admv admv) {
    }
    
    public final void i(final String s, final admv admv) {
        synchronized (this.h) {
            if (!this.g.containsKey(s)) {
                this.v(admv, true);
            }
        }
    }
    
    public final void j(final String s) {
    }
    
    public final void k(final String s, final boolean b) {
    }
    
    public final void l(final String s, final apil apil) {
    }
    
    public final void m(final String s, final String s2) {
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        if (n != -1) {
            final Class[] array;
            if (n != 0) {
                if (n == 1) {
                    final zmu zmu = (zmu)o;
                    synchronized (this.h) {
                        final vdq b = this.d.b();
                        this.g.clear();
                        final veb e = ((vdw)b).e();
                        ((vfw)e).d((vfn)apii.d(adkf.a).b());
                        ((vfw)e).b();
                        this.j = null;
                        this.i = null;
                        return array;
                    }
                }
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zms zms = (zms)o;
            synchronized (this.h) {
                final vdq b2 = this.d.b();
                this.g.clear();
                final veb e2 = ((vdw)b2).e();
                ((vfw)e2).d((vfn)apii.d(adkf.a).b());
                ((vfw)e2).b();
                this.j = null;
                this.i = zms.a().d();
                return array;
            }
        }
        return new Class[] { zms.class, zmu.class };
    }
    
    public final void n(final String s, final admu admu) {
    }
    
    public final void o(final String s, final int n) {
    }
    
    public final void p(final String s) {
    }
    
    public final void q(final String s, final admv admv) {
        synchronized (this.h) {
            this.v(admv, true);
        }
    }
    
    public final void r(final String s) {
        final Object h = this.h;
        monitorenter(h);
        try {
            try {
                final admv b = this.n.b(s);
            }
            finally {
                monitorexit(h);
                final admv b;
                while (true) {
                    monitorexit(h);
                    return;
                    iftrue(Label_0103:)(!this.g.containsKey(s));
                    this.g.get(s).d = 3;
                    this.u();
                    continue;
                    Label_0097: {
                        this.v(b, false);
                    }
                    continue;
                }
                iftrue(Label_0097:)(b != null);
            }
        }
        catch (final adkv adkv) {}
    }
    
    public final void s(final String s) {
    }
    
    public final void t() {
    }
}
