import android.view.ViewGroup;
import android.graphics.Rect;
import android.view.View;
import java.util.Iterator;
import com.facebook.litho.ComponentTree;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxm extends egi implements egh
{
    public static final dxm a;
    
    static {
        a = new dxm();
    }
    
    private dxm() {
    }
    
    public static int a(final egn egn, int i) {
        final egd e = egn.e(i);
        ++i;
        while (i < egn.a()) {
            egd egd = egn.e(i).a;
            while (egd != e) {
                if (egd == null || (egd = egd.a) == null) {
                    return i - 1;
                }
            }
            ++i;
        }
        return egn.a() - 1;
    }
    
    public static boolean c(final dxl dxl) {
        return dxl.h != null;
    }
    
    public static boolean d(final dxl dxl, final egn egn) {
        return dxl.d == ((dve)egn).s || dxl.c.l();
    }
    
    public static void e(final aja aja, final egn egn) {
        final dxl dxl = (dxl)aja.a;
        epc.R();
        if (dxl.g) {
            return;
        }
        final ArrayList list = new ArrayList();
        final dve dve = (dve)egn;
        final List y = dve.y;
        if (y != null) {
            list.addAll(y);
        }
        final ComponentTree h = dve.c.h;
        final dxf dxf = null;
        List list2 = null;
        Label_0095: {
            if (h != null) {
                final List f = h.f();
                if (f != null) {
                    list2 = new ArrayList();
                    list2.addAll(f);
                    break Label_0095;
                }
            }
            list2 = null;
        }
        if (list2 != null) {
            final Iterator iterator = list2.iterator();
            while (iterator.hasNext()) {
                epc.U((dxf)iterator.next(), (List)list, dve.p);
            }
        }
        final toq toq = new toq((byte[])null);
        final toq toq2 = new toq((byte[])null);
        final dxg o = dve.o;
        if (o != null) {
            for (int size = list.size(), i = 0; i < size; ++i) {
                final dxf dxf2 = list.get(i);
                if (dxf2 == null) {
                    final String p2 = dve.p;
                    final String string = o.toString();
                    final StringBuilder sb = new StringBuilder("NULL_TRANSITION when collecting root bounds anim. Root: ");
                    sb.append(p2);
                    sb.append(", root TransitionId: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                epc.aa(o, dxf2, dxu.c, toq);
                epc.aa(o, dxf2, dxu.d, toq2);
            }
        }
        toq b = toq;
        if (!toq.a) {
            b = null;
        }
        toq c = toq2;
        if (!toq2.a) {
            c = null;
        }
        final ComponentTree h2 = dve.c.h;
        if (h2 != null) {
            h2.B = b;
            h2.C = c;
        }
        Object h3;
        if (list.isEmpty()) {
            h3 = dxf;
        }
        else if (list.size() == 1) {
            h3 = list.get(0);
        }
        else {
            h3 = new dxk(list);
        }
        dxl.h = (dxf)h3;
        dxl.g = true;
    }
    
    public static void f(final aja aja, final dwi dwi) {
        final dxl dxl = (dxl)aja.a;
        final dxg h = dxl.b.get(((efz)dwi.d()).d.b).h;
        final dxj e = dxl.e;
        if (e != null && h != null) {
            e.f(h, null);
        }
        for (short b = dwi.b, n = 0; n < b; ++n) {
            n(aja, (efz)dwi.c((int)n), true);
        }
    }
    
    public static void g(final aja aja, final egn egn, final int n, final boolean b) {
        for (int a = a(egn, n), i = n; i <= a; ++i) {
            final long a2 = egn.e(i).b.a();
            if (b) {
                if (!aja.h(a2)) {
                    aja.f(a2, false);
                }
            }
            else if (aja.h(a2)) {
                aja.i(a2);
            }
        }
        for (egd egd = egn.e(n).a; egd != null && egd.a != null; egd = egd.a) {
            final long a3 = egd.b.a();
            if (b) {
                if (!aja.h(a3)) {
                    aja.f(a3, false);
                }
                if (!aja.h(a3)) {
                    aja.f(a3, false);
                }
            }
            else if (aja.h(a3)) {
                aja.i(a3);
            }
        }
    }
    
    public static final void j(final aja aja) {
        ((dxl)aja.a).d = -1;
    }
    
    private static void m(final View view) {
        epc.R();
        final boolean b = view instanceof egl;
        int i = 0;
        if (b) {
            ((egl)view).u(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
            return;
        }
        if (view instanceof ViewGroup) {
            for (ViewGroup viewGroup = (ViewGroup)view; i < viewGroup.getChildCount(); ++i) {
                m(viewGroup.getChildAt(i));
            }
        }
    }
    
    private static void n(final aja aja, final efz efz, final boolean b) {
        final dxl dxl = (dxl)aja.a;
        final Object a = efz.a;
        if (a instanceof efw && !(a instanceof egg)) {
            final efw efw = (efw)a;
            int a2 = efw.a();
            while (--a2 >= 0) {
                n(aja, efw.b(a2), false);
            }
            if (efw.a() > 0) {
                throw new IllegalStateException("Recursively unmounting items from a Host, left some items behind, this should never happen.");
            }
        }
        final efw b2 = efz.b;
        if (b2 != null) {
            if (b) {
                ((egm)b2).e(efz);
            }
            else {
                b2.l(efz);
            }
            k(aja).v(efz);
            dxl.b.remove(efz.d.b);
            return;
        }
        throw new IllegalStateException("Disappearing mountItem has no host, can not be unmounted.");
    }
    
    public final boolean h(final aja aja, final efz efz) {
        return ((dxl)aja.a).b.containsKey(efz.d.b);
    }
    
    public final void i(final aja aja, final egf egf, final Object o) {
        if (aja.h(egf.a()) && ((dve)((dxl)aja.a).c).k.contains(egf.a())) {
            m((View)o);
        }
    }
}
