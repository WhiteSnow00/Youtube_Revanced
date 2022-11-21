import android.support.v7.widget.RecyclerView;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acdg extends achc
{
    public final acfn q;
    public final xab r;
    public final onm s;
    
    public acdg(final acfn q, final onm s, final xab r) {
        new HashSet(Arrays.asList(oyl.a));
        super(q.k, q.l);
        this.q = q;
        this.s = s;
        this.r = r;
    }
    
    public final void f() {
        super.d();
        final RecyclerView c = ((oyk)this).c;
        if (c != null) {
            c.aH((hz)((oyk)this).e);
            ((oyk)this).c.removeOnLayoutChangeListener(((oyk)this).f);
        }
        final nr b = ((oyk)this).b;
        if (b != null) {
            b.w((fo)((oyk)this).g);
        }
        ((oyk)this).b = null;
        ((oyk)this).c = null;
        ((oyk)this).p = null;
        ((oyk)this).j.clear();
        ((oyk)this).h = -1;
        ((oyk)this).i = -1;
        ((oyk)this).k = -1;
        ((oyk)this).l = -1;
        ((oyk)this).m = 1;
        ((oyk)this).n = -1;
        ((oyk)this).o = -1;
        ((oyk)this).a.clear();
    }
}
