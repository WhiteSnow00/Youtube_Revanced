import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hor implements ViewTreeObserver$OnGlobalLayoutListener
{
    final int a;
    final int b;
    final ViewTreeObserver c;
    final how d;
    
    public hor(final how d, final int a, final int b, final ViewTreeObserver c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onGlobalLayout() {
        if (this.a == this.d.bf.getWidth() && this.b == this.d.bf.getHeight()) {
            return;
        }
        if (this.c.isAlive()) {
            this.c.removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        this.d.c.notifyObservers();
    }
}
