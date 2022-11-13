import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class kiu extends iw
{
    int a;
    int b;
    final kiv c;
    
    public kiu(final kiv c) {
        this.c = c;
        this.a = 0;
        this.b = 0;
    }
    
    public final void b(final RecyclerView recyclerView, final int a) {
        final kiv c = this.c;
        final ajvk d = c.d;
        d.getClass();
        final int a2 = this.a;
        if (a != a2) {
            if (a == 0) {
                final int b = this.b;
                if (b > 0) {
                    c.e.J(4097, (wzz)new wyt(d.q), (alhi)null);
                }
                else if (b < 0) {
                    c.e.J(8193, (wzz)new wyt(d.q), (alhi)null);
                }
                this.b = 0;
            }
            else if (a == 1 && a2 != 2) {
                c.e.J(65, (wzz)new wyt(d.q), (alhi)null);
            }
        }
        this.a = a;
    }
    
    public final void py(final RecyclerView recyclerView, final int n, final int n2) {
        this.b += n2;
    }
}
