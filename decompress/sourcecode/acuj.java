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

public final class acuj implements aciz, acod
{
    private final acup a;
    private final Map b;
    private final Map c;
    private final ReferenceQueue d;
    
    public acuj(final acup a, final aeby aeby, final aeby aeby2, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new ReferenceQueue();
        ((Set<acuj>)aeby.a).add(this);
        ((Set<acuj>)aeby2.a).add(this);
        final krj krj = new krj(this, 5);
        a.b.add(krj);
        final acug f = a.f;
        if (f != null) {
            ((actk)krj).mv(f);
        }
    }
    
    public static String c(final View view) {
        if (view == null) {
            return null;
        }
        return (String)view.getTag(2131432128);
    }
    
    private final void h(final aotf aotf, final View a) {
        if (aotf != null) {
            if (a != null) {
                final acup a2 = this.a;
                final acuf k = a2.k(aotf);
                k.a = a;
                k.n(false);
                a2.c(k.c());
            }
        }
    }
    
    private final void i() {
        for (acui acui = (acui)this.d.poll(); acui != null; acui = (acui)this.d.poll()) {
            final acui acui2 = this.c.get(acui.a);
            if (acui2 != null && acui2.get() == null) {
                this.c.remove(acui.a);
            }
        }
    }
    
    public final void a(final Object o, final View view) {
        final String e = gkt.e(o);
        if (e != null && !e.isEmpty()) {
            this.d(e, view);
        }
    }
    
    public final void b(final Object o, final View view) {
        final String e = gkt.e(o);
        if (e != null && !e.isEmpty()) {
            this.d(e, view);
        }
    }
    
    public final void d(final String s, final View view) {
        final String c = c(view);
        if (c != null && !c.equals(s)) {
            final acui acui = this.c.get(c);
            if (acui != null && view.equals(acui.get())) {
                this.c.remove(c);
            }
        }
        view.setTag(2131432128, (Object)s);
        if (s != null && !s.isEmpty()) {
            this.c.put(s, new acui(view, this.d, s));
            final Pair pair = this.b.get(s);
            aotf aotf;
            if (pair != null && ((aext)pair.second).a((Object)pair.first)) {
                aotf = (aotf)pair.first;
            }
            else {
                this.b.remove(s);
                aotf = null;
            }
            this.h(aotf, view);
        }
        this.i();
    }
    
    public final void e(final aotf aotf, final aext aext) {
        this.f(aotf, aext, true);
    }
    
    public final void f(final aotf aotf, final aext aext, final boolean b) {
        final String d = aotf.d;
        final WeakReference weakReference = this.c.get(d);
        View view = null;
        if (weakReference != null) {
            final View view2 = (View)weakReference.get();
            if (view2 != null && d.equals(c(view2))) {
                if (ana.am(view2)) {
                    view = view2;
                }
            }
            else {
                this.c.remove(d);
            }
        }
        if (b && view != null && !view.isDirty() && aext.a((Object)aotf)) {
            this.h(aotf, view);
        }
        else {
            this.b.put(aotf.d, new Pair((Object)aotf, (Object)aext));
        }
        this.i();
    }
    
    public final void g(final String s) {
        this.b.remove(s);
        this.i();
    }
}
