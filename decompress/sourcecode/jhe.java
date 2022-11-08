import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView$OnScrollListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhe implements AbsListView$OnScrollListener
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public jhe(final jhf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jhe(final nb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        if (this.b != 0) {
            return;
        }
        final jhf jhf = (jhf)this.a;
        jhf.aD = Math.max(jhf.aD, jhf.aB.getLastVisiblePosition());
    }
    
    public final void onScrollStateChanged(final AbsListView absListView, final int n) {
        if (this.b != 0) {
            if (n == 1 && !((nb)this.a).w() && ((nb)this.a).q.getContentView() != null) {
                final nb nb = (nb)this.a;
                nb.o.removeCallbacks((Runnable)nb.r);
                ((nb)this.a).r.run();
            }
            return;
        }
        if (n == 1) {
            tmy.p((View)((jhf)this.a).aA);
        }
    }
}
