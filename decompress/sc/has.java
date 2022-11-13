import android.graphics.Outline;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.GreenScreenMediaThumbnailContainer;
import android.view.ViewOutlineProvider;

// 
// Decompiled by Procyon v0.6.0
// 

final class has extends ViewOutlineProvider
{
    final GreenScreenMediaThumbnailContainer a;
    
    public has(final GreenScreenMediaThumbnailContainer a) {
        this.a = a;
    }
    
    public final void getOutline(final View view, final Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a.getResources().getDimension(2131166812));
    }
}
