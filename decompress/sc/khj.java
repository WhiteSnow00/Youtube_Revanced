import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

final class khj extends hy
{
    final int a;
    final khk b;
    
    public khj(final khk b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final void b(final Rect rect, final View view, final RecyclerView recyclerView, final ok ok) {
        super.b(rect, view, recyclerView, ok);
        if (anb.f(this.b.a) == 1) {
            rect.right = this.a;
            return;
        }
        rect.left = this.a;
    }
}
