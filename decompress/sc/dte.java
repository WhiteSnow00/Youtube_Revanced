import android.view.View;
import android.view.View$OnLongClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class dte implements View$OnLongClickListener
{
    public dun a;
    
    public dte() {
    }
    
    public final boolean onLongClick(final View a) {
        final dun a2 = this.a;
        if (a2 != null) {
            bkw.e();
            if (bku.e == null) {
                bku.e = new dvv();
            }
            bku.e.a = a;
            final Object p = a2.b.l().P(a2, bku.e);
            bku.e.a = null;
            if (p != null && (boolean)p) {
                return true;
            }
        }
        return false;
    }
}
