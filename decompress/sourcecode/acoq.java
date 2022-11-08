import android.view.View;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class acoq extends iw
{
    final /* synthetic */ acor a;
    
    public acoq(final acor a) {
        this.a = a;
    }
    
    public final void b(final RecyclerView recyclerView, final int n) {
        final acor a = this.a;
        final Runnable r = ((aclp)a).r;
        if (r != null) {
            if (n == 1) {
                ((aclp)a).r = null;
                return;
            }
            if (n == 0) {
                ((View)recyclerView).post(r);
                ((aclp)a).r = null;
            }
        }
    }
    
    public final void pu(final RecyclerView recyclerView, final int n, final int n2) {
        final nw n3 = recyclerView.n;
        if (!(n3 instanceof LinearLayoutManager)) {
            return;
        }
        this.a.O = ((LinearLayoutManager)n3).K();
    }
}
