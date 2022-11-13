import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijn implements iix
{
    private final Context a;
    private final vdr b;
    private final iiu c;
    private final hzn d;
    private final bhv e;
    private final hzn f;
    private final bhv g;
    private final fzw h;
    private final fzw i;
    
    public ijn(final Context a, final vdr b, final hzn f, final fzw h, final hzn d, final fzw i, final iiu c, final bhv e, final bhv g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.h = h;
        this.d = d;
        this.i = i;
        this.c = c;
        this.e = e;
        this.g = g;
    }
    
    private final List i(final String s, final aezf aezf) {
        return (List)this.b.b().f(glb.Q(s)).j((Class)apyx.class).X().t((asjr)ign.p).Z((asjr)new ijl(aezf, 0)).K((asjs)ija.d).aF().ac();
    }
    
    private final Set j(final List list, final aezf... array) {
        final HashSet set = new HashSet();
        for (final String s : list) {
            for (int i = 0; i < 5; ++i) {
                set.add(this.f.J((String)array[i].apply((Object)s)));
            }
        }
        return set;
    }
    
    public final int a() {
        return 156;
    }
    
    public final int b() {
        return 141;
    }
    
    public final aezp c(final String s) {
        final appk ad = glb.ad(s, this.g);
        if (ad == null) {
            return (aezp)aeyo.a;
        }
        return aezp.k((Object)glb.w(ad.c));
    }
    
    public final afft d(String s) {
        final appk ad = glb.ad(s, this.g);
        if (ad == null) {
            return (afft)afiq.a;
        }
        final String c = ad.c;
        final String w = glb.w(c);
        s = glb.Q(c);
        final List i = this.i(c, (aezf)iil.k);
        if (this.e.E()) {
            final affr j = afft.i();
            j.h((Object)this.f.J(w));
            j.h((Object)this.f.J(s));
            j.h((Object)this.h.al());
            j.h((Object)this.d.I());
            j.j((Iterable)this.j(i, (aezf)iil.l, (aezf)iil.m, (aezf)iil.n, (aezf)iil.o, (aezf)iil.p));
            final Iterator iterator = i.iterator();
            while (iterator.hasNext()) {
                s = glb.M((String)iterator.next());
                if (iiu.p((amwb)this.b.b().f(s).j((Class)amwb.class).af())) {
                    j.h((Object)this.i.an());
                    break;
                }
            }
            return j.g();
        }
        final affr k = afft.i();
        k.h((Object)this.f.J(w));
        k.h((Object)this.f.J(s));
        k.h((Object)this.h.al());
        k.h((Object)this.d.I());
        k.j((Iterable)this.j(i, (aezf)iil.l, (aezf)iil.m, (aezf)iil.n, (aezf)iil.o, (aezf)iil.p));
        return k.g();
    }
    
    public final Class e() {
        return apyn.class;
    }
    
    public final Class f() {
        return ajgq.class;
    }
    
    public final argj g(final String s) {
        return new argj(2, s, (byte[])null);
    }
    
    public final fzw h(final vfn vfn, final String s, final iiw iiw) {
        final apyn apyn = (apyn)vfn;
        final vdq b = this.b.b();
        final ajgo d = ajgp.d(s);
        final ijm ijm = (ijm)iiw;
        ijm ijm2 = new ijm(0.0f, false, (afft)afiq.a, 0);
        if (apyn != null) {
            final apyx c = apyn.c();
            float n;
            if (ijm == null) {
                n = 0.0f;
            }
            else {
                n = ijm.a;
            }
            if (c != null) {
                final List i = this.i(c.getPlaylistId(), (aezf)iil.l);
                final Iterator iterator = i.iterator();
                long n2 = 2147483647L;
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                int n6 = 0;
                boolean b2 = false;
                float n7 = 0.0f;
                while (iterator.hasNext()) {
                    final apys apys = (apys)((vfp)b).f((String)iterator.next()).j((Class)apys.class).af();
                    int n8 = n3;
                    int n9 = n4;
                    int n10 = n5;
                    long n11 = n2;
                    int n12 = n6;
                    boolean b3 = b2;
                    float q = n7;
                    if (apys != null) {
                        n8 = n3 + 1;
                        final apme a = apme.a;
                        switch (iiu.f(this.c.c(apys)).ordinal()) {
                            default: {
                                n9 = n4;
                                n10 = n5;
                                n11 = n2;
                                n12 = n6;
                                b3 = b2;
                                q = n7;
                                break;
                            }
                            case 6: {
                                n10 = 1;
                                n9 = n4;
                                n11 = n2;
                                n12 = n6;
                                b3 = b2;
                                q = n7;
                                break;
                            }
                            case 5:
                            case 7:
                            case 8: {
                                n9 = n4 + 1;
                                n10 = n5;
                                n11 = n2;
                                n12 = n6;
                                b3 = b2;
                                q = n7;
                                break;
                            }
                            case 4: {
                                final amwb c2 = apys.c();
                                n11 = n2;
                                if (c2 != null) {
                                    n11 = n2;
                                    if (iiu.p(c2)) {
                                        final long a2 = this.c.a(c2);
                                        n11 = n2;
                                        if (a2 < n2) {
                                            n11 = a2;
                                        }
                                    }
                                }
                                n9 = n4 + 1;
                                b3 = true;
                                n10 = n5;
                                n12 = n6;
                                q = n7;
                                break;
                            }
                            case 3: {
                                q = iiu.q(apys.f());
                                n12 = 1;
                                b3 = b2;
                                n11 = n2;
                                n10 = n5;
                                n9 = n4;
                                break;
                            }
                        }
                    }
                    n3 = n8;
                    n4 = n9;
                    n5 = n10;
                    n2 = n11;
                    n6 = n12;
                    b2 = b3;
                    n7 = q;
                }
                final int size = i.size();
                final afft p3 = afft.p((Collection)i);
                float n13 = 0.0f;
                apme d2 = null;
                Label_0592: {
                    apme apme = null;
                    Label_0586: {
                        Label_0582: {
                            if (n3 != n4 && size != 0) {
                                if (n5 != 0) {
                                    if (n6 == 0) {
                                        break Label_0582;
                                    }
                                }
                                else if (n6 == 0 && n4 <= 0) {
                                    apme = apme.c;
                                    break Label_0586;
                                }
                                n13 = n;
                                if (ijm != null) {
                                    n13 = n;
                                    if (!p3.equals((Object)ijm.b)) {
                                        n13 = 0.0f;
                                    }
                                }
                                final float n14 = (n4 + n7) / n3;
                                d2 = apme.d;
                                n = Math.max(n13, n14);
                                break Label_0592;
                            }
                        }
                        apme = apme.e;
                    }
                    n13 = n;
                    d2 = apme;
                }
                d.d(d2);
                final int ordinal = d2.ordinal();
                String s2;
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        s2 = this.a.getString(2132018884);
                    }
                    else if (n2 != 2147483647L && n2 != 0L) {
                        s2 = this.c.h(n2, false);
                    }
                    else {
                        s2 = "";
                    }
                }
                else {
                    s2 = this.a.getString(2132017937, new Object[] { (int)Math.max(0.0f, Math.min(n * 100.0f, 100.0f)) });
                }
                d.e(s2);
                d.c(Float.valueOf(n));
                d.i(Float.valueOf(n13));
                d.j(Boolean.valueOf(b2));
                ijm2 = new ijm(n, d2 == apme.e, p3, 0);
            }
        }
        else {
            d.d(apme.b);
        }
        return fzw.aD((vfn)d.b((vfp)b), (iiw)ijm2);
    }
}
