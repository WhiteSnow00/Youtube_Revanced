import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class adur extends aej
{
    private adus a;
    private int b;
    
    public adur() {
        this.b = 0;
    }
    
    public adur(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = 0;
    }
    
    public final int J() {
        final adus a = this.a;
        if (a != null) {
            return a.b;
        }
        return 0;
    }
    
    public final boolean K(final int b) {
        final adus a = this.a;
        if (a != null) {
            return a.c(b);
        }
        this.b = b;
        return false;
    }
    
    public boolean h(final CoordinatorLayout coordinatorLayout, final View view, int b) {
        this.tl(coordinatorLayout, view, b);
        if (this.a == null) {
            this.a = new adus(view);
        }
        this.a.b();
        this.a.a();
        b = this.b;
        if (b != 0) {
            this.a.c(b);
            this.b = 0;
        }
        return true;
    }
    
    protected void tl(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
        coordinatorLayout.k(view, n);
    }
}
