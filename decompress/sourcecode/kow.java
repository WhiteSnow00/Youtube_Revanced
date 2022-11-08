import android.graphics.drawable.Drawable;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kow extends acja
{
    private final Context a;
    private final bu b;
    private final aceo c;
    private final acnj d;
    private final vax e;
    private final giz f;
    private final acng g;
    private final koo h;
    private acja i;
    private acja j;
    private acja k;
    private acja l;
    private acja m;
    private acja n;
    private acja o;
    private final adcr p;
    private final arud q;
    private final fzo r;
    
    public kow(final Context a, final bu b, final aceo c, final acnj d, final vax e, final giz f, final acng g, final fzo r, final adcr p15, final arud q, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        this.r = r;
        this.d = d;
        this.p = p15;
        this.q = q;
        f.c((View)(this.h = new koo(a)));
    }
    
    public static String f(final ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        ahgn ahgn;
        if ((ahgn = reelItemRendererOuterClass$ReelItemRenderer.q) == null) {
            ahgn = ahgn.a;
        }
        if ((ahgn.b & 0x1) != 0x0) {
            ahgn ahgn2;
            if ((ahgn2 = reelItemRendererOuterClass$ReelItemRenderer.q) == null) {
                ahgn2 = ahgn.a;
            }
            ahgm ahgm;
            if ((ahgm = ahgn2.c) == null) {
                ahgm = ahgm.a;
            }
            return ahgm.c;
        }
        return null;
    }
    
    public final View a() {
        return this.f.a;
    }
    
    public final void c(final acir acir) {
        final acja i = this.i;
        if (i != null) {
            i.c(acir);
        }
    }
    
    protected final boolean lS() {
        return gkt.aC(this.q);
    }
}
