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

public final class dxk
{
    public final Map a;
    public final abp b;
    public final Map c;
    public final ArrayList d;
    public final dxj e;
    public dxy f;
    public final Map g;
    public final dyb h;
    public final eab i;
    public final hyx j;
    public final pvh k;
    
    public dxk(final eab i, final byte[] array) {
        this.a = new HashMap();
        this.j = new hyx((byte[])null);
        this.b = new abp();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new dxj(this);
        this.h = new dyb(this, 1);
        this.k = new pvh(this);
        this.g = new LinkedHashMap();
        this.i = i;
    }
    
    public static void b(final dxi dxi) {
        if (dxi.d != null) {
            dxi.d = null;
        }
        if (dxi.e != null) {
            dxi.e = null;
        }
    }
    
    public static void e(final dxw dxw, final dwj dwj) {
        for (short b = dwj.b, n = 0; n < b; ++n) {
            dxw.c(dwj.c((int)n));
        }
    }
    
    public static void g(final dxw dxw, final float n, final dwj dwj) {
        for (short b = dwj.b, n2 = 0; n2 < b; ++n2) {
            dxw.d(dwj.c((int)n2), n);
        }
    }
    
    private final void i(final dxf dxf, final dxh dxh, final ArrayList list) {
        final Object a = ((cya)dxf.e.b).a;
        final dxi dxi = (dxi)this.j.E(dxh);
        dyh dyh2;
        final dyh dyh = dyh2 = null;
        Label_0513: {
            if (dxi != null) {
                if (dxi.d == null && dxi.e == null) {
                    dyh2 = dyh;
                }
                else {
                    dxi.h = (dxf.b() || dxi.h);
                    final int c = dxi.c;
                    Label_0145: {
                        if (c == 0) {
                            if (dxf.a()) {
                                break Label_0145;
                            }
                        }
                        else if (c != 2 || dxf.b()) {
                            break Label_0145;
                        }
                        dxi.g = true;
                        dyh2 = dyh;
                        break Label_0513;
                    }
                    final glo glo = dxi.a.get(a);
                    final dye dye = new dye(dxh, (dxw)a);
                    float c2;
                    if (glo != null) {
                        c2 = ((dzd)glo.d).c;
                    }
                    else if (dxi.c != 0) {
                        c2 = ((dxw)a).e((dvd)dxi.d.d());
                    }
                    else {
                        c2 = dxf.c.a;
                    }
                    float n;
                    if (dxi.c != 2) {
                        n = ((dxw)a).e((dvd)dxi.e.d());
                    }
                    else {
                        n = dxf.d.a;
                    }
                    Label_0326: {
                        if (glo != null) {
                            final Object e = glo.e;
                            if (e != null) {
                                if (n == (float)e) {
                                    dyh2 = dyh;
                                    break Label_0513;
                                }
                                break Label_0326;
                            }
                        }
                        if (c2 == n) {
                            dyh2 = dyh;
                            break Label_0513;
                        }
                    }
                    final dyh a2 = dxf.a.a(new dyd(dye, n));
                    ((dxy)a2).a((dxz)this.e);
                    glo glo2;
                    if ((glo2 = glo) == null) {
                        glo2 = new glo((byte[])null, (byte[])null);
                        glo2.d = new dxx(dxi.b, (dxw)a);
                        dxi.a.put(a, glo2);
                    }
                    final Object d = glo2.d;
                    ((dzd)d).c = c2;
                    ((dxx)d).c(c2);
                    ++glo2.a;
                    final ArrayList list2 = new ArrayList();
                    list2.add(dye);
                    this.a.put(a2, list2);
                    this.c.put(dye, c2);
                    if (!TextUtils.isEmpty((CharSequence)null)) {
                        this.b.h(a2.hashCode(), (Object)null);
                    }
                    dyh2 = a2;
                }
            }
        }
        if (dyh2 != null) {
            list.add(dyh2);
        }
    }
    
    private final void j(final View view, final boolean b) {
        if (view instanceof efx && !(view instanceof egh)) {
            if (b) {
                if (this.g.containsKey(view)) {
                    ((efx)view).setClipChildren((boolean)this.g.remove(view));
                }
            }
            else {
                final Map g = this.g;
                final efx efx = (efx)view;
                g.put(efx, efx.getClipChildren());
                efx.setClipChildren(false);
            }
        }
        final ViewParent parent = view.getParent();
        if (parent instanceof efx && !(parent instanceof egh)) {
            this.j((View)parent, b);
        }
    }
    
