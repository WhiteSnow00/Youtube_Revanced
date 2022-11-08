import android.view.View;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oe extends hw
{
    final /* synthetic */ RecyclerView a;
    
    public oe(final RecyclerView a) {
        this.a = a;
    }
    
    public final void c() {
        this.a.v(null);
        final RecyclerView a = this.a;
        a.V(a.L.f = true);
        if (!this.a.S.q()) {
            this.a.requestLayout();
        }
    }
    
    public final void e(final int n, final int n2, final Object o) {
        this.a.v(null);
        final abey s = this.a.S;
        if (n2 > 0) {
            s.b.add(s.h(4, n, n2, o));
            s.c |= 0x4;
            if (s.b.size() == 1) {
                this.i();
            }
        }
    }
    
    public final void f(final int n, final int n2) {
        this.a.v(null);
        final abey s = this.a.S;
        if (n2 > 0) {
            s.b.add(s.h(1, n, n2, null));
            s.c |= 0x1;
            if (s.b.size() == 1) {
                this.i();
            }
        }
    }
    
    public final void g(final int n, final int n2) {
        this.a.v(null);
        final abey s = this.a.S;
        if (n2 > 0) {
            s.b.add(s.h(2, n, n2, null));
            s.c |= 0x2;
            if (s.b.size() == 1) {
                this.i();
            }
        }
    }
    
    public final void h(final int n, final int n2) {
        this.a.v(null);
        final abey s = this.a.S;
        if (n != n2) {
            s.b.add(s.h(8, n, n2, null));
            s.c |= 0x8;
            if (s.b.size() == 1) {
                this.i();
            }
        }
    }
    
    final void i() {
        if (RecyclerView.b) {
            final RecyclerView a = this.a;
            if (a.s && a.r) {
                ana.I((View)a, a.j);
                return;
            }
        }
        final RecyclerView a2 = this.a;
        a2.w = true;
        a2.requestLayout();
    }
}
