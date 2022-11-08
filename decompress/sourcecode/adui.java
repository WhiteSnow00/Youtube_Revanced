import android.view.View;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adui implements View$OnAttachStateChangeListener
{
    public final void onViewAttachedToWindow(final View view) {
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        ana.L(view);
    }
    
    public final void onViewDetachedFromWindow(final View view) {
    }
}
