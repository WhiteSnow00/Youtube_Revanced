import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezy extends hy
{
    private final int a;
    
    public ezy(final int a) {
        this.a = a;
    }
    
    public final void b(final Rect rect, final View view, final RecyclerView recyclerView, final ok ok) {
        rect.right = this.a / 2;
        rect.left = this.a / 2;
    }
}
