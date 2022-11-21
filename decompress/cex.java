import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

final class cex extends hy
{
    public Drawable a;
    public int b;
    public boolean c;
    final cfb d;
    
    public cex(final cfb d) {
        this.d = d;
        this.c = true;
    }
    
    private final boolean e(final View view, final RecyclerView recyclerView) {
        final oo j = recyclerView.j(view);
        final boolean b = j instanceof cfm;
        boolean c;
        final boolean b2 = c = false;
        if (b) {
            c = b2;
            if (((cfm)j).w) {
                c = this.c;
                final int indexOfChild = recyclerView.indexOfChild(view);
                if (indexOfChild < recyclerView.getChildCount() - 1) {
                    final oo i = recyclerView.j(recyclerView.getChildAt(indexOfChild + 1));
                    c = b2;
                    if (i instanceof cfm) {
                        c = b2;
                        if (((cfm)i).v) {
                            c = true;
                        }
                    }
                }
            }
        }
        return c;
    }
    
    public final void b(final Rect rect, final View view, final RecyclerView recyclerView, final ol ol) {
        if (this.e(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }
    
    public final void d(final Canvas canvas, final RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        final int childCount = recyclerView.getChildCount();
        final int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; ++i) {
            final View child = recyclerView.getChildAt(i);
            if (this.e(child, recyclerView)) {
                final int n = (int)child.getY() + child.getHeight();
                this.a.setBounds(0, n, width, this.b + n);
                this.a.draw(canvas);
            }
        }
    }
}
