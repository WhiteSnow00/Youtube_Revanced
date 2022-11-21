import android.os.Build$VERSION;
import android.view.View;
import android.graphics.Rect;
import androidx.viewpager.widget.ViewPager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ckt implements alx
{
    final ViewPager a;
    private final Rect b;
    
    public ckt(final ViewPager a) {
        this.a = a;
        this.b = new Rect();
    }
    
    public final aoc a(final View view, final aoc aoc) {
        final aoc x = anc.x(view, aoc);
        if (x.t()) {
            return x;
        }
        final Rect b = this.b;
        b.left = x.b();
        b.top = x.d();
        b.right = x.c();
        b.bottom = x.a();
        for (int childCount = this.a.getChildCount(), i = 0; i < childCount; ++i) {
            final aoc v = anc.v(this.a.getChildAt(i), x);
            b.left = Math.min(v.b(), b.left);
            b.top = Math.min(v.d(), b.top);
            b.right = Math.min(v.c(), b.right);
            b.bottom = Math.min(v.a(), b.bottom);
        }
        Object o;
        if (Build$VERSION.SDK_INT >= 30) {
            o = new ant(x);
        }
        else if (Build$VERSION.SDK_INT >= 29) {
            o = new ans(x);
        }
        else {
            o = new anr(x);
        }
        ((anu)o).c(aic.c(b));
        return ((anu)o).a();
    }
}
