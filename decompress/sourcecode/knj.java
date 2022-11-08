import android.view.View$AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knj extends acja
{
    public final FrameLayout a;
    kni b;
    private final Context c;
    private final giz d;
    private final uyf e;
    private final alm f;
    
    public knj(final Context c, final giz d, final alm f, final uyf e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.d = d;
        this.f = f;
        this.e = e;
        d.c((View)(this.a = new FrameLayout(c)));
    }
    
    public final View a() {
        return this.d.a;
    }
    
    public final void c(final acir acir) {
        if (this.b != null) {
            this.b = null;
        }
        this.a.removeAllViews();
    }
}
