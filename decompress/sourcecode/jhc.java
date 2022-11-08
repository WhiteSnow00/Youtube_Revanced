import android.support.v7.widget.LinearLayoutManager;
import android.widget.EditText;
import android.view.View;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class jhc extends iw
{
    final /* synthetic */ jhf a;
    
    public jhc(final jhf a) {
        this.a = a;
    }
    
    @Override
    public final void b(final RecyclerView recyclerView, final int n) {
        if (n == 1) {
            final EditText aa = this.a.aA;
            if (aa != null) {
                tmy.p((View)aa);
            }
        }
    }
    
    @Override
    public final void pu(final RecyclerView recyclerView, final int n, final int n2) {
        final jhf a = this.a;
        a.aD = Math.max(a.aD, ((LinearLayoutManager)a.aK.c()).M());
    }
}
