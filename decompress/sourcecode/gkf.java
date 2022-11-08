import android.support.v7.widget.RecyclerView;
import android.graphics.Rect;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkf extends hy
{
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    public final /* synthetic */ gkh d;
    
    public gkf(final gkh d, final View a, final int b, final int c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void b(final Rect rect, final View view, final RecyclerView recyclerView, final ok ok) {
        super.b(rect, view, recyclerView, ok);
        final View a = this.a;
        if (view != a) {
            return;
        }
        final gkh d = this.d;
        rect.bottom = (int)(-this.c * (1.0f - d.a(this.b, a, d.g)));
        final gkh d2 = this.d;
        if (d2.o == null && (d2.m > this.a.getY() || this.d.p)) {
            recyclerView.post(this.d.o = (Runnable)new awz(this, this.c, this.b, this.a, recyclerView, 2));
        }
    }
}
