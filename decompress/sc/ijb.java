import java.util.Iterator;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijb implements iix
{
    private final Context a;
    private final zmf b;
    private final vdr c;
    private final oby d;
    private final hzn e;
    private final bhv f;
    
    public ijb(final Context a, final zmf b, final vdr c, final hzn e, final oby d, final bhv f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
        this.f = f;
    }
    
    private final afeq j(final afeq afeq) {
        return (afeq)asht.U((Iterable)afeq).Z((asjr)ign.m).u((asjr)new ijl(this, 1)).K((asjs)ija.c).Z((asjr)ign.n).ar(2L).aF().J((asjr)ign.l).ac();
    }
    
    public final int a() {
        return 306;
    }
    
    public final int b() {
        return 192;
    }
    
    public final aezp c(final String s) {
        final appk ad = glb.ad(s, this.f);
        if (ad == null) {
            return (aezp)aeyo.a;
        }
        return aezp.k((Object)glb.H(ad.c));
    }
    
    public final afft d(String h) {
        final appk ad = glb.ad(h, this.f);
        if (ad == null) {
            return (afft)afiq.a;
        }
        final String c = ad.c;
        h = glb.H(c);
        final String r = glb.R(c);
        final alzj alzj = (alzj)this.i().f(h).j((Class)alzj.class).af();
        final affr i = afft.i();
        i.i((Object[])new ijj[] { (ijj)this.e.J(h), (ijj)this.e.J(r) });
        if (alzj != null) {
            i.h((Object)this.e.J(alzj.c.f));
        }
        return i.g();
    }
    
    public final Class e() {
        return alzj.class;
    }
    
    public final Class f() {
        return ajhz.class;
    }
    
    public final argj g(final String s) {
        return new argj(2, s, (byte[])null);
    }
    
    public final fzw h(vfn b, final String s, final iiw iiw) {
        final alzj alzj = (alzj)b;
        final vfp i = this.i();
        final ajhx d = ajhy.d(s);
        fzw fzw;
        if (alzj == null) {
            fzw = fzw.aC((vfn)d.b(i));
        }
        else {
            final alze c = alzj.c();
            if (c == null) {
                fzw = fzw.aC((vfn)d.b(i));
            }
            else {
                b = alzj.b.b(alzj.c.f);
                adkp.R(b == null || b instanceof apyj, "entityFromStore is not instance of YtMainChannelEntityModel, key=channelOwner");
                final apyj apyj = (apyj)b;
                final String playlistId = alzj.getPlaylistId();
                final int size = alzj.f().size();
                d.i(alzj.getTitle());
                String title;
                if (apyj == null) {
                    title = "";
                }
                else {
                    title = apyj.getTitle();
                }
                d.d(title);
                final ahbb ahbb = (ahbb)((ahbh)appk.a).createBuilder();
                ((ahaz)ahbb).copyOnWrite();
                final appk appk = (appk)ahbb.instance;
                playlistId.getClass();
                appk.b |= 0x1;
                appk.c = playlistId;
                ((ahaz)ahbb).copyOnWrite();
                final appk appk2 = (appk)ahbb.instance;
                appk2.b |= 0x2;
                appk2.d = 306;
                d.c(glb.v((appk)((ahaz)ahbb).build()));
                d.g(playlistId);
                final Integer value = size;
                d.k(value);
                d.l(this.a.getResources().getQuantityString(2131886174, size, new Object[] { value }));
                final appk ad = glb.ad(s, this.f);
                apza apza;
                if (ad != null && ad.ry((ahaq)ajic.b)) {
                    if ((apza = apza.b(((ajic)ad.rx((ahaq)ajic.b)).d)) == null) {
                        apza = apza.a;
                    }
                }
                else {
                    apza = apza.a;
                }
                final afeq afeq = (afeq)asht.U((Iterable)alzj.f()).u((asjr)new hvs(this, 20)).K((asjs)ija.a).aF().J((asjr)ign.l).ac();
                final ankd ankd = alzj.getThumbnailStyleDataMap().get(apza.f);
                final int ordinal = apza.ordinal();
                Label_0711: {
                    if (ordinal != 2) {
                        if (ordinal != 3 && ordinal != 4) {
                            if (ankd != null) {
                                d.h(ankd.c());
                            }
                            d.j(Integer.valueOf(42357));
                            break Label_0711;
                        }
                        final agnl a = ajhw.a();
                        a.p(apza);
                        if (ankd != null) {
                            final ankc b2 = ankd.b();
                            if (b2.b()) {
                                a.o(new aotp[] { b2.a() });
                            }
                        }
                        a.n((List)this.j(afeq));
                        d.f(a.m(this.i()).b);
                    }
                    else {
                        final agnl a2 = ajhw.a();
                        a2.p(apza);
                        final afeq j = this.j(afeq);
                        if (j != null) {
                            if (!((List)j).isEmpty()) {
                                final Iterator iterator = ((List)j).iterator();
                                while (iterator.hasNext()) {
                                    ((ahaz)a2.b).aI((aotp)iterator.next());
                                }
                            }
                        }
                        final int size2 = afeq.size();
                        if (size2 > 2) {
                            a2.n((List)this.j(afeq.b(2, size2)));
                        }
                        d.f(a2.m(this.i()).b);
                    }
                    d.e(jgk.y(this.a.getResources(), this.d, (long)c.getLastSyncedTimestampMillis()));
                    d.j(Integer.valueOf(69464));
                }
                fzw = fzw.aC((vfn)d.b(i));
            }
        }
        return fzw;
    }
    
    public final vfp i() {
        return (vfp)this.c.a(this.b.c());
    }
}
