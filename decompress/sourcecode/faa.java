import java.util.List;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import java.util.Iterator;
import android.widget.TextView;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class faa extends ezb
{
    private final View l;
    private final acqu m;
    private final adcr n;
    
    public faa(final Context context, final aceo aceo, final giz giz, final aeby aeby, final acnj acnj, final cxz cxz, final zhb zhb, final fvf fvf, final hyc hyc, final adcr n, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(context, aceo, giz, aeby, acnj, cxz, fvf, hyc, null, null, null, null, null, null);
        this.l = super.e.findViewById(2131427730);
        this.n = n;
        final TextView h = this.h;
        acqu g;
        if (h != null) {
            g = zhb.g(h);
        }
        else {
            g = null;
        }
        this.m = g;
    }
    
    public static final CharSequence q(final aiso aiso) {
        ajsq ajsq;
        if ((aiso.b & 0x20) != 0x0) {
            if ((ajsq = aiso.f) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        return (CharSequence)abyh.b(ajsq);
    }
    
    public static final ahyy r(final aiso aiso) {
        for (final ahyg ahyg : aiso.j) {
            if ((ahyg.b & 0x1000000) != 0x0) {
                ahyy ahyy;
                if ((ahyy = ahyg.h) == null) {
                    ahyy = ahyy.a;
                }
                return ahyy;
            }
        }
        return null;
    }
    
    public static final CharSequence s(final aiso aiso) {
        ajsq ajsq;
        if ((aiso.b & 0x10) != 0x0) {
            if ((ajsq = aiso.e) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        return (CharSequence)abyh.b(ajsq);
    }
}
