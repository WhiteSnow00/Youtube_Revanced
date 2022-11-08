import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.Queue;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class achg
{
    private final Context a;
    private final acir b;
    private final Queue c;
    private final Queue d;
    
    public achg(final Context a, final acir b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = new LinkedList();
        this.d = new LinkedList();
    }
    
    protected abstract ViewGroup a(final Context p0);
    
    @Deprecated
    public final View c(final acij acij, final Object o) {
        return this.f(acij, o, null);
    }
    
    public final acij d(acij acij) {
        final acij acij2 = this.d.poll();
        if (acij2 == null) {
            acij = new acij(acij);
        }
        else {
            acij2.i(acij);
            acij = acij2;
        }
        return acij;
    }
    
    public final void e(final ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = viewGroup.getChildAt(i);
            if (child instanceof ViewGroup) {
                final ViewGroup viewGroup2 = (ViewGroup)child;
                final View child2 = viewGroup2.getChildAt(0);
                if (child2 != null) {
                    viewGroup2.removeAllViews();
                    final acij r = actc.r(child2);
                    if (r != null) {
                        r.h();
                        this.d.add(r);
                        actc.x(child2, (acij)null);
                    }
                    this.b.b(child2);
                }
                this.c.add(viewGroup2);
            }
        }
        viewGroup.removeAllViews();
    }
    
    public final View f(final acij acij, final Object o, final ViewGroup viewGroup) {
        ViewGroup a;
        if ((a = this.c.poll()) == null) {
            a = this.a(this.a);
        }
        if (o != null) {
            final int c = this.b.c(o);
            final acil e = this.b.e(c, viewGroup);
            View view;
            if (e == null) {
                view = null;
            }
            else {
                e.mN(acij, o);
                final View a2 = e.a();
                actc.z(a2, e, c);
                actc.x(a2, acij);
                view = a2;
            }
            if (view != null) {
                a.addView(view, -1, -2);
            }
        }
        return (View)a;
    }
}
