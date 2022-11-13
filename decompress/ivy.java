import android.graphics.Rect;
import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivy implements asji
{
    final FullscreenEngagementPanelOverlay a;
    
    public ivy(final FullscreenEngagementPanelOverlay a) {
        this.a = a;
    }
    
    @Override
    public final /* bridge */ Object a(Object o, final Object o2) {
        final Integer n = (Integer)o;
        final Rect rect = (Rect)o2;
        final FullscreenEngagementPanelOverlay a = this.a;
        if (a.b) {
            final int intValue = n;
            int n2;
            int n3;
            if (a.G()) {
                n2 = rect.width() + intValue;
                n3 = a.g.right;
            }
            else {
                n2 = rect.width() - intValue;
                n3 = a.g.left;
            }
            o = new Rect((int)(float)n3, 0, (int)tpe.aN((float)n2, 0.0f, (float)rect.width()), 0);
        }
        else {
            final int intValue2 = n;
            final int height = rect.height();
            final float n4 = (float)rect.height();
            final float n5 = (float)rect.width();
            final boolean g = a.G();
            final float n6 = (height - intValue2) / n4;
            int n7;
            if (g) {
                n7 = a.g.right;
            }
            else {
                n7 = a.g.left;
            }
            o = new Rect((int)(n7 * n6), 0, (int)tpe.aN(n5 * n6, 0.0f, (float)rect.width()), 0);
        }
        return o;
    }
}
