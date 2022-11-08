import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Set;
import android.support.v7.widget.RecyclerView;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jsg
{
    public final ql a;
    public final Map b;
    public RecyclerView c;
    public acin d;
    public Set e;
    public Set f;
    public Set g;
    private final qf h;
    private acik i;
    
    public jsg() {
        final jsc h = new jsc(this);
        this.h = (qf)h;
        this.a = new ql((qf)h);
        this.b = new IdentityHashMap();
    }
    
    public static int a(final on on, final acjb acjb, final acin acin) {
        final int b = on.b();
        if (b == -1) {
            return -1;
        }
        return acjb.indexOf(acin.getItem(b));
    }
    
    public static jsg b(final acij acij) {
        return (jsg)r(acij, "DragReorderCoordinator.PRESENT_CONTEXT_KEY", jsg.class);
    }
    
    public static acil d(final on on) {
        if (on == null) {
            return null;
        }
        if (on instanceof aciq) {
            return ((aciq)on).t;
        }
        return actc.s(on.a);
    }
    
    public static acjb e(final acij acij) {
        return (acjb)r(acij, "DragReorderCoordinator.DATA_ADAPTER_KEY", acjb.class);
    }
    
    public static void k(final acij acij, final acjb acjb) {
        l(acij, "DragReorderCoordinator.DATA_ADAPTER_KEY", acjb);
    }
    
    public static void l(final acij acij, final String s, final Object o) {
        if (o != null) {
            acij.f(s, o);
        }
    }
    
    public static void n(final Set set, final Object o) {
        if (set == null) {
            return;
        }
        set.remove(o);
    }
    
    private static Object r(final acij acij, final String s, final Class clazz) {
        Object c;
        if (acij != null) {
            c = acij.c(s);
        }
        else {
            c = null;
        }
        if (clazz.isInstance(c)) {
            return clazz.cast(c);
        }
        return null;
    }
    
    private static Set s(final Set set, final Object o) {
        if (o == null) {
            return set;
        }
        Set set2;
        if ((set2 = set) == null) {
            set2 = new HashSet();
        }
        set2.add(o);
        return set2;
    }
    
    public final acik c() {
        if (this.i == null) {
            this.i = (acik)new fas(this, 12);
        }
        return this.i;
    }
    
    public final void f(final jsd jsd) {
        this.g = s(this.g, jsd);
    }
    
    public final void g(final jse jse) {
        this.f = s(this.f, jse);
    }
    
    public final void h(final jsf jsf) {
        this.e = s(this.e, jsf);
    }
    
    public final void i(final acil acil, final acjb acjb) {
        this.b.put(acil, acjb);
    }
    
    public final void j(final RecyclerView c, final acin d) {
        this.c = c;
        this.d = d;
        this.a.g(c);
    }
    
    public final void m(final acil acil) {
        this.b.remove(acil);
    }
    
    public final boolean o(final RecyclerView recyclerView) {
        return recyclerView == this.c;
    }
    
    public final boolean p(final on on) {
        return this.b.get(d(on)) != null;
    }
    
    public final boolean q(final on on, final on on2) {
        final acjb acjb = this.b.get(d(on));
        final acjb acjb2 = this.b.get(d(on2));
        return acjb != null && acjb == acjb2;
    }
}
