import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gar implements are
{
    public final Object a;
    private final int b;
    
    public gar(final accc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gar(final BottomUiContainer a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final boolean b) {
        final int b2 = this.b;
        if (b2 == 0) {
            final BottomUiContainer bottomUiContainer = (BottomUiContainer)this.a;
            bottomUiContainer.k = null;
            bottomUiContainer.n = null;
            if (!b) {
                bottomUiContainer.q((View)null, (hft)null);
                bottomUiContainer.i();
            }
            return;
        }
        if (b2 == 1) {
            ((BottomUiContainer)this.a).n = null;
            return;
        }
        if (b2 != 2) {
            final accc accc = (accc)this.a;
            accc.b = null;
            accc.a = null;
            return;
        }
        ((accc)this.a).a = null;
    }
}
