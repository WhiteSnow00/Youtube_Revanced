import java.util.List;
import android.app.Dialog;
import android.view.WindowInsets$Type;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import android.view.WindowInsetsAnimation$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class acqf extends WindowInsetsAnimation$Callback
{
    final /* synthetic */ int a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ ViewGroup$MarginLayoutParams d;
    final /* synthetic */ acqj e;
    
    public acqf(final acqj e, final int a, final View b, final View c, final ViewGroup$MarginLayoutParams d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        super(0);
    }
    
    public final void onEnd(final WindowInsetsAnimation windowInsetsAnimation) {
        final acqj e = this.e;
        if (!e.aq) {
            return;
        }
        e.aq = false;
        final WindowInsets rootWindowInsets = this.c.getRootWindowInsets();
        int a;
        final int n = a = this.a;
        if (rootWindowInsets != null) {
            a = n + acqj.bd(rootWindowInsets);
        }
        if (this.d.bottomMargin != a) {
            tmy.aF(this.b, tmy.aq(a), (Class)ViewGroup$MarginLayoutParams.class);
        }
    }
    
    public final void onPrepare(final WindowInsetsAnimation windowInsetsAnimation) {
        if ((windowInsetsAnimation.getTypeMask() & WindowInsets$Type.ime()) != 0x0) {
            final acqj e = this.e;
            e.aq = true;
            final Dialog ay = e.ay;
            if (ay != null) {
                ((adrq)ay).a().H(3);
            }
        }
    }
    
    public final WindowInsets onProgress(final WindowInsets windowInsets, final List list) {
        if (!this.e.aq) {
            return windowInsets;
        }
        tmy.aF(this.b, tmy.aq(this.a + acqj.bd(windowInsets)), (Class)ViewGroup$MarginLayoutParams.class);
        return windowInsets;
    }
}
