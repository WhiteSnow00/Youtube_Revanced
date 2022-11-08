import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class acyd extends hy
{
    private final int a;
    
    public acyd(final Context context) {
        this.a = context.getResources().getDimensionPixelSize(2131169548);
    }
    
    public final void b(final Rect rect, final View view, final RecyclerView recyclerView, final ok ok) {
        rect.top = this.a;
        if (recyclerView.c(view) == ok.a() - 1) {
            rect.bottom = this.a;
        }
    }
}
