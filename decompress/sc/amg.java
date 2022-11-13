import java.util.Iterator;
import java.util.Map;
import android.os.Build$VERSION;
import android.view.View;
import java.util.WeakHashMap;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class amg implements ViewTreeObserver$OnGlobalLayoutListener, View$OnAttachStateChangeListener
{
    public final WeakHashMap a;
    
    public amg() {
        this.a = new WeakHashMap();
    }
    
    public final void a(final View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
    
    public final void onGlobalLayout() {
        if (Build$VERSION.SDK_INT < 28) {
            for (final Map.Entry<View, V> entry : this.a.entrySet()) {
                final View view = entry.getKey();
                final boolean booleanValue = (boolean)entry.getValue();
                final boolean shown = view.isShown();
                int n2;
                final int n = n2 = 0;
                if (shown) {
                    n2 = n;
                    if (view.getWindowVisibility() == 0) {
                        n2 = 1;
                    }
                }
                if ((booleanValue ? 1 : 0) != n2) {
                    int n3;
                    if (n2 == 0) {
                        n3 = 32;
                    }
                    else {
                        n3 = 16;
                    }
                    anb.D(view, n3);
                    this.a.put(view, (boolean)(n2 != 0));
                }
            }
        }
    }
    
    public final void onViewAttachedToWindow(final View view) {
        this.a(view);
    }
    
    public final void onViewDetachedFromWindow(final View view) {
    }
}
