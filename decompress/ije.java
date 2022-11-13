import java.util.HashSet;
import java.util.Collection;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ije implements iix
{
    private final Context a;
    private final vdr b;
    private final zmf c;
    private final iiu d;
    private final int e;
    private final hzn f;
    private final bhv g;
    
    public ije(final Context a, final vdr b, final hzn f, final zmf c, final iiu d, final bhv g, final int e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = d;
        this.g = g;
    }
    
    private final vfp i() {
        return (vfp)this.b.a(this.c.c());
    }
    
    private final vfp j() {
        return (vfp)this.b.a(this.c.c());
    }
    
    public final int a() {
        return 261;
    }
    
    public final int b() {
        if (this.e != 0) {
            return 284;
        }
        return 173;
    }
    
    public final aezp c(final String s) {
        if (this.e != 0) {
            final appk ad = glb.ad(s, this.g);
            Object o;
            if (ad == null) {
                o = aeyo.a;
            }
            else {
                o = aezp.k((Object)glb.J(ad.c));
            }
            return (aezp)o;
        }
        final appk ad2 = glb.ad(s, this.g);
        Object o2;
        if (ad2 == null) {
            o2 = aeyo.a;
        }
        else {
            o2 = aezp.k((Object)glb.J(ad2.c));
        }
        return (aezp)o2;
    }
    
    public final afft d(String s) {
        final int e = this.e;
        final String s2 = null;
        final String s3 = null;
        if (e != 0) {
            final appk ad = glb.ad(s, this.g);
            Object o;
            if (ad == null) {
                o = afiq.a;
            }
            else {
                final String c = ad.c;
                s = glb.J(c);
                final HashSet af = agqs.af((Object[])new ijj[] { (ijj)this.f.J(s), (ijj)this.f.J(glb.M(c)), (ijj)this.f.J(glb.Z(c)), (ijj)this.f.J(glb.E(c)), (ijj)this.f.J(glb.Y(c)) });
                final amar amar = (amar)this.j().f(s).j((Class)amar.class).af();
                s = s3;
                if (amar != null) {
                    s = amar.h();
                }
                if (s != null) {
                    af.add(this.f.J(s));
                }
                o = afft.p((Collection)af);
            }
            return (afft)o;
        }
        final appk ad2 = glb.ad(s, this.g);
        Object o2;
        if (ad2 == null) {
            o2 = afiq.a;
        }
        else {
            final String c2 = ad2.c;
            s = glb.J(c2);
            final HashSet af2 = agqs.af((Object[])new ijj[] { (ijj)this.f.J(s), (ijj)this.f.J(glb.M(c2)), (ijj)this.f.J(glb.Z(c2)), (ijj)this.f.J(glb.E(c2)), (ijj)this.f.J(glb.Y(c2)) });
            final amar amar2 = (amar)this.i().f(s).j((Class)amar.class).af();
            s = s2;
            if (amar2 != null) {
                s = amar2.h();
            }
            if (s != null) {
                af2.add(this.f.J(s));
            }
            o2 = afft.p((Collection)af2);
        }
        return (afft)o2;
    }
    
    public final Class e() {
        if (this.e != 0) {
            return amar.class;
        }
        return amar.class;
    }
    
    public final Class f() {
        if (this.e != 0) {
            return ajgw.class;
        }
        return ajje.class;
    }
    
    public final argj g(final String s) {
        if (this.e != 0) {
            return new argj(2, s, (byte[])null);
        }
        return new argj(2, s, (byte[])null);
    }
    
    public final fzw h(final vfn vfn, String s, final iiw iiw) {
        final int e = this.e;
        final String s2 = "";
        long n = 0L;
        final ajjv ajjv = null;
        ajjv c = null;
        final int n2 = 0;
        if (e != 0) {
            final amar amar = (amar)vfn;
            final vfp j = this.j();
            final ajgu d = ajgv.d(s);
            if (amar != null) {
                final amam c2 = amar.c();
                ancy f;
                if (c2 != null) {
                    f = c2.f();
                }
                else {
                    f = null;
                }
                amwb f2;
                if (f != null) {
                    f2 = f.f();
                }
                else {
                    f2 = null;
                }
                if (f != null) {
                    c = f.c();
                }
                final boolean i = this.d.i(f2, c);
                final boolean k = this.d.j(f2, c);
                final apyj g = amar.g();
                final apnp apnp = (apnp)j.f(amar.getUserState().c).j((Class)apnp.class).af();
                if (apnp != null) {
                    n = apnp.getLastPlaybackPositionSeconds();
                }
                final boolean b = apnp != null && !i && !this.d.m(amar, n);
                String s3;
                if (k) {
                    s3 = this.a.getString(2132018033);
                }
                else {
                    s3 = amar.getTitle();
                }
                d.j(s3);
                String title = s2;
                if (!k) {
                    if (g == null) {
                        title = s2;
                    }
                    else {
                        title = g.getTitle();
                    }
                }
                d.e(title);
                int n3;
                if (b) {
                    n3 = (int)n;
                }
                else {
                    n3 = 0;
                }
                d.f(Integer.valueOf(n3));
                d.l(amar.getVideoId());
                d.h(this.d.g((long)amar.getPublishedTimestampMillis()));
                d.n(amar.getLocalizedStrings().c);
                d.k(Integer.valueOf(134956));
                final ahaz builder = ((ahbh)aiab.a).createBuilder();
                final String string = this.a.getString(2132018836);
                builder.copyOnWrite();
                final aiab aiab = (aiab)builder.instance;
                string.getClass();
                aiab.b |= 0x1;
                aiab.c = string;
                d.c(new aiab[] { (aiab)builder.build() });
                if (!k) {
                    d.i(amar.getThumbnail());
                    if (g != null && g.c()) {
                        d.d(g.getAvatar());
                    }
                }
                if (!i) {
                    d.m(amar.getLengthSeconds());
                }
            }
            return fzw.aC((vfn)d.b(j));
        }
        final amar amar2 = (amar)vfn;
        final vfp l = this.i();
        final ajjc d2 = ajjd.d(s);
        if (amar2 != null) {
            final amam c3 = amar2.c();
            ancy f3;
            if (c3 != null) {
                f3 = c3.f();
            }
            else {
                f3 = null;
            }
            amwb f4;
            if (f3 != null) {
                f4 = f3.f();
            }
            else {
                f4 = null;
            }
            ajjv c4 = ajjv;
            if (f3 != null) {
                c4 = f3.c();
            }
            final boolean m = this.d.i(f4, c4);
            final boolean j2 = this.d.j(f4, c4);
            final apyj g2 = amar2.g();
            final apnp apnp2 = (apnp)l.f(amar2.getUserState().c).j((Class)apnp.class).af();
            if (apnp2 != null) {
                n = apnp2.getLastPlaybackPositionSeconds();
            }
            final boolean b2 = apnp2 != null && !m && !this.d.m(amar2, n);
            if (j2) {
                s = this.a.getString(2132018033);
            }
            else {
                s = amar2.getTitle();
            }
            d2.j(s);
            s = s2;
            if (!j2) {
                if (g2 == null) {
                    s = s2;
                }
                else {
                    s = g2.getTitle();
                }
            }
            d2.d(s);
            final ahbb ahbb = (ahbb)((ahbh)appk.a).createBuilder();
            final String videoId = amar2.getVideoId();
            ((ahaz)ahbb).copyOnWrite();
            final appk appk = (appk)ahbb.instance;
            videoId.getClass();
            appk.b |= 0x1;
            appk.c = videoId;
            ((ahaz)ahbb).copyOnWrite();
            final appk appk2 = (appk)ahbb.instance;
            appk2.b |= 0x2;
            appk2.d = 261;
            d2.c(glb.v((appk)((ahaz)ahbb).build()));
            int n4;
            if (b2) {
                n4 = (int)n;
            }
            else {
                n4 = 0;
            }
            d2.g(Integer.valueOf(n4));
            d2.k(amar2.getVideoId());
            d2.e(Boolean.valueOf(true));
            d2.f(Boolean.valueOf(tpe.bq(this.a)));
            d2.h(this.d.g((long)amar2.getPublishedTimestampMillis()));
            d2.m(amar2.getLocalizedStrings().c);
            if (!j2) {
                d2.i(amar2.getThumbnail());
            }
            if (!m) {
                d2.l(amar2.getLengthSeconds());
            }
            if (c4 != null && !m && !j2) {
                final aiab e2 = this.d.e(c4);
                if (e2 != null) {
                    for (int n5 = n2; n5 <= 0; ++n5) {
                        d2.a.aK((new aiab[] { e2 })[n5]);
                    }
                }
            }
        }
        return fzw.aC((vfn)d2.b(l));
    }
}
