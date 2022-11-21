import android.view.View;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adyb implements View$OnAttachStateChangeListener
{
    public final void onViewAttachedToWindow(final View view) {
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        anc.L(view);
    }
    
    public final void onViewDetachedFromWindow(final View view) {
    }
}
