import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.Collection;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijt implements iix
{
    private final Context a;
    private final vdr b;
    private final iiu c;
    private final int d;
    private final hzn e;
    private final bhv f;
    
    public ijt(final Context a, final vdr b, final hzn e, final iiu c, final bhv f, final int d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.f = f;
    }
    
    public final int a() {
        return 155;
    }
    
    public final int b() {
        if (this.d != 0) {
            return 284;
        }
        return 173;
    }
    
    public final aezp c(final String s) {
        if (this.d != 0) {
            final appk ad = glb.ad(s, this.f);
            Object o;
            if (ad == null) {
                o = aeyo.a;
            }
            else {
                o = aezp.k((Object)glb.x(ad.c));
            }
            return (aezp)o;
        }
        final appk ad2 = glb.ad(s, this.f);
        Object o2;
        if (ad2 == null) {
            o2 = aeyo.a;
        }
        else {
            o2 = aezp.k((Object)glb.x(ad2.c));
        }
        return (aezp)o2;
    }
    
    public final afft d(String s) {
        final int d = this.d;
        final String s2 = null;
        final String s3 = null;
        if (d != 0) {
            final appk ad = glb.ad(s, this.f);
            Object o;
            if (ad == null) {
                o = afiq.a;
            }
            else {
                final String c = ad.c;
                final String x = glb.x(c);
                s = glb.X(c);
                final HashSet af = agqs.af((Object[])new ijj[] { (ijj)this.e.J(x), (ijj)this.e.J(s), (ijj)this.e.J(glb.M(c)), (ijj)this.e.J(glb.Z(c)), (ijj)this.e.J(glb.E(c)) });
                final apzm apzm = (apzm)this.b.b().f(s).j((Class)apzm.class).af();
                s = s3;
                if (apzm != null) {
                    s = apzm.g();
                }
                if (s != null) {
                    af.add(this.e.J(s));
                }
                o = afft.p((Collection)af);
            }
            return (afft)o;
        }
        final appk ad2 = glb.ad(s, this.f);
        Object o2;
        if (ad2 == null) {
            o2 = afiq.a;
        }
        else {
            final String c2 = ad2.c;
            final String x2 = glb.x(c2);
            s = glb.X(c2);
            final HashSet af2 = agqs.af((Object[])new ijj[] { (ijj)this.e.J(x2), (ijj)this.e.J(s), (ijj)this.e.J(glb.M(c2)), (ijj)this.e.J(glb.Z(c2)), (ijj)this.e.J(glb.E(c2)) });
            final apzm apzm2 = (apzm)this.b.b().f(s).j((Class)apzm.class).af();
            s = s2;
            if (apzm2 != null) {
                s = apzm2.g();
            }
            if (s != null) {
                af2.add(this.e.J(s));
            }
            o2 = afft.p((Collection)af2);
        }
        return (afft)o2;
    }
    
    public final Class e() {
        if (this.d != 0) {
            return apys.class;
        }
        return apys.class;
    }
    
    public final Class f() {
        if (this.d != 0) {
            return ajgw.class;
        }
        return ajje.class;
    }
    
    public final argj g(final String s) {
        if (this.d != 0) {
            return new argj(2, s, (byte[])null);
        }
        return new argj(2, s, (byte[])null);
    }
    
    public final fzw h(final vfn vfn, final String s, final iiw iiw) {
        final int d = this.d;
        final String s2 = "";
        final ajjv ajjv = null;
        final ajjv ajjv2 = null;
        int intValue = 0;
        if (d != 0) {
            final apys apys = (apys)vfn;
            final vdq b = this.b.b();
            final ajgu d2 = ajgv.d(s);
            if (apys != null) {
                final ancy f = apys.f();
                ajjv c = ajjv2;
                if (f != null) {
                    c = f.c();
                }
                final boolean i = this.c.i(apys.c(), c);
                final boolean j = this.c.j(apys.c(), c);
                final apzm g = apys.g();
                if (g != null) {
                    final apyj f2 = g.f();
                    final apnp c2 = g.c();
                    final boolean b2 = c2 != null && !i && !this.c.n(apys, (long)c2.getLastPlaybackPositionSeconds());
                    String s3;
                    if (j) {
                        s3 = this.a.getString(2132018033);
                    }
                    else {
                        s3 = g.getTitle();
                    }
                    d2.j(s3);
                    String title = s2;
                    if (!j) {
                        if (f2 == null) {
                            title = s2;
                        }
                        else {
                            title = f2.getTitle();
                        }
                    }
                    d2.e(title);
                    int intValue2;
                    if (b2) {
                        intValue2 = c2.getLastPlaybackPositionSeconds().intValue();
                    }
                    else {
                        intValue2 = 0;
                    }
                    d2.f(Integer.valueOf(intValue2));
                    d2.l(g.getVideoId());
                    d2.h(this.c.g((long)g.getPublishedTimestampMillis()));
                    d2.n(g.getLocalizedStrings().c);
                    d2.k(Integer.valueOf(134956));
                    final ahaz builder = ((ahbh)aiab.a).createBuilder();
                    final String string = this.a.getString(2132018836);
                    builder.copyOnWrite();
                    final aiab aiab = (aiab)builder.instance;
                    string.getClass();
                    aiab.b |= 0x1;
                    aiab.c = string;
                    d2.c(new aiab[] { (aiab)builder.build() });
                    if (!j) {
                        d2.i(g.getThumbnail());
                        if (f2 != null && f2.c()) {
                            d2.d(f2.getAvatar());
                        }
                    }
                    if (!i) {
                        d2.m(g.getLengthSeconds());
                    }
                    d2.b((vfp)b);
                }
            }
            return fzw.aC((vfn)d2.b((vfp)b));
        }
        final apys apys2 = (apys)vfn;
        final vdq b3 = this.b.b();
        final ajjc d3 = ajjd.d(s);
        if (apys2 != null) {
            final ancy f3 = apys2.f();
            ajjv c3 = ajjv;
            if (f3 != null) {
                c3 = f3.c();
            }
            final boolean k = this.c.i(apys2.c(), c3);
            final boolean l = this.c.j(apys2.c(), c3);
            final apzm g2 = apys2.g();
            if (g2 != null) {
                final apyj f4 = g2.f();
                final apnp c4 = g2.c();
                final boolean b4 = c4 != null && !k && !this.c.n(apys2, (long)c4.getLastPlaybackPositionSeconds());
                String s4;
                if (l) {
                    s4 = this.a.getString(2132018033);
                }
                else {
                    s4 = g2.getTitle();
                }
                d3.j(s4);
                String title2 = s2;
                if (!l) {
                    if (f4 == null) {
                        title2 = s2;
                    }
                    else {
                        title2 = f4.getTitle();
                    }
                }
                d3.d(title2);
                final ahbb ahbb = (ahbb)((ahbh)appk.a).createBuilder();
                final String videoId = g2.getVideoId();
                ((ahaz)ahbb).copyOnWrite();
                final appk appk = (appk)ahbb.instance;
                videoId.getClass();
                appk.b |= 0x1;
                appk.c = videoId;
                ((ahaz)ahbb).copyOnWrite();
                final appk appk2 = (appk)ahbb.instance;
                appk2.b |= 0x2;
                appk2.d = 155;
                d3.c(glb.v((appk)((ahaz)ahbb).build()));
                if (b4) {
                    intValue = c4.getLastPlaybackPositionSeconds().intValue();
                }
                d3.g(Integer.valueOf(intValue));
                d3.k(g2.getVideoId());
                d3.e(Boolean.valueOf(true));
                d3.f(Boolean.valueOf(tpe.bq(this.a)));
                final ahaz a = d3.a;
                final int intValue3 = 42356;
                a.copyOnWrite();
                final ajjf ajjf = (ajjf)a.instance;
                final ajjf a2 = ajjf.a;
                ajjf.c |= 0x800;
                ajjf.o = intValue3;
                d3.h(this.c.g((long)g2.getPublishedTimestampMillis()));
                d3.m(g2.getLocalizedStrings().c);
                if (!l) {
                    d3.i(g2.getThumbnail());
                }
                if (!k) {
                    d3.l(g2.getLengthSeconds());
                }
                if (!k && !l) {
                    final iiu c5 = this.c;
                    final afel d4 = afeq.d();
                    final ancy f5 = apys2.f();
                    afeq afeq;
                    if (f5 == null) {
                        afeq = d4.g();
                    }
                    else {
                        final ajjv c6 = f5.c();
                        if (c6 != null && !c6.getLicenses().isEmpty()) {
                            final aiab e = c5.e(c6);
                            if (e != null) {
                                d4.h((Object)e);
                            }
                            afeq = d4.g();
                        }
                        else {
                            afeq = d4.g();
                        }
                    }
                    if (afeq != null) {
                        if (!((List)afeq).isEmpty()) {
                            final afkf d5 = afeq.D();
                            while (((Iterator)d5).hasNext()) {
                                d3.a.aK((aiab)((Iterator)d5).next());
                            }
                        }
                    }
                }
                d3.b((vfp)b3);
            }
        }
        return fzw.aC((vfn)d3.b((vfp)b3));
    }
}
