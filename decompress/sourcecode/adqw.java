import java.util.List;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class adqw extends adqy
{
    public final Rect d;
    final Rect e;
    public int f;
    public int g;
    
    public adqw() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
    
    public adqw(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
    
    public final int B(final View view) {
        if (this.g == 0) {
            return 0;
        }
        final float x = this.x(view);
        final int g = this.g;
        return aeh.t((int)(x * g), 0, g);
    }
    
    protected final void th(final CoordinatorLayout coordinatorLayout, final View view, int b) {
        final View z = this.z(coordinatorLayout.b(view));
        if (z != null) {
            final aej aej = (aej)view.getLayoutParams();
            final Rect d = this.d;
            d.set(coordinatorLayout.getPaddingLeft() + aej.leftMargin, z.getBottom() + aej.topMargin, coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight() - aej.rightMargin, coordinatorLayout.getHeight() + z.getBottom() - coordinatorLayout.getPaddingBottom() - aej.bottomMargin);
            final aoa f = coordinatorLayout.f;
            if (f != null && ana.ai((View)coordinatorLayout) && !ana.ai(view)) {
                d.left += f.b();
                d.right -= f.c();
            }
            final Rect e = this.e;
            int c = aej.c;
            if (c == 0) {
                c = 8388659;
            }
            alg.a(c, view.getMeasuredWidth(), view.getMeasuredHeight(), d, e, b);
            b = this.B(z);
            view.layout(e.left, e.top - b, e.right, e.bottom - b);
            this.f = e.top - z.getBottom();
            return;
        }
        coordinatorLayout.k(view, b);
        this.f = 0;
    }
    
    public boolean w() {
        return false;
    }
    
    public float x(final View view) {
        throw null;
    }
    
    public int y(final View view) {
        throw null;
    }
    
    public abstract View z(final List p0);
}
