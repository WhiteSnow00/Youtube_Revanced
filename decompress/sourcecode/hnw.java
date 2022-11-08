import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hnw implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ ViewTreeObserver c;
    final /* synthetic */ hoa d;
    
    public hnw(final hoa d, final int a, final int b, final ViewTreeObserver c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onGlobalLayout() {
        if (this.a == this.d.bh.getWidth() && this.b == this.d.bh.getHeight()) {
            return;
        }
        if (this.c.isAlive()) {
            this.c.removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        this.d.c.notifyObservers();
    }
}
