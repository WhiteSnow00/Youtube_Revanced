import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import android.graphics.Rect;
import com.facebook.litho.ComponentTree;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtp
{
    public static final Map a;
    public dva b;
    private int c;
    
    static {
        a = new HashMap();
    }
    
    private dtp() {
    }
    
    static dtp c(final dva b, final int c) {
        synchronized (dtp.class) {
            final dtp dtp = new dtp();
            final dsx ac = b.ac();
            if (c >= b.aB().size()) {
                return null;
            }
            final dst dst = b.aB().get(c);
            if (b.aA() != null) {
                final String s = b.aA().get(c);
            }
            i(ac, coy.l(dst));
            dtp.b = b;
            dtp.c = c;
            b.aK(dtp);
            return dtp;
        }
    }
    
    public static dtp d(final ComponentTree componentTree) {
        dvf t;
        if (componentTree == null) {
            t = null;
        }
        else {
            t = componentTree.t;
        }
        dva n;
        if (t == null) {
            n = null;
        }
        else {
            n = t.n;
        }
        if (n != null && n != dsx.a) {
            return c(n, Math.max(0, n.aB().size() - 1));
        }
        return null;
    }
    
    public static dtp e(final dvu dvu) {
        return d(dvu.j);
    }
    
    public static String i(final dsx dsx, final String s) {
        final int identityHashCode = System.identityHashCode(dsx.h);
        final StringBuilder sb = new StringBuilder();
        sb.append(identityHashCode);
        sb.append(s);
        return sb.toString();
    }
    
    static void l(final dsx dsx, final dva dva) {
        if (dva.aB() != null) {
            if (!dva.aB().isEmpty()) {
                final dst dst = dva.aB().get(0);
                if (dva.aA() != null) {
                    final String s = dva.aA().get(0);
                }
                final dto dto = dtp.a.get(i(dsx, coy.l(dst)));
                if (dto != null) {
                    dto.b();
                }
            }
        }
    }
    
    private static int o(final dva dva) {
        if (dva == null) {
            return 0;
        }
        return dva.I() + o(q(dva));
    }
    
    private static int p(final dva dva) {
        if (dva == null) {
            return 0;
        }
        return dva.J() + p(q(dva));
    }
    
    private static dva q(final dva dva) {
        final dva ao = dva.ao();
        if (ao != null) {
            return ao;
        }
        return dva.an();
    }
    
    public final Rect a() {
        if (this.c == 0 && this.b.ao() == null) {
            return new Rect(0, 0, this.b.H(), this.b.a());
        }
        final int o = o(this.b);
        final int p = p(this.b);
        return new Rect(o, p, this.b.H() + o, this.b.a() + p);
    }
    
    public final dst b() {
        return this.b.aB().get(this.c);
    }
    
    public final dvu f() {
        final dsx ac = this.b.ac();
        ComponentTree h;
        if (ac == null) {
            h = null;
        }
        else {
            h = ac.h;
        }
        if (h == null) {
            return null;
        }
        return h.getLithoView();
    }
    
    public final ehb g() {
        return this.b.as();
    }
    
    public final Object h() {
        final dsq u = this.b.aB().get(this.c).u;
        if (u != null) {
            return u.e;
        }
        return null;
    }
    
    public final String j() {
        final dsq u = this.b.aB().get(this.c).u;
        if (u == null) {
            return null;
        }
        if ((u.a & 0x2) != 0x0) {
            return u.d;
        }
        return null;
    }
    
    public final List k() {
        if (this.m()) {
            final ArrayList list = new ArrayList();
            for (int r = this.b.R(), i = 0; i < r; ++i) {
                final dva al = this.b.al(i);
                final dtp c = c(al, Math.max(0, ((dty)al).b.size() - 1));
                if (c != null) {
                    list.add(c);
                }
            }
            final dva am = this.b.am();
            if (am != null && am.ba()) {
                for (int r2 = am.R(), j = 0; j < r2; ++j) {
                    final dva al2 = am.al(j);
                    final dtp c2 = c(al2, Math.max(0, ((dty)al2).b.size() - 1));
                    if (c2 != null) {
                        list.add(c2);
                    }
                }
            }
            return list;
        }
        final dtp c3 = c(this.b, this.c - 1);
        if (c3 != null) {
            return Collections.singletonList(c3);
        }
        return Collections.emptyList();
    }
    
    public final boolean m() {
        return this.c == 0;
    }
    
    public final bhv n() {
        if (this.m()) {
            return new bhv(this.b);
        }
        return null;
    }
}
