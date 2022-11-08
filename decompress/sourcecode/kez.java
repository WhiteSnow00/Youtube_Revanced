import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

final class kez extends hy
{
    final /* synthetic */ kfa a;
    
    public kez(final kfa a) {
        this.a = a;
    }
    
    public final void b(final Rect rect, final View view, final RecyclerView recyclerView, final ok ok) {
        if (view == this.a.a) {
            rect.set(0, 0, 0, -1);
        }
    }
}
