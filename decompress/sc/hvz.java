import android.view.View;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class hvz extends iw
{
    final hwl a;
    
    public hvz(final hwl a) {
        this.a = a;
    }
    
    @Override
    public final void b(final RecyclerView recyclerView, final int n) {
        if (n == 1) {
            final gec af = this.a.af;
            final gdz d = af.d;
            if (d != null) {
                final gee a = af.a(d);
                if (a != null) {
                    a.d();
                }
            }
        }
    }
    
    @Override
    public final void py(final RecyclerView recyclerView, final int n, final int n2) {
        final gec af = this.a.af;
        final gdz d = af.d;
        if (d != null) {
            final gee a = af.a(d);
            if (a != null) {
                a.a((View)recyclerView, n2);
            }
        }
    }
}
