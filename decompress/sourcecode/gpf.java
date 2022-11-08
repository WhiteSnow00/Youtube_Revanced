import android.view.View;
import com.google.protos.youtube.api.innertube.AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class gpf implements vau
{
    private final vax a;
    private final wwu b;
    private final vwb c;
    
    public gpf(final vax a, final wwu b, final vwb c, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public final void mE(aioe aioe, final Map map) {
        if (!((agzd)aioe).rs((agyr)AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.adsClickWrapperCommand)) {
            return;
        }
        final AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand adsClickWrapperCommandOuterClass$AdsClickWrapperCommand = (AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand)((agzd)aioe).rr((agyr)AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.adsClickWrapperCommand);
        ahnb ahnb;
        if ((ahnb = adsClickWrapperCommandOuterClass$AdsClickWrapperCommand.d) == null) {
            ahnb = ahnb.a;
        }
        if (ahnb.b && this.c.q(tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"))) {
            return;
        }
        aiof aiof;
        if ((aiof = aioe.e) == null) {
            aiof = aiof.a;
        }
        agza agza;
        if (((agzd)aiof).rs((agyr)algq.a)) {
            agza = ((agzi)((agzd)aiof).rr((agyr)algq.a)).toBuilder();
        }
        else {
            agza = ((agzi)alff.a).createBuilder();
        }
        if (ahnb.e && ((agzd)aiof).rs((agyr)alev.b)) {
            final alev y = (alev)((agzd)aiof).rr((agyr)alev.b);
            agza.copyOnWrite();
            final alff alff = (alff)agza.instance;
            y.getClass();
            alff.y = y;
            alff.c |= 0x2000;
        }
        final alff alff2 = (alff)agza.build();
        if (ahnb.d) {
            final wwv n = this.b.n();
            final wws wws = new wws(aioe.c);
            alff alff3;
            if (!((agzi)alff.a).equals(alff2)) {
                alff3 = alff2;
            }
            else {
                alff3 = null;
            }
            n.J(3, (wxz)wws, alff3);
        }
        if (ahnb.c && ((agzd)aiof).rs((agyr)alev.b)) {
            final View view = (View)tmy.M(map, (Object)"com.google.android.libraries.youtube.rendering.elements.sender_view");
            if (view != null) {
                final alev alev = (alev)((agzd)aiof).rr((agyr)alev.b);
                final sak sak = new sak(view);
                sak.d(alev.d, alev.e);
                map.put("MacrosConverters.CustomConvertersKey", new znn[] { (znn)sak });
            }
            else {
                zjp.b(zjo.b, zjn.a, "The AdsClickWrapperCommandResolver has no View set in its event data.");
            }
        }
        if ((adsClickWrapperCommandOuterClass$AdsClickWrapperCommand.b & 0x1) != 0x0) {
            if ((aioe = adsClickWrapperCommandOuterClass$AdsClickWrapperCommand.c) == null) {
                aioe = aioe.a;
            }
            aioe aioe2 = aioe;
            if (!((agzi)alff.a).equals(alff2)) {
                final agzc agzc = (agzc)((agzi)aioe).toBuilder();
                final agzc agzc2 = (agzc)((agzi)aiof.a).createBuilder();
                agzc2.e((agyr)algq.a, (Object)alff2);
                final aiof e = (aiof)((agza)agzc2).build();
                ((agza)agzc).copyOnWrite();
                final aioe aioe3 = (aioe)agzc.instance;
                e.getClass();
                aioe3.e = e;
                aioe3.b |= 0x2;
                aioe2 = (aioe)((agza)agzc).build();
            }
            this.a.c(aioe2, map);
        }
    }
}
