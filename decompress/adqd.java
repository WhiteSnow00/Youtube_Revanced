import java.util.Iterator;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class adqd
{
    public final CopyOnWriteArrayList a;
    private final Map b;
    private final adnk c;
    private final adms d;
    private final adnc e;
    
    public adqd(final Map b, final adnk c, final adms d, final adnc e) {
        this.a = new CopyOnWriteArrayList();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final adne adne) {
        final adoj a = adne.a;
        final adoj b = adne.b;
        if ((a == null && b == null) || (a != null && a.equals(b))) {
            return;
        }
        if (a == null) {
            b.getClass();
            final boolean i = this.c.i();
            final boolean h = this.c.h();
            adoj adoj = null;
            Label_0356: {
                if (!i) {
                    adoj = b;
                    if (!h) {
                        break Label_0356;
                    }
                }
                final ahcr builder = b.toBuilder();
                if ((((adoj)builder.instance).c & 0x200) == 0x0) {
                    final adog a2 = adog.a;
                    builder.copyOnWrite();
                    final adoj adoj2 = (adoj)builder.instance;
                    a2.getClass();
                    adoj2.N = a2;
                    adoj2.c |= 0x200;
                }
                adog adog;
                if ((adog = ((adoj)builder.instance).N) == null) {
                    adog = adog.a;
                }
                apkh apkh;
                if ((apkh = apkh.b(adog.d)) == null) {
                    apkh = apkh.a;
                }
                if (apkh == apkh.a) {
                    final ahcr builder2 = adog.a.createBuilder();
                    if (i) {
                        final apkh h2 = apkh.h;
                        builder2.copyOnWrite();
                        final adog adog2 = (adog)builder2.instance;
                        adog2.d = h2.aD;
                        adog2.b |= 0x2;
                    }
                    else {
                        final apkh j = apkh.i;
                        builder2.copyOnWrite();
                        final adog adog3 = (adog)builder2.instance;
                        adog3.d = j.aD;
                        adog3.b |= 0x2;
                    }
                    builder.copyOnWrite();
                    final adoj adoj3 = (adoj)builder.instance;
                    final adog n = (adog)builder2.build();
                    n.getClass();
                    adoj3.N = n;
                    adoj3.c |= 0x200;
                }
                adoj = (adoj)builder.build();
            }
            this.d.h(adoj);
            return;
        }
        final String e = a.e;
        final String k = a.k;
        if (b == null) {
            this.d.k(k, a.ai);
            this.e.d(k);
            return;
        }
        if (!TextUtils.equals((CharSequence)b.e, (CharSequence)e)) {
            throw new AssertionError((Object)"Identity associated with an upload job must not change");
        }
        if (TextUtils.equals((CharSequence)b.k, (CharSequence)k)) {
            if (!this.b(b)) {
                final Iterator iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    ((adqc)iterator.next()).x(b.k);
                }
            }
            adog adog4;
            if ((adog4 = a.N) == null) {
                adog4 = adog.a;
            }
            final long g = adog4.g;
            final adog n2 = b.N;
            adog a3;
            if (n2 == null) {
                a3 = adog.a;
            }
            else {
                a3 = n2;
            }
            if (g != a3.g) {
                final adms d = this.d;
                adog a4;
                if ((a4 = n2) == null) {
                    a4 = adog.a;
                }
                d.g(k, a4);
            }
            if (!TextUtils.equals((CharSequence)a.ac, (CharSequence)b.ac)) {
                this.d.m(k, b.ac);
            }
            apkx apkx;
            if ((apkx = a.af) == null) {
                apkx = apkx.a;
            }
            apkx apkx2;
            if ((apkx2 = b.af) == null) {
                apkx2 = apkx.a;
            }
            if (!((ahcz)apkx).equals(apkx2)) {
                final adms d2 = this.d;
                apkx apkx3;
                if ((apkx3 = b.af) == null) {
                    apkx3 = apkx.a;
                }
                d2.l(k, apkx3);
            }
            adoi adoi;
            if ((adoi = adoi.a(a.ad)) == null) {
                adoi = adoi.a;
            }
            final int ad = b.ad;
            adoi adoi2;
            if ((adoi2 = adoi.a(ad)) == null) {
                adoi2 = adoi.a;
            }
            if (adoi != adoi2) {
                final adms d3 = this.d;
                adoi adoi3;
                if ((adoi3 = adoi.a(ad)) == null) {
                    adoi3 = adoi.a;
                }
                d3.n(k, adoi3);
            }
            if (adgg.k(a) != adgg.k(b)) {
                this.d.o(k, adgg.v(b));
            }
            final boolean ai = a.ai;
            final boolean ai2 = b.ai;
            if (ai != ai2) {
                this.d.a(k, ai2, false);
            }
            else if (ai && !a.aj && b.aj) {
                this.d.a(k, true, true);
            }
            final boolean aj = a.aj;
            final boolean aj2 = b.aj;
            if (aj != aj2 && aj2) {
                this.d.j(k);
            }
            adon adon;
            if ((adon = a.i) == null) {
                adon = adon.a;
            }
            adon adon2;
            if ((adon2 = b.i) == null) {
                adon2 = adon.a;
            }
            if (!aexq.c(adon, adon2)) {
                this.d.c(k, adon2);
            }
            return;
        }
        throw new AssertionError((Object)"Frontend upload id of an upload job must not change");
    }
    
    public final boolean b(final adoj adoj) {
        adoh adoh;
        if ((adoh = adoh.a(adoj.l)) == null) {
            adoh = adoh.a;
        }
        final adqx adqx = this.b.get(adoh.h);
        return adqx != null && adqx.a(adoj);
    }
}
