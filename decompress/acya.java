import java.util.Set;
import java.lang.ref.WeakReference;
import android.util.Pair;
import android.view.View;
import java.util.HashMap;
import java.lang.ref.ReferenceQueue;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acya implements acmp, acrs
{
    private final acyg a;
    private final Map b;
    private final Map c;
    private final ReferenceQueue d;
    
    public acya(final acyg a, final aefs aefs, final adgg adgg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new ReferenceQueue();
        ((Set<acya>)aefs.a).add(this);
        ((Set<acya>)adgg.a).add(this);
        a.d((acxb)new ksv(this, 6));
    }
    
    public static String c(final View view) {
        if (view == null) {
            return null;
        }
        return (String)view.getTag(2131432132);
    }
    
    private final void h(final aoxu aoxu, final View a) {
        if (aoxu != null) {
            if (a != null) {
                final acyg a2 = this.a;
                final acxw l = a2.l(aoxu);
                l.a = a;
                l.n(false);
                a2.c(l.c());
            }
        }
    }
    
    private final void i() {
        for (acxz acxz = (acxz)this.d.poll(); acxz != null; acxz = (acxz)this.d.poll()) {
            final acxz acxz2 = this.c.get(acxz.a);
            if (acxz2 != null && acxz2.get() == null) {
                this.c.remove(acxz.a);
            }
        }
    }
    
    @Override
    public final void a(final Object o, final View view) {
        final String p2 = glg.p(o);
        if (p2 != null && !p2.isEmpty()) {
            this.d(p2, view);
        }
    }
    
    public final void b(final Object o, final View view) {
        final String p2 = glg.p(o);
        if (p2 != null && !p2.isEmpty()) {
            this.d(p2, view);
        }
    }
    
    public final void d(final String s, final View view) {
        final String c = c(view);
        if (c != null && !c.equals(s)) {
            final acxz acxz = this.c.get(c);
            if (acxz != null && view.equals(acxz.get())) {
                this.c.remove(c);
            }
        }
        view.setTag(2131432132, (Object)s);
        if (s != null && !s.isEmpty()) {
            this.c.put(s, new acxz(view, this.d, s));
            final Pair pair = this.b.get(s);
            aoxu aoxu;
            if (pair != null && ((afbk)pair.second).a(pair.first)) {
                aoxu = (aoxu)pair.first;
            }
            else {
                this.b.remove(s);
                aoxu = null;
            }
            this.h(aoxu, view);
        }
        this.i();
    }
    
    public final void e(final aoxu aoxu, final afbk afbk) {
        this.f(aoxu, afbk, true);
    }
    
    public final void f(final aoxu aoxu, final afbk afbk, final boolean b) {
        final String d = aoxu.d;
        final WeakReference weakReference = this.c.get(d);
        View view = null;
        if (weakReference != null) {
            final View view2 = (View)weakReference.get();
            if (view2 != null && d.equals(c(view2))) {
                if (anc.am(view2)) {
                    view = view2;
                }
            }
            else {
                this.c.remove(d);
            }
        }
        if (b && view != null && !view.isDirty() && afbk.a(aoxu)) {
            this.h(aoxu, view);
        }
        else {
            this.b.put(aoxu.d, new Pair((Object)aoxu, (Object)afbk));
        }
        this.i();
    }
    
    public final void g(final String s) {
        this.b.remove(s);
        this.i();
    }
}
