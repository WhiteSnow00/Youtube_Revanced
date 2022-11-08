import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

// 
// Decompiled by Procyon v0.6.0
// 

final class acqe extends ViewOutlineProvider
{
    final /* synthetic */ int a;
    
    public acqe(final int a) {
        this.a = a;
    }
    
    public final void getOutline(final View view, final Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float)this.a);
    }
}
