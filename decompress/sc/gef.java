import android.graphics.Rect;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gef implements gee, trg
{
    public final trh a;
    protected final View b;
    protected View c;
    private final ged d;
    
    public gef(final View b, final View view, final ged d) {
        this.c = null;
        this.b = b;
        this.a = new trh(view);
        this.d = d;
    }
    
    public final void a(final View view, final int n) {
    }
    
    public final void b() {
        this.b.setTranslationY(0.0f);
        this.b.setTranslationX(0.0f);
        final View b = this.b;
        b.setTranslationY((float)(-b.getHeight()));
    }
    
    public final void c(final int n) {
        tpe.aF(this.b, tpe.an(new tut[] { tpe.ax(0), tpe.aw(0), tpe.aB(0), tpe.as(51) }), (Class)FrameLayout$LayoutParams.class);
    }
    
    public final void d() {
    }
    
    public final void f(final View c) {
        this.c = c;
        this.a.c(c);
    }
    
    public final void tj(final tre tre) {
        final View c = this.c;
        if (c == null) {
            return;
        }
        final Rect a = tre.a;
        if (tre.e() && (a.left > 0 || a.top > 0)) {
            final Rect a2 = tre.a;
            if (anb.f(c) == 1) {
                this.b.setTranslationX((float)(a2.right - this.b.getWidth()));
            }
            else {
                this.b.setTranslationX((float)a2.left);
            }
            this.b.setTranslationY((float)a2.top);
            this.d.h();
            return;
        }
        this.d.c(true);
    }
}
