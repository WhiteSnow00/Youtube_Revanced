import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import java.util.List;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class adup extends adur
{
    public final Rect d;
    final Rect e;
    public int f;
    public int g;
    
    public adup() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
    
    public adup(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
    
    public abstract View A(final List p0);
    
    public final int C(final View view) {
        if (this.g == 0) {
            return 0;
        }
        final float y = this.y(view);
        final int g = this.g;
        return aaa.a((int)(y * g), 0, g);
    }
    
    @Override
    protected final void tl(final CoordinatorLayout coordinatorLayout, final View view, int c) {
        final View a = this.A(coordinatorLayout.b(view));
        if (a != null) {
            final ael ael = (ael)view.getLayoutParams();
            final Rect d = this.d;
            d.set(coordinatorLayout.getPaddingLeft() + ael.leftMargin, a.getBottom() + ael.topMargin, coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight() - ael.rightMargin, coordinatorLayout.getHeight() + a.getBottom() - coordinatorLayout.getPaddingBottom() - ael.bottomMargin);
            final aoc f = coordinatorLayout.f;
            if (f != null && anc.ai((View)coordinatorLayout) && !anc.ai(view)) {
                d.left += f.b();
                d.right -= f.c();
            }
            final Rect e = this.e;
            int c2 = ael.c;
            if (c2 == 0) {
                c2 = 8388659;
            }
            ali.a(c2, view.getMeasuredWidth(), view.getMeasuredHeight(), d, e, c);
            c = this.C(a);
            view.layout(e.left, e.top - c, e.right, e.bottom - c);
            this.f = e.top - a.getBottom();
            return;
        }
        coordinatorLayout.k(view, c);
        this.f = 0;
    }
    
    public boolean x() {
        return false;
    }
    
    public float y(final View view) {
        throw null;
    }
    
    public int z(final View view) {
        throw null;
    }
}
