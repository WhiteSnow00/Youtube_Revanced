import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class kvr extends iw
{
    final /* synthetic */ kvu a;
    
    public kvr(final kvu a) {
        this.a = a;
    }
    
    @Override
    public final void pu(final RecyclerView recyclerView, int a, final int n) {
        if (!(recyclerView.n instanceof LinearLayoutManager)) {
            return;
        }
        if (ezp.w(recyclerView)) {
            a = this.a.d.a.a();
            final kvu a2 = this.a;
            if (a != a2.o) {
                a2.o = a;
                ((acms)a2.k).lL(abxw.b);
            }
        }
    }
}
