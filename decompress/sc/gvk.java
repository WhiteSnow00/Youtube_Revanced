import android.os.Bundle;
import java.util.Collection;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.Map;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvk implements vcv
{
    private final bu a;
    private final SfvAudioItemPlaybackController b;
    private final vcy c;
    private final guw d;
    private final hsq e;
    private final Map f;
    private final wyv g;
    private final cyb h;
    
    public gvk(final bu a, final SfvAudioItemPlaybackController b, final vcy c, final guw d, final hsq e, final cyb h, final Map f, final wyv g, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.g = g;
    }
    
    private static boolean b(final aicj aicj) {
        final String c = aicj.c;
        return c.equals("FEsfv_audio_pivot") || c.equals("FEsfv_hashtag_pivot") || c.equals("FEsfv_channel_pivot") || c.equals("FEsfv_effect_pivot") || c.equals("FEsfv_analytics_screen") || c.equals("FEproduct_details") || c.equals("FEcommerce_cart");
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        adkp.H(((ahbc)aiqj).ry((ahaq)BrowseEndpointOuterClass.browseEndpoint));
        final aicj aicj = (aicj)((ahbc)aiqj).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint);
        if (this.e.M()) {
            this.e.E();
        }
        if (!b(aicj) && !aicj.c.equals("FEsfv_audio_picker")) {
            this.c.a(aiqj);
            return;
        }
        if (!b(aicj)) {
            final gvm aq = gvm.aQ(aiqj);
            final cl supportFragmentManager = this.a.getSupportFragmentManager();
            ((aui)((br)aq).X).b((aum)this.b);
            final afke k = afft.p((Collection)this.h.a).k();
            while (k.hasNext()) {
                ((aui)((br)aq).X).b((aum)k.next());
            }
            final ct i = supportFragmentManager.i();
            if (this.f.containsKey(this.a.getClass())) {
                final hxw hxw = (hxw)this.f.get(this.a.getClass()).a();
                i.r(2131427411, (br)aq, "ReelBrowseFragmentTag");
            }
            else {
                i.w(16908290, (br)aq, "ReelBrowseFragmentTag");
            }
            i.t((String)null);
            i.a();
            supportFragmentManager.ab();
            return;
        }
        this.g.pF().s();
        this.d.e(aiqj, new Bundle());
    }
}
