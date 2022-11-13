import android.support.v7.widget.RecyclerView;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acbu extends acfr
{
    public final acea q;
    public final wyw r;
    public final omw s;
    
    public acbu(final acea q, final omw s, final wyw r) {
        new HashSet(Arrays.asList(oxt.a));
        super(q.k, q.l);
        this.q = q;
        this.s = s;
        this.r = r;
    }
    
    public final void f() {
        super.d();
        final RecyclerView c = ((oxs)this).c;
        if (c != null) {
            c.aH((iw)((oxs)this).e);
            ((oxs)this).c.removeOnLayoutChangeListener(((oxs)this).f);
        }
        final nq b = ((oxs)this).b;
        if (b != null) {
            b.w((hw)((oxs)this).g);
        }
        ((oxs)this).b = null;
        ((oxs)this).c = null;
        ((oxs)this).p = null;
        ((oxs)this).j.clear();
        ((oxs)this).h = -1;
        ((oxs)this).i = -1;
        ((oxs)this).k = -1;
        ((oxs)this).l = -1;
        ((oxs)this).m = 1;
        ((oxs)this).n = -1;
        ((oxs)this).o = -1;
        ((oxs)this).a.clear();
    }
}
