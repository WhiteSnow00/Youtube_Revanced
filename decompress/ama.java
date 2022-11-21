import android.view.ViewTreeObserver;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ama implements ViewTreeObserver$OnPreDrawListener, View$OnAttachStateChangeListener
{
    private final View a;
    private ViewTreeObserver b;
    private final Runnable c;
    
    private ama(final View a, final Runnable c) {
        this.a = a;
        this.b = a.getViewTreeObserver();
        this.c = c;
    }
    
    public static void b(final View view, final Runnable runnable) {
        if (view != null) {
            final ama ama = new ama(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)ama);
            view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)ama);
            return;
        }
        throw new NullPointerException("view == null");
    }
    
    public final void a() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        }
        else {
            this.a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        }
        this.a.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
    }
    
    public final boolean onPreDraw() {
        this.a();
        this.c.run();
        return true;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        this.b = view.getViewTreeObserver();
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.a();
    }
}
