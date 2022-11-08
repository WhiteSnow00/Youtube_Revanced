import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

final class jfn extends hy
{
    final /* synthetic */ jfr a;
    private final int b;
    
    public jfn(final jfr a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Rect rect, final View view, final RecyclerView recyclerView, final ok ok) {
        final int c = recyclerView.c(view);
        rect.setEmpty();
        if (c == 0) {
            rect.right = this.b;
            int b;
            if (this.a.b()) {
                b = this.b;
            }
            else {
                b = 0;
            }
            rect.bottom = b;
            return;
        }
        if (c != 1) {
            if (c == 2) {
                if (this.a.b()) {
                    rect.bottom = this.b;
                }
                else {
                    rect.top = this.b;
                }
                rect.left = this.b;
                return;
            }
            if (c != 3) {
                return;
            }
            rect.left = this.b;
            rect.top = this.b;
        }
        else {
            if (this.a.b()) {
                rect.top = this.b;
                rect.right = this.b;
                return;
            }
            rect.left = this.b;
            rect.bottom = this.b;
        }
    }
}
