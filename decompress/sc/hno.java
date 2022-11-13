import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.PopupWindow$OnDismissListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hno implements PopupWindow$OnDismissListener
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public hno(final acbq a, final acbs b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hno(final aels a, final psb b, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hno(final ku a, final ViewTreeObserver$OnGlobalLayoutListener b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onDismiss() {
        final int c = this.c;
        if (c == 0) {
            final Object a = this.a;
            ((psb)this.b).c(true);
            final aels aels = (aels)a;
            ((hqv)aels.a).c(aels.b);
            aels.b = 0;
            return;
        }
        if (c != 1) {
            final Object a2 = this.a;
            final Object b = this.b;
            final acbq acbq = (acbq)a2;
            if (b == acbq.c) {
                acbq.c = null;
            }
            return;
        }
        final ViewTreeObserver viewTreeObserver = ((ku)this.a).d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.b);
        }
    }
}
