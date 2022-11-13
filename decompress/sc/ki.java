import android.util.AttributeSet;
import android.content.Context;
import android.widget.PopupWindow;

// 
// Decompiled by Procyon v0.6.0
// 

final class ki extends PopupWindow
{
    public ki(final Context context, final AttributeSet set, final int n) {
        super(context, set, n, 0);
        final cdo w = cdo.w(context, set, gl.s, n, 0);
        if (w.q(2)) {
            apr.b(this, w.p(2, false));
        }
        this.setBackgroundDrawable(w.k(0));
        w.o();
    }
}
