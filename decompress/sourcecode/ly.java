import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.content.res.TypedArray;
import android.util.Log;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ly extends hy
{
    private static final int[] b;
    public final Drawable a;
    private final Rect c;
    
    static {
        b = new int[] { 16843284 };
    }
    
    public ly(final Context context) {
        this.c = new Rect();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ly.b);
        final Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
    }
    
    public final void b(final Rect rect, final View view, final RecyclerView recyclerView, final ok ok) {
        final Drawable a = this.a;
        if (a == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        rect.set(0, 0, 0, a.getIntrinsicHeight());
    }
    
    public final void c(final Canvas canvas, final RecyclerView recyclerView) {
        if (recyclerView.n != null) {
            if (this.a != null) {
                canvas.save();
                final boolean i = recyclerView.i;
                int j = 0;
                int paddingLeft;
                int width;
                if (i) {
                    paddingLeft = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                }
                else {
                    width = recyclerView.getWidth();
                    paddingLeft = 0;
                }
                while (j < recyclerView.getChildCount()) {
                    final View child = recyclerView.getChildAt(j);
                    RecyclerView.K(child, this.c);
                    final int n = this.c.bottom + Math.round(child.getTranslationY());
                    this.a.setBounds(paddingLeft, n - this.a.getIntrinsicHeight(), width, n);
                    this.a.draw(canvas);
                    ++j;
                }
                canvas.restore();
            }
        }
    }
}
