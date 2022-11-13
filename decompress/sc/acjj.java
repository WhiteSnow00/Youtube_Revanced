import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.Queue;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acjj
{
    private final Context a;
    private final acku b;
    private final Queue c;
    private final Queue d;
    
    public acjj(final Context a, final acku b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = new LinkedList();
        this.d = new LinkedList();
    }
    
    protected abstract ViewGroup a(final Context p0);
    
    @Deprecated
    public final View c(final ackm ackm, final Object o) {
        return this.f(ackm, o, null);
    }
    
    public final ackm d(ackm ackm) {
        final ackm ackm2 = this.d.poll();
        if (ackm2 == null) {
            ackm = new ackm(ackm);
        }
        else {
            ackm2.i(ackm);
            ackm = ackm2;
        }
        return ackm;
    }
    
    public final void e(final ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = viewGroup.getChildAt(i);
            if (child instanceof ViewGroup) {
                final ViewGroup viewGroup2 = (ViewGroup)child;
                final View child2 = viewGroup2.getChildAt(0);
                if (child2 != null) {
                    viewGroup2.removeAllViews();
                    final ackm x = aald.x(child2);
                    if (x != null) {
                        x.h();
                        this.d.add(x);
                        aald.D(child2, (ackm)null);
                    }
                    this.b.b(child2);
                }
                this.c.add(viewGroup2);
            }
        }
        viewGroup.removeAllViews();
    }
    
    public final View f(final ackm ackm, final Object o, final ViewGroup viewGroup) {
        ViewGroup a;
        if ((a = this.c.poll()) == null) {
            a = this.a(this.a);
        }
        if (o != null) {
            final int c = this.b.c(o);
            final acko e = this.b.e(c, viewGroup);
            View view;
            if (e == null) {
                view = null;
            }
            else {
                e.mN(ackm, o);
                final View a2 = e.a();
                aald.F(a2, e, c);
                aald.D(a2, ackm);
                view = a2;
            }
            if (view != null) {
                a.addView(view, -1, -2);
            }
        }
        return (View)a;
    }
}
