import com.google.protos.youtube.api.innertube.ShowInterstitialActionOuterClass$ShowInterstitialAction;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyw implements vcv
{
    private static final long a;
    private final wyv b;
    private final glf c;
    private final adhi d;
    
    static {
        a = TimeUnit.DAYS.toSeconds(1L);
    }
    
    public hyw(final wyv b, final fzw fzw, final glf c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.d = fzw.ac("rate_limit_show_interstitial_promo_last_allowed", hyw.a, TimeUnit.SECONDS);
        this.c = c;
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        if (((ahbc)aiqj).ry((ahaq)ShowInterstitialActionOuterClass$ShowInterstitialAction.showInterstitialAction) && (((ShowInterstitialActionOuterClass$ShowInterstitialAction)((ahbc)aiqj).rx((ahaq)ShowInterstitialActionOuterClass$ShowInterstitialAction.showInterstitialAction)).c || this.d.c())) {
            final ShowInterstitialActionOuterClass$ShowInterstitialAction showInterstitialActionOuterClass$ShowInterstitialAction = (ShowInterstitialActionOuterClass$ShowInterstitialAction)((ahbc)aiqj).rx((ahaq)ShowInterstitialActionOuterClass$ShowInterstitialAction.showInterstitialAction);
            aogm aogm;
            if ((aogm = showInterstitialActionOuterClass$ShowInterstitialAction.b) == null) {
                aogm = aogm.a;
            }
            if (aogm.b == 86135402) {
                aogm aogm2;
                if ((aogm2 = showInterstitialActionOuterClass$ShowInterstitialAction.b) == null) {
                    aogm2 = aogm.a;
                }
                aljh a;
                if (aogm2.b == 86135402) {
                    a = (aljh)aogm2.c;
                }
                else {
                    a = aljh.a;
                }
                this.b.pF().D((wzz)new wyt(a.n));
                this.c.e((Object)a);
                this.d.b();
            }
        }
    }
}
