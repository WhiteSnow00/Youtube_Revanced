import android.graphics.Rect;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdx implements gdw, tpb
{
    public final tpc a;
    protected final View b;
    protected View c;
    private final gdv d;
    
    public gdx(final View b, final View view, final gdv d) {
        this.c = null;
        this.b = b;
        this.a = new tpc(view);
        this.d = d;
    }
    
    @Override
    public final void a(final View view, final int n) {
    }
    
    @Override
    public final void b() {
        this.b.setTranslationY(0.0f);
        this.b.setTranslationX(0.0f);
        final View b = this.b;
        b.setTranslationY((float)(-b.getHeight()));
    }
    
    @Override
    public final void c(final int n) {
        tmy.aF(this.b, tmy.an(new tsp[] { tmy.ax(0), tmy.aw(0), tmy.aB(0), tmy.as(51) }), (Class)FrameLayout$LayoutParams.class);
    }
    
    @Override
    public final void d() {
    }
    
    public final void f(final View c) {
        this.c = c;
        this.a.c(c);
    }
    
    public final void te(final toz toz) {
        final View c = this.c;
        if (c == null) {
            return;
        }
        final Rect a = toz.a;
        if (toz.e() && (a.left > 0 || a.top > 0)) {
            final Rect a2 = toz.a;
            if (ana.f(c) == 1) {
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
