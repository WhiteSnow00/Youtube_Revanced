import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijq implements iix
{
    private final Context a;
    private final vdr b;
    private final oby c;
    private final hzn d;
    private final bhv e;
    
    public ijq(final Context a, final vdr b, final hzn d, final oby c, final bhv e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
    }
    
    private static void i(final agnl agnl, final afeq afeq) {
        final int size = ((List)afeq).size();
        int i = 0;
        int n = 0;
        while (i < size) {
            final apzm c = ((List<apzf>)afeq).get(i).c();
            int n2 = n;
            if (c != null) {
                n2 = n;
                if (c.h()) {
                    n2 = n;
                    if (c.getThumbnail() != null) {
                        final aotp thumbnail = c.getThumbnail();
                        for (int j = 0; j <= 0; ++j) {
                            ((ahaz)agnl.b).aJ((new aotp[] { thumbnail })[j]);
                        }
                        n2 = n + 1;
                        if (n2 >= 2) {
                            break;
                        }
                    }
                }
            }
            ++i;
            n = n2;
        }
    }
    
    public final int a() {
        return 156;
    }
    
    public final int b() {
        return 192;
    }
    
    public final aezp c(final String s) {
        final appk ad = glb.ad(s, this.e);
        if (ad == null) {
            return (aezp)aeyo.a;
        }
        return aezp.k((Object)glb.w(ad.c));
    }
    
    public final afft d(String w) {
        final appk ad = glb.ad(w, this.e);
        if (ad == null) {
            return (afft)afiq.a;
        }
        final String c = ad.c;
        w = glb.w(c);
        final String q = glb.Q(c);
        final apyx apyx = (apyx)this.b.b().f(q).j((Class)apyx.class).af();
        final affr i = afft.i();
        i.i((Object[])new ijj[] { (ijj)this.d.J(w), (ijj)this.d.J(q) });
        if (apyx != null) {
            i.h((Object)this.d.J(apyx.f()));
        }
        return i.g();
    }
    
    public final Class e() {
        return apyn.class;
    }
    
    public final Class f() {
        return ajhz.class;
    }
    
    public final argj g(final String s) {
        return new argj(2, s, (byte[])null);
    }
    
    public final fzw h(final vfn vfn, final String s, final iiw iiw) {
        final apyn apyn = (apyn)vfn;
        final vdq b = this.b.b();
        final ajhx d = ajhy.d(s);
        fzw fzw;
        if (apyn == null) {
            fzw = fzw.aC((vfn)d.b((vfp)b));
        }
        else {
            final apyx c = apyn.c();
            if (c == null) {
                fzw = fzw.aC((vfn)d.b((vfp)b));
            }
            else {
                final apyj c2 = c.c();
                final String playlistId = c.getPlaylistId();
                final int size = c.g().size();
                d.i(c.getTitle());
                String title;
                if (c2 == null) {
                    title = "";
                }
                else {
                    title = c2.getTitle();
                }
                d.d(title);
                final ahbb ahbb = (ahbb)((ahbh)appk.a).createBuilder();
                final String playlistId2 = c.getPlaylistId();
                ((ahaz)ahbb).copyOnWrite();
                final appk appk = (appk)ahbb.instance;
                playlistId2.getClass();
                appk.b |= 0x1;
                appk.c = playlistId2;
                ((ahaz)ahbb).copyOnWrite();
                final appk appk2 = (appk)ahbb.instance;
                appk2.b |= 0x2;
                appk2.d = 156;
                d.c(glb.v((appk)((ahaz)ahbb).build()));
                d.g(playlistId);
                final Integer value = size;
                d.k(value);
                d.l(this.a.getResources().getQuantityString(2131886174, size, new Object[] { value }));
                final appk ad = glb.ad(s, this.e);
                apza apza;
                if (ad != null && ad.ry((ahaq)ajic.b)) {
                    if ((apza = apza.b(((ajic)ad.rx((ahaq)ajic.b)).d)) == null) {
                        apza = apza.a;
                    }
                }
                else {
                    apza = apza.a;
                }
                final vdq b2 = this.b.b();
                final afeq afeq = (afeq)((vfp)b2).f(glb.Q(playlistId)).j((Class)apyx.class).C((asjr)ijp.a).W((asjr)ijp.c).u((asjr)new ijl((vfp)b2, 3)).K((asjs)ija.f).aF().J((asjr)ijp.d).ac();
                final ankd ankd = c.getThumbnailStyleDataMap().get(apza.f);
                final int ordinal = apza.ordinal();
                Label_0746: {
                    if (ordinal != 2) {
                        if (ordinal != 3 && ordinal != 4) {
                            if (ankd != null) {
                                d.h(ankd.c());
                            }
                            d.j(Integer.valueOf(42357));
                            break Label_0746;
                        }
                        final agnl a = ajhw.a();
                        a.p(apza);
                        if (ankd != null) {
                            final ankc b3 = ankd.b();
                            if (b3.b()) {
                                a.o(new aotp[] { b3.a() });
                            }
                        }
                        i(a, afeq);
                        d.f(a.m((vfp)this.b.b()).b);
                    }
                    else {
                        final agnl a2 = ajhw.a();
                        a2.p(apza);
                        final int size2 = ((List)afeq).size();
                        int i = 0;
                        int n = 0;
                        while (i < size2) {
                            final apzm c3 = ((apzf)((List)afeq).get(i)).c();
                            int n2 = n;
                            if (c3 != null) {
                                n2 = n;
                                if (c3.h()) {
                                    n2 = n;
                                    if (c3.getThumbnail() != null) {
                                        a2.o(new aotp[] { c3.getThumbnail() });
                                        n2 = ++n;
                                        if (n >= 2) {
                                            break;
                                        }
                                    }
                                }
                            }
                            ++i;
                            n = n2;
                        }
                        final int size3 = afeq.size();
                        if (size3 > 2) {
                            i(a2, afeq.b(2, size3));
                        }
                        d.f(a2.m((vfp)this.b.b()).b);
                    }
                    d.e(jgk.y(this.a.getResources(), this.c, (long)apyn.getLastSyncedTimestampMillis()));
                    d.j(Integer.valueOf(69464));
                }
                fzw = fzw.aC((vfn)d.b((vfp)b));
            }
        }
        return fzw;
    }
}
