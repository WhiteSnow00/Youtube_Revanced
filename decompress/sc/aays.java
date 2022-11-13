import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

// 
// Decompiled by Procyon v0.6.0
// 

final class aays extends ViewOutlineProvider
{
    public aays() {
    }
    
    public final void getOutline(final View view, final Outline outline) {
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }
}
