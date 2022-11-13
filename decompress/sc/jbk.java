import com.google.protos.youtube.api.innertube.FullscreenEngagementOverlayRendererOuterClass;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbk
{
    public static final kre a;
    public final wyw b;
    public final ViewGroup c;
    public final View d;
    public final kqp e;
    public jbm f;
    public kqw g;
    public kqw h;
    public kqo i;
    public final lkx j;
    public final e k;
    private final kqx l;
    
    static {
        a = new kre((byte[])null);
    }
    
    public jbk(final wyw b, final e k, final lkx j, final kqx l, final kqp e, final ViewGroup c, final View d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.k = k;
        this.j = j;
        this.l = l;
        this.e = e;
    }
    
    public static ajvr b(final ajvv ajvv) {
        if (ajvv != null) {
            anuv anuv;
            if ((anuv = ajvv.f) == null) {
                anuv = anuv.a;
            }
            if (anuv.ry((ahaq)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarRenderer)) {
                anuv anuv2;
                if ((anuv2 = ajvv.f) == null) {
                    anuv2 = anuv.a;
                }
                return (ajvr)anuv2.rx((ahaq)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarRenderer);
            }
        }
        return null;
    }
    
    public final kqw a() {
        return this.l.b(this.c, 2131624467, jbk.a);
    }
}
