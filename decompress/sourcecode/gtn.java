import java.util.concurrent.atomic.AtomicReference;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtn extends RecyclerView implements ariy
{
    public atjj aa;
    public atjj ab;
    public LinearLayoutManager ac;
    public long ad;
    public Runnable ae;
    public gsv af;
    public gte ag;
    public asho ah;
    public asic ai;
    public boolean aj;
    public long ak;
    public iw al;
    public iw am;
    private arit an;
    private boolean ao;
    
    public gtn(final Context context) {
        super(context);
        if (!this.ao) {
            this.ao = true;
            ((gtl)this.aR()).n(this);
        }
    }
    
    @Override
    public final void T(final int n) {
        if (n == 1) {
            final InputMethodManager inputMethodManager = (InputMethodManager)this.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(this.getWindowToken(), 2);
            }
        }
    }
    
    public final arit a() {
        if (this.an == null) {
            this.an = new arit((View)this, false);
        }
        return this.an;
    }
    
    public final long aK(final int n, final int n2) {
        final gtj gtj = (gtj)super.m;
        if (gtj == null) {
            return 0L;
        }
        final int f = gtj.f();
        final int max = Math.max(gtj.b(), this.getMeasuredWidth());
        if (max == 0) {
            return 0L;
        }
        return (n + n2 - f) * this.ak / max;
    }
    
    public final long aL() {
        final gtj gtj = (gtj)super.m;
        int f;
        if (gtj != null) {
            f = gtj.f();
        }
        else {
            f = 0;
        }
        return this.aK(this.computeHorizontalScrollOffset(), f);
    }
    
    public final long aM() {
        final gtj gtj = (gtj)super.m;
        int f;
        if (gtj != null) {
            f = gtj.f();
        }
        else {
            f = 0;
        }
        return this.aK(this.computeHorizontalScrollOffset(), this.getMeasuredWidth() - f);
    }
    
    public final void aN() {
        final iw al = this.al;
        if (al != null) {
            al.b(this, 101);
        }
    }
    
    public final void aO() {
        final asic ai = this.ai;
        if (ai != null && !ai.tx()) {
            asjg.b((AtomicReference)this.ai);
        }
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    @Override
    public final int computeHorizontalScrollOffset() {
        final gtj gtj = (gtj)super.m;
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)super.n;
        int n = 0;
        if (gtj != null) {
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
                n = gtj.f() + (k - 1) * gtj.e() + Math.abs(t.getLeft());
            }
        }
        return n;
    }
}
