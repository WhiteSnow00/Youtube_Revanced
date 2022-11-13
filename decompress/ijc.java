import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.Collection;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijc implements iix
{
    private final Context a;
    private final vdr b;
    private final vef c;
    private final vai d;
    private final hzn e;
    private final bhv f;
    
    public ijc(final Context a, final vdr b, final vef c, final hzn e, final bhv f, final vai d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.f = f;
        this.d = d;
    }
    
    public final int a() {
        return 137;
    }
    
    public final int b() {
        return 199;
    }
    
    public final aezp c(final String s) {
        final appk ad = glb.ad(s, this.f);
        if (ad == null) {
            return (aezp)aeyo.a;
        }
        return aezp.k((Object)glb.U(ad.c));
    }
    
    public final afft d(String s) {
        final vee b = this.c.b();
        final appk ad = glb.ad(s, this.f);
        if (ad == null) {
            return (afft)afiq.a;
        }
        final String c = ad.c;
        s = glb.U(c);
        final String x = glb.X(c);
        final HashSet af = agqs.af((Object[])new ijj[] { (ijj)this.e.H(s), (ijj)this.e.H(x) });
        final apzm apzm = (apzm)b.f(x).j((Class)apzm.class).af();
        if (apzm != null) {
            s = apzm.g();
        }
        else {
            s = null;
        }
        if (s != null) {
            af.add(this.e.H(s));
        }
        return afft.p((Collection)af);
    }
    
    public final Class e() {
        return alzx.class;
    }
    
    public final Class f() {
        return ajih.class;
    }
    
    public final argj g(final String s) {
        return new argj(1, s, (byte[])null);
    }
    
    public final /* bridge */ fzw h(final vfn vfn, final String d, final iiw iiw) {
        final alzx alzx = (alzx)vfn;
        d.getClass();
        adkp.R(d.isEmpty() ^ true, "key cannot be empty");
        final ahaz builder = ajii.a.createBuilder();
        builder.copyOnWrite();
        final ajii ajii = (ajii)builder.instance;
        ajii.c |= 0x1;
        ajii.d = d;
        final ajif ajif = new ajif(builder);
        if (alzx != null) {
            final apzm c = alzx.c();
            if (c != null) {
                final apyj f = c.f();
                final aotp thumbnail = c.getThumbnail();
                final ahaz a = ajif.a;
                a.copyOnWrite();
                final ajii ajii2 = (ajii)a.instance;
                thumbnail.getClass();
                ajii2.e = thumbnail;
                ajii2.c |= 0x2;
                final String title = c.getTitle();
                final ahaz a2 = ajif.a;
                a2.copyOnWrite();
                final ajii ajii3 = (ajii)a2.instance;
                title.getClass();
                ajii3.c |= 0x4;
                ajii3.f = title;
                String title2;
                if (f == null) {
                    title2 = "";
                }
                else {
                    title2 = f.getTitle();
                }
                final ahaz a3 = ajif.a;
                a3.copyOnWrite();
                final ajii ajii4 = (ajii)a3.instance;
                title2.getClass();
                ajii4.c |= 0x8;
                ajii4.g = title2;
                final Integer lengthSeconds = c.getLengthSeconds();
                final ahaz a4 = ajif.a;
                final int intValue = lengthSeconds;
                a4.copyOnWrite();
                final ajii ajii5 = (ajii)a4.instance;
                ajii5.c |= 0x10;
                ajii5.h = intValue;
                final String string = tpe.ad(this.a.getResources(), (CharSequence)tvb.j((long)c.getLengthSeconds())).toString();
                final ahaz a5 = ajif.a;
                a5.copyOnWrite();
                final ajii ajii6 = (ajii)a5.instance;
                string.getClass();
                ajii6.c |= 0x20;
                ajii6.i = string;
                final ahbb ahbb = (ahbb)((ahbh)appk.a).createBuilder();
                final String videoId = c.getVideoId();
                ((ahaz)ahbb).copyOnWrite();
                final appk appk = (appk)ahbb.instance;
                videoId.getClass();
                appk.b |= 0x1;
                appk.c = videoId;
                int d2;
                if (!this.d.ax()) {
                    d2 = 155;
                }
                else {
                    d2 = 261;
                }
                ((ahaz)ahbb).copyOnWrite();
                final appk appk2 = (appk)ahbb.instance;
                appk2.b |= 0x2;
                appk2.d = d2;
                final String v = glb.v((appk)((ahaz)ahbb).build());
                final ahaz a6 = ajif.a;
                a6.copyOnWrite();
                final ajii ajii7 = (ajii)a6.instance;
                v.getClass();
                ajii7.c |= 0x40;
                ajii7.j = v;
                final String videoId2 = c.getVideoId();
                final ahaz a7 = ajif.a;
                a7.copyOnWrite();
                final ajii ajii8 = (ajii)a7.instance;
                videoId2.getClass();
                ajii8.c |= 0x80;
                ajii8.k = videoId2;
                final String c2 = c.getLocalizedStrings().c;
                final ahaz a8 = ajif.a;
                a8.copyOnWrite();
                final ajii ajii9 = (ajii)a8.instance;
                c2.getClass();
                ajii9.c |= 0x100;
                ajii9.l = c2;
                final List formats = alzx.getFormats();
                if (formats != null) {
                    if (!formats.isEmpty()) {
                        for (final ajfu ajfu : formats) {
                            final ahaz a9 = ajif.a;
                            a9.copyOnWrite();
                            final ajii ajii10 = (ajii)a9.instance;
                            ajfu.getClass();
                            final ahbx m = ajii10.m;
                            if (!m.c()) {
                                ajii10.m = ahbh.mutableCopy(m);
                            }
                            ajii10.m.add((Object)ajfu);
                        }
                    }
                }
                final ahab scoringTrackingParams = alzx.getScoringTrackingParams();
                final ahaz a10 = ajif.a;
                a10.copyOnWrite();
                final ajii ajii11 = (ajii)a10.instance;
                scoringTrackingParams.getClass();
                ajii11.c |= 0x200;
                ajii11.n = scoringTrackingParams;
            }
        }
        return fzw.aC((vfn)ajif.b((vfp)this.b.b()));
    }
}
