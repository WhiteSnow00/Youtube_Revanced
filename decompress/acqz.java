import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class acqz implements ViewTreeObserver$OnGlobalLayoutListener
{
    final View a;
    final amiv b;
    final View c;
    final Object d;
    final xab e;
    final acrc f;
    
    public acqz(final acrc f, final View a, final amiv b, final View c, final Object d, final xab e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        this.f.a(this.b, this.c, this.d, this.e);
    }
}
