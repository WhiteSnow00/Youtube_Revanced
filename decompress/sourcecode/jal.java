import com.google.protos.youtube.api.innertube.FullscreenEngagementOverlayRendererOuterClass;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jal
{
    public static final kqd a;
    public final wwv b;
    public final ViewGroup c;
    public final View d;
    public final kpo e;
    public jan f;
    public kpv g;
    public kpv h;
    public kpn i;
    public final lht j;
    public final e k;
    private final kpw l;
    
    static {
        a = new kqd(null);
    }
    
    public jal(final wwv b, final e k, final lht j, final kpw l, final kpo e, final ViewGroup c, final View d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.k = k;
        this.j = j;
        this.l = l;
        this.e = e;
    }
    
    public static ajto b(final ajts ajts) {
        if (ajts != null) {
            anss anss;
            if ((anss = ajts.f) == null) {
                anss = anss.a;
            }
            if (((agzd)anss).rs((agyr)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarRenderer)) {
                anss anss2;
                if ((anss2 = ajts.f) == null) {
                    anss2 = anss.a;
                }
                return (ajto)((agzd)anss2).rr((agyr)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarRenderer);
            }
        }
        return null;
    }
    
    public final kpv a() {
        return this.l.b(this.c, 2131624467, jal.a);
    }
}
