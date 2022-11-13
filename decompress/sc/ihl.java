import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Collection;
import java.util.Set;
import java.util.Collections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.List;
import android.content.Context;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import com.google.android.apps.youtube.app.player.DefaultVideoStageMonitor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihl implements asjm
{
    public final Object a;
    private final int b;
    
    public ihl(final atiy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ihl(final DefaultVideoStageMonitor a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ihl(final YouTubePlayerViewNotForReflection a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ihl(final inf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ihl(final iox a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ihl(final ipl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ihl(final irk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ihl(final iru a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ihl(final isa a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public ihl(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ihl(final lan a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public ihl(final zpf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object e) {
        final int b = this.b;
        final boolean b2 = false;
        boolean a = false;
        switch (b) {
            default: {
                final Object a2 = this.a;
                final boolean booleanValue = (boolean)e;
                final YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = (YouTubePlayerViewNotForReflection)a2;
                if (youTubePlayerViewNotForReflection.a == booleanValue) {
                    return;
                }
                youTubePlayerViewNotForReflection.a = booleanValue;
                youTubePlayerViewNotForReflection.f();
                return;
            }
            case 19: {
                final Object a3 = this.a;
                final aanp aanp = (aanp)e;
                tpe.x((Context)((iru)a3).a.od(), 2132019174, 1);
                return;
            }
            case 18: {
                final Object a4 = this.a;
                final aani aani = (aani)e;
                final PlayerResponseModel b3 = aani.b();
                if (aani.c() == abkb.d && b3 != null) {
                    final PlayerConfigModel m = b3.m();
                    if (m != null && m.ax()) {
                        ((iru)a4).d.c(2132018066);
                    }
                }
                return;
            }
            case 17: {
                final Object a5 = this.a;
                final aanf aanf = (aanf)e;
                if (aanf.b() == abka.b) {
                    final PlayerResponseModel a6 = aanf.a();
                    if (a6 != null) {
                        ((aanx)((isa)a5).a).E((List)a6.z().O);
                    }
                }
                return;
            }
            case 16: {
                final Object a7 = this.a;
                final aans b4 = (aans)e;
                final DefaultVideoStageMonitor defaultVideoStageMonitor = (DefaultVideoStageMonitor)a7;
                defaultVideoStageMonitor.b = b4;
                if (!defaultVideoStageMonitor.a.isEmpty()) {
                    final Iterator iterator = defaultVideoStageMonitor.a.iterator();
                    while (iterator.hasNext()) {
                        ((iry)iterator.next()).a();
                    }
                }
                return;
            }
            case 15: {
                final Object a8 = this.a;
                if (((aamh)e).d() == abjv.h) {
                    a = true;
                }
                ((irk)a8).a = a;
                return;
            }
            case 14: {
                final Object a9 = this.a;
                if (!((aanw)e).e()) {
                    return;
                }
                ((irk)a9).b();
                return;
            }
            case 13: {
                final Object a10 = this.a;
                final aans aans = (aans)e;
                final abke c = aans.c();
                final irk irk = (irk)a10;
                irk.c = c;
                final PlayerResponseModel b5 = aans.b();
                boolean b6 = b2;
                if (b5 != null) {
                    b6 = b2;
                    if (b5.T()) {
                        b6 = true;
                    }
                }
                irk.b = b6;
                return;
            }
            case 12: {
                final Object a11 = this.a;
                final Boolean b7 = (Boolean)e;
                final ipl ipl = (ipl)a11;
                if ("downloads_page_recommendations_item_section_identifier".equals(ipl.b)) {
                    ipl.d(((acov)a11).E);
                }
                return;
            }
            case 11: {
                final Object a12 = this.a;
                final Boolean b8 = (Boolean)e;
                final ipl ipl2 = (ipl)a12;
                if ("downloads_page_smart_downloads_item_section_identifier".equals(ipl2.b)) {
                    ((acqa)a12).lH(jgk.L(), (aiqj)null);
                    return;
                }
                if ("downloads_page_downloads_item_section_identifier".equals(ipl2.b)) {
                    ipl2.d(((acov)a12).E);
                }
                return;
            }
            case 10: {
                ((acqa)this.a).lH(((fdw)e).a(), (aiqj)null);
                return;
            }
            case 9: {
                ttr.d("Error observing on entity key: ".concat(String.valueOf(this.a)), (Throwable)e);
                return;
            }
            case 8: {
                final Object a13 = this.a;
                if (e) {
                    ((iox)a13).b();
                }
                return;
            }
            case 7: {
                final Object a14 = this.a;
                if (e) {
                    ((iox)a14).b();
                }
                return;
            }
            case 6: {
                final Object a15 = this.a;
                if (e) {
                    final aacg a16 = ((inf)a15).a;
                    final ahaz builder = ((ahbh)amul.a).createBuilder();
                    builder.copyOnWrite();
                    final amul amul = (amul)builder.instance;
                    amul.c = 1;
                    amul.b |= 0x1;
                    final ahbb ahbb = (ahbb)((ahbh)amuj.b).createBuilder();
                    ahbb.o((Iterable)zvg.a);
                    ahbb.p(amui.c);
                    final ahbf b9 = apyu.b;
                    final ahaz builder2 = ((ahbh)apyu.a).createBuilder();
                    builder2.copyOnWrite();
                    final apyu apyu = (apyu)builder2.instance;
                    apyu.d = 7;
                    apyu.c |= 0x1;
                    ahbb.e((ahaq)b9, (Object)builder2.build());
                    final amuj e2 = (amuj)((ahaz)ahbb).build();
                    builder.copyOnWrite();
                    final amul amul2 = (amul)builder.instance;
                    e2.getClass();
                    amul2.e = e2;
                    amul2.b |= 0x4;
                    final String v = glb.V();
                    builder.copyOnWrite();
                    final amul amul3 = (amul)builder.instance;
                    v.getClass();
                    amul3.b |= 0x2;
                    amul3.d = v;
                    a16.a((amul)builder.build());
                    return;
                }
                final inf inf = (inf)a15;
                final vfw c2 = inf.c.a(inf.d.c()).c();
                c2.g(glb.C());
                fex.t(c2, "Error removing the DownloadsPageRefreshTokenEntity on Smart Downloads opt out.");
                final aacg a17 = inf.a;
                final ahaz builder3 = ((ahbh)amul.a).createBuilder();
                builder3.copyOnWrite();
                final amul amul4 = (amul)builder3.instance;
                amul4.c = 2;
                amul4.b |= 0x1;
                final String v2 = glb.V();
                builder3.copyOnWrite();
                final amul amul5 = (amul)builder3.instance;
                v2.getClass();
                amul5.b |= 0x2;
                amul5.d = v2;
                a17.a((amul)builder3.build());
                aelq.b(((tmv)((atke)inf.f.c).a()).b((aezf)new fmu(inf.d.c().b(), inf.e.a().toEpochMilli(), 1)), "Failed to save the smart downloads last opt out timestamp.", new Object[0]);
                return;
            }
            case 5: {
                ((zpf)this.a).a(new dbj((Throwable)e));
                return;
            }
            case 4: {
                ((dbf)this.a).mX((Object)e);
                return;
            }
            case 3: {
                ttr.d((String)this.a, (Throwable)e);
                return;
            }
            case 2: {
                ttr.d((String)this.a, (Throwable)e);
                return;
            }
            case 1: {
                ((atiy)this.a).tu((Object)e);
                return;
            }
            case 0: {
                final Object a18 = this.a;
                final String s = (String)e;
                tbi.e();
                final int a19 = vgl.a(s);
                final lan lan = (lan)a18;
                e = lan.e;
                final Integer value = a19;
                iix iix = null;
                Label_1493: {
                    if (((afev)e).containsKey(value)) {
                        iix = (iix)((afev)lan.e).get(value);
                    }
                    else {
                        final int a20 = vgl.a(s);
                        final appk ad = glb.ad(s, (bhv)lan.d);
                        if (ad != null) {
                            final int d = ad.d;
                            final Map map = (Map)((afev)lan.i).get(a20);
                            if (map != null) {
                                iix = (iix)map.get(d);
                                break Label_1493;
                            }
                            final StringBuilder sb = new StringBuilder("Unable to find transformer from data model field number ");
                            sb.append(d);
                            sb.append(" to view model field number");
                            sb.append(a20);
                            ttr.b(sb.toString());
                        }
                        iix = null;
                    }
                }
                if (iix == null) {
                    ttr.b("Unable to find transformer for outputEntityKey = ".concat(String.valueOf(s)));
                    return;
                }
                if (!((Map)lan.g).containsKey(s)) {
                    ((Map<String, ConcurrentHashMap>)lan.g).put(s, new ConcurrentHashMap());
                }
                if (!((Map)lan.b).containsKey(s)) {
                    ((Map<String, Set<Object>>)lan.b).put(s, Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap()));
                }
                final Map map2 = ((Map<K, Map>)lan.g).get(s);
                final asjm d2 = lan.d(s);
                ((Map<String, iix>)lan.c).put(s, iix);
                final Set set = ((Map<K, Set>)lan.b).get(s);
                final afft d3 = iix.d(s);
                set.addAll((Collection)d3);
                final afke k = d3.k();
                while (k.hasNext()) {
                    final ijj ijj = k.next();
                    map2.put(ijj, lan.c(ijj, s, d2, iix));
                }
                final aezp c3 = iix.c(s);
                if (c3.h()) {
                    final argj g = iix.g((String)c3.c());
                    vfn vfn;
                    if (g.a - 1 != 1) {
                        vfn = (vfn)((vef)lan.a).b().f((String)g.b).af();
                    }
                    else {
                        vfn = (vfn)((vdr)lan.f).b().f((String)g.b).af();
                    }
                    lan.e(iix, vfn, s, (iiw)null);
                }
            }
        }
    }
}
