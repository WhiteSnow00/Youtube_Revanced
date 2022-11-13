import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gas implements arf
{
    public final View a;
    public final Object b;
    private final int c;
    
    public gas(final accc b, final View a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gas(final BottomUiContainer b, final View a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a(final float n) {
        final int c = this.c;
        if (c == 0) {
            final Object b = this.b;
            final View a = this.a;
            final BottomUiContainer bottomUiContainer = (BottomUiContainer)b;
            bottomUiContainer.k(bottomUiContainer.b(a));
            return;
        }
        if (c != 1) {
            final Object b2 = this.b;
            final View a2 = this.a;
            final int top = a2.getTop();
            final int n2 = (int)n;
            anb.F(a2, n2 - top);
            a2.setAlpha(((accc)b2).x(a2, n2));
            return;
        }
        final Object b3 = this.b;
        final View a3 = this.a;
        final int top2 = a3.getTop();
        final int n3 = (int)n;
        anb.F(a3, n3 - top2);
        a3.setAlpha(((BottomUiContainer)b3).a(a3, n3));
    }
}
