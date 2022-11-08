import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.apps.youtube.app.player.overlay.transientoverlay.DefaultTransientOverlayController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jci implements itw
{
    final /* synthetic */ DefaultTransientOverlayController a;
    
    public jci(final DefaultTransientOverlayController a) {
        this.a = a;
    }
    
    @Override
    public final void oX(final boolean b) {
        this.a.e.tr((Object)false);
    }
    
    @Override
    public final void v(final boolean b) {
        this.a.f.tr((Object)b);
    }
    
    @Override
    public final void y(final boolean b) {
        this.a.e.tr((Object)true);
    }
}
