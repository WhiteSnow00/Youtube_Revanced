import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import android.view.View;
import com.google.protos.youtube.api.innertube.AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpe implements vau
{
    private final Context a;
    private final vax b;
    private final wwu c;
    private final fax d;
    private final arud e;
    private final vwb f;
    private final hyc g;
    
    public gpe(final Context a, final vax b, final vwb f, final hyc g, final wwu c, final fax d, final arud e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.g = g;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void mE(aioe aioe, final Map map) {
        if (!((agzd)aioe).rs((agyr)AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.adInfraSupportWrapperCommand)) {
            return;
        }
        final AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand adInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand = (AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand)((agzd)aioe).rr((agyr)AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.adInfraSupportWrapperCommand);
        ahjn ahjn;
        if ((ahjn = adInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.d) == null) {
            ahjn = ahjn.a;
        }
        if ((ahjn.b & 0x2) != 0x0) {
            ahow ahow;
            if ((ahow = ahjn.d) == null) {
                ahow = ahow.a;
            }
            if ((ahow.b & 0x1) != 0x0) {
                final gpd gpd = (gpd)this.g.s(ahow.c, (Class)gpd.class, "AFOCState", (fbc)kjg.b);
                final boolean a = gpd.a;
                gpd.a = true;
                if (!(a ^ true)) {
                    return;
                }
            }
        }
        ahos ahos;
        if ((ahos = ahjn.e) == null) {
            ahos = ahos.a;
        }
        if (ahos.c && this.f.q(tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"))) {
            return;
        }
        aiof e;
        if ((e = aioe.e) == null) {
            e = aiof.a;
        }
        agza agza;
        if (((agzd)e).rs((agyr)algq.a)) {
            agza = ((agzi)((agzd)e).rr((agyr)algq.a)).toBuilder();
        }
        else {
            agza = ((agzi)alff.a).createBuilder();
        }
        if ((ahjn.b & 0x10) != 0x0) {
            if (!((agzd)e).rs((agyr)alev.b)) {
                zjp.b(zjo.b, zjn.e, "The command has ads_border_click_protection_config, but does not have click_signals set in its commandMetadata.");
            }
            else {
                ahmz ahmz;
                if ((ahmz = ahjn.g) == null) {
                    ahmz = ahmz.a;
                }
                final alev y = (alev)((agzd)e).rr((agyr)alev.b);
                final int n = y.d + y.l;
                final int bc = tmy.bc(this.a);
                if (n < ahmz.c || n > bc - ahmz.d) {
                    if ((aioe = ahmz.b) == null) {
                        aioe = aioe.a;
                    }
                    final agzc agzc = (agzc)((agzi)aioe).toBuilder();
                    ((agza)agzc).copyOnWrite();
                    final aioe aioe2 = (aioe)agzc.instance;
                    ((agzd)e).getClass();
                    aioe2.e = e;
                    aioe2.b |= 0x2;
                    this.b.c((aioe)((agza)agzc).build(), map);
                    return;
                }
                agza.copyOnWrite();
                final alff alff = (alff)agza.instance;
                y.getClass();
                alff.y = y;
                alff.c |= 0x2000;
            }
        }
        ajdb ajdb;
        if ((ajdb = ahjn.h) == null) {
            ajdb = ajdb.a;
        }
        if (ajdb.b) {
            if (map != null && map.containsKey("com.google.android.libraries.youtube.rendering.elements.sender_view") && ((agzd)e).rs((agyr)alev.b)) {
                final sak sak = new sak((View)map.get("com.google.android.libraries.youtube.rendering.elements.sender_view"));
                final alev alev = (alev)((agzd)e).rr((agyr)alev.b);
                sak.d(alev.d, alev.e);
                final ArrayList list = new ArrayList();
                if (map.containsKey("MacrosConverters.CustomConvertersKey")) {
                    Collections.addAll(list, (Object[])map.get("MacrosConverters.CustomConvertersKey"));
                }
                list.add(sak);
                map.put("MacrosConverters.CustomConvertersKey", list.toArray(new znn[0]));
            }
            else {
                zjp.b(zjo.b, zjn.e, "The command has display_ad_macro_expander_config, but does not have click_signals set in its commandMetadata or view set in args");
            }
        }
        if ((ahjn.b & 0x1) != 0x0) {
            ahjo ahjo;
            if ((ahjo = ahjn.c) == null) {
                ahjo = ahjo.a;
            }
            alek alek;
            if ((alek = ((alff)agza.instance).v) == null) {
                alek = alek.a;
            }
            final agza builder = ((agzi)alek).toBuilder();
            alef alef;
            if ((alef = ((alek)builder.instance).g) == null) {
                alef = alef.a;
            }
            final agza builder2 = ((agzi)alef).toBuilder();
            aijk aijk;
            if ((aijk = aijk.b(ahjo.b)) == null) {
                aijk = aijk.a;
            }
            builder2.copyOnWrite();
            final alef alef2 = (alef)builder2.instance;
            alef2.d = aijk.e;
            alef2.b |= 0x2;
            builder.copyOnWrite();
            final alek alek2 = (alek)builder.instance;
            final alef g = (alef)builder2.build();
            g.getClass();
            alek2.g = g;
            alek2.b |= 0x2000;
            agza.copyOnWrite();
            final alff alff2 = (alff)agza.instance;
            final alek v = (alek)builder.build();
            v.getClass();
            alff2.v = v;
            alff2.c |= 0x400;
            final ahox c = qcv.C(this.e);
            if (c != null && c.C) {
                this.d.b.clear();
            }
            else {
                final ahox c2 = qcv.C(this.e);
                if (c2 != null && c2.D) {
                    final fax d = this.d;
                    aijk aijk2;
                    if ((aijk2 = aijk.b(ahjo.b)) == null) {
                        aijk2 = aijk.a;
                    }
                    d.b.remove(aijk2);
                }
            }
            final fax d2 = this.d;
            aijk aijk3;
            if ((aijk3 = aijk.b(ahjo.b)) == null) {
                aijk3 = aijk.a;
            }
            aioe aioe3;
            if ((aioe3 = ahjo.c) == null) {
                aioe3 = aioe.a;
            }
            final List<aioe> list2 = Arrays.asList(aioe3);
            Object b;
            if (map != null) {
                b = map;
            }
            else {
                b = afgm.b;
            }
            d2.a(aijk3, list2, (Map)b);
        }
        if ((ahjn.b & 0x8) != 0x0) {
            ahoz ahoz;
            if ((ahoz = ahjn.f) == null) {
                ahoz = ahoz.a;
            }
            aiof aiof;
            if ((aiof = aioe.e) == null) {
                aiof = aiof.a;
            }
            if (ahoz.c && ((agzd)aiof).rs((agyr)alev.b)) {
                final alev y2 = (alev)((agzd)aiof).rr((agyr)alev.b);
                agza.copyOnWrite();
                final alff alff3 = (alff)agza.instance;
                y2.getClass();
                alff3.y = y2;
                alff3.c |= 0x2000;
            }
            final alff alff4 = (alff)agza.build();
            if (ahoz.b) {
                final wwv n2 = this.c.n();
                final wws wws = new wws(aioe.c);
                alff alff5;
                if (!((agzi)alff.a).equals(alff4)) {
                    alff5 = alff4;
                }
                else {
                    alff5 = null;
                }
                n2.J(3, (wxz)wws, alff5);
            }
        }
        final alff alff6 = (alff)agza.build();
        if ((adInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.b & 0x1) != 0x0) {
            if ((aioe = adInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.c) == null) {
                aioe = aioe.a;
            }
            aioe aioe4 = aioe;
            if (!((agzi)alff.a).equals(alff6)) {
                final agzc agzc2 = (agzc)((agzi)aioe).toBuilder();
                final agzc agzc3 = (agzc)((agzi)aiof.a).createBuilder();
                agzc3.e((agyr)algq.a, (Object)alff6);
                final aiof e2 = (aiof)((agza)agzc3).build();
                ((agza)agzc2).copyOnWrite();
                final aioe aioe5 = (aioe)agzc2.instance;
                e2.getClass();
                aioe5.e = e2;
                aioe5.b |= 0x2;
                aioe4 = (aioe)((agza)agzc2).build();
            }
            this.b.c(aioe4, map);
        }
        final ahos e3 = ahjn.e;
        ahos a2;
        if (e3 == null) {
            a2 = ahos.a;
        }
        else {
            a2 = e3;
        }
        if (a2.c) {
            ahos a3;
            if ((a3 = e3) == null) {
                a3 = ahos.a;
            }
            if (a3.b) {
                this.f.p(tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"), ahpu.b);
            }
        }
    }
}
