import android.animation.Animator;
import android.animation.AnimatorInflater;
import java.util.HashMap;
import java.util.Map;
import android.util.SparseArray;
import android.view.ViewStub;
import android.animation.Animator$AnimatorListener;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jeh
{
    public final Context a;
    public boolean b;
    public View c;
    public View d;
    public TextView e;
    public TextView f;
    public Animator$AnimatorListener g;
    public Animator$AnimatorListener h;
    acwr i;
    public final vai j;
    public final vai k;
    private final ViewStub l;
    private final SparseArray m;
    private final Map n;
    private Animator$AnimatorListener o;
    
    public jeh(final Context a, final ViewStub l, final vai j, final vai k) {
        this.a = a;
        this.l = l;
        this.m = new SparseArray();
        this.n = new HashMap();
        this.j = j;
        this.k = k;
    }
    
    public final void a(final View target, final int n, final Animator$AnimatorListener animator$AnimatorListener) {
        if (target == null) {
            return;
        }
        target.setVisibility(0);
        if (this.m.get(n) == null) {
            this.m.put(n, (Object)AnimatorInflater.loadAnimator(this.a, n));
        }
        final Animator animator = (Animator)this.m.get(n);
        this.b(target);
        this.n.put(target, animator);
        animator.setTarget((Object)target);
        animator.removeAllListeners();
        if (animator$AnimatorListener != null) {
            animator.addListener(animator$AnimatorListener);
        }
        animator.start();
    }
    
    public final void b(final View view) {
        if (this.n.containsKey(view) && this.n.get(view) != null) {
            final Animator animator = this.n.get(view);
            animator.removeAllListeners();
            animator.cancel();
        }
    }
    
    public final void c() {
        if (!this.b) {
            return;
        }
        this.a((View)this.f, 2130837571, this.o);
        final TextView e = this.e;
        if (e != null) {
            e.setVisibility(8);
        }
        final View d = this.d;
        if (d != null) {
            d.setVisibility(8);
        }
    }
    
    public final void d() {
        if (!this.b) {
            return;
        }
        this.a(this.d, 2130837575, null);
        final TextView e = this.e;
        if (e != null) {
            e.setVisibility(8);
        }
    }
    
    public final void e() {
        if (this.b) {
            return;
        }
        final View inflate = this.l.inflate();
        this.c = inflate;
        this.d = inflate.findViewById(2131432357);
        this.e = (TextView)this.c.findViewById(2131432358);
        this.f = (TextView)this.c.findViewById(2131432356);
        this.o = (Animator$AnimatorListener)new jee(this);
        this.g = (Animator$AnimatorListener)new jef(this);
        this.h = (Animator$AnimatorListener)new jeg(this);
        anb.X((View)this.e, 1);
        this.b = true;
    }
}
