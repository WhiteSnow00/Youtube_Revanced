import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

final class kgi extends hy
{
    final /* synthetic */ int a;
    final /* synthetic */ kgj b;
    
    public kgi(final kgj b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final void b(final Rect rect, final View view, final RecyclerView recyclerView, final ok ok) {
        super.b(rect, view, recyclerView, ok);
        if (ana.f(this.b.a) == 1) {
            rect.right = this.a;
            return;
        }
        rect.left = this.a;
    }
}
