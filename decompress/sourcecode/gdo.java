import android.widget.FrameLayout$LayoutParams;
import android.util.DisplayMetrics;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdo implements gdw
{
    private final int a;
    private final int b;
    private final int c;
    private final View d;
    private final gdv e;
    private int f;
    
    public gdo(final Context context, final View d, final gdv e) {
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.a = tmy.aZ(displayMetrics, 8);
        this.b = tmy.aZ(displayMetrics, 80);
        this.c = tmy.aZ(displayMetrics, 640);
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void a(final View view, int f) {
        this.f += f;
        if (view.canScrollVertically(-1)) {
            f = this.f;
            if (f >= -this.c) {
                if (f > this.b) {
                    this.e.c(true);
                    this.f = 0;
                }
                return;
            }
        }
        this.e.h();
        this.f = 0;
    }
    
    @Override
    public final void b() {
        this.d.setTranslationY(0.0f);
        this.d.setTranslationX(0.0f);
        this.f = 0;
    }
    
    @Override
    public final void c(final int n) {
        final View d = this.d;
        final tsp ax = tmy.ax(0);
        final int a = this.a;
        tmy.aF(d, tmy.an(new tsp[] { ax, tmy.aw(a), tmy.aq(n + a), tmy.as(8388693) }), (Class)FrameLayout$LayoutParams.class);
    }
    
    @Override
    public final void d() {
        this.f = 0;
    }
}
