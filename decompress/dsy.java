import android.view.View;
import android.view.View$OnFocusChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class dsy implements View$OnFocusChangeListener
{
    public dun a;
    
    public dsy() {
    }
    
    public final void onFocusChange(final View a, final boolean b) {
        final dun a2 = this.a;
        if (a2 != null) {
            bkw.e();
            if (bku.d == null) {
                bku.d = new dup();
            }
            final dup d = bku.d;
            d.a = a;
            d.b = b;
            a2.b.l().P(a2, bku.d);
            bku.d.a = null;
        }
    }
}
