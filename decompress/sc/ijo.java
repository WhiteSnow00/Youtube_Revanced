import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijo implements iix
{
    private final Context a;
    private final vdr b;
    private final oby c;
    private final hzn d;
    private final bhv e;
    
    public ijo(final Context a, final vdr b, final hzn d, final oby c, final bhv e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
                            final aotp aotp = (new aotp[] { thumbnail })[j];
                            final ahaz ahaz = (ahaz)agnl.b;
                            ahaz.copyOnWrite();
                            final ajgx ajgx = (ajgx)ahaz.instance;
                            final ajgx a = ajgx.a;
                            aotp.getClass();
                            final ahbx d = ajgx.d;
                            if (!d.c()) {
                                ajgx.d = ahbh.mutableCopy(d);
                            }
                            ajgx.d.add((Object)aotp);
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
        return 284;
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
        return ajgw.class;
    }
    
    public final argj g(final String s) {
        return new argj(2, s, (byte[])null);
    }
    
    public final fzw h(final vfn vfn, final String s, final iiw iiw) {
        final apyn apyn = (apyn)vfn;
        final vdq b = this.b.b();
        final ajgu d = ajgv.d(s);
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
                final ahaz a = d.a;
                final boolean booleanValue = (boolean)true;
                a.copyOnWrite();
                final ajgy ajgy = (ajgy)a.instance;
                final ajgy a2 = ajgy.a;
                ajgy.c |= 0x80;
                ajgy.m = booleanValue;
                d.j(c.getTitle());
                String title;
                if (c2 == null) {
                    title = "";
                }
                else {
                    title = c2.getTitle();
                }
                d.e(title);
                final ahaz a3 = d.a;
                a3.copyOnWrite();
                final ajgy ajgy2 = (ajgy)a3.instance;
                playlistId.getClass();
                ajgy2.c |= 0x100;
                ajgy2.n = playlistId;
                final Integer value = size;
                final ahaz a4 = d.a;
                final int intValue = value;
                a4.copyOnWrite();
                final ajgy ajgy3 = (ajgy)a4.instance;
                ajgy3.c |= 0x400;
                ajgy3.p = intValue;
                final String quantityString = this.a.getResources().getQuantityString(2131886174, size, new Object[] { value });
                final ahaz a5 = d.a;
                a5.copyOnWrite();
                final ajgy ajgy4 = (ajgy)a5.instance;
                quantityString.getClass();
                ajgy4.c |= 0x200;
                ajgy4.o = quantityString;
                final ahaz builder = ((ahbh)aiab.a).createBuilder();
                final String string = this.a.getString(2132018836);
                builder.copyOnWrite();
                final aiab aiab = (aiab)builder.instance;
                string.getClass();
                aiab.b |= 0x1;
                aiab.c = string;
                d.c(new aiab[] { (aiab)builder.build() });
                final appk ad = glb.ad(s, this.e);
                apza apza;
                if (ad != null && ad.ry((ahaq)ajgz.b)) {
                    if ((apza = apza.b(((ajgz)ad.rx((ahaq)ajgz.b)).d)) == null) {
                        apza = apza.a;
                    }
                }
                else {
                    apza = apza.a;
                }
                final vdq b2 = this.b.b();
                final afeq afeq = (afeq)((vfp)b2).f(glb.Q(playlistId)).j((Class)apyx.class).C((asjr)ign.q).W((asjr)ign.r).u((asjr)new ijl((vfp)b2, 2)).K((asjs)ija.e).aF().J((asjr)ijp.b).ac();
                final ankd ankd = c.getThumbnailStyleDataMap().get(apza.f);
                final int ordinal = apza.ordinal();
                Label_0947: {
                    if (ordinal != 2) {
                        if (ordinal != 3 && ordinal != 4) {
                            if (ankd != null) {
                                d.i(ankd.c());
                            }
                            d.k(Integer.valueOf(138481));
                            break Label_0947;
                        }
                        final agnl a6 = ajgt.a();
                        a6.s(apza);
                        if (ankd != null) {
                            final ankc b3 = ankd.b();
                            if (b3.b()) {
                                a6.r(new aotp[] { b3.a() });
                            }
                        }
                        i(a6, afeq);
                        d.g(a6.q((vfp)this.b.b()).b);
                    }
                    else {
                        final agnl a7 = ajgt.a();
                        a7.s(apza);
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
                                        a7.r(new aotp[] { c3.getThumbnail() });
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
                            i(a7, afeq.b(2, size3));
                        }
                        d.g(a7.q((vfp)this.b.b()).b);
                    }
                    final String y = jgk.y(this.a.getResources(), this.c, (long)apyn.getLastSyncedTimestampMillis());
                    final ahaz a8 = d.a;
                    a8.copyOnWrite();
                    final ajgy ajgy5 = (ajgy)a8.instance;
                    y.getClass();
                    ajgy5.c |= 0x2000;
                    ajgy5.q = y;
                    d.k(Integer.valueOf(138482));
                }
                fzw = fzw.aC((vfn)d.b((vfp)b));
            }
        }
        return fzw;
    }
}
