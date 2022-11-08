import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

// 
// Decompiled by Procyon v0.6.0
// 

final class gbc extends ViewOutlineProvider
{
    final /* synthetic */ gbd a;
    
    public gbc(final gbd a) {
        this.a = a;
    }
    
    public final void getOutline(final View view, final Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a.a.getResources().getDimension(2131169784));
    }
}
