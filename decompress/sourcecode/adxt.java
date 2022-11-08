import com.google.android.material.tabs.TabLayout;
import android.view.View;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxt
{
    public Drawable a;
    public CharSequence b;
    public CharSequence c;
    public int d;
    public View e;
    public final int f;
    public TabLayout g;
    public adxv h;
    public int i;
    
    public adxt() {
        this.d = -1;
        this.f = 1;
        this.i = -1;
    }
    
    public final void a() {
        final TabLayout g = this.g;
        if (g != null) {
            g.i(this);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }
    
    public final void b() {
        final adxv h = this.h;
        if (h != null) {
            h.b();
        }
    }
    
    public final void c(final Drawable a) {
        this.a = a;
        final TabLayout g = this.g;
        if (g.r == 1 || g.u == 2) {
            g.n(true);
        }
        this.b();
    }
}
