import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.io.Serializable;
import com.facebook.litho.ComponentTree;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import android.view.View$OnTouchListener;
import android.util.SparseArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewOutlineProvider;
import com.facebook.litho.ComponentHost;
import android.view.ViewGroup;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvy implements efy
{
    public static final Rect a;
    private final dsw A;
    private final Set B;
    private final eg C;
    public final abk b;
    public final Map c;
    public long[] d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final abk h;
    public final dvt i;
    public final Rect j;
    public final dvx k;
    public int l;
    public int m;
    public int n;
    public dve o;
    public dve p;
    public final efz q;
    public final egr r;
    public egh s;
    public final dxm t;
    public int u;
    public final mvz v;
    public wtl w;
    public final aja x;
    public final aja y;
    private final abk z;
    
    static {
        a = new Rect();
    }
    
    public dvy(final dvt dvt) {
        this.h = new abk();
        this.j = new Rect();
        this.v = new mvz(null);
        this.k = new dvx();
        final boolean a = dyo.a;
        this.n = -1;
        this.B = new HashSet();
        this.C = new eg((byte[])null, (byte[])null);
        this.u = 0;
        this.b = new abk();
        this.z = new abk();
        this.A = dvt.l;
        this.i = dvt;
        this.e = true;
        HashMap c;
        if (dyo.e) {
            c = new HashMap();
        }
        else {
            c = null;
        }
        this.c = c;
        final glg glg = new glg(null);
        glg.e = egw.a;
        final efz q = new efz(dvc.g(new dvc((dty)null, glg, (dss)duw.b(), (String)null, dvt.m, 0, 0, 0, 0L, 0, dvt.getContext().getResources().getConfiguration().orientation, (dxg)null, (byte[])null), (egd)null, (Map)null), (efw)dvt, (Object)dvt);
        q.e = new dvn((Object)dvt);
        this.q = q;
        final egr a2 = egr.a;
        this.r = a2;
        final aja l = ((egi)a2).l(new wtl((efy)this));
        this.x = l;
        ((egq)l.a).f = (efw)dvt;
        final dxm a3 = dxm.a;
        this.t = a3;
        if (this.w == null) {
            this.w = new wtl((efy)this);
        }
        final wtl w = this.w;
        final aja i = a3.l(w);
        if (a3 instanceof egh) {
            ((dvy)w.c).s = (egh)a3;
            w.d = i;
        }
        final boolean a4 = w.a;
        w.a = false;
        ((Map<dxm, aja>)w.e).put(a3, i);
        ((List<dxm>)w.b).add(a3);
        aja p;
        if (a3 == a2) {
            p = l;
        }
        else {
            p = this.w.p((egi)a3);
        }
        this.y = p;
    }
    
    private static void D(final View view, final boolean b) {
        bkv.e();
        final boolean b2 = view instanceof dvt;
        int i = 0;
        if (b2) {
            final dvt dvt = (dvt)view;
            if (dvt.F()) {
                if (!b) {
                    dvt.u(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
                    return;
                }
                dvt.t();
            }
        }
        else if (view instanceof ViewGroup) {
            for (ViewGroup viewGroup = (ViewGroup)view; i < viewGroup.getChildCount(); ++i) {
                D(viewGroup.getChildAt(i), b);
            }
        }
    }
    
    static dsv c(final View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost)view).c;
        }
        return (dsv)view.getTag(2131428376);
    }
    
    static dsx d(final View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost)view).e;
        }
        return (dsx)view.getTag(2131428377);
    }
    
    static dtd e(final View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost)view).d;
        }
        return (dtd)view.getTag(2131428378);
    }
    
    static dte f(final View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost)view).f;
        }
        return (dte)view.getTag(2131428380);
    }
    
    public static void k(final Object o, final int n, final int n2, final int n3, final int n4, final boolean b) {
        bkv.e();
        epc.T(n, n2, n3, n4, o, b);
    }
    
    public static void o(efz efz) {
        final dvc b = dvc.b(efz);
        final int a = dvn.a(efz).a;
        final Object a2 = efz.a;
        final dss c = b.c;
        final boolean v = dss.v(c);
        if (dss.z(c)) {
            efz = (efz)a2;
            final dty m = b.m;
            final int n = 1;
            if (m != null) {
                if (m.j != null) {
                    final dsv c2 = c((View)efz);
                    if (c2 != null) {
                        c2.a = null;
                    }
                }
                if (m.l != null) {
                    final dtd e = e((View)efz);
                    if (e != null) {
                        e.a = null;
                    }
                }
                if (m.k != null) {
                    final dsx d = d((View)efz);
                    if (d != null) {
                        d.a = null;
                    }
                }
                if (m.m != null) {
                    final dte f = f((View)efz);
                    if (f != null) {
                        f.a = null;
                    }
                }
                if (m.n != null) {
                    if (efz instanceof dut) {
                        final elw p = ((dut)efz).p();
                        if (p != null) {
                            p.a = null;
                        }
                    }
                    final dte f2 = f((View)efz);
                    if (f2 != null) {
                        f2.b = null;
                    }
                }
                ((View)efz).setTag((Object)null);
                final SparseArray c3 = m.c;
                if (efz instanceof ComponentHost) {
                    ((ComponentHost)efz).b = null;
                }
                else if (c3 != null) {
                    for (int size = c3.size(), i = 0; i < size; ++i) {
                        ((View)efz).setTag(c3.keyAt(i), (Object)null);
                    }
                }
                if (m.d != null) {
                    ((View)efz).setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                }
                if (m.e) {
                    ((View)efz).setClipToOutline(false);
                }
                if (!m.f && efz instanceof ViewGroup) {
                    ((ViewGroup)efz).setClipChildren(true);
                }
                if (!TextUtils.isEmpty(m.a)) {
                    ((View)efz).setContentDescription((CharSequence)null);
                }
                if (m.B()) {
                    if (((View)efz).getScaleX() != 1.0f) {
                        ((View)efz).setScaleX(1.0f);
                    }
                    if (((View)efz).getScaleY() != 1.0f) {
                        ((View)efz).setScaleY(1.0f);
                    }
                }
                if (m.w() && ((View)efz).getAlpha() != 1.0f) {
                    ((View)efz).setAlpha(1.0f);
                }
                if (m.y() && ((View)efz).getRotation() != 0.0f) {
                    ((View)efz).setRotation(0.0f);
                }
                if (m.z() && ((View)efz).getRotationX() != 0.0f) {
                    ((View)efz).setRotationX(0.0f);
                }
                if (m.A() && ((View)efz).getRotationY() != 0.0f) {
                    ((View)efz).setRotationY(0.0f);
                }
            }
            ((View)efz).setClickable(0x1 == (a & 0x1));
            ((View)efz).setLongClickable((a & 0x2) == 0x2);
            ((View)efz).setFocusable((a & 0x4) == 0x4);
            ((View)efz).setEnabled((a & 0x8) == 0x8);
            ((View)efz).setSelected((a & 0x10) == 0x10);
            if (b.f != 0) {
                ana.X((View)efz, 0);
            }
            final boolean b2 = efz instanceof ComponentHost;
            if (b2 || ((View)efz).getTag(2131428379) != null) {
                ((View)efz).setTag(2131428379, (Object)null);
                if (!b2) {
                    ana.N((View)efz, (akv)null);
                }
            }
            final glg n2 = b.n;
            if (n2 != null) {
                final int e2 = b.e;
                if (!v) {
                    if (n2.g()) {
                        try {
                            ((View)efz).setPadding(0, 0, 0, 0);
                        }
                        catch (final NullPointerException ex) {
                            efu.a().d("From component: ".concat(b.c.q()), (Throwable)ex);
                        }
                    }
                    if (n2.b != null) {
                        ((View)efz).setBackground((Drawable)null);
                    }
                    ((View)efz).setLayoutDirection(2);
                }
            }
            int n3;
            if ((a & 0x20) == 0x0) {
                n3 = -1;
            }
            else {
                n3 = n;
                if ((a & 0x40) == 0x40) {
                    n3 = 2;
                }
            }
            if (n3 != -1) {
                ((View)efz).setLayerType(n3, (Paint)null);
            }
        }
    }
    
    public static void p(final efz efz, final boolean b) {
        if (!dss.z(dvc.b(efz).c)) {
            return;
        }
        D((View)efz.a, b);
    }
    
    static void s(final View view, final dte dte) {
        if (view instanceof ComponentHost) {
            final ComponentHost componentHost = (ComponentHost)view;
            componentHost.setOnTouchListener((View$OnTouchListener)(componentHost.f = dte));
            return;
        }
        view.setOnTouchListener((View$OnTouchListener)dte);
        view.setTag(2131428380, (Object)dte);
    }
    
    public static void t(final efz efz) {
        final Object a = efz.a;
        final dvc b = dvc.b(efz);
        final dss c = b.c;
        if (dss.z(c)) {
            final View view = (View)a;
            final dty m = b.m;
            final int n = 2;
            if (m != null) {
                final dum j = m.j;
                if (j != null) {
                    dsv c2;
                    if ((c2 = c(view)) == null) {
                        c2 = new dsv();
                        if (view instanceof ComponentHost) {
                            final ComponentHost componentHost = (ComponentHost)view;
                            componentHost.setOnClickListener((View$OnClickListener)(componentHost.c = c2));
                        }
                        else {
                            view.setOnClickListener((View$OnClickListener)c2);
                            view.setTag(2131428376, (Object)c2);
                        }
                    }
                    c2.a = j;
                    view.setClickable(true);
                }
                final dum l = m.l;
                if (l != null) {
                    dtd e;
                    if ((e = e(view)) == null) {
                        e = new dtd();
                        if (view instanceof ComponentHost) {
                            final ComponentHost componentHost2 = (ComponentHost)view;
                            componentHost2.setOnLongClickListener((View$OnLongClickListener)(componentHost2.d = e));
                        }
                        else {
                            view.setOnLongClickListener((View$OnLongClickListener)e);
                            view.setTag(2131428378, (Object)e);
                        }
                    }
                    e.a = l;
                    view.setLongClickable(true);
                }
                final dum k = m.k;
                if (k != null) {
                    dsx d;
                    if ((d = d(view)) == null) {
                        d = new dsx();
                        if (view instanceof ComponentHost) {
                            final ComponentHost componentHost3 = (ComponentHost)view;
                            componentHost3.setOnFocusChangeListener((View$OnFocusChangeListener)(componentHost3.e = d));
                        }
                        else {
                            view.setOnFocusChangeListener((View$OnFocusChangeListener)d);
                            view.setTag(2131428377, (Object)d);
                        }
                    }
                    d.a = k;
                }
                final dum i = m.m;
                if (i != null) {
                    dte f;
                    if ((f = f(view)) == null) {
                        f = new dte();
                        s(view, f);
                    }
                    f.a = i;
                }
                final dum n2 = m.n;
                if (n2 != null) {
                    if (view instanceof dut) {
                        final dut dut = (dut)view;
                        elw p;
                        if ((p = dut.p()) == null) {
                            p = new elw();
                            dut.q(p);
                        }
                        p.a = n2;
                    }
                    else {
                        dte f2;
                        if ((f2 = f(view)) == null) {
                            f2 = new dte();
                            s(view, f2);
                        }
                        f2.b = n2;
                    }
                }
                final boolean b2 = view instanceof ComponentHost;
                if (b2 || m.C()) {
                    view.setTag(2131428379, (Object)m);
                }
                view.setTag(m.b);
                final SparseArray c3 = m.c;
                if (c3 != null) {
                    if (b2) {
                        ((ComponentHost)view).b = c3;
                    }
                    else {
                        for (int size = c3.size(), n3 = 0; n3 < size; ++n3) {
                            view.setTag(c3.keyAt(n3), c3.valueAt(n3));
                        }
                    }
                }
                final ViewOutlineProvider d2 = m.d;
                if (d2 != null) {
                    view.setOutlineProvider(d2);
                }
                if (m.e) {
                    view.setClipToOutline(true);
                }
                if (m.x() && view instanceof ViewGroup) {
                    ((ViewGroup)view).setClipChildren(m.f);
                }
                final CharSequence a2 = m.a;
                if (!TextUtils.isEmpty(a2)) {
                    view.setContentDescription(a2);
                }
                final int q = m.q;
                if (q == 1) {
                    view.setFocusable(true);
                }
                else if (q == 2) {
                    view.setFocusable(false);
                }
                final int r = m.r;
                if (r == 1) {
                    view.setClickable(true);
                }
                else if (r == 2) {
                    view.setClickable(false);
                }
                final int s = m.s;
                if (s == 1) {
                    view.setEnabled(true);
                }
                else if (s == 2) {
                    view.setEnabled(false);
                }
                final int t = m.t;
                if (t == 1) {
                    view.setSelected(true);
                }
                else if (t == 2) {
                    view.setSelected(false);
                }
                if (m.B()) {
                    final float g = m.g;
                    view.setScaleX(g);
                    view.setScaleY(g);
                }
                if (m.w()) {
                    view.setAlpha(m.h);
                }
                if (m.y()) {
                    view.setRotation(m.i);
                }
                if (m.z()) {
                    view.setRotationX(0.0f);
                }
                if (m.A()) {
                    view.setRotationY(0.0f);
                }
                ana.ad(view, (String)null);
            }
            final int f3 = b.f;
            if (f3 != 0) {
                ana.X(view, f3);
            }
            final glg n4 = b.n;
            if (n4 != null) {
                final boolean v = dss.v(c);
                if (n4.a != -1) {
                    view.setLayerType(0, (Paint)null);
                }
                final int e2 = b.e;
                if (!v) {
                    final Object b3 = n4.b;
                    if (b3 != null) {
                        view.setBackground((Drawable)b3);
                    }
                    if (n4.g()) {
                        final Object c4 = n4.c;
                        int left;
                        if (c4 != null) {
                            left = ((Rect)c4).left;
                        }
                        else {
                            left = 0;
                        }
                        final Object c5 = n4.c;
                        int top;
                        if (c5 != null) {
                            top = ((Rect)c5).top;
                        }
                        else {
                            top = 0;
                        }
                        final Object c6 = n4.c;
                        int right;
                        if (c6 != null) {
                            right = ((Rect)c6).right;
                        }
                        else {
                            right = 0;
                        }
                        final Object c7 = n4.c;
                        int bottom;
                        if (c7 != null) {
                            bottom = ((Rect)c7).bottom;
                        }
                        else {
                            bottom = 0;
                        }
                        view.setPadding(left, top, right, bottom);
                    }
                    final egw a3 = egw.a;
                    final int ordinal = ((egw)n4.e).ordinal();
                    int layoutDirection;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            layoutDirection = n;
                        }
                        else {
                            layoutDirection = 1;
                        }
                    }
                    else {
                        layoutDirection = 0;
                    }
                    view.setLayoutDirection(layoutDirection);
                }
            }
        }
    }
    
    public final dsw A(final dss dss) {
        dsw dsw;
        if ((dsw = dss.p) == null) {
            dsw = this.A;
        }
        return dsw;
    }
    
    public final void B(final Rect rect, final boolean b) {
        if (b) {
            final aja x = this.x;
            egc.a();
            if (!egr.d(x)) {
                egr.c(x, ((egq)x.a).e, true);
            }
            final epc a = egc.a;
            return;
        }
        final aja x2 = this.x;
        final boolean d = egr.d(x2);
        egr.d(x2);
        egc.a();
        if (true ^ d) {
            egr.c(x2, rect, false);
        }
        final epc a2 = egc.a;
    }
    
    public final void C(final dwj dwj) {
        final dvx k = this.k;
        if (!k.n) {
            mck.r(dwj);
            return;
        }
        if (k.j != 0 && !k.a.isEmpty()) {
            final String[] array = this.k.a.toArray(new String[0]);
            final Double[] array2 = this.k.f.toArray(new Double[0]);
            final String[] array3 = this.k.b.toArray(new String[0]);
            final Double[] array4 = this.k.g.toArray(new Double[0]);
            final String[] array5 = this.k.e.toArray(new String[0]);
            final String[] array6 = this.k.c.toArray(new String[0]);
            final Double[] array7 = this.k.h.toArray(new Double[0]);
            final String[] array8 = this.k.d.toArray(new String[0]);
            final Double[] array9 = this.k.i.toArray(new Double[0]);
            mck.t(dwj);
            return;
        }
        mck.r(dwj);
    }
    
    public final int a() {
        return this.b.c();
    }
    
    public final int b() {
        bkv.e();
        final long[] d = this.d;
        if (d == null) {
            return 0;
        }
        return d.length;
    }
    
    public final efz g(final int n) {
        bkv.e();
        final long[] d = this.d;
        if (d == null) {
            return null;
        }
        if (n >= d.length) {
            return null;
        }
        return (efz)this.b.e(d[n]);
    }
    
    public final efz h() {
        return (efz)this.b.e(0L);
    }
    
    public final String i(final efz efz) {
        final int b = this.b.b((Object)efz);
        boolean b2 = false;
        final int n = -1;
        int n3;
        long n4;
        if (b >= 0) {
            final long d = this.b.d(b);
            int n2 = 0;
            while (true) {
                final long[] d2 = this.d;
                n3 = n;
                n4 = d;
                if (n2 >= d2.length) {
                    break;
                }
                if (d == d2[n2]) {
                    n3 = n2;
                    n4 = d;
                    break;
                }
                ++n2;
            }
        }
        else {
            n4 = -1L;
            n3 = n;
        }
        final ComponentTree j = this.i.j;
        String q;
        if (j == null) {
            q = "<null_component_tree>";
        }
        else {
            q = j.a().q();
        }
        final Object a = efz.a;
        Serializable class1;
        if (a != null) {
            class1 = a.getClass();
        }
        else {
            class1 = "<null_content>";
        }
        final String value = String.valueOf(class1);
        final dss c = dvc.b(efz).c;
        final String q2 = dvc.b(efz).c.q();
        final String value2 = String.valueOf(dvc.b(efz).h);
        final efw b3 = efz.b;
        Serializable class2;
        if (b3 != null) {
            class2 = b3.getClass();
        }
        else {
            class2 = "<null_host>";
        }
        final String value3 = String.valueOf(class2);
        if (this.h.e(0L) == efz.b) {
            b2 = true;
        }
        final StringBuilder sb = new StringBuilder("rootComponent=");
        sb.append(q);
        sb.append(", index=");
        sb.append(n3);
        sb.append(", mapIndex=");
        sb.append(b);
        sb.append(", id=");
        sb.append(n4);
        sb.append(", disappearRange=[-1,-1], contentType=");
        sb.append(value);
        sb.append(", component=");
        sb.append(q2);
        sb.append(", transitionId=");
        sb.append(value2);
        sb.append(", host=");
        sb.append(value3);
        sb.append(", isRootHost=");
        sb.append(b2);
        return sb.toString();
    }
    
    public final void j() {
        if (this.t != null && this.e) {
            final aja y = this.y;
            final dxl dxl = (dxl)y.a;
            if (dxl.e != null) {
                egc.a();
                final LinkedHashMap linkedHashMap = new LinkedHashMap(dxl.f.size());
                for (int b = dxm.k(y).b(), i = 0; i < b; ++i) {
                    final efz g = ((dvy)dxm.k(y)).g(i);
                    if (g != null) {
                        final dvc a = g.d.b.a;
                        if (a.h != null) {
                            final int a2 = a.a();
                            dwi dwi;
                            if ((dwi = (dwi)linkedHashMap.get(a.h)) == null) {
                                dwi = new dwi();
                                linkedHashMap.put((Object)a.h, (Object)dwi);
                            }
                            dwi.f(a2, g.a);
                        }
                    }
                }
                for (final Map.Entry<dxg, V> entry : linkedHashMap.entrySet()) {
                    dxl.e.f(entry.getKey(), (dwi)entry.getValue());
                }
                for (final Map.Entry<K, dwi> entry2 : dxl.a.entrySet()) {
                    final dwi dwi2 = entry2.getValue();
                    final dwi dwi3 = new dwi();
                    for (short b2 = dwi2.b, n = 0; n < b2; ++n) {
                        dwi3.e(dwi2.a((int)n), ((efz)dwi2.c((int)n)).a);
                    }
                    dxl.e.f((dxg)entry2.getKey(), dwi3);
                }
                final epc a3 = egc.a;
            }
            if (dxm.d(dxl, dxl.c) && dxm.c(dxl)) {
                final dxj e = dxl.e;
                egc.a();
                for (final dyd dyd : e.c.keySet()) {
                    final float floatValue = e.c.get(dyd);
                    final dwi b3 = ((dxh)e.j.D(dyd.a)).b;
                    if (b3 != null) {
                        dxj.g(dyd.b, floatValue, b3);
                    }
                }
                e.c.clear();
                final dxx f = e.f;
                if (f != null) {
                    f.a(e.h);
                    e.f.f(e.k);
                    e.f = null;
                }
                final epc a4 = egc.a;
            }
            ((dve)dxl.c).c.h.r = false;
            final egn c = dxl.c;
            dxl.i = c;
            dxl.g = false;
            dxl.d = ((dve)c).s;
        }
    }
    
    public final void l(final efz efz, final dss dss, final Object o) {
        dvc.b(efz);
        ((dtc)dss).S(this.A(dss), o);
        final eg c = this.C;
        final boolean g = eg.G(dss);
        final int length = dss.v.length;
        if (g) {
            final HashSet set = new HashSet();
            final SparseArray g2 = dss.g();
            for (int i = 0; i < g2.size(); ++i) {
                final int key = g2.keyAt(i);
                final hyq hyq = (hyq)g2.valueAt(i);
                eg.J(key, hyq, (View)o);
                c.I(hyq, dss);
                set.add(hyq);
            }
            final int length2 = dss.v.length;
            ((Map<dss, HashSet>)c.d).put(dss, set);
            ((Map<dss, Object>)c.c).put(dss, o);
        }
        efz.c = true;
    }
    
    public final void m() {
        if (this.t != null) {
            dxm.j(this.y);
        }
        this.n = -1;
    }
    
    final void n() {
        egr.a(this.x);
    }
    
    public final void q(final int n, final egd egd, final dvc dvc, final dve dve) {
        final long nanoTime = System.nanoTime();
        final long i = dvc.i;
        Object o;
        if ((o = this.h.e(i)) == null) {
            final int b = dve.b(i);
            final egd e = dve.e(b);
            this.q(b, e, dvc.c(e), dve);
            o = this.h.e(i);
        }
        final dss c = dvc.c;
        final Context b2 = this.A.b;
        final dvw a = dtl.a(b2, (dtc)c);
        Object o2;
        if (a == null) {
            o2 = ((dtc)c).O(b2);
        }
        else {
            o2 = a.a(b2, (dtc)c);
        }
        final dsw a2 = this.A(c);
        ((dtc)c).V(a2, o2);
        if (dss.v(c)) {
            this.r(dvc.k, (ComponentHost)o2);
        }
        final efz efz = new efz(egd, (efw)o, o2);
        efz.e = new dvn(o2);
        this.b.i(this.d[n], (Object)efz);
        if (((dtc)c).ah()) {
            this.z.i(this.d[n], (Object)efz);
        }
        final Rect a3 = dvy.a;
        dvc.f(a3);
        ((ComponentHost)o).h(n, efz, a3);
        t(efz);
        this.l(efz, c, o2);
        dvc.f(a3);
        k(efz.a, a3.left, a3.top, a3.right, a3.bottom, true);
        final dvx k = this.k;
        if (k.n) {
            final List f = k.f;
            final double n2 = (double)(System.nanoTime() - nanoTime);
            Double.isNaN(n2);
            f.add(n2 / 1000000.0);
            this.k.a.add(c.q());
            final dvx j = this.k;
            ++j.j;
            final dsw p4 = c.p;
            final List e2 = j.e;
            final mck p5 = a2.p();
            String string = null;
            if (p4 != null) {
                final cxz l = p4.k;
                if (l != null) {
                    final Map m = p5.I(l);
                    if (m != null) {
                        final StringBuilder sb = new StringBuilder(m.size() * 16);
                        for (final Map.Entry<K, String> entry : m.entrySet()) {
                            sb.append((String)entry.getKey());
                            sb.append(':');
                            sb.append(entry.getValue());
                            sb.append(';');
                        }
                        string = sb.toString();
                    }
                }
            }
            e2.add(string);
        }
    }
    
    public final void r(final long n, final ComponentHost componentHost) {
        this.h.i(n, (Object)componentHost);
    }
    
    public final void u(final efz efz, final dss dss, final Object o) {
        dvc.b(efz);
        final eg c = this.C;
        if (!eg.G(dss)) {
            final int length = dss.v.length;
        }
        else {
            ((Map<Object, Object>)c.c).remove(dss);
            final Set set = ((Map<K, Set>)c.d).get(dss);
            if (set != null) {
                for (final hyq hyq : set) {
                    final Set set2 = ((Map<K, Set>)c.b).get(hyq);
                    set2.remove(dss);
                    if (set2.isEmpty()) {
                        ((Map<Object, Object>)c.b).remove(hyq);
                        ((Set)hyq.b).remove(c);
                    }
                }
                if (o instanceof View) {
                    final View view = (View)o;
                    if (view.getAlpha() != 1.0f) {
                        view.setAlpha(1.0f);
                    }
                    if (view.getTranslationX() != 0.0f) {
                        view.setTranslationX(0.0f);
                    }
                    if (view.getTranslationY() != 0.0f) {
                        view.setTranslationY(0.0f);
                    }
                    if (view.getScaleX() != 1.0f) {
                        view.setScaleX(1.0f);
                    }
                    if (view.getScaleY() != 1.0f) {
                        view.setScaleY(1.0f);
                    }
                    if (view.getElevation() != 0.0f) {
                        view.setElevation(0.0f);
                    }
                    if (view.getBackground() != null) {
                        view.setBackground((Drawable)null);
                    }
                    if (view.getRotation() != 0.0f) {
                        view.setRotation(0.0f);
                    }
                }
            }
        }
        final dsw a = this.A(dss);
        try {
            ((dtc)dss).aw(o);
        }
        catch (final Exception ex) {
            cox.g(a, ex);
        }
        efz.c = false;
    }
    
    public final void v(final efz efz) {
        final long k = dvc.b(efz).k;
        o(efz);
        final dss c = dvc.b(efz).c;
        final Object a = efz.a;
        final dsw a2 = this.A(c);
        if (efz.c) {
            this.u(efz, c, a);
        }
        ((dtc)c).ae(a2, a);
        if (this.t != null) {
            final aja y = this.y;
            final egf b = efz.d.b;
            final Object a3 = efz.a;
            final dxl dxl = (dxl)y.a;
            final egn c2 = dxl.c;
            final dwi dwi = null;
            dvc a4;
            if (c2 != null) {
                a4 = b.a;
            }
            else {
                a4 = null;
            }
            if (a4 != null) {
                final dxg h = a4.h;
                if (h != null) {
                    final int a5 = a4.a();
                    final dxj e = dxl.e;
                    if (e != null) {
                        final dxh dxh = (dxh)e.j.D(h);
                        if (dxh != null) {
                            final dwi b2 = dxh.b;
                            if (b2 != null && b2.b(a5) != null) {
                                dwi dwi2 = dwi;
                                if (b2.b > 1) {
                                    dwi2 = new dwi(b2);
                                    dwi2.f(a5, (Object)null);
                                }
                                e.h(dxh, dwi2);
                            }
                        }
                    }
                }
            }
        }
        else {
            final wtl w = this.w;
            if (w != null) {
                final egf b3 = efz.d.b;
                final Object a6 = efz.a;
                for (int size = ((List)w.b).size(), i = 0; i < size; ++i) {
                    w.p((egi)((List<Object>)w.b).get(i));
                }
            }
        }
        try {
            final dvn a7 = dvn.a(efz);
            final Context b4 = this.A.b;
            final dvc c3 = dvc.c(efz.d);
            final dss c4 = c3.c;
            if (!a7.b) {
                final Object a8 = efz.a;
                final dvw a9 = dtl.a(b4, (dtc)c4);
                if (a9 != null) {
                    a9.b(a8);
                }
                a7.b = true;
                a7.c = "unmountItem";
                return;
            }
            final String q = c4.q();
            final String b5 = c3.b;
            final String l = cox.l(c4);
            final String value = String.valueOf(c3.h);
            final String c5 = a7.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Releasing released mount content! component: ");
            sb.append(q);
            sb.append(", globalKey: ");
            sb.append(l);
            sb.append(", transitionId: ");
            sb.append(value);
            sb.append(", previousReleaseCause: ");
            sb.append(c5);
            throw new dvm(sb.toString());
        }
        catch (final dvm dvm) {
            final String message = dvm.getMessage();
            final String j = this.i(efz);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(message);
            sb2.append(" ");
            sb2.append(j);
            throw new RuntimeException(sb2.toString());
        }
    }
    
    public final void w(final int n, final abk abk) {
        final efz g = this.g(n);
        final long nanoTime = System.nanoTime();
        if (g == null) {
            return;
        }
        final long n2 = this.d[n];
        if (n2 == 0L) {
            o(g);
            return;
        }
        this.b.j(n2);
        final Object a = g.a;
        final egh s = this.s;
        int n4;
        final int n3 = n4 = 0;
        if (s != null) {
            n4 = n3;
            if (s.h((aja)this.w.d, g)) {
                n4 = 1;
            }
        }
        if (a instanceof ComponentHost && !(a instanceof dvt)) {
            final ComponentHost componentHost = (ComponentHost)a;
            for (int i = componentHost.a() - 1; i >= 0; --i) {
                final efz b = componentHost.b(i);
                if (this.b.b((Object)b) == -1) {
                    final dvc b2 = dvc.b(b);
                    final String q = b2.c.q();
                    final String value = String.valueOf(b2.h);
                    final StringBuilder sb = new StringBuilder("Child of mount item not found in MountSate mIndexToItemMap, child_component: ");
                    sb.append(q);
                    sb.append(", child_transitionId: ");
                    sb.append(value);
                    coy.d(2, "UnmountItem:ChildNotFound", sb.toString());
                }
                final abk b3 = this.b;
                final long d = b3.d(b3.b((Object)b));
                for (int j = this.d.length - 1; j >= 0; --j) {
                    if (this.d[j] == d) {
                        this.w(j, abk);
                        break;
                    }
                }
            }
            if (n4 == 0) {
                if (componentHost.a() > 0) {
                    final dvc b4 = dvc.b(g);
                    final String q2 = b4.c.q();
                    final String value2 = String.valueOf(b4.h);
                    final StringBuilder sb2 = new StringBuilder("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState, component: ");
                    sb2.append(q2);
                    sb2.append(", transitionId: ");
                    sb2.append(value2);
                    coy.d(2, "UnmountItem:ChildsNotUnmounted", sb2.toString());
                    throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                }
            }
        }
        final efw b5 = g.b;
        final dss c = dvc.b(g).c;
        if (((dtc)c).ah()) {
            this.z.j(this.d[n]);
        }
        if (dss.v(c)) {
            abk.k(abk.b((Object)a));
        }
        if (n4 != 0) {
            final dxl dxl = (dxl)((aja)this.w.d).a;
            final dvc dvc = dxl.b.get(g.d.b);
            final dwi dwi = dxl.a.get(dvc.h);
            if (dwi != null && dwi.b(dvc.a()) != null) {
                ((egm)b5).k(g);
            }
        }
        else {
            if (a instanceof duv) {
                final ArrayList list = new ArrayList();
                ((duv)a).a(list);
                for (int k = list.size() - 1; k >= 0; --k) {
                    ((dvt)list.get(k)).E();
                }
            }
            ((ComponentHost)b5).m(n, g);
            this.v(g);
        }
        final dvx l = this.k;
        if (l.n) {
            final List g2 = l.g;
            final double n5 = (double)(System.nanoTime() - nanoTime);
            Double.isNaN(n5);
            g2.add(n5 / 1000000.0);
            this.k.b.add(c.q());
            final dvx m = this.k;
            ++m.k;
        }
    }
    
    public final boolean x(final egd egd) {
        if (this.t == null) {
            return false;
        }
        final aja y = this.y;
        if (y != null) {
            return y.h(egd.b.a());
        }
        throw new IllegalStateException("Need a state when using the TransitionsExtension.");
    }
    
    final boolean y() {
        bkv.e();
        return this.e;
    }
    
    public final boolean z(final dve dve, final Rect rect, final boolean b) {
        final boolean empty = this.j.isEmpty();
        int i = 0;
        if (empty) {
            return false;
        }
        if (rect.left == this.j.left && rect.right == this.j.right) {
            final ArrayList j = dve.i;
            final ArrayList k = dve.j;
            final int a = dve.a();
            Label_0323: {
                if (rect.top < 0) {
                    if (this.j.top < 0) {
                        break Label_0323;
                    }
                }
                while (true) {
                    while (this.m < a) {
                        if (rect.top < dve.d((egj)k.get(this.m)).d.bottom) {
                            while (this.m > 0 && rect.top <= dve.d((egj)k.get(this.m - 1)).d.bottom) {
                                final int m = this.m - 1;
                                this.m = m;
                                final egd f = dve.f((egj)k.get(m));
                                final dvc c = dvc.c(f);
                                if (this.g(dve.b(c.k)) == null) {
                                    this.q(dve.b(c.k), f, c, dve);
                                    this.B.add(c.k);
                                }
                            }
                            break Label_0323;
                        }
                        final egd f2 = dve.f((egj)k.get(this.m));
                        final int b2 = dve.b(dvc.c(f2).k);
                        if (!this.x(f2)) {
                            this.w(b2, this.h);
                        }
                        ++this.m;
                    }
                    continue;
                }
            }
            final int height = this.i.getHeight();
            Label_0591: {
                if (rect.bottom >= height) {
                    if (this.j.bottom >= height) {
                        break Label_0591;
                    }
                }
                while (true) {
                    while (this.l < a) {
                        if (rect.bottom < dve.d((egj)j.get(this.l)).d.top) {
                            while (this.l > 0 && rect.bottom < dve.d((egj)j.get(this.l - 1)).d.top) {
                                final int l = this.l - 1;
                                this.l = l;
                                final egd f3 = dve.f((egj)j.get(l));
                                final int b3 = dve.b(dvc.c(f3).k);
                                if (!this.x(f3)) {
                                    this.w(b3, this.h);
                                }
                            }
                            break Label_0591;
                        }
                        final egd f4 = dve.f((egj)j.get(this.l));
                        final dvc c2 = dvc.c(f4);
                        if (this.g(dve.b(c2.k)) == null) {
                            this.q(dve.b(c2.k), f4, c2, dve);
                            this.B.add(c2.k);
                        }
                        ++this.l;
                    }
                    continue;
                }
            }
            while (i < this.z.c()) {
                final efz efz = (efz)this.z.g(i);
                final long d = this.z.d(i);
                if (!this.B.contains(d) && dve.b(d) != -1) {
                    p(efz, b);
                }
                ++i;
            }
            this.B.clear();
            return true;
        }
        return false;
    }
}
