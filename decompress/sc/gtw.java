import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtw extends RecyclerView implements arln
{
    public atke aa;
    public LinearLayoutManager ab;
    public long ac;
    public Runnable ad;
    public gte ae;
    public long af;
    public iw ag;
    public iw ah;
    private arli ai;
    private boolean aj;
    
    public gtw(final Context context) {
        super(context);
        if (!this.aj) {
            this.aj = true;
            ((gtu)this.aR()).n(this);
        }
    }
    
    public final void T(final int n) {
        if (n == 1) {
            final InputMethodManager inputMethodManager = (InputMethodManager)this.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(this.getWindowToken(), 2);
            }
        }
    }
    
    public final arli a() {
        if (this.ai == null) {
            this.ai = new arli((View)this, false);
        }
        return this.ai;
    }
    
    public final long aK(final int n, final int n2) {
        final gts gts = (gts)super.m;
        if (gts == null) {
            return 0L;
        }
        final int f = gts.f();
        final int max = Math.max(gts.b(), this.getMeasuredWidth());
        if (max == 0) {
            return 0L;
        }
        return (n + n2 - f) * this.af / max;
    }
    
    public final long aL() {
        final gts gts = (gts)super.m;
        int f;
        if (gts != null) {
            f = gts.f();
        }
        else {
            f = 0;
        }
        return this.aK(this.computeHorizontalScrollOffset(), f);
    }
    
    public final long aM() {
        final gts gts = (gts)super.m;
        int f;
        if (gts != null) {
            f = gts.f();
        }
        else {
            f = 0;
        }
        return this.aK(this.computeHorizontalScrollOffset(), this.getMeasuredWidth() - f);
    }
    
    public final void aN() {
        final iw ag = this.ag;
        if (ag != null) {
            ag.b((RecyclerView)this, 101);
        }
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    public final int computeHorizontalScrollOffset() {
        final gts gts = (gts)super.m;
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)super.n;
        int n = 0;
        if (gts != null) {
            if (linearLayoutManager == null) {
                n = n;
            }
            else {
                final int k = linearLayoutManager.K();
                final View t = ((nw)linearLayoutManager).T(k);
                if (t == null) {
                    return 0;
                }
                if (k == 0) {
                    return Math.abs(t.getLeft());
                }
                n = gts.f() + (k - 1) * gts.e() + Math.abs(t.getLeft());
            }
        }
        return n;
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.a();
    }
}