    public final dxy a(final dxg dxg) {
        final boolean b = dxg instanceof dxf;
        final dxy dxy = null;
        int i = 0;
        if (b) {
            final dxf dxf = (dxf)dxg;
            final eab e = dxf.e;
            final ArrayList list = new ArrayList();
            final argj argj = (argj)e.a;
            final int n = argj.a - 1;
            if (n != 1) {
                if (n != 2) {
                    this.i(dxf, (dxh)((Map<Object, Object>)this.j.b).get(argj.b), list);
                }
                else {
                    final String[] array = (String[])argj.b;
                    final String b2 = dxf.b;
                    for (int j = 0; j < array.length; ++j) {
                        final dxh k = this.j.I(array[j]);
                        if (k != null) {
                            this.i(dxf, k, list);
                        }
                    }
                }
            }
            else {
                final Object b3 = argj.b;
                final hyx l = this.j;
                final String b4 = dxf.b;
                this.i(dxf, l.I((String)b3), list);
            }
            Object o;
            if (list.isEmpty()) {
                o = dxy;
            }
            else if (list.size() == 1) {
                o = list.get(0);
            }
            else {
                o = new dyc((List)list);
            }
            return (dxy)o;
        }
        if (!(dxg instanceof dxl)) {
            throw new RuntimeException("Unhandled Transition type: ".concat(String.valueOf(String.valueOf(dxg))));
        }
        final ArrayList a = ((dxl)dxg).a;
        final ArrayList list2 = new ArrayList();
        while (i < a.size()) {
            final dxy a2 = this.a(a.get(i));
            if (a2 != null) {
                list2.add(a2);
            }
            ++i;
        }
        if (list2.isEmpty()) {
            return null;
        }
        return (dxy)new dyc((List)list2);
    }
    
    public final void c(final dxh dxh, final dwj d, final dwj e) {
        dxi dxi;
        if ((dxi = (dxi)this.j.E(dxh)) == null) {
            final dxi dxi2 = new dxi();
            final hyx j = this.j;
            dxi = dxi2;
            if (((Map<dxh, dxi>)j.a).put(dxh, dxi2) == null) {
                final int a = dxh.a;
                if (a != 1) {
                    if (a != 2) {
                        ((Map<String, dxh>)j.d).put(dxh.b, dxh);
                        dxi = dxi2;
                    }
                    else {
                        final String c = dxh.c;
                        Map map;
                        if ((map = ((Map<K, Map>)j.c).get(c)) == null) {
                            map = new LinkedHashMap();
                            ((Map<String, Map>)j.c).put(c, map);
                        }
                        map.put(dxh.b, dxh);
                        dxi = dxi2;
                    }
                }
                else {
                    ((Map<String, dxh>)j.b).put(dxh.b, dxh);
                    dxi = dxi2;
                }
            }
        }
        if (d == null && e == null) {
            throw new RuntimeException("Both current and next LayoutOutput groups were null!");
        }
        if (d == null) {
            dxi.c = 0;
        }
        else if (e != null) {
            dxi.c = 1;
        }
        else {
            final int c2 = dxi.c;
            if ((c2 == 0 || c2 == 1) && !dxi.h) {
                dxi.g = true;
            }
            dxi.c = 2;
        }
        dxi.d = d;
        dxi.e = e;
        final dwj e2 = dxi.e;
        dvd dvd;
        if (e2 != null) {
            dvd = (dvd)e2.d();
        }
        else {
            dvd = null;
        }
        for (final dxw dxw : dxi.a.keySet()) {
            final glo glo = dxi.a.get(dxw);
            if (dvd == null) {
                glo.b = null;
            }
            else {
                glo.b = dxw.e(dvd);
            }
        }
        dxi.f = true;
    }
    
    public final void d(final dwj dwj, final boolean b) {
        final Object b2 = dwj.b(3);
        if (!(b2 instanceof View)) {
            return;
        }
        this.j((View)b2, b);
    }
    
    final void f(final dxh dxh, final dwj dwj) {
        final dxi dxi = (dxi)this.j.E(dxh);
        if (dxi != null) {
            this.h(dxi, dwj);
        }
    }
    
    public final void h(final dxi dxi, final dwj b) {
        final dwj b2 = dxi.b;
        if ((b2 != null || b != null) && (b2 == null || !b2.equals((Object)b))) {
            final Map a = dxi.a;
            if (dxi.b != null) {
                final Iterator iterator = a.keySet().iterator();
                while (iterator.hasNext()) {
                    e((dxw)iterator.next(), dxi.b);
                }
                this.d(dxi.b, true);
            }
            final Iterator iterator2 = a.values().iterator();
            while (iterator2.hasNext()) {
                final Object d = ((glo)iterator2.next()).d;
                final dxx dxx = (dxx)d;
                dxx.b(b);
                dxx.c(((dzd)d).c);
            }
            if (b != null) {
                this.d(b, false);
            }
            dxi.b = b;
        }
    }
}
