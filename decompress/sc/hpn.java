import android.graphics.Rect;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpn implements asjm
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final Object e;
    private final int f;
    
    public hpn(final int a, final ViewGroup e, final int b, final int c, final int d, final int f) {
        this.f = f;
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public hpn(final gap e, final int a, final int b, final int c, final int d, final int f) {
        this.f = f;
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final Object o) {
        if (this.f != 0) {
            final Object e = this.e;
            final int a = this.a;
            final int b = this.b;
            final int c = this.c;
            final int d = this.d;
            final trn trn = (trn)o;
            final Rect rect = new Rect();
            final gap gap = (gap)e;
            if (gap.a.m()) {
                final tqh a2 = trn.a;
                final tqa b2 = a2.b;
                int b3;
                int d2;
                int c2;
                int a3;
                if (!b2.a.isEmpty()) {
                    b3 = b2.b();
                    d2 = b2.d();
                    c2 = b2.c();
                    a3 = b2.a();
                }
                else {
                    b3 = 0;
                    a3 = 0;
                    d2 = 0;
                    c2 = 0;
                }
                final Rect d3 = a2.d;
                rect.set(new Rect(Math.max(d3.left, b3), Math.max(d3.top, d2), Math.max(d3.right, c2), Math.max(d3.bottom, a3)));
            }
            gap.c.setPadding(a + rect.left, b + rect.top, c + rect.right, d + rect.bottom);
            return;
        }
        ((ViewGroup)this.e).setPadding(this.b, this.a + ((trn)o).a.a.top, this.c, this.d);
    }
}
