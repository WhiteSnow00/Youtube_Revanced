import java.util.Iterator;
import java.util.List;
import android.view.ViewParent;
import android.view.View;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxj
{
    public final Map a;
    public final abo b;
    public final Map c;
    public final ArrayList d;
    public final dxi e;
    public dxx f;
    public final Map g;
    public final dya h;
    public final eaa i;
    public final hyc j;
    public final qpt k;
    
    public dxj(final eaa i, final byte[] array) {
        this.a = new HashMap();
        this.j = new hyc((byte[])null);
        this.b = new abo();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new dxi(this);
        this.h = new dya(this, 1);
        this.k = new qpt(this);
        this.g = new LinkedHashMap();
        this.i = i;
    }
    
    public static void b(final dxh dxh) {
        if (dxh.d != null) {
            dxh.d = null;
        }
        if (dxh.e != null) {
            dxh.e = null;
        }
    }
    
    public static void e(final dxv dxv, final dwi dwi) {
        for (short b = dwi.b, n = 0; n < b; ++n) {
            dxv.c(dwi.c((int)n));
        }
    }
    
    public static void g(final dxv dxv, final float n, final dwi dwi) {
        for (short b = dwi.b, n2 = 0; n2 < b; ++n2) {
            dxv.d(dwi.c((int)n2), n);
        }
    }
    
    private final void i(final dxe dxe, final dxg dxg, final ArrayList list) {
        final Object a = ((cxz)dxe.e.b).a;
        final dxh dxh = (dxh)this.j.D(dxg);
        dyg dyg2;
        final dyg dyg = dyg2 = null;
        Label_0513: {
            if (dxh != null) {
                if (dxh.d == null && dxh.e == null) {
                    dyg2 = dyg;
                }
                else {
                    dxh.h = (dxe.b() || dxh.h);
                    final int c = dxh.c;
                    Label_0145: {
                        if (c == 0) {
                            if (dxe.a()) {
                                break Label_0145;
                            }
                        }
                        else if (c != 2 || dxe.b()) {
                            break Label_0145;
                        }
                        dxh.g = true;
                        dyg2 = dyg;
                        break Label_0513;
                    }
                    final glg glg = dxh.a.get(a);
                    final dyd dyd = new dyd(dxg, (dxv)a);
                    float c2;
                    if (glg != null) {
                        c2 = ((dzc)glg.d).c;
                    }
                    else if (dxh.c != 0) {
                        c2 = ((dxv)a).e((dvc)dxh.d.d());
                    }
                    else {
                        c2 = dxe.c.a;
                    }
                    float n;
                    if (dxh.c != 2) {
                        n = ((dxv)a).e((dvc)dxh.e.d());
                    }
                    else {
                        n = dxe.d.a;
                    }
                    Label_0326: {
                        if (glg != null) {
                            final Object e = glg.e;
                            if (e != null) {
                                if (n == (float)e) {
                                    dyg2 = dyg;
                                    break Label_0513;
                                }
                                break Label_0326;
                            }
                        }
                        if (c2 == n) {
                            dyg2 = dyg;
                            break Label_0513;
                        }
                    }
                    final dyg a2 = dxe.a.a(new dyc(dyd, n));
                    ((dxx)a2).a(this.e);
                    glg glg2;
                    if ((glg2 = glg) == null) {
                        glg2 = new glg(null, null);
                        glg2.d = new dxw(dxh.b, (dxv)a);
                        dxh.a.put(a, glg2);
                    }
                    final Object d = glg2.d;
                    ((dzc)d).c = c2;
                    ((dxw)d).c(c2);
                    ++glg2.a;
                    final ArrayList list2 = new ArrayList();
                    list2.add(dyd);
                    this.a.put(a2, list2);
                    this.c.put(dyd, c2);
                    if (!TextUtils.isEmpty((CharSequence)null)) {
                        this.b.h(a2.hashCode(), (Object)null);
                    }
                    dyg2 = a2;
                }
            }
        }
        if (dyg2 != null) {
            list.add(dyg2);
        }
    }
    
    private final void j(final View view, final boolean b) {
        if (view instanceof efw && !(view instanceof egg)) {
            if (b) {
                if (this.g.containsKey(view)) {
                    ((efw)view).setClipChildren((boolean)this.g.remove(view));
                }
            }
            else {
                final Map g = this.g;
                final efw efw = (efw)view;
                g.put(efw, efw.getClipChildren());
                efw.setClipChildren(false);
            }
        }
        final ViewParent parent = view.getParent();
        if (parent instanceof efw && !(parent instanceof egg)) {
            this.j((View)parent, b);
        }
    }
    
    public final dxx a(final dxf dxf) {
        final boolean b = dxf instanceof dxe;
        final dxx dxx = null;
        int i = 0;
        if (b) {
            final dxe dxe = (dxe)dxf;
            final eaa e = dxe.e;
            final ArrayList list = new ArrayList();
            final ardu ardu = (ardu)e.a;
            final int n = ardu.a - 1;
            if (n != 1) {
                if (n != 2) {
                    this.i(dxe, (dxg)((Map<Object, Object>)this.j.b).get(ardu.b), list);
                }
                else {
                    final String[] array = (String[])ardu.b;
                    final String b2 = dxe.b;
                    for (int j = 0; j < array.length; ++j) {
                        final dxg h = this.j.H(array[j]);
                        if (h != null) {
                            this.i(dxe, h, list);
                        }
                    }
                }
            }
            else {
                final Object b3 = ardu.b;
                final hyc k = this.j;
                final String b4 = dxe.b;
                this.i(dxe, k.H((String)b3), list);
            }
            Object o;
            if (list.isEmpty()) {
                o = dxx;
            }
            else if (list.size() == 1) {
                o = list.get(0);
            }
            else {
                o = new dyb((List)list);
            }
            return (dxx)o;
        }
        if (!(dxf instanceof dxk)) {
            throw new RuntimeException("Unhandled Transition type: ".concat(String.valueOf(String.valueOf(dxf))));
        }
        final ArrayList a = ((dxk)dxf).a;
        final ArrayList list2 = new ArrayList();
        while (i < a.size()) {
            final dxx a2 = this.a(a.get(i));
            if (a2 != null) {
                list2.add(a2);
            }
            ++i;
        }
        if (list2.isEmpty()) {
            return null;
        }
        return (dxx)new dyb((List)list2);
    }
    
    public final void c(final dxg dxg, final dwi d, final dwi e) {
        dxh dxh;
        if ((dxh = (dxh)this.j.D(dxg)) == null) {
            final dxh dxh2 = new dxh();
            final hyc j = this.j;
            dxh = dxh2;
            if (((Map<dxg, dxh>)j.a).put(dxg, dxh2) == null) {
                final int a = dxg.a;
                if (a != 1) {
                    if (a != 2) {
                        ((Map<String, dxg>)j.d).put(dxg.b, dxg);
                        dxh = dxh2;
                    }
                    else {
                        final String c = dxg.c;
                        Map map;
                        if ((map = ((Map<K, Map>)j.c).get(c)) == null) {
                            map = new LinkedHashMap();
                            ((Map<String, Map>)j.c).put(c, map);
                        }
                        map.put(dxg.b, dxg);
                        dxh = dxh2;
                    }
                }
                else {
                    ((Map<String, dxg>)j.b).put(dxg.b, dxg);
                    dxh = dxh2;
                }
            }
        }
        if (d == null && e == null) {
            throw new RuntimeException("Both current and next LayoutOutput groups were null!");
        }
        if (d == null) {
            dxh.c = 0;
        }
        else if (e != null) {
            dxh.c = 1;
        }
        else {
            final int c2 = dxh.c;
            if ((c2 == 0 || c2 == 1) && !dxh.h) {
                dxh.g = true;
            }
            dxh.c = 2;
        }
        dxh.d = d;
        dxh.e = e;
        final dwi e2 = dxh.e;
        dvc dvc;
        if (e2 != null) {
            dvc = (dvc)e2.d();
        }
        else {
            dvc = null;
        }
        for (final dxv dxv : dxh.a.keySet()) {
            final glg glg = dxh.a.get(dxv);
            if (dvc == null) {
                glg.b = null;
            }
            else {
                glg.b = dxv.e(dvc);
            }
        }
        dxh.f = true;
    }
    
    public final void d(final dwi dwi, final boolean b) {
        final Object b2 = dwi.b(3);
        if (!(b2 instanceof View)) {
            return;
        }
        this.j((View)b2, b);
    }
    
    final void f(final dxg dxg, final dwi dwi) {
        final dxh dxh = (dxh)this.j.D(dxg);
        if (dxh != null) {
            this.h(dxh, dwi);
        }
    }
    
    public final void h(final dxh dxh, final dwi b) {
        final dwi b2 = dxh.b;
        if ((b2 != null || b != null) && (b2 == null || !b2.equals((Object)b))) {
            final Map a = dxh.a;
            if (dxh.b != null) {
                final Iterator iterator = a.keySet().iterator();
                while (iterator.hasNext()) {
                    e((dxv)iterator.next(), dxh.b);
                }
                this.d(dxh.b, true);
            }
            final Iterator iterator2 = a.values().iterator();
            while (iterator2.hasNext()) {
                final Object d = ((glg)iterator2.next()).d;
                final dxw dxw = (dxw)d;
                dxw.b(b);
                dxw.c(((dzc)d).c);
            }
            if (b != null) {
                this.d(b, false);
            }
            dxh.b = b;
        }
    }
}
