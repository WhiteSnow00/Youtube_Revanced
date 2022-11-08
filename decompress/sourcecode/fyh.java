import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyh extends iw
{
    private final RecyclerView[] a;
    private boolean b;
    
    public fyh(final RecyclerView[] a) {
        this.a = a;
    }
    
    @Override
    public final void pu(final RecyclerView recyclerView, final int n, final int n2) {
        if (!this.b) {
            this.b = true;
            final RecyclerView[] a = this.a;
            for (int i = 0; i < 2; ++i) {
                final RecyclerView recyclerView2 = a[i];
                if (recyclerView2 != recyclerView) {
                    recyclerView2.scrollBy(n, n2);
                }
            }
            this.b = false;
        }
    }
}
