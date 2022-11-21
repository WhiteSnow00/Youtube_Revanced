import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class adbt extends hy
{
    private final int a;
    
    public adbt(final Context context) {
        this.a = context.getResources().getDimensionPixelSize(2131169586);
    }
    
    public final void b(final Rect rect, final View view, final RecyclerView recyclerView, final ol ol) {
        rect.top = this.a;
        if (recyclerView.c(view) == ol.a() - 1) {
            rect.bottom = this.a;
        }
    }
}
