import com.google.android.apps.youtube.app.common.widget.WrappingTextViewForClarifyBox;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jia implements ViewTreeObserver$OnPreDrawListener
{
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ List c;
    public final /* synthetic */ jib d;
    
    public jia(final jib d, final boolean a, final int b, final List c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean onPreDraw() {
        this.d.i.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        int c;
        if (this.a) {
            c = this.d.i.getMeasuredWidth() + this.d.b.getDimensionPixelSize(2131165818) + this.d.b.getDimensionPixelSize(2131165817);
        }
        else {
            c = 0;
        }
        final WrappingTextViewForClarifyBox h = this.d.h;
        h.b = this.b;
        h.d = new adrh(this, this.a);
        h.c = c;
        h.a = new ArrayList(this.c);
        h.requestLayout();
        this.d.g.invalidate();
        return true;
    }
}
