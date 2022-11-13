import android.support.v7.widget.LinearLayoutManager;
import android.widget.EditText;
import android.view.View;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class jie extends iw
{
    final jih a;
    
    public jie(final jih a) {
        this.a = a;
    }
    
    public final void b(final RecyclerView recyclerView, final int n) {
        if (n == 1) {
            final EditText aa = this.a.aA;
            if (aa != null) {
                tpe.p((View)aa);
            }
        }
    }
    
    public final void py(final RecyclerView recyclerView, final int n, final int n2) {
        final jih a = this.a;
        a.aD = Math.max(a.aD, ((LinearLayoutManager)a.aK.c()).M());
    }
}
