import android.view.ViewGroup$MarginLayoutParams;
import android.app.Activity;
import android.view.View;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class acqg implements View$OnLayoutChangeListener
{
    public int a;
    public int b;
    final /* synthetic */ acqj c;
    private int d;
    
    public acqg(final acqj c, final int a, final int b) {
        this.c = c;
        this.d = 0;
        this.a = a;
        this.b = b;
    }
    
    public final void onLayoutChange(final View view, int n, int b, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        n = n3 - b;
        if (n == this.d) {
            return;
        }
        this.d = n;
        final acqj c = this.c;
        c.ba(((bi)c).d, (Activity)((br)c).od(), this.a, this.b);
        if (this.c.aC.isPresent()) {
            final acqj c2 = this.c;
            if (c2.ar) {
                final acqh acqh = (acqh)c2.aC.get();
                n = this.a;
                b = this.b;
                n = Math.max(0, Math.min(acqh.a.getMeasuredHeight() + ((ViewGroup$MarginLayoutParams)acqh.a.getLayoutParams()).bottomMargin, b) - n);
                if (n != acqh.b) {
                    acqh.b = n;
                    tmy.aF(acqh.a, tmy.aq(n), (Class)ViewGroup$MarginLayoutParams.class);
                }
            }
        }
    }
}
