import android.view.View;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class keh implements View$OnAttachStateChangeListener
{
    final /* synthetic */ int a;
    final /* synthetic */ kei b;
    
    public keh(final kei b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        this.b.d.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.b.d.measure(0, 0);
        this.b.p(this.a);
        this.b.d.requestLayout();
    }
    
    public final void onViewDetachedFromWindow(final View view) {
    }
}
