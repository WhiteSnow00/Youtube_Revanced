import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class adta extends aei
{
    private adtb a;
    private int b;
    
    public adta() {
        this.b = 0;
    }
    
    public adta(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = 0;
    }
    
    public final int I() {
        final adtb a = this.a;
        if (a != null) {
            return a.b;
        }
        return 0;
    }
    
    public final boolean J(final int b) {
        final adtb a = this.a;
        if (a != null) {
            return a.c(b);
        }
        this.b = b;
        return false;
    }
    
    public boolean h(final CoordinatorLayout coordinatorLayout, final View view, int b) {
        this.tm(coordinatorLayout, view, b);
        if (this.a == null) {
            this.a = new adtb(view);
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
    
    protected void tm(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
        coordinatorLayout.k(view, n);
    }
}
