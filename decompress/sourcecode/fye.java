import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fye extends hy
{
    private final int a;
    
    public fye(final int a) {
        this.a = a;
    }
    
    public final void b(final Rect rect, final View view, final RecyclerView recyclerView, final ok ok) {
        final int c = recyclerView.c(view);
        final int f = ana.f((View)recyclerView);
        if (c != 0) {
            if (f != 1) {
                rect.left += this.a;
            }
            else {
                rect.right += this.a;
            }
        }
        final Object tag = view.getTag(2131430139);
        if (tag instanceof fyd) {
            ((fyd)tag).a(rect);
        }
    }
}
