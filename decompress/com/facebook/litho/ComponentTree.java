// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.litho;

import android.content.Context;
import java.util.HashMap;
import java.util.ArrayDeque;
import androidx.viewpager.widget.ViewPager;
import android.os.HandlerThread;
import java.util.LinkedList;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import android.view.ViewGroup;
import android.util.Log;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentTree
{
    private static final AtomicInteger H;
    private static volatile Looper I;
    public static final String a = "ComponentTree";
    public static final ThreadLocal b;
    public final String A;
    public tqv B;
    public tqv C;
    public final bhv D;
    public final ajb E;
    public final msr F;
    public volatile pvh G;
    private boolean J;
    private String K;
    private Deque L;
    private int M;
    private boolean N;
    private final boolean O;
    private final boolean P;
    private dvk Q;
    private final Runnable R;
    private final Object S;
    private final List T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    private final eab aa;
    private volatile elx ab;
    private bhv ac;
    private final cya ad;
    private cya ae;
    private final hhg af;
    public final boolean c;
    public List d;
    public final Object e;
    public dtk f;
    public final dsx g;
    public boolean h;
    public final boolean i;
    public final boolean j;
    public boolean k;
    public final boolean l;
    public dvu m;
    public dvk n;
    public final Object o;
    public dth p;
    public volatile boolean q;
    public volatile boolean r;
    public dst s;
    public dvf t;
    public dvf u;
    public dws v;
    public final int w;
    public final dul x;
    public final boolean y;
    public final boolean z;
    
    static {
        H = new AtomicInteger(0);
        b = new ThreadLocal();
    }
    
    public ComponentTree(final dtg dtg) {
        this.E = new ajb((byte[])null);
        this.e = new Object();
        this.Q = (dvk)new dvj(Looper.getMainLooper());
        this.R = (Runnable)new dmc(this, 2);
        this.o = new Object();
        this.S = new Object();
        this.T = new ArrayList();
        this.U = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.D = new bhv((char[])null);
        this.af = new hhg((byte[])null, (byte[])null);
        this.ad = new cya((byte[])null, (byte[])null, (char[])null);
        final dsx g = new dsx(dtg.a, new dws(null), (cya)null, (pa)null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        g.h = this;
        g.e = null;
        this.g = g;
        this.s = dtg.c;
        boolean i;
        if (dtg.d) {
            final boolean a = dyp.a;
            i = true;
        }
        else {
            i = false;
        }
        this.i = i;
        this.j = dtg.b;
        this.O = dtg.e;
        this.P = dtg.f;
        this.n = dtg.g;
        this.l = true;
        this.q = dtg.i;
        this.r = false;
        this.g(dtg.j);
        this.z = dtg.m;
        final boolean a2 = dyp.a;
        this.y = dtg.k;
        this.x = dtg.l;
        dws v;
        if ((v = dtg.h) == null) {
            v = dws.a(null);
        }
        this.v = v;
        this.w = ComponentTree.H.getAndIncrement();
        this.aa = new eab(this);
        final dvk q = this.Q;
        final dut a3 = bku.a;
        this.Q = q;
        Object o;
        if ((o = this.n) == null) {
            if (dyp.u == null) {
                o = new dvj(z());
            }
            else {
                if (dwv.a == null) {
                    synchronized (dwv.class) {
                        if (dwv.a == null) {
                            dwv.a = new dwv(dwv.c, (byte[])null);
                        }
                    }
                }
                o = dwv.a;
            }
        }
        Object n;
        if (dyp.o) {
            Object o2 = o;
            if (o instanceof dwv) {
                o2 = new duo(afwm.g((Executor)((dwv)o).b));
            }
            final dut a4 = bku.a;
            n = o2;
        }
        else {
            n = new dwp((dvk)o);
            final dut a5 = bku.a;
        }
        this.n = (dvk)n;
        this.F = dtg.o;
        this.A = dtg.n;
        this.c = dsj.a(g.b);
    }
    
    private final void A() {
        this.af.h();
    }
    
    private final void B() {
        monitorenter(this);
        try {
            final dvf u = this.u;
            if (u != null) {
                final cya ad = this.ad;
                final elx g = u.G;
                if (g != null) {
                    final Object a = g.a;
                    if (a != null) {
                        final Iterator iterator = ((Map)a).keySet().iterator();
                        while (iterator.hasNext()) {
                            final hyx hyx = ((Map<K, hyx>)g.a).get(iterator.next());
                            for (int size = ((List)hyx.c).size(), i = 0; i < size; ++i) {
                                final dst dst = ((List<dst>)hyx.c).get(i);
                                final String s = ((List<String>)hyx.a).get(i);
                                final Object b = hyx.b;
                                if (ad.s(dst)) {
                                    final dsx p = dst.p;
                                    final Object b2 = hyx.b;
                                    ((dtd)dst).ao();
                                }
                            }
                        }
                    }
                }
            }
            ((Map)this.ad.a).clear();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void C(Rect bounds, boolean b) {
        final dvf t = this.t;
        if (t == null) {
            Log.w(ComponentTree.a, "Main Thread Layout state is not found");
            return;
        }
        this.m.G();
        this.h = true;
        while (true) {
            if (!this.q) {
                dvu m;
                ComponentTree j;
                Rect rect;
                dvt q;
                boolean[] a;
                dvt q2;
                boolean[] a2;
                boolean[] b2;
                ViewGroup viewGroup;
                dvz k;
                ComponentTree i;
                boolean l;
                int j2;
                int n;
                ajb x;
                egr egr;
                epf a3;
                ajb y;
                dxm dxm;
                dxm dxm2;
                Iterator iterator;
                dxk e;
                Iterator iterator2;
                dxi dxi;
                hyx j3;
                epf a4;
                int n3 = 0;
                dxm dxm3;
                Iterator iterator3;
                dwj dwj;
                dxg h;
                dxm dxm4;
                ego i2;
                Map<K, dwj> x2;
                dxk e2;
                Map x3;
                Iterator iterator4;
                int n4;
                HashSet<dxh> set;
                int a5;
                dwj dwj2;
                dwj dwj3;
                Rect rect2;
                Iterator<K> iterator7;
                dxh dxh2;
                HashSet set2;
                dxi dxi2;
                Iterator iterator9;
                epf a6;
                Iterator iterator10;
                dxh dxh4;
                dxk e3;
                ArrayList list;
                dxi dxi3;
                ArrayList list2;
                Object c;
                dxm dxm5;
                dwj dwj4;
                epf a7;
                int b4;
                dxm dxm6;
                int n8;
                ego i3;
                dxh h2;
                dxi dxi4;
                int a8;
                long a9;
                egg b5;
                ega g;
                StringBuilder sb;
                efx b6;
                efx b7;
                StringBuilder sb2;
                Object a10;
                StringBuilder sb3;
                efx efx;
                int n10;
                int n11;
                View view;
                int n12;
                int n13;
                int width;
                int n14;
                int n15;
                int n16;
                int n17;
                int width2;
                int n18;
                Rect rect3;
                dvd a11;
                dxh h3;
                dwj dwj5;
                long a12;
                efz k2;
                ega ega;
                epf a13;
                msr q3;
                int s;
                dwk e4;
                dsx g2;
                mxe v;
                int n19;
                long[] d;
                int b8;
                dvd c2;
                int j4;
                ega g3;
                egi s2;
                mxe mxe;
                int n20;
                long i4;
                mxe v2;
                mxe v3;
                int a14;
                long[] d2;
                dvy k3;
                dwk dwk;
                int n22;
                Rect rect4;
                dvf p;
                ega ega2;
                int a15;
                int n23;
                Rect rect5;
                int n24;
                ege e5;
                dvd c3;
                dst c4;
                ega g4;
                boolean b9;
                boolean b10 = false;
                Object a16;
                boolean b11 = false;
                ega g5;
                dxn t2;
                ajb y2;
                ege d3;
                egg b12;
                Object a17;
                Object c5;
                wvl w;
                ege d4;
                egg b13;
                Object a18;
                Object c6;
                egj egj;
                dvf p2;
                boolean b14;
                long nanoTime;
                dvd c7;
                dst c8;
                dvd b15;
                dst c9;
                Object a19;
                efx b16;
                int l2;
                dst c10;
                Rect d5;
                Rect d6;
                dsx a20;
                dsx a21;
                boolean az = false;
                dsx a22;
                dsx a23;
                glo n26;
                glo n27;
                glo glo;
                dtz m2;
                dtz m3;
                dtz dtz;
                boolean b17 = false;
                dst c11;
                dst c12;
                Object a24;
                dvy k4;
                List h4;
                double n28;
                dvy k5;
                dwk dwk2;
                dvf dvf;
                ArrayList i5;
                ArrayList j5;
                int a25;
                Rect rect6;
                int m4;
                boolean e6;
                Map c13;
                List m5;
                int size4;
                List m6;
                dwt dwt;
                long b18;
                long c14;
                ega ega3;
                TestItem testItem;
                ComponentHost c15;
                Object a26;
                Deque deque;
                Object o;
                Label_0127_Outer:Label_5739_Outer:
                while (true) {
                    this.r = true;
                    this.q = true;
                    while (true) {
                        try {
                            try {
                                m = this.m;
                                Label_5714: {
                                    while (true) {
                                        Label_0130: {
                                            if (m.p <= 0) {
                                                break Label_0130;
                                            }
                                            try {
                                                j = m.j;
                                                if (j == null || !j.i) {
                                                    break Label_0130;
                                                }
                                                if (!m.G()) {
                                                    break Label_5714;
                                                }
                                                rect = new Rect(0, 0, m.getWidth(), m.getHeight());
                                                b = false;
                                                break Label_0130;
                                            }
                                            finally {}
                                            break;
                                        }
                                        m.m.set(bounds);
                                        q = m.q;
                                        if (q != null && dvq.b((dvq)null)) {
                                            a = q.a;
                                            if (a != null) {
                                                if (!a[0]) {
                                                    throw null;
                                                }
                                            }
                                        }
                                        q2 = m.q;
                                        Label_0319: {
                                            if (q2 != null && dvq.b((dvq)null)) {
                                                a2 = q2.a;
                                                if (a2 != null && a2[0]) {
                                                    b2 = q2.b;
                                                    if (b2 != null && !b2[0]) {
                                                        viewGroup = (ViewGroup)m.getParent();
                                                        if (viewGroup != null) {
                                                            if (!q2.c) {
                                                                if (q2.d) {
                                                                    if (m.getBottom() < viewGroup.getHeight() - viewGroup.getPaddingBottom()) {
                                                                        break Label_0319;
                                                                    }
                                                                }
                                                                else if (m.getRight() < viewGroup.getWidth() - viewGroup.getPaddingRight()) {
                                                                    break Label_0319;
                                                                }
                                                            }
                                                            throw null;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        k = m.k;
                                        i = k.i.j;
                                        l = i.i;
                                        j2 = (i.j ? 1 : 0);
                                        bkw.e();
                                        n = (k.e ? 1 : 0);
                                        if (n != 0) {
                                            x = k.x;
                                            egd.a();
                                            egr = (egr)x.a;
                                            egr.c = t.h;
                                            egr.d = t.k;
                                            egr.b.setEmpty();
                                            egr.e = bounds;
                                            a3 = egd.a;
                                        }
                                        Label_2901: {
                                            if (k.t == null) {
                                                break Label_2901;
                                            }
                                            try {
                                                Label_2909: {
                                                    try {
                                                        if (k.e) {
                                                            y = k.y;
                                                            dxm = (dxm)y.a;
                                                            dxm.c = (ego)t;
                                                            if (t.s != dxm.d) {
                                                                dxm.i = null;
                                                            }
                                                            egd.a();
                                                            try {
                                                                Label_1991: {
                                                                    if (dxm.d != t.s) {
                                                                        dxm2 = (dxm)y.a;
                                                                        if (dxm2.e != null) {
                                                                            iterator = dxm2.a.values().iterator();
                                                                            while (iterator.hasNext()) {
                                                                                dxn.f(y, (dwj)iterator.next());
                                                                            }
                                                                            y.g();
                                                                            dxm2.a.clear();
                                                                            dxm2.b.clear();
                                                                            dxm2.f.clear();
                                                                            e = dxm2.e;
                                                                            iterator2 = e.j.G().iterator();
                                                                            while (iterator2.hasNext()) {
                                                                                dxi = (dxi)e.j.E((dxh)iterator2.next());
                                                                                e.h(dxi, null);
                                                                                dxk.b(dxi);
                                                                            }
                                                                            j3 = e.j;
                                                                            ((Map)j3.b).clear();
                                                                            ((Map)j3.c).clear();
                                                                            ((Map)j3.d).clear();
                                                                            ((Map)j3.a).clear();
                                                                            e.b.f();
                                                                            e.a.clear();
                                                                            for (int n2 = e.d.size() - 1; n2 >= 0; --n2) {
                                                                                ((dxy)e.d.get(n2)).d();
                                                                            }
                                                                            e.d.clear();
                                                                            e.f = null;
                                                                            e.g.clear();
                                                                        }
                                                                        n = (dxm.c.l() ? 1 : 0);
                                                                        if (n == 0) {
                                                                            a4 = egd.a;
                                                                            n3 = j2;
                                                                            j2 = (l ? 1 : 0);
                                                                            l = b;
                                                                            break Label_1991;
                                                                        }
                                                                    }
                                                                    if (!dxm.a.isEmpty()) {
                                                                        dxm3 = (dxm)y.a;
                                                                        iterator3 = t.x.keySet().iterator();
                                                                        while (iterator3.hasNext()) {
                                                                            dwj = dxm3.a.remove(iterator3.next());
                                                                            if (dwj != null) {
                                                                                dxn.f(y, dwj);
                                                                            }
                                                                        }
                                                                    }
                                                                    Label_1677: {
                                                                        if (dxn.d(dxm, (ego)t)) {
                                                                            dxn.e(y, (ego)t);
                                                                            if (dxn.c(dxm)) {
                                                                                h = dxm.h;
                                                                                dxm4 = (dxm)y.a;
                                                                                if (dxm4.e == null) {
                                                                                    dxm4.e = new dxk(new eab(y, null, null, null), null);
                                                                                }
                                                                                i2 = dxm4.i;
                                                                                if (i2 == null) {
                                                                                    x2 = null;
                                                                                }
                                                                                else {
                                                                                    x2 = ((dvf)i2).x;
                                                                                }
                                                                                e2 = dxm4.e;
                                                                                x3 = t.x;
                                                                                egd.a();
                                                                                iterator4 = e2.j.F().iterator();
                                                                                while (iterator4.hasNext()) {
                                                                                    ((dxi)iterator4.next()).f = false;
                                                                                }
                                                                                n4 = j2;
                                                                                if (x2 == null) {
                                                                                    for (final Map.Entry<dxh, V> entry : x3.entrySet()) {
                                                                                        e2.c(entry.getKey(), null, (dwj)entry.getValue());
                                                                                    }
                                                                                    j2 = (b ? 1 : 0);
                                                                                    b = l;
                                                                                    l = (j2 != 0);
                                                                                }
                                                                                else {
                                                                                    set = new HashSet<dxh>();
                                                                                    for (final dxh dxh : x3.keySet()) {
                                                                                        a5 = dxh.a;
                                                                                        dwj2 = x3.get(dxh);
                                                                                        dwj3 = x2.get(dxh);
                                                                                        if (dwj2 != null) {
                                                                                            set.add(dxh);
                                                                                        }
                                                                                        else if (a5 == 3) {
                                                                                            continue Label_0127_Outer;
                                                                                        }
                                                                                        e2.c(dxh, dwj3, dwj2);
                                                                                    }
                                                                                    rect2 = bounds;
                                                                                    j2 = (b ? 1 : 0);
                                                                                    n = (l ? 1 : 0);
                                                                                    iterator7 = x2.keySet().iterator();
                                                                                    while (true) {
                                                                                        bounds = rect2;
                                                                                        b = (n != 0);
                                                                                        l = (j2 != 0);
                                                                                        if (!iterator7.hasNext()) {
                                                                                            break;
                                                                                        }
                                                                                        dxh2 = iterator7.next();
                                                                                        if (set.contains(dxh2)) {
                                                                                            continue Label_0127_Outer;
                                                                                        }
                                                                                        e2.c(dxh2, x2.get(dxh2), null);
                                                                                    }
                                                                                }
                                                                                e2.f = e2.a(h);
                                                                                set2 = new HashSet();
                                                                                for (final dxh dxh3 : e2.j.G()) {
                                                                                    dxi2 = (dxi)e2.j.E(dxh3);
                                                                                    if (dxi2.a.isEmpty()) {
                                                                                        e2.h(dxi2, null);
                                                                                        dxk.b(dxi2);
                                                                                        set2.add(dxh3);
                                                                                    }
                                                                                }
                                                                                iterator9 = set2.iterator();
                                                                                while (iterator9.hasNext()) {
                                                                                    e2.j.H((dxh)iterator9.next());
                                                                                }
                                                                                a6 = egd.a;
                                                                                iterator10 = t.x.keySet().iterator();
                                                                                while (true) {
                                                                                    n3 = n4;
                                                                                    j2 = (b ? 1 : 0);
                                                                                    n = (l ? 1 : 0);
                                                                                    if (!iterator10.hasNext()) {
                                                                                        break Label_1677;
                                                                                    }
                                                                                    dxh4 = (dxh)iterator10.next();
                                                                                    if (!((Map)dxm4.e.j.a).containsKey(dxh4)) {
                                                                                        continue Label_0127_Outer;
                                                                                    }
                                                                                    dxm4.f.add(dxh4);
                                                                                }
                                                                            }
                                                                        }
                                                                        n3 = j2;
                                                                        n = (b ? 1 : 0);
                                                                        j2 = (l ? 1 : 0);
                                                                    }
                                                                    e3 = dxm.e;
                                                                    if (e3 != null) {
                                                                        list = new ArrayList(e3.j.F());
                                                                        for (int size = list.size(), n5 = 0; n5 < size; ++n5) {
                                                                            dxi3 = (dxi)list.get(n5);
                                                                            if (dxi3.g) {
                                                                                dxi3.g = false;
                                                                                list2 = new ArrayList(dxi3.a.values());
                                                                                for (int size2 = list2.size(), n6 = 0; n6 < size2; ++n6) {
                                                                                    c = ((glo)list2.get(n6)).c;
                                                                                    if (c != null) {
                                                                                        ((dxy)c).d();
                                                                                        e3.e.a((dxy)c);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    y.g();
                                                                    if (!dxm.f.isEmpty()) {
                                                                        dxm5 = (dxm)y.a;
                                                                        for (final Map.Entry<Object, V> entry2 : t.x.entrySet()) {
                                                                            if (dxm5.f.contains(entry2.getKey())) {
                                                                                dwj4 = (dwj)entry2.getValue();
                                                                                for (short b3 = dwj4.b, n7 = 0; n7 < b3; ++n7) {
                                                                                    dxn.g(y, (ego)t, ((ego)t).b(((dvd)dwj4.c((int)n7)).k), true);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    a7 = egd.a;
                                                                    l = (n != 0);
                                                                }
                                                                b4 = dxn.k(y).b();
                                                                dxm6 = (dxm)y.a;
                                                                n4 = n3;
                                                                n = j2;
                                                                b = l;
                                                                if (dxm6.i == null) {
                                                                    break Label_2909;
                                                                }
                                                                if (b4 == 0) {
                                                                    n4 = n3;
                                                                    n = j2;
                                                                    b = l;
                                                                    break Label_2909;
                                                                }
                                                                n8 = 1;
                                                                while (true) {
                                                                    n4 = n3;
                                                                    n = j2;
                                                                    b = l;
                                                                    if (n8 >= b4) {
                                                                        break Label_2909;
                                                                    }
                                                                    if (dxn.d(dxm6, (ego)t) && dxn.c(dxm6) && dxm6.e != null) {
                                                                        i3 = dxm6.i;
                                                                        if (i3 != null) {
                                                                            h2 = i3.e(n8).b.a.h;
                                                                            if (h2 != null) {
                                                                                dxi4 = (dxi)dxm6.e.j.E(h2);
                                                                                if (dxi4 != null && dxi4.c == 2 && dxi4.h) {
                                                                                    a8 = dxn.a(dxm6.i, n8);
                                                                                    for (int n9 = n8; n9 <= a8; ++n9) {
                                                                                        if (((dvz)dxn.k(y)).g(n9) == null) {
                                                                                            a9 = dxm6.i.e(n9).b.a();
                                                                                            if (y.h(a9)) {
                                                                                                y.i(a9);
                                                                                            }
                                                                                            y.f(a9, true);
                                                                                            y.i(a9);
                                                                                        }
                                                                                        b5 = ((dvz)dxn.k(y)).g(n9).d.b;
                                                                                        dxm6.b.put(b5, b5.a);
                                                                                    }
                                                                                    g = ((dvz)dxn.k(y)).g(n8);
                                                                                    if (g == null) {
                                                                                        sb = new StringBuilder();
                                                                                        sb.append("The root of the disappearing subtree should not be null, acquireMountReference on this index should be called before this. Index: ");
                                                                                        sb.append(n8);
                                                                                        throw new IllegalStateException(sb.toString());
                                                                                    }
                                                                                    b6 = dxn.k(y).h().b;
                                                                                    b7 = g.b;
                                                                                    if (b7 == null) {
                                                                                        sb2 = new StringBuilder();
                                                                                        sb2.append("Disappearing item host should never be null. Index: ");
                                                                                        sb2.append(n8);
                                                                                        throw new IllegalStateException(sb2.toString());
                                                                                    }
                                                                                    if (b6 != b7) {
                                                                                        a10 = g.a;
                                                                                        if (a10 == null) {
                                                                                            sb3 = new StringBuilder();
                                                                                            sb3.append("Disappearing item content should never be null. Index: ");
                                                                                            sb3.append(n8);
                                                                                            throw new IllegalStateException(sb3.toString());
                                                                                        }
                                                                                        efx = b7;
                                                                                        n10 = 0;
                                                                                        n11 = 0;
                                                                                        while (efx != b6) {
                                                                                            n10 += efx.getLeft();
                                                                                            n11 += efx.getTop();
                                                                                            efx = (efx)efx.getParent();
                                                                                        }
                                                                                        if (a10 instanceof View) {
                                                                                            view = (View)a10;
                                                                                            n12 = n10 + view.getLeft();
                                                                                            n13 = n11 + view.getTop();
                                                                                            width = view.getWidth();
                                                                                            n14 = view.getHeight() + n13;
                                                                                            n15 = n12 + width;
                                                                                            n16 = n12;
                                                                                        }
                                                                                        else {
                                                                                            bounds = ((Drawable)a10).getBounds();
                                                                                            n17 = n10 + bounds.left;
                                                                                            width2 = bounds.width();
                                                                                            n13 = n11 + bounds.top;
                                                                                            n14 = n13 + bounds.height();
                                                                                            n18 = width2 + n17;
                                                                                            n16 = n17;
                                                                                            n15 = n18;
                                                                                        }
                                                                                        b7.l(g);
                                                                                        rect3 = new Rect(n16, n13, n15, n14);
                                                                                        epf.T(rect3.left, rect3.top, rect3.right, rect3.bottom, a10, false);
                                                                                        b6.g(n8, g);
                                                                                        g.b = b6;
                                                                                    }
                                                                                    a11 = g.d.b.a;
                                                                                    h3 = a11.h;
                                                                                    if ((dwj5 = dxm6.a.get(h3)) == null) {
                                                                                        dwj5 = new dwj();
                                                                                        dxm6.a.put(h3, dwj5);
                                                                                    }
                                                                                    dwj5.e(a11.a(), (Object)g);
                                                                                    a12 = g.d.b.a();
                                                                                    k2 = dxn.k(y);
                                                                                    ega = (ega)((dvz)k2).b.e(a12);
                                                                                    if (ega != null) {
                                                                                        ((dvz)k2).w(dvd.b(ega).j, ((dvz)k2).h);
                                                                                    }
                                                                                    n8 = a8;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    ++n8;
                                                                }
                                                            }
                                                            finally {
                                                                a13 = egd.a;
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        continue Label_5739_Outer;
                                                    }
                                                    n = (l ? 1 : 0);
                                                    n4 = j2;
                                                    try {
                                                        k.o = t;
                                                        if (k.f) {
                                                            coz.d(3, "MountState:InvalidReentrantMounts", "Trying to mount while already mounting! ".concat(k.i(k.q)));
                                                        }
                                                        k.f = true;
                                                        q3 = i.g.q();
                                                        s = t.s;
                                                        if (s != k.n) {
                                                            k.p = null;
                                                        }
                                                        if (q3 == null) {
                                                            e4 = null;
                                                        }
                                                        else {
                                                            g2 = i.g;
                                                            e4 = bkv.e(g2, q3, q3.r(g2, 6));
                                                        }
                                                        if (k.e) {
                                                            if (e4 != null) {
                                                                e4.b("PREPARE_MOUNT_START");
                                                            }
                                                            v = k.v;
                                                            v.b = 0;
                                                            v.a = 0;
                                                            v.c = 0;
                                                            if (k.d != null) {
                                                                n19 = 0;
                                                                while (true) {
                                                                    d = k.d;
                                                                    if (n19 >= d.length) {
                                                                        break;
                                                                    }
                                                                    b8 = t.b(d[n19]);
                                                                    if (b8 < 0) {
                                                                        c2 = null;
                                                                    }
                                                                    else {
                                                                        c2 = dvd.c(t.e(b8));
                                                                    }
                                                                    if (c2 == null) {
                                                                        j4 = -1;
                                                                    }
                                                                    else {
                                                                        j4 = c2.j;
                                                                    }
                                                                    g3 = k.g(n19);
                                                                    s2 = k.s;
                                                                    Label_3398: {
                                                                        if (s2 == null || g3 == null || !s2.h((ajb)k.w.d, g3)) {
                                                                            if (j4 == -1) {
                                                                                k.w(n19, k.h);
                                                                                mxe = k.v;
                                                                                n20 = mxe.c;
                                                                            }
                                                                            else {
                                                                                i4 = c2.i;
                                                                                if (g3 == null) {
                                                                                    mxe = k.v;
                                                                                    n20 = mxe.c;
                                                                                }
                                                                                else if (g3.b != k.h.e(i4)) {
                                                                                    k.w(n19, k.h);
                                                                                    mxe = k.v;
                                                                                    n20 = mxe.c;
                                                                                }
                                                                                else {
                                                                                    if (j4 != n19) {
                                                                                        g3.b.i(g3, n19, j4);
                                                                                        v2 = k.v;
                                                                                        ++v2.a;
                                                                                        break Label_3398;
                                                                                    }
                                                                                    v3 = k.v;
                                                                                    ++v3.b;
                                                                                    break Label_3398;
                                                                                }
                                                                            }
                                                                            mxe.c = n20 + 1;
                                                                        }
                                                                    }
                                                                    ++n19;
                                                                }
                                                            }
                                                            if (k.h.e(0L) == null) {
                                                                k.r(0L, (ComponentHost)k.i);
                                                                k.b.i(0L, (Object)k.q);
                                                            }
                                                            a14 = t.a();
                                                            d2 = k.d;
                                                            if (d2 == null || a14 != d2.length) {
                                                                k.d = new long[a14];
                                                            }
                                                            for (int n21 = 0; n21 < a14; ++n21) {
                                                                k.d[n21] = dvd.c(t.e(n21)).k;
                                                            }
                                                            if (e4 != null) {
                                                                e4.b("PREPARE_MOUNT_END");
                                                            }
                                                        }
                                                        k3 = k.k;
                                                        k3.j = 0;
                                                        k3.k = 0;
                                                        k3.l = 0;
                                                        k3.m = 0;
                                                        if (k3.o) {
                                                            k3.a.clear();
                                                            k3.b.clear();
                                                            k3.c.clear();
                                                            k3.d.clear();
                                                            k3.e.clear();
                                                            k3.f.clear();
                                                            k3.g.clear();
                                                            k3.h.clear();
                                                            k3.i.clear();
                                                        }
                                                        k3.n = false;
                                                        if (e4 != null && msr.t(e4)) {
                                                            k.k.a();
                                                        }
                                                        if (n != 0 && k.z(t, bounds, b)) {
                                                            dwk = e4;
                                                            n22 = s;
                                                            rect4 = bounds;
                                                            p = t;
                                                        }
                                                        else {
                                                            ega2 = (ega)k.b.e(0L);
                                                            a15 = t.a();
                                                            n23 = 0;
                                                            rect5 = bounds;
                                                            n24 = s;
                                                            p = t;
                                                            while (n23 < a15) {
                                                                e5 = p.e(n23);
                                                                c3 = dvd.c(e5);
                                                                c4 = c3.c;
                                                                g4 = k.g(n23);
                                                                b9 = (g4 != null);
                                                                Label_3843: {
                                                                    if (g4 != null) {
                                                                        if (g4 == ega2) {
                                                                            b10 = true;
                                                                            break Label_3843;
                                                                        }
                                                                    }
                                                                    else {
                                                                        g4 = null;
                                                                    }
                                                                    b10 = false;
                                                                }
                                                                Label_3925: {
                                                                    Label_3922: {
                                                                        if (n != 0) {
                                                                            if (g4 != null) {
                                                                                a16 = g4.a;
                                                                                if (a16 instanceof ComponentHost && ((ComponentHost)a16).a() > 0) {
                                                                                    break Label_3922;
                                                                                }
                                                                            }
                                                                            if (!Rect.intersects(rect5, c3.d) && !k.x(e5)) {
                                                                                if (!b10) {
                                                                                    b11 = false;
                                                                                    break Label_3925;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    b11 = true;
                                                                }
                                                                if (b11 && !b9) {
                                                                    k.q(n23, e5, c3, p);
                                                                    if (n != 0) {
                                                                        g5 = k.g(n23);
                                                                        t2 = k.t;
                                                                        if (t2 != null) {
                                                                            y2 = k.y;
                                                                            d3 = g5.d;
                                                                            b12 = d3.b;
                                                                            a17 = g5.a;
                                                                            c5 = d3.c;
                                                                            ((egj)t2).i(y2, b12, a17);
                                                                        }
                                                                        else {
                                                                            w = k.w;
                                                                            if (w != null) {
                                                                                d4 = g5.d;
                                                                                b13 = d4.b;
                                                                                a18 = g5.a;
                                                                                c6 = d4.c;
                                                                                for (int size3 = ((List)w.b).size(), n25 = 0; n25 < size3; ++n25) {
                                                                                    egj = ((List<egj>)w.b).get(n25);
                                                                                    egj.i(w.p(egj), b13, a18);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (!b11 && b9) {
                                                                    k.w(n23, k.h);
                                                                }
                                                                else if (b9) {
                                                                    if (k.e || (b10 && k.g)) {
                                                                        p2 = k.p;
                                                                        b14 = (p2 != null && p2.t == p.u);
                                                                        nanoTime = System.nanoTime();
                                                                        c7 = dvd.c(e5);
                                                                        c8 = c7.c;
                                                                        b15 = dvd.b(g4);
                                                                        c9 = b15.c;
                                                                        a19 = g4.a;
                                                                        b16 = g4.b;
                                                                        l2 = c7.l;
                                                                        c10 = c7.c;
                                                                        Label_4446: {
                                                                            Label_4293: {
                                                                                if (!dyp.n || c7.g == b15.g) {
                                                                                    if (((dtd)c10).al()) {
                                                                                        d5 = c7.d;
                                                                                        d6 = b15.d;
                                                                                        if (d5.width() != d6.width() || d5.height() != d6.height()) {
                                                                                            break Label_4293;
                                                                                        }
                                                                                    }
                                                                                    if (b14) {
                                                                                        if (l2 == 1) {
                                                                                            if (c9 instanceof duf && c10 instanceof duf) {
                                                                                                a20 = b15.a;
                                                                                                a21 = c7.a;
                                                                                                if (((dtd)c9).az(c9, c10)) {
                                                                                                    break Label_4293;
                                                                                                }
                                                                                            }
                                                                                            az = false;
                                                                                            break Label_4446;
                                                                                        }
                                                                                        if (l2 == 2) {
                                                                                            break Label_4293;
                                                                                        }
                                                                                    }
                                                                                    a22 = b15.a;
                                                                                    a23 = c7.a;
                                                                                    az = ((dtd)c9).az(c9, c10);
                                                                                    break Label_4446;
                                                                                }
                                                                            }
                                                                            az = true;
                                                                        }
                                                                        Label_4675: {
                                                                            Label_4672: {
                                                                                if (!az) {
                                                                                    n26 = c7.n;
                                                                                    n27 = b15.n;
                                                                                    glo = n26;
                                                                                    if (n27 == null) {
                                                                                        if (n26 != null) {
                                                                                            break Label_4672;
                                                                                        }
                                                                                        glo = null;
                                                                                    }
                                                                                    if (n27 != null) {
                                                                                        if (n27 != glo) {
                                                                                            if (glo == null) {
                                                                                                break Label_4672;
                                                                                            }
                                                                                            if (!blf.f((Drawable)n27.b, (Drawable)glo.b)) {
                                                                                                break Label_4672;
                                                                                            }
                                                                                            if (!blf.f(null, null)) {
                                                                                                break Label_4672;
                                                                                            }
                                                                                            if (!com.j(n27.c, glo.c)) {
                                                                                                break Label_4672;
                                                                                            }
                                                                                            if (!com.j(n27.d, glo.d)) {
                                                                                                break Label_4672;
                                                                                            }
                                                                                            if (!com.j(n27.e, glo.e)) {
                                                                                                break Label_4672;
                                                                                            }
                                                                                            if (!com.j((Object)null, (Object)null)) {
                                                                                                break Label_4672;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    m2 = c7.m;
                                                                                    m3 = b15.m;
                                                                                    dtz = m2;
                                                                                    if (m3 == null) {
                                                                                        if (m2 != null) {
                                                                                            break Label_4672;
                                                                                        }
                                                                                        dtz = null;
                                                                                    }
                                                                                    if (m3 == null || m3.a((Object)dtz)) {
                                                                                        b17 = false;
                                                                                        break Label_4675;
                                                                                    }
                                                                                }
                                                                            }
                                                                            b17 = true;
                                                                        }
                                                                        if (b17) {
                                                                            dvz.o(g4);
                                                                        }
                                                                        if (g4.c) {
                                                                            k.u(g4, c9, g4.a);
                                                                        }
                                                                        g4.d = e5;
                                                                        if (az) {
                                                                            c11 = c7.c;
                                                                            c12 = b15.c;
                                                                            if (!dst.v(c11)) {
                                                                                a24 = g4.a;
                                                                                ((dtd)c12).ae(k.A(c12), a24);
                                                                                ((dtd)c11).V(k.A(c11), a24);
                                                                            }
                                                                        }
                                                                        if (b17) {
                                                                            dvz.t(g4);
                                                                        }
                                                                        k.l(g4, c8, a19);
                                                                        if (c7.k != 0L) {
                                                                            c7.f(dvz.a);
                                                                            dvz.k(g4.a, dvz.a.left, dvz.a.top, dvz.a.right, dvz.a.bottom, dst.z(c7.c) && ((View)g4.a).isLayoutRequested());
                                                                        }
                                                                        if (g4.a instanceof Drawable) {
                                                                            com.h((View)b16, (Drawable)a19, b15.e, b15.m);
                                                                        }
                                                                        k4 = k.k;
                                                                        if (k4.n) {
                                                                            if (az) {
                                                                                k4.c.add(c4.q());
                                                                                h4 = k.k.h;
                                                                                n28 = (double)(System.nanoTime() - nanoTime);
                                                                                Double.isNaN(n28);
                                                                                h4.add(n28 / 1000000.0);
                                                                                k5 = k.k;
                                                                                ++k5.l;
                                                                            }
                                                                            else {
                                                                                ++k4.m;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (n != 0 && ((dtd)c4).ah()) {
                                                                        dvz.p(g4, b);
                                                                    }
                                                                }
                                                                ++n23;
                                                            }
                                                            dwk2 = e4;
                                                            if (n != 0 && !rect5.isEmpty()) {
                                                                dvf = p;
                                                                i5 = dvf.i;
                                                                j5 = dvf.j;
                                                                a25 = dvf.a();
                                                                k.l = dvf.a();
                                                                for (int l3 = 0; l3 < a25; ++l3) {
                                                                    if (rect5.bottom <= dvf.d((egk)i5.get(l3)).d.top) {
                                                                        k.l = l3;
                                                                        break;
                                                                    }
                                                                }
                                                                rect6 = rect5;
                                                                k.m = dvf.a();
                                                                m4 = 0;
                                                                while (true) {
                                                                    p = dvf;
                                                                    rect4 = rect6;
                                                                    n22 = n24;
                                                                    dwk = dwk2;
                                                                    if (m4 >= a25) {
                                                                        break;
                                                                    }
                                                                    if (rect6.top < dvf.d((egk)j5.get(m4)).d.bottom) {
                                                                        k.m = m4;
                                                                        p = dvf;
                                                                        rect4 = rect6;
                                                                        n22 = n24;
                                                                        dwk = dwk2;
                                                                        break;
                                                                    }
                                                                    ++m4;
                                                                }
                                                            }
                                                            else {
                                                                rect4 = rect5;
                                                                dwk = dwk2;
                                                                n22 = n24;
                                                            }
                                                        }
                                                        k.j();
                                                        if (n4 != 0) {
                                                            if (dwk != null) {
                                                                dwk.b("EVENT_PROCESS_VISIBILITY_OUTPUTS_START");
                                                            }
                                                            k.B(rect4, k.e);
                                                            if (dwk != null) {
                                                                dwk.b("EVENT_PROCESS_VISIBILITY_OUTPUTS_END");
                                                            }
                                                        }
                                                        e6 = k.e;
                                                        k.e = false;
                                                        k.g = false;
                                                        k.j.set(rect4);
                                                        k.n = n22;
                                                        k.p = p;
                                                        c13 = k.c;
                                                        if (c13 != null) {
                                                            c13.clear();
                                                            m5 = p.m;
                                                            if (m5 == null) {
                                                                size4 = 0;
                                                            }
                                                            else {
                                                                size4 = m5.size();
                                                            }
                                                            for (int n29 = 0; n29 < size4; ++n29) {
                                                                m6 = p.m;
                                                                if (m6 == null) {
                                                                    dwt = null;
                                                                }
                                                                else {
                                                                    dwt = m6.get(n29);
                                                                }
                                                                b18 = dwt.b;
                                                                c14 = dwt.c;
                                                                if (c14 == -1L) {
                                                                    ega3 = null;
                                                                }
                                                                else {
                                                                    ega3 = (ega)k.b.e(c14);
                                                                }
                                                                testItem = new TestItem();
                                                                if (b18 == -1L) {
                                                                    c15 = null;
                                                                }
                                                                else {
                                                                    c15 = (ComponentHost)k.h.e(b18);
                                                                }
                                                                testItem.c = c15;
                                                                testItem.b.set(dwt.d);
                                                                testItem.a = dwt.a;
                                                                if (ega3 == null) {
                                                                    a26 = null;
                                                                }
                                                                else {
                                                                    a26 = ega3.a;
                                                                }
                                                                testItem.d = a26;
                                                                if ((deque = k.c.get(dwt.a)) == null) {
                                                                    deque = new LinkedList();
                                                                }
                                                                deque.add(testItem);
                                                                k.c.put(dwt.a, deque);
                                                            }
                                                        }
                                                        if (dwk != null) {
                                                            k.C(dwk);
                                                        }
                                                        ebe.f.addAndGet(1L);
                                                        k.f = false;
                                                        this.h = false;
                                                        this.C = null;
                                                        this.B = null;
                                                        return;
                                                    }
                                                    finally {}
                                                }
                                            }
                                            catch (final Exception ex) {}
                                        }
                                        break;
                                    }
                                }
                            }
                            finally {}
                            break;
                        }
                        catch (final Exception ex2) {}
                        try {
                            if (bounds instanceof dvm) {
                                o = bounds;
                            }
                            else {
                                o = new dvm(this, (Throwable)bounds);
                            }
                            throw o;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                    break;
                }
                this.h = false;
                this.C = null;
                this.B = null;
                throw bounds;
            }
            continue;
        }
    }
    
    private final void D() {
        final dvf u = this.u;
        if (u == null) {
            throw new RuntimeException("Cannot promote null LayoutState!");
        }
        if (u == this.t) {
            return;
        }
        this.t = u;
        final dvu m = this.m;
        if (m != null) {
            m.D();
        }
    }
    
    private static boolean E(final dvf dvf, final int n, final int n2, final int n3) {
        return dvf != null && dvf.j(n, n2, n3) && dvf.i();
    }
    
    private static boolean F(final dvf dvf, final int n, final int n2) {
        return dvf != null && dvf.k(n, n2) && dvf.i();
    }
    
    private final void G(dst k, final int x, final int y, final boolean b, final dwq dwq, final int z, final String s, final cya ae, final boolean b2, final boolean b3) {
        synchronized (this) {
            if (this.J) {
                return;
            }
            boolean b4 = true;
            if (z == 0 || z == 1) {
                if (this.U >= 0) {
                    throw new IllegalStateException("Setting an unversioned root after calling setVersionedRootAndSizeSpec is not supported. If this ComponentTree takes its version from a parent tree make sure to always call setVersionedRootAndSizeSpec");
                }
                this.U = -1;
            }
            if (k != null && this.v.m()) {
                k = k.k();
            }
            final boolean b5 = x != -1;
            if (y == -1) {
                b4 = false;
            }
            dst s3;
            dst s2;
            if (k != null) {
                s2 = (s3 = k);
            }
            else {
                s2 = this.s;
                s3 = null;
            }
            int x2;
            if (b5) {
                x2 = x;
            }
            else {
                x2 = this.X;
            }
            int y2;
            if (b4) {
                y2 = y;
            }
            else {
                y2 = this.Y;
            }
            final dvf u = this.u;
            if (!b3 && s2 != null && u != null && u.j(s2.j, x2, y2)) {
                if (dwq != null) {
                    dwq.b = u.r;
                    dwq.a = u.q;
                }
                return;
            }
            if (b5) {
                this.X = x;
            }
            if (b4) {
                this.Y = y;
            }
            if (k != null) {
                this.s = s3;
            }
            if (b3) {
                this.s = this.s.k();
            }
            cya ae2;
            if (ae != null) {
                this.ae = ae;
                ae2 = ae;
            }
            else {
                ae2 = this.ae;
            }
            this.Z = z;
            monitorexit(this);
            if (b && dwq != null) {
                throw new IllegalArgumentException("The layout can't be calculated asynchronously if we need the Size back");
            }
            if (b) {
                synchronized (this.o) {
                    final dth p10 = this.p;
                    if (p10 != null) {
                        this.n.a((Runnable)p10);
                    }
                    this.p = new dth(this, z, ae2, s, b2, (byte[])null, (byte[])null, (byte[])null);
                    this.n.b();
                    this.n.c((Runnable)this.p);
                    return;
                }
            }
            this.w(dwq, z, s, ae2, b2);
        }
    }
    
    public static dtg b(final dsx dsx, final dst c) {
        final dtg dtg = new dtg(dsx);
        if (c != null) {
            dtg.c = c;
            return dtg;
        }
        throw new NullPointerException("Creating a ComponentTree with a null root is not allowed!");
    }
    
    public static boolean r(final int n) {
        return n == 0 || n == 2 || n == 4 || n == 6;
    }
    
    private static Looper z() {
        synchronized (ComponentTree.class) {
            if (ComponentTree.I == null) {
                final boolean a = dyp.a;
                final HandlerThread handlerThread = new HandlerThread("ComponentLayoutThread", 5);
                handlerThread.start();
                ComponentTree.I = handlerThread.getLooper();
            }
            return ComponentTree.I;
        }
    }
    
    public final dst a() {
        synchronized (this) {
            return this.s;
        }
    }
    
    public final dws c() {
        synchronized (this) {
            return dws.a(this.v);
        }
    }
    
    public final String d() {
        synchronized (this) {
            return this.K;
        }
    }
    
    public final String e() {
        synchronized (this) {
            final dst s = this.s;
            if (s == null) {
                return null;
            }
            return s.q();
        }
    }
    
    public final List f() {
        monitorenter(this);
        try {
            final dws v = this.v;
            List list = null;
            if (v != null) {
                list = list;
                if (v.d() != null) {
                    final Map d = v.d();
                    final ArrayList list2 = new ArrayList();
                    final Iterator iterator = d.values().iterator();
                    while (true) {
                        list = list2;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        list2.addAll((Collection)iterator.next());
                    }
                }
            }
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void g(final dtj dtj) {
        if (dtj == null) {
            return;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(dtj);
        }
    }
    
    public dvu getLithoView() {
        return this.m;
    }
    
    public final void h() {
        bkw.e();
        final dvu m = this.m;
        if (m != null) {
            final eab aa = this.aa;
            if (aa != null) {
                aa.c(m);
            }
            synchronized (this) {
                this.k = true;
                final dvf u = this.u;
                if (u != null && this.t != u) {
                    this.D();
                }
                if (this.s != null) {
                    monitorexit(this);
                    final int measuredWidth = this.m.getMeasuredWidth();
                    final int measuredHeight = this.m.getMeasuredHeight();
                    int n;
                    if ((n = measuredWidth) == 0) {
                        if (measuredHeight == 0) {
                            return;
                        }
                        n = 0;
                    }
                    final dvf t = this.t;
                    if (t != null && t.q == n) {
                        if (t.r == measuredHeight) {
                            if (!this.m.G()) {
                                this.m.w();
                                return;
                            }
                        }
                    }
                    ((ComponentHost)this.m).requestLayout();
                    return;
                }
                final boolean j = this.J;
                final String k = this.K;
                final StringBuilder sb = new StringBuilder("Trying to attach a ComponentTree with a null root. Is released: ");
                sb.append(j);
                sb.append(", Released Component name is: ");
                sb.append(k);
                throw new IllegalStateException(sb.toString());
            }
        }
        throw new IllegalStateException("Trying to attach a ComponentTree without a set View");
    }
    
    public final void i() {
        bkw.e();
        synchronized (this) {
            if (this.s == null) {
                return;
            }
            final dvf u = this.u;
            if (u != null) {
                final dvf t = this.t;
                final int n = 0;
                boolean b;
                if (t != u) {
                    this.D();
                    b = true;
                }
                else {
                    b = false;
                }
                monitorexit(this);
                if (b) {
                    final pvh g = this.G;
                    if (g != null) {
                        ((eeb)g.a).u();
                        this.G = null;
                    }
                    if (this.k) {
                        if (!this.N) {
                            int measuredWidth = this.m.getMeasuredWidth();
                            final int measuredHeight = this.m.getMeasuredHeight();
                            if (measuredWidth == 0) {
                                if (measuredHeight == 0) {
                                    return;
                                }
                                measuredWidth = n;
                            }
                            final dvf t2 = this.t;
                            if (t2.q == measuredWidth && t2.r == measuredHeight) {
                                this.t();
                                return;
                            }
                            ((ComponentHost)this.m).requestLayout();
                        }
                    }
                }
                return;
            }
            throw new RuntimeException("Unexpected null mCommittedLayoutState");
        }
    }
    
    public final void j() {
        bkw.e();
        final eab aa = this.aa;
        if (aa != null) {
            for (int size = ((List)aa.b).size(), i = 0; i < size; ++i) {
                final duy duy = ((List<duy>)aa.b).get(i);
                duy.a.clear();
                final ViewPager viewPager = (ViewPager)duy.b.get();
                if (viewPager != null) {
                    anb.I((View)viewPager, new coh(duy, viewPager, 14));
                }
            }
            ((List)aa.b).clear();
        }
        monitorenter(this);
        try {
            this.k = false;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void k() {
        bkw.e();
        if (!this.i) {
            throw new IllegalStateException("Calling incrementalMountComponent() but incremental mount is not enabled");
        }
        if (this.m == null) {
            return;
        }
        final Rect rect = new Rect();
        Label_0076: {
            if (!this.m.getLocalVisibleRect(rect)) {
                if (!this.q) {
                    if (this.C != null && rect.height() == 0) {
                        break Label_0076;
                    }
                    if (this.B != null && rect.width() == 0) {
                        break Label_0076;
                    }
                }
                return;
            }
        }
        this.m(rect, true);
    }
    
    public final void l(final int p0, final int p1, final int[] p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0        
        //     4: iconst_1       
        //     5: putfield        com/facebook/litho/ComponentTree.N:Z
        //     8: aload_0        
        //     9: monitorenter   
        //    10: aload_0        
        //    11: getfield        com/facebook/litho/ComponentTree.u:Ldvf;
        //    14: astore          7
        //    16: aload           7
        //    18: ifnull          44
        //    21: aload           7
        //    23: aload_0        
        //    24: getfield        com/facebook/litho/ComponentTree.t:Ldvf;
        //    27: if_acmpeq       44
        //    30: aload           7
        //    32: iload_1        
        //    33: iload_2        
        //    34: invokestatic    com/facebook/litho/ComponentTree.F:(Ldvf;II)Z
        //    37: ifeq            44
        //    40: aload_0        
        //    41: invokespecial   com/facebook/litho/ComponentTree.D:()V
        //    44: aload_0        
        //    45: getfield        com/facebook/litho/ComponentTree.t:Ldvf;
        //    48: astore          7
        //    50: aload           7
        //    52: ifnull          79
        //    55: aload           7
        //    57: getfield        dvf.e:I
        //    60: iload_1        
        //    61: if_icmpne       79
        //    64: aload           7
        //    66: getfield        dvf.f:I
        //    69: iload_2        
        //    70: if_icmpne       79
        //    73: iconst_1       
        //    74: istore          5
        //    76: goto            82
        //    79: iconst_0       
        //    80: istore          5
        //    82: aload           7
        //    84: aload_0        
        //    85: getfield        com/facebook/litho/ComponentTree.s:Ldst;
        //    88: getfield        dst.j:I
        //    91: iload_1        
        //    92: iload_2        
        //    93: invokestatic    com/facebook/litho/ComponentTree.E:(Ldvf;III)Z
        //    96: istore          6
        //    98: iload           5
        //   100: ifne            117
        //   103: iload           6
        //   105: ifeq            111
        //   108: goto            117
        //   111: iconst_1       
        //   112: istore          5
        //   114: goto            142
        //   117: aload_0        
        //   118: getfield        com/facebook/litho/ComponentTree.t:Ldvf;
        //   121: astore          7
        //   123: aload_3        
        //   124: iconst_0       
        //   125: aload           7
        //   127: getfield        dvf.q:I
        //   130: iastore        
        //   131: aload_3        
        //   132: iconst_1       
        //   133: aload           7
        //   135: getfield        dvf.r:I
        //   138: iastore        
        //   139: iconst_0       
        //   140: istore          5
        //   142: aload_0        
        //   143: monitorexit    
        //   144: iload           5
        //   146: ifne            178
        //   149: iload           4
        //   151: ifeq            160
        //   154: iconst_1       
        //   155: istore          4
        //   157: goto            178
        //   160: aload_0        
        //   161: aconst_null    
        //   162: iload_1        
        //   163: iload_2        
        //   164: iconst_1       
        //   165: aconst_null    
        //   166: bipush          7
        //   168: aconst_null    
        //   169: aconst_null    
        //   170: iconst_0       
        //   171: iconst_0       
        //   172: invokespecial   com/facebook/litho/ComponentTree.G:(Ldst;IIZLdwq;ILjava/lang/String;Lcya;ZZ)V
        //   175: goto            459
        //   178: new             Ldwq;
        //   181: astore          9
        //   183: aload           9
        //   185: invokespecial   dwq.<init>:()V
        //   188: aload_0        
        //   189: aconst_null    
        //   190: iload_1        
        //   191: iload_2        
        //   192: iconst_0       
        //   193: aload           9
        //   195: bipush          6
        //   197: aconst_null    
        //   198: aconst_null    
        //   199: iconst_0       
        //   200: iload           4
        //   202: invokespecial   com/facebook/litho/ComponentTree.G:(Ldst;IIZLdwq;ILjava/lang/String;Lcya;ZZ)V
        //   205: aload_0        
        //   206: monitorenter   
        //   207: aload_0        
        //   208: getfield        com/facebook/litho/ComponentTree.J:Z
        //   211: ifne            465
        //   214: aload_0        
        //   215: getfield        com/facebook/litho/ComponentTree.u:Ldvf;
        //   218: aload_0        
        //   219: getfield        com/facebook/litho/ComponentTree.t:Ldvf;
        //   222: if_acmpeq       229
        //   225: aload_0        
        //   226: invokespecial   com/facebook/litho/ComponentTree.D:()V
        //   229: aload_0        
        //   230: getfield        com/facebook/litho/ComponentTree.t:Ldvf;
        //   233: astore          7
        //   235: aload           7
        //   237: ifnull          259
        //   240: aload_3        
        //   241: iconst_0       
        //   242: aload           7
        //   244: getfield        dvf.q:I
        //   247: iastore        
        //   248: aload_3        
        //   249: iconst_1       
        //   250: aload           7
        //   252: getfield        dvf.r:I
        //   255: iastore        
        //   256: goto            457
        //   259: aload_3        
        //   260: iconst_0       
        //   261: aload           9
        //   263: getfield        dwq.a:I
        //   266: iastore        
        //   267: aload_3        
        //   268: iconst_1       
        //   269: aload           9
        //   271: getfield        dwq.b:I
        //   274: iastore        
        //   275: iload_1        
        //   276: invokestatic    android/view/View$MeasureSpec.toString:(I)Ljava/lang/String;
        //   279: astore          10
        //   281: iload_2        
        //   282: invokestatic    android/view/View$MeasureSpec.toString:(I)Ljava/lang/String;
        //   285: astore          8
        //   287: aload_0        
        //   288: getfield        com/facebook/litho/ComponentTree.X:I
        //   291: invokestatic    android/view/View$MeasureSpec.toString:(I)Ljava/lang/String;
        //   294: astore_3       
        //   295: aload_0        
        //   296: getfield        com/facebook/litho/ComponentTree.Y:I
        //   299: invokestatic    android/view/View$MeasureSpec.toString:(I)Ljava/lang/String;
        //   302: astore          7
        //   304: aload           9
        //   306: getfield        dwq.a:I
        //   309: istore_2       
        //   310: aload           9
        //   312: getfield        dwq.b:I
        //   315: istore_1       
        //   316: aload_0        
        //   317: getfield        com/facebook/litho/ComponentTree.Z:I
        //   320: invokestatic    dvf.g:(I)Ljava/lang/String;
        //   323: astore          11
        //   325: new             Ljava/lang/StringBuilder;
        //   328: astore          9
        //   330: aload           9
        //   332: ldc_w           "Measure Specs: ["
        //   335: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   338: aload           9
        //   340: aload           10
        //   342: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   345: pop            
        //   346: aload           9
        //   348: ldc_w           ", "
        //   351: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   354: pop            
        //   355: aload           9
        //   357: aload           8
        //   359: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   362: pop            
        //   363: aload           9
        //   365: ldc_w           "], Current Specs: ["
        //   368: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   371: pop            
        //   372: aload           9
        //   374: aload_3        
        //   375: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   378: pop            
        //   379: aload           9
        //   381: ldc_w           ", "
        //   384: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   387: pop            
        //   388: aload           9
        //   390: aload           7
        //   392: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   395: pop            
        //   396: aload           9
        //   398: ldc_w           "], Output [W: "
        //   401: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   404: pop            
        //   405: aload           9
        //   407: iload_2        
        //   408: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   411: pop            
        //   412: aload           9
        //   414: ldc_w           ", H:"
        //   417: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   420: pop            
        //   421: aload           9
        //   423: iload_1        
        //   424: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   427: pop            
        //   428: aload           9
        //   430: ldc_w           "], Last Layout Source: "
        //   433: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   436: pop            
        //   437: aload           9
        //   439: aload           11
        //   441: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   444: pop            
        //   445: iconst_2       
        //   446: ldc_w           "NullLayoutStateInMeasure"
        //   449: aload           9
        //   451: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   454: invokestatic    coz.d:(ILjava/lang/String;Ljava/lang/String;)V
        //   457: aload_0        
        //   458: monitorexit    
        //   459: aload_0        
        //   460: iconst_0       
        //   461: putfield        com/facebook/litho/ComponentTree.N:Z
        //   464: return         
        //   465: new             Ljava/lang/RuntimeException;
        //   468: astore_3       
        //   469: aload_3        
        //   470: ldc_w           "Tree is released during measure!"
        //   473: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   476: aload_3        
        //   477: athrow         
        //   478: astore_3       
        //   479: aload_0        
        //   480: monitorexit    
        //   481: aload_3        
        //   482: athrow         
        //   483: astore_3       
        //   484: aload_0        
        //   485: monitorexit    
        //   486: aload_3        
        //   487: athrow         
        //   488: astore_3       
        //   489: goto            497
        //   492: astore_3       
        //   493: goto            484
        //   496: astore_3       
        //   497: aload_0        
        //   498: iconst_0       
        //   499: putfield        com/facebook/litho/ComponentTree.N:Z
        //   502: goto            507
        //   505: aload_3        
        //   506: athrow         
        //   507: goto            505
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  8      10     496    497    Any
        //  10     16     483    488    Any
        //  21     44     483    488    Any
        //  44     50     483    488    Any
        //  55     73     483    488    Any
        //  82     98     483    488    Any
        //  117    139    483    488    Any
        //  142    144    483    488    Any
        //  160    175    496    497    Any
        //  178    188    496    497    Any
        //  188    207    488    492    Any
        //  207    229    478    483    Any
        //  229    235    478    483    Any
        //  240    256    478    483    Any
        //  259    457    478    483    Any
        //  457    459    478    483    Any
        //  465    478    478    483    Any
        //  479    481    478    483    Any
        //  481    483    488    492    Any
        //  484    486    492    496    Any
        //  486    488    488    492    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 268, Size: 268
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void m(final Rect rect, final boolean b) {
        bkw.e();
        if (this.h) {
            final fwv fwv = new fwv(rect, b);
            final Deque l = this.L;
            if (l == null) {
                this.L = new ArrayDeque();
            }
            else if (l.size() > 25) {
                final dvu m = this.m;
                String a;
                if (m != null) {
                    a = LithoViewTestHelper.a(m);
                }
                else {
                    a = null;
                }
                Object o;
                if ((o = this.s) == null) {
                    o = this.e();
                }
                final String value = String.valueOf(o);
                final StringBuilder sb = new StringBuilder("Reentrant mounts exceed max attempts, view=");
                sb.append(a);
                sb.append(", component=");
                sb.append(value);
                coz.d(3, "ComponentTree:ReentrantMountsExceedMaxAttempts", sb.toString());
                this.L.clear();
                return;
            }
            this.L.add(fwv);
            return;
        }
        this.C(rect, b);
        final Deque i = this.L;
        if (i != null) {
            final ArrayDeque arrayDeque = new ArrayDeque(i);
            this.L.clear();
            while (!arrayDeque.isEmpty()) {
                final fwv fwv2 = (fwv)arrayDeque.pollFirst();
                this.m.D();
                this.C((Rect)fwv2.b, fwv2.a);
            }
        }
    }
    
    public final void n() {
        if (!this.h) {
            synchronized (this) {
                ((dvj)this.Q).removeCallbacks(this.R);
                Object o = this.o;
                synchronized (o) {
                    final dth p = this.p;
                    if (p != null) {
                        this.n.a((Runnable)p);
                        this.p = null;
                    }
                    monitorexit(o);
                    o = this.e;
                    synchronized (o) {
                        final dtk f = this.f;
                        if (f != null) {
                            this.n.a((Runnable)f);
                            this.f = null;
                        }
                        monitorexit(o);
                        o = this.S;
                        monitorenter(o);
                        final int n = 0;
                        int i = 0;
                        try {
                            while (i < this.T.size()) {
                                ((dti)this.T.get(i)).b();
                                ++i;
                            }
                            this.T.clear();
                            monitorexit(o);
                            this.J = true;
                            o = this.s;
                            if (o != null) {
                                this.K = ((dst)o).q();
                            }
                            o = this.m;
                            if (o != null) {
                                ((dvu)o).B((ComponentTree)null);
                            }
                            this.s = null;
                            this.B();
                            this.t = null;
                            this.u = null;
                            this.v = null;
                            this.d = null;
                            monitorexit(this);
                            synchronized (this.af) {
                                this.A();
                                monitorexit(this.af);
                                if (this.ab != null) {
                                    Object ab = this.ab;
                                    monitorenter(ab);
                                    try {
                                        if (((elx)ab).a == null) {
                                            return;
                                        }
                                        final ArrayList list = new ArrayList();
                                        final ArrayList list2 = new ArrayList();
                                        for (final Map.Entry<K, dst> entry : ((Map<Object, Object>)((elx)ab).a).entrySet()) {
                                            list.add(entry.getValue());
                                            list2.add(entry.getKey());
                                        }
                                        ((Map)((elx)ab).a).clear();
                                        monitorexit(ab);
                                        for (int size = list.size(), j = n; j < size; ++j) {
                                            ab = list.get(j);
                                            final String s = (String)list2.get(j);
                                            final dsx p2 = ((dst)ab).p;
                                            ((dtd)ab).as();
                                        }
                                    }
                                    finally {}
                                }
                                return;
                            }
                        }
                        finally {
                            monitorexit(o);
                        }
                    }
                }
            }
        }
        throw new IllegalStateException("Releasing a ComponentTree that is currently being mounted");
    }
    
    public final void o(final dst dst, final int n, final int n2, final dwq dwq) {
        if (dst != null) {
            this.y(dst, n, n2, false, dwq, 0, null);
            return;
        }
        throw new IllegalArgumentException("Root component can't be null");
    }
    
    public final void p(final boolean b, final String s, final boolean b2) {
        final boolean a = dyp.a;
        synchronized (this) {
            final dst s2 = this.s;
            if (s2 != null) {
                final dst j = s2.j();
                final cya x = cya.x(this.ae);
                if (b2 && ++this.M == 50) {
                    coz.d(3, "ComponentTree:StateUpdatesWhenLayoutInProgressExceedsThreshold", "State Updates when create layout in progress exceeds threshold");
                }
                monitorexit(this);
                int n;
                if (!b) {
                    n = 4;
                }
                else {
                    n = 5;
                }
                this.G(j, -1, -1, b, null, n, s, x, b2, false);
            }
        }
    }
    
    public final boolean q(final int n, final int n2) {
        synchronized (this) {
            return F(this.t, n, n2) || F(this.u, n, n2);
        }
    }
    
    public final boolean s() {
        synchronized (this) {
            return this.J;
        }
    }
    
    public final boolean t() {
        if (!this.m.G() && !this.m.H()) {
            if (this.O) {
                final dvz k = this.m.k;
                bkw.e();
                this.m.w();
            }
            return false;
        }
        if (this.i) {
            this.k();
        }
        else {
            final Rect rect = new Rect();
            this.m.getLocalVisibleRect(rect);
            this.m(rect, true);
        }
        return true;
    }
    
    public final void u(final int n, final int n2, final int n3) {
        monitorenter(this);
        try {
            final dvf u = this.u;
            if (u != null) {
                final cya ad = this.ad;
                final elx g = u.G;
                if (g != null) {
                    final Object a = g.a;
                    if (a != null) {
                        final Iterator iterator = ((Map)a).keySet().iterator();
                        while (iterator.hasNext()) {
                            final hyx hyx = ((Map<K, hyx>)g.a).get(iterator.next());
                            for (int size = ((List)hyx.c).size(), i = 0; i < size; ++i) {
                                final dst dst = ((List<dst>)hyx.c).get(i);
                                final String s = ((List<String>)hyx.a).get(i);
                                final Object b = hyx.b;
                                if (!ad.s(dst)) {
                                    final int n4 = (int)((n3 - n2 + 1) * ((ovz)hyx.d).a);
                                    if (n >= n2 - n4 && n <= n4 + n3) {
                                        final dsx p3 = dst.p;
                                        final Object b2 = hyx.b;
                                        ((dtd)dst).ap();
                                        final Object b3 = hyx.b;
                                        ad.t(dst, 1);
                                        continue;
                                    }
                                }
                                final Object b4 = hyx.b;
                                if (ad.s(dst)) {
                                    final int n5 = (int)((n3 - n2 + 1) * ((ovz)hyx.d).a);
                                    if (n < n2 - n5 || n > n5 + n3) {
                                        final dsx p4 = dst.p;
                                        final Object b5 = hyx.b;
                                        ((dtd)dst).ao();
                                        final Object b6 = hyx.b;
                                        ad.t(dst, 2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final int v(final int n, final boolean b, final tqv tqv) {
        if (tqv == null) {
            return -1;
        }
        if (!this.q) {
            final Object b2 = tqv.b;
            if (b2 != null) {
                return (int)dxg.f((dxf)b2, (ego)this.t);
            }
        }
        if (this.q && !b) {
            return n;
        }
        return -1;
    }
    
    public final void w(final dwq dwq, int i, String o, cya cya, final boolean b) {
        Object u = this.o;
        monitorenter(u);
        try {
            final dth p5 = this.p;
            if (p5 != null) {
                this.n.a((Runnable)p5);
                this.p = null;
            }
            monitorexit(u);
            synchronized (this) {
                final int x = this.X;
                if (x != -1) {
                    final int y = this.Y;
                    if (y != -1) {
                        u = this.s;
                        if (u != null) {
                            if (E(this.u, ((dst)u).j, x, y)) {
                                if (dwq != null) {
                                    final dvf u2 = this.u;
                                    dwq.a = u2.q;
                                    dwq.b = u2.r;
                                }
                                return;
                            }
                            final int x2 = this.X;
                            final int y2 = this.Y;
                            final dst j = this.s.j();
                            final int w = this.V++;
                            monitorexit(this);
                            final dsx g = this.g;
                            final dti dti = new dti(this, g, j, x2, y2, this.P, cya, i, (String)o, (byte[])null, (byte[])null, (byte[])null);
                            u = this.S;
                            monitorenter(u);
                            final int n = 0;
                            int n2 = 0;
                            try {
                                dti dti2;
                                boolean b3;
                                while (true) {
                                    final int size = this.T.size();
                                    final boolean b2 = true;
                                    if (n2 >= size) {
                                        dti2 = dti;
                                        b3 = false;
                                        break;
                                    }
                                    dti2 = this.T.get(n2);
                                    if (!dti2.k && dti2.equals((Object)dti)) {
                                        b3 = true;
                                        break;
                                    }
                                    ++n2;
                                }
                                if (!b3) {
                                    this.T.add(dti2);
                                }
                                dti2.f.incrementAndGet();
                                monitorexit(u);
                                u = dti2.a(i);
                                cya = (cya)this.S;
                                synchronized (cya) {
                                    if (dti2.f.decrementAndGet() >= 0) {
                                        if (dti2.f.get() == 0) {
                                            dti2.b();
                                            this.T.remove(dti2);
                                        }
                                        monitorexit(cya);
                                        cya = (cya)j.r;
                                        if (cya != null) {
                                            final Context b4 = g.b;
                                            if (cya != b4) {
                                                cya = (cya)String.valueOf(b4);
                                                final String value = String.valueOf(j.r);
                                                o = j.q();
                                                final String m = coy.m(g);
                                                final StringBuilder sb = new StringBuilder("ComponentTree context is different from root builder context, ComponentTree context=");
                                                sb.append((String)cya);
                                                sb.append(", root builder context=");
                                                sb.append(value);
                                                sb.append(", root=");
                                                sb.append((String)o);
                                                sb.append(", ContextTree=");
                                                sb.append(m);
                                                coz.d(2, "ComponentTree:CTContextIsDifferentFromRootBuilderContext", sb.toString());
                                            }
                                        }
                                        if (u == null) {
                                            if (!this.s() && r(i)) {
                                                o = dvf.g(i);
                                                cya = (cya)Thread.currentThread().getName();
                                                final dst s = this.s;
                                                String q;
                                                if (s == null) {
                                                    q = "null";
                                                }
                                                else {
                                                    q = s.q();
                                                }
                                                final boolean z = this.z;
                                                u = new StringBuilder("LayoutState is null, but only async operations can return a null LayoutState. Source: ");
                                                ((StringBuilder)u).append((String)o);
                                                ((StringBuilder)u).append(", current thread: ");
                                                ((StringBuilder)u).append((String)cya);
                                                ((StringBuilder)u).append(". Root: ");
                                                ((StringBuilder)u).append(q);
                                                ((StringBuilder)u).append(". Interruptible layouts: ");
                                                ((StringBuilder)u).append(z);
                                                final String string = ((StringBuilder)u).toString();
                                                final boolean a = dyp.a;
                                                throw new IllegalStateException(string);
                                            }
                                            return;
                                        }
                                        else {
                                            if (dwq != null) {
                                                dwq.a = ((dvf)u).q;
                                                dwq.b = ((dvf)u).r;
                                            }
                                            synchronized (this) {
                                                boolean b2;
                                                if (w > this.W && !((dvf)u).E && F((dvf)u, this.X, this.Y)) {
                                                    this.W = w;
                                                    this.u = (dvf)u;
                                                    ((dvf)u).E = true;
                                                }
                                                else {
                                                    b2 = false;
                                                }
                                                final dws w2 = ((dvf)u).w;
                                                cya = null;
                                                ((dvf)u).w = null;
                                                int n3;
                                                if (!b2) {
                                                    o = null;
                                                    i = 0;
                                                    n3 = 0;
                                                }
                                                else {
                                                    o = ((dvf)u).a;
                                                    ((dvf)u).a = null;
                                                    ((dvf)u).b = null;
                                                    if (w2 != null) {
                                                        cya = (cya)this.v;
                                                        if (cya != null) {
                                                            if (dyp.t) {
                                                                ((List)o).indexOf(j);
                                                                coy.l(j);
                                                                if (!dtt.a.remove(this.w)) {
                                                                    new dws((dws)cya);
                                                                    final bhv ac = this.ac;
                                                                    if (ac == null) {
                                                                        this.ac = new bhv(j);
                                                                    }
                                                                    else {
                                                                        final Object a2 = ac.a;
                                                                        ac.n(new dts(System.currentTimeMillis(), ((List<dts>)a2).get(((List)a2).size() - 1).a + 1L));
                                                                    }
                                                                }
                                                            }
                                                            final Map b5 = w2.b();
                                                            monitorenter(cya);
                                                            Label_1170: {
                                                                if (b5 == null) {
                                                                    break Label_1170;
                                                                }
                                                                try {
                                                                    final Map a3 = ((dws)cya).a;
                                                                    Label_1173: {
                                                                        if (a3 != null) {
                                                                            if (!a3.isEmpty()) {
                                                                                monitorexit(cya);
                                                                                for (Map.Entry<String, V> entry : b5.entrySet()) {
                                                                                    final String s2 = entry.getKey();
                                                                                    synchronized (cya) {
                                                                                        final List list = ((dws)cya).a.get(s2);
                                                                                        final Map b6 = ((dws)cya).b;
                                                                                        List list2;
                                                                                        if (b6 == null) {
                                                                                            list2 = null;
                                                                                        }
                                                                                        else {
                                                                                            list2 = b6.get(s2);
                                                                                        }
                                                                                        monitorexit(cya);
                                                                                        if (list == null) {
                                                                                            continue;
                                                                                        }
                                                                                        final List list3 = (List)entry.getValue();
                                                                                        if (list.size() == list3.size()) {
                                                                                            synchronized (cya) {
                                                                                                ((dws)cya).a.remove(s2);
                                                                                                final Map b7 = ((dws)cya).b;
                                                                                                if (b7 == null) {
                                                                                                    continue;
                                                                                                }
                                                                                                b7.remove(s2);
                                                                                                continue;
                                                                                            }
                                                                                        }
                                                                                        list.removeAll(list3);
                                                                                        if (list2 != null) {
                                                                                            list2.removeAll(list3);
                                                                                            continue;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    break Label_1170;
                                                                                }
                                                                                break Label_1173;
                                                                            }
                                                                        }
                                                                        monitorexit(cya);
                                                                    }
                                                                    final HashSet f = w2.f;
                                                                    final ArrayList list4 = new ArrayList();
                                                                    if (f != null) {
                                                                        final Map e = w2.e;
                                                                        if (e != null) {
                                                                            list4.addAll(e.keySet());
                                                                            int size2;
                                                                            String s3;
                                                                            for (size2 = list4.size(), i = 0; i < size2; ++i) {
                                                                                s3 = (String)list4.get(i);
                                                                                if (!f.contains(s3)) {
                                                                                    w2.e.remove(s3);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    ((dws)cya).h(w2.f());
                                                                    ((dws)cya).i(w2.d());
                                                                    final Map g2 = ((dws)cya).g;
                                                                    if (g2 != null) {
                                                                        g2.clear();
                                                                    }
                                                                    final Map g3 = w2.g;
                                                                    if (g3 != null && !g3.isEmpty()) {
                                                                        final Map g4 = ((dws)cya).g;
                                                                        if (g4 == null) {
                                                                            ((dws)cya).g = new HashMap(w2.g);
                                                                        }
                                                                        else {
                                                                            g4.putAll(w2.g);
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    monitorexit(cya);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int q2;
                                                    if (this.d != null) {
                                                        q2 = ((dvf)u).q;
                                                        i = ((dvf)u).r;
                                                    }
                                                    else {
                                                        q2 = 0;
                                                        i = 0;
                                                    }
                                                    cya = (cya)((dvf)u).B;
                                                    ((dvf)u).B = null;
                                                    final int n4 = q2;
                                                    n3 = i;
                                                    i = n4;
                                                }
                                                if (w2 != null) {
                                                    this.E.k(w2);
                                                }
                                                if (!b) {
                                                    this.M = 0;
                                                }
                                                monitorexit(this);
                                                if (b2) {
                                                    synchronized (this) {
                                                        final List d = this.d;
                                                        List list5;
                                                        if (d == null) {
                                                            list5 = null;
                                                        }
                                                        else {
                                                            list5 = new ArrayList(d);
                                                        }
                                                        monitorexit(this);
                                                        if (list5 != null) {
                                                            for (int size3 = list5.size(), k = 0; k < size3; ++k) {
                                                                ((dtj)list5.get(k)).a(i, n3);
                                                            }
                                                        }
                                                        if (this.ab != null) {
                                                            this.ab.l((Map)cya);
                                                        }
                                                        else if (cya != null) {
                                                            u = this.ab;
                                                            final dvf dvf;
                                                            if ((dvf = (dvf)u) == null) {
                                                                synchronized (this) {
                                                                    u = this.ab;
                                                                    if (u == null) {
                                                                        this.ab = new elx();
                                                                    }
                                                                }
                                                            }
                                                            ((elx)dvf).l((Map)cya);
                                                        }
                                                    }
                                                }
                                                if (o != null) {
                                                    this.A();
                                                    final int size4 = ((List)o).size();
                                                    i = n;
                                                    while (i < size4) {
                                                        final dst dst = ((List<dst>)o).get(i);
                                                        u = coy.l(dst);
                                                        cya = (cya)dst.p;
                                                        this.D.j((dsx)cya, (duv)dst, (String)u);
                                                        synchronized (this.af) {
                                                            dst.J(this.af);
                                                            monitorexit(this.af);
                                                            ++i;
                                                            continue;
                                                        }
                                                        break;
                                                    }
                                                    this.D.k();
                                                }
                                                if (b2) {
                                                    if (bkw.f()) {
                                                        this.i();
                                                        return;
                                                    }
                                                    ((dvj)this.Q).post(this.R);
                                                }
                                                return;
                                            }
                                        }
                                    }
                                    throw new IllegalStateException("LayoutStateFuture ref count is below 0");
                                }
                            }
                            finally {
                                monitorexit(u);
                            }
                        }
                    }
                }
            }
        }
        finally {
            monitorexit(u);
            while (true) {}
        }
    }
    
    public final msr x() {
        msr msr;
        if ((msr = this.F) == null) {
            msr = this.g.q();
        }
        return msr;
    }
    
    public final void y(final dst dst, final int n, final int n2, final boolean b, final dwq dwq, final int n3, final cya cya) {
        this.G(dst, n, n2, b, dwq, n3, null, cya, false, false);
    }
}
