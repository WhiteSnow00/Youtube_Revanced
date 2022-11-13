import android.widget.FrameLayout$LayoutParams;
import android.util.DisplayMetrics;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdw implements gee
{
    private final int a;
    private final int b;
    private final int c;
    private final View d;
    private final ged e;
    private int f;
    
    public gdw(final Context context, final View d, final ged e) {
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.a = tpe.aZ(displayMetrics, 8);
        this.b = tpe.aZ(displayMetrics, 80);
        this.c = tpe.aZ(displayMetrics, 640);
        this.d = d;
        this.e = e;
    }
    
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
    
    public final void b() {
        this.d.setTranslationY(0.0f);
        this.d.setTranslationX(0.0f);
        this.f = 0;
    }
    
    public final void c(final int n) {
        final View d = this.d;
        final tut ax = tpe.ax(0);
        final int a = this.a;
        tpe.aF(d, tpe.an(new tut[] { ax, tpe.aw(a), tpe.aq(n + a), tpe.as(8388693) }), (Class)FrameLayout$LayoutParams.class);
    }
    
    public final void d() {
        this.f = 0;
    }
}
