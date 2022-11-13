import android.graphics.Rect;
import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivz implements asjm
{
    final Object a;
    private final int b;
    
    public ivz(final FullscreenEngagementPanelOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivz(final ivk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        if (b == 0) {
            final Boolean b2 = (Boolean)o;
            final Object a = this.a;
            ((FullscreenEngagementPanelOverlay)a).h = b2;
            ((abbk)a).Z(1);
            return;
        }
        if (b != 1) {
            final Rect rect = (Rect)o;
            final Object a2 = this.a;
            ((FullscreenEngagementPanelOverlay)a2).g.set(rect);
            ((abbk)a2).Z(2);
            return;
        }
        ((ivk)this.a).a.set(((trn)o).a.a);
    }
}
