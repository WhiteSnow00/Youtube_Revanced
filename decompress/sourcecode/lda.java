import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class lda extends iw
{
    final /* synthetic */ ldb a;
    
    public lda(final ldb a) {
        this.a = a;
    }
    
    public final void b(final RecyclerView recyclerView, final int n) {
        final ldb a = this.a;
        final Runnable b = a.b;
        if (b != null) {
            if (n == 1) {
                ldb.e(a);
                return;
            }
            if (n == 0) {
                recyclerView.post(b);
                ldb.e(this.a);
            }
        }
    }
    
    public final void pu(final RecyclerView recyclerView, final int n, final int n2) {
    }
}
