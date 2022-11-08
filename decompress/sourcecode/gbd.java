import android.view.ViewOutlineProvider;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class gbd implements gaw
{
    public final Context a;
    private final FrameLayout b;
    private final osu c;
    private final wwu d;
    private final aeim e;
    
    public gbd(final FrameLayout b, final Context a, final osu c, final wwu d, final aeim e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private final ogl b(final aqdk aqdk, final wwv wwv) {
        final ota a = otb.a(this.c);
        a.d(false);
        a.d = this.e.L(wwv);
        final ogl ogl = new ogl(this.a, a.a());
        ogl.setAccessibilityLiveRegion(2);
        osi i;
        if (wwv != null) {
            i = acbf.I(wwv);
        }
        else {
            i = null;
        }
        ogl.b = i;
        ogl.a(((agxl)aqdk).toByteArray());
        return ogl;
    }
    
    private final wwv c(final wwv wwv) {
        if (wwv != null && !(wwv instanceof wxw)) {
            return wwv;
        }
        return this.d.n();
    }
}
