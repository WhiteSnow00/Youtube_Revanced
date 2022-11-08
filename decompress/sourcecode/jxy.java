import java.util.concurrent.atomic.AtomicReference;
import android.support.v7.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxy extends iw implements adqq
{
    private final jxz a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final uyi e;
    
    public jxy(final jxz a) {
        this.b = false;
        this.c = false;
        this.d = false;
        this.a = a;
        this.e = null;
    }
    
    public jxy(final jxz a, final uyi e) {
        this.b = false;
        this.c = false;
        this.d = false;
        this.a = a;
        this.e = e;
    }
    
    public final void a(final AppBarLayout appBarLayout, final int n) {
        if (this.d) {
            return;
        }
        if (Math.abs(n) == appBarLayout.g() && this.b) {
            this.c = true;
            this.a.m();
            return;
        }
        if (n == 0 && this.c) {
            this.a.n();
        }
    }
    
    @Override
    public final void b(final RecyclerView recyclerView, final int n) {
        if (!this.d) {
            if (!this.b) {
                if (n == 1) {
                    this.b = true;
                }
            }
        }
    }
    
    public final void d(final RecyclerView recyclerView, final AppBarLayout appBarLayout) {
        if (recyclerView != null && appBarLayout != null) {
            recyclerView.aE(this);
            appBarLayout.i((adqn)this);
            return;
        }
        trn.b("Could not attach PartialPullListener listener as one or more target views was null.");
    }
    
    public final void e(final RecyclerView recyclerView, final AppBarLayout appBarLayout) {
        if (this.d) {
            return;
        }
        this.d = true;
        if (recyclerView != null && appBarLayout != null) {
            recyclerView.post((Runnable)new jku(this, recyclerView, 10));
            appBarLayout.post((Runnable)new jku(this, appBarLayout, 11));
            return;
        }
        trn.l("Disabled PartialPullListener but did not remove it, as one or more of the target  views was null.");
    }
    
    @Override
    public final void pu(final RecyclerView recyclerView, int n, final int n2) {
        if (this.d) {
            return;
        }
        if (n2 < 0) {
            if (this.e == null) {
                n = 0;
            }
            else {
                final afrz afrz = new afrz();
                asjg.b((AtomicReference)this.e.m(45374931L).aw((Object)0.0).Z((asix)new jou(afrz, 19)));
                n = -(int)afrz.a();
            }
            if (n2 < n) {
                this.a.n();
            }
        }
    }
}
