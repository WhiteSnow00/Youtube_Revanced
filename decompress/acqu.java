import android.view.View;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class acqu extends iw
{
    final acqv a;
    
    public acqu(final acqv a) {
        this.a = a;
    }
    
    @Override
    public final void b(final RecyclerView recyclerView, final int n) {
        final acqv a = this.a;
        final Runnable r = ((acns)a).r;
        if (r != null) {
            if (n == 1) {
                ((acns)a).r = null;
                return;
            }
            if (n == 0) {
                ((View)recyclerView).post(r);
                ((acns)a).r = null;
            }
        }
    }
    
    @Override
    public final void py(final RecyclerView recyclerView, final int n, final int n2) {
        final nw n3 = recyclerView.n;
        if (!(n3 instanceof LinearLayoutManager)) {
            return;
        }
        this.a.O = ((LinearLayoutManager)n3).K();
    }
}
