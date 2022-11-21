import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.Queue;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ackw
{
    private final Context a;
    private final acmh b;
    private final Queue c;
    private final Queue d;
    
    public ackw(final Context a, final acmh b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = new LinkedList();
        this.d = new LinkedList();
    }
    
    protected abstract ViewGroup a(final Context p0);
    
    @Deprecated
    public final View c(final aclz aclz, final Object o) {
        return this.f(aclz, o, null);
    }
    
    public final aclz d(aclz aclz) {
        final aclz aclz2 = this.d.poll();
        if (aclz2 == null) {
            aclz = new aclz(aclz);
        }
        else {
            aclz2.i(aclz);
            aclz = aclz2;
        }
        return aclz;
    }
    
    public final void e(final ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = viewGroup.getChildAt(i);
            if (child instanceof ViewGroup) {
                final ViewGroup viewGroup2 = (ViewGroup)child;
                final View child2 = viewGroup2.getChildAt(0);
                if (child2 != null) {
                    viewGroup2.removeAllViews();
                    final aclz a = aamz.A(child2);
                    if (a != null) {
                        a.h();
                        this.d.add(a);
                        aamz.G(child2, null);
                    }
                    this.b.b(child2);
                }
                this.c.add(viewGroup2);
            }
        }
        viewGroup.removeAllViews();
    }
    
    public final View f(final aclz aclz, final Object o, final ViewGroup viewGroup) {
        ViewGroup a;
        if ((a = this.c.poll()) == null) {
            a = this.a(this.a);
        }
        if (o != null) {
            final int c = this.b.c(o);
            final acmb e = this.b.e(c, viewGroup);
            View view;
            if (e == null) {
                view = null;
            }
            else {
                e.mK(aclz, o);
                final View a2 = e.a();
                aamz.I(a2, e, c);
                aamz.G(a2, aclz);
                view = a2;
            }
            if (view != null) {
                a.addView(view, -1, -2);
            }
        }
        return (View)a;
    }
}
