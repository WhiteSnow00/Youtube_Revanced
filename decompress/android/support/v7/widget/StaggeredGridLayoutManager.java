// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import java.util.List;
import java.util.ArrayList;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.os.Parcelable;
import android.graphics.PointF;
import android.view.View$MeasureSpec;
import java.util.Arrays;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import java.util.BitSet;

public class StaggeredGridLayoutManager extends nx implements oj
{
    private final ph H;
    private boolean I;
    private int[] J;
    private final Runnable K;
    pj[] a;
    public nl b;
    nl c;
    public boolean d;
    boolean e;
    int f;
    int g;
    qr h;
    private int i;
    private int j;
    private int k;
    private final ms l;
    private BitSet m;
    private int n;
    private boolean o;
    private boolean p;
    private StaggeredGridLayoutManager$SavedState q;
    private final Rect r;
    
    public StaggeredGridLayoutManager(final Context context, final AttributeSet set, int i, final int n) {
        this.i = -1;
        final int n2 = 0;
        this.d = false;
        this.e = false;
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.h = new qr();
        this.n = 2;
        this.r = new Rect();
        this.H = new ph(this);
        this.I = true;
        this.K = (Runnable)new pg(this, 0);
        final nw az = az(context, set, i, n);
        i = az.a;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        this.U((String)null);
        if (i != this.j) {
            this.j = i;
            final nl b = this.b;
            this.b = this.c;
            this.c = b;
            this.aX();
        }
        i = az.b;
        this.U((String)null);
        if (i != this.i) {
            this.h.a();
            this.aX();
            this.i = i;
            this.m = new BitSet(i);
            this.a = new pj[this.i];
            for (i = n2; i < this.i; ++i) {
                this.a[i] = new pj(this, i);
            }
            this.aX();
        }
        this.H(az.c);
        this.l = new ms();
        this.b = nl.q((nx)this, this.j);
        this.c = nl.q((nx)this, 1 - this.j);
    }
    
    private final int L(final int n) {
        if (this.as() == 0) {
            if (this.e) {
                return 1;
            }
            return -1;
        }
        else {
            if (n < this.c() != this.e) {
                return -1;
            }
            return 1;
        }
    }
    
    private final int M(final ol ol) {
        if (this.as() == 0) {
            return 0;
        }
        return ix.b(ol, this.b, this.r(this.I ^ true), this.l(this.I ^ true), (nx)this, this.I);
    }
    
    private final int N(final ol ol) {
        if (this.as() == 0) {
            return 0;
        }
        return ix.c(ol, this.b, this.r(this.I ^ true), this.l(this.I ^ true), (nx)this, this.I, this.e);
    }
    
    private final int O(final ol ol) {
        if (this.as() == 0) {
            return 0;
        }
        return ix.d(ol, this.b, this.r(this.I ^ true), this.l(this.I ^ true), (nx)this, this.I);
    }
    
    private final int R(final od od, final ms ms, final ol ol) {
        this.m.set(0, this.i, true);
        int n;
        if (this.l.i) {
            if (ms.e == 1) {
                n = Integer.MAX_VALUE;
            }
            else {
                n = Integer.MIN_VALUE;
            }
        }
        else if (ms.e == 1) {
            n = ms.g + ms.b;
        }
        else {
            n = ms.f - ms.b;
        }
        final int e = ms.e;
        for (int i = 0; i < this.i; ++i) {
            if (!this.a[i].a.isEmpty()) {
                this.bC(this.a[i], e, n);
            }
        }
        int n2;
        if (this.e) {
            n2 = this.b.f();
        }
        else {
            n2 = this.b.j();
        }
        boolean b = false;
        while (ms.a(ol) && (this.l.i || !this.m.isEmpty())) {
            final View b2 = od.b(ms.c);
            ms.c += ms.d;
            final pi pi = (pi)b2.getLayoutParams();
            final int lt = ((ny)pi).lt();
            final Object a = this.h.a;
            int n3 = 0;
            Label_0277: {
                if (a != null) {
                    final int[] array = (int[])a;
                    if (lt < array.length) {
                        n3 = array[lt];
                        break Label_0277;
                    }
                }
                n3 = -1;
            }
            final boolean b3 = n3 == -1;
            pj a2;
            if (b3) {
                final boolean b4 = pi.b;
                int n4;
                int j;
                int n5;
                if (this.bD(ms.e)) {
                    n4 = this.i - 1;
                    j = -1;
                    n5 = -1;
                }
                else {
                    j = this.i;
                    n4 = 0;
                    n5 = 1;
                }
                final int e2 = ms.e;
                final pj pj = null;
                pj pj2 = null;
                if (e2 == 1) {
                    final int k = this.b.j();
                    final int n6 = Integer.MAX_VALUE;
                    int n7 = n4;
                    int n8 = n6;
                    while (true) {
                        a2 = pj2;
                        if (n7 == j) {
                            break;
                        }
                        final pj pj3 = this.a[n7];
                        final int d = pj3.d(k);
                        int n9;
                        if (d < n8) {
                            n9 = d;
                        }
                        else {
                            n9 = n8;
                        }
                        if (d < n8) {
                            pj2 = pj3;
                        }
                        n7 += n5;
                        n8 = n9;
                    }
                }
                else {
                    final int f = this.b.f();
                    final int n10 = Integer.MIN_VALUE;
                    pj pj4 = pj;
                    int n11 = n4;
                    int n12 = n10;
                    while (true) {
                        a2 = pj4;
                        if (n11 == j) {
                            break;
                        }
                        final pj pj5 = this.a[n11];
                        final int f2 = pj5.f(f);
                        int n13;
                        if (f2 > n12) {
                            n13 = f2;
                        }
                        else {
                            n13 = n12;
                        }
                        if (f2 > n12) {
                            pj4 = pj5;
                        }
                        n11 += n5;
                        n12 = n13;
                    }
                }
                final qr h = this.h;
                h.b(lt);
                ((int[])h.a)[lt] = a2.e;
            }
            else {
                a2 = this.a[n3];
            }
            pi.a = a2;
            if (ms.e == 1) {
                this.aF(b2);
            }
            else {
                this.aG(b2, 0);
            }
            final boolean b5 = pi.b;
            if (this.j == 1) {
                this.bE(b2, au(this.k, super.B, 0, pi.width, false), au(super.E, super.C, this.getPaddingTop() + this.getPaddingBottom(), pi.height, true));
            }
            else {
                this.bE(b2, au(super.D, super.B, this.getPaddingLeft() + this.getPaddingRight(), pi.width, true), au(this.k, super.C, 0, pi.height, false));
            }
            int n15;
            int n16;
            if (ms.e == 1) {
                final boolean b6 = pi.b;
                final int d2 = a2.d(n2);
                final int n14 = this.b.b(b2) + d2;
                n15 = d2;
                n16 = n14;
                if (b3) {
                    final boolean b7 = pi.b;
                    n15 = d2;
                    n16 = n14;
                }
            }
            else {
                final boolean b8 = pi.b;
                final int f3 = a2.f(n2);
                final int n17 = n15 = f3 - this.b.b(b2);
                n16 = f3;
                if (b3) {
                    final boolean b9 = pi.b;
                    n16 = f3;
                    n15 = n17;
                }
            }
            final boolean b10 = pi.b;
            if (ms.e == 1) {
                final pj a3 = pi.a;
                final pi n18 = pj.n(b2);
                n18.a = a3;
                a3.a.add(b2);
                a3.c = Integer.MIN_VALUE;
                if (a3.a.size() == 1) {
                    a3.b = Integer.MIN_VALUE;
                }
                if (((ny)n18).lv() || ((ny)n18).lu()) {
                    a3.d += a3.f.b.b(b2);
                }
            }
            else {
                final pj a4 = pi.a;
                final pi n19 = pj.n(b2);
                n19.a = a4;
                a4.a.add(0, b2);
                a4.b = Integer.MIN_VALUE;
                if (a4.a.size() == 1) {
                    a4.c = Integer.MIN_VALUE;
                }
                if (((ny)n19).lv() || ((ny)n19).lu()) {
                    a4.d += a4.f.b.b(b2);
                }
            }
            int n20;
            int n21;
            if (this.K() && this.j == 1) {
                final boolean b11 = pi.b;
                n20 = this.c.f() - (this.i - 1 - a2.e) * this.k;
                n21 = n20 - this.c.b(b2);
            }
            else {
                final boolean b12 = pi.b;
                n21 = this.c.j() + a2.e * this.k;
                n20 = this.c.b(b2) + n21;
            }
            if (this.j == 1) {
                bs(b2, n21, n15, n20, n16);
            }
            else {
                bs(b2, n15, n21, n16, n20);
            }
            final boolean b13 = pi.b;
            this.bC(a2, this.l.e, n);
            this.ah(od, this.l);
            if (this.l.h && b2.hasFocusable()) {
                final boolean b14 = pi.b;
                this.m.set(a2.e, false);
            }
            b = true;
        }
        if (!b) {
            this.ah(od, this.l);
        }
        int n22;
        if (this.l.e == -1) {
            n22 = this.b.j() - this.V(this.b.j());
        }
        else {
            n22 = this.S(this.b.f()) - this.b.f();
        }
        if (n22 > 0) {
            return Math.min(ms.b, n22);
        }
        return 0;
    }
    
    private final int S(final int n) {
        int d = this.a[0].d(n);
        int n2;
        for (int i = 1; i < this.i; ++i, d = n2) {
            final int d2 = this.a[i].d(n);
            if (d2 > (n2 = d)) {
                n2 = d2;
            }
        }
        return d;
    }
    
    private final int V(final int n) {
        int f = this.a[0].f(n);
        int n2;
        for (int i = 1; i < this.i; ++i, f = n2) {
            final int f2 = this.a[i].f(n);
            if (f2 < (n2 = f)) {
                n2 = f2;
            }
        }
        return f;
    }
    
    private final void W(final od od, final ol ol, final boolean b) {
        final int s = this.S(Integer.MIN_VALUE);
        if (s == Integer.MIN_VALUE) {
            return;
        }
        final int n = this.b.f() - s;
        if (n > 0) {
            final int n2 = -this.k(-n, od, ol);
            if (b) {
                final int n3 = n - n2;
                if (n3 > 0) {
                    this.b.n(n3);
                }
            }
        }
    }
    
    private final void ab(final od od, final ol ol, final boolean b) {
        final int v = this.V(Integer.MAX_VALUE);
        if (v == Integer.MAX_VALUE) {
            return;
        }
        final int n = v - this.b.j();
        if (n > 0) {
            final int n2 = n - this.k(n, od, ol);
            if (b && n2 > 0) {
                this.b.n(-n2);
            }
        }
    }
    
    private final void ac(int n, final int n2, final int n3) {
        int n4;
        if (this.e) {
            n4 = this.i();
        }
        else {
            n4 = this.c();
        }
        int n5 = 0;
        int n6 = 0;
        Label_0064: {
            int n7;
            if (n3 == 8) {
                if (n >= n2) {
                    n5 = n + 1;
                    n6 = n2;
                    break Label_0064;
                }
                n7 = n2 + 1;
            }
            else {
                n7 = n + n2;
            }
            n6 = n;
            n5 = n7;
        }
        final qr h = this.h;
        final Object a = h.a;
        if (a != null) {
            if (n6 < ((int[])a).length) {
                final Object b = h.b;
                int a2 = 0;
                Label_0287: {
                    Label_0108: {
                        if (b != null) {
                            while (true) {
                                for (int i = ((List)b).size() - 1; i >= 0; --i) {
                                    final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = ((List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>)h.b).get(i);
                                    if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a == n6) {
                                        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                                            ((List)h.b).remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                                        }
                                        final int size = ((List)h.b).size();
                                        int j = 0;
                                        while (true) {
                                            while (j < size) {
                                                if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)((List<Object>)h.b).get(j)).a >= n6) {
                                                    if (j != -1) {
                                                        final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = ((List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>)h.b).get(j);
                                                        ((List<Object>)h.b).remove(j);
                                                        a2 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.a;
                                                        break Label_0287;
                                                    }
                                                    break Label_0108;
                                                }
                                                else {
                                                    ++j;
                                                }
                                            }
                                            j = -1;
                                            continue;
                                        }
                                    }
                                }
                                final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                                continue;
                            }
                        }
                    }
                    a2 = -1;
                }
                if (a2 == -1) {
                    final int[] array = (int[])h.a;
                    Arrays.fill(array, n6, array.length, -1);
                    final int length = ((int[])h.a).length;
                }
                else {
                    Arrays.fill((int[])h.a, n6, Math.min(a2 + 1, ((int[])h.a).length), -1);
                }
            }
        }
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 == 8) {
                    this.h.d(n, 1);
                    this.h.c(n2, 1);
                }
            }
            else {
                this.h.d(n, n2);
            }
        }
        else {
            this.h.c(n, n2);
        }
        if (n5 <= n4) {
            return;
        }
        if (this.e) {
            n = this.c();
        }
        else {
            n = this.i();
        }
        if (n6 <= n) {
            this.aX();
        }
    }
    
    private final void ad(final od od, final ol ol, final boolean b) {
        final ph h = this.H;
        if ((this.q == null && this.f == -1) || ol.a() != 0) {
            final boolean e = h.e;
            final int n = 1;
            final boolean b2 = !e || this.f != -1 || this.q != null;
            if (b2) {
                h.a();
                final StaggeredGridLayoutManager$SavedState q = this.q;
                if (q != null) {
                    final int c = q.c;
                    if (c > 0) {
                        if (c == this.i) {
                            for (int i = 0; i < this.i; ++i) {
                                this.a[i].j();
                                final StaggeredGridLayoutManager$SavedState q2 = this.q;
                                final int n2 = q2.d[i];
                                int n3;
                                if ((n3 = n2) != Integer.MIN_VALUE) {
                                    int n4;
                                    if (q2.i) {
                                        n4 = this.b.f();
                                    }
                                    else {
                                        n4 = this.b.j();
                                    }
                                    n3 = n2 + n4;
                                }
                                this.a[i].l(n3);
                            }
                        }
                        else {
                            q.b();
                            final StaggeredGridLayoutManager$SavedState q3 = this.q;
                            q3.a = q3.b;
                        }
                    }
                    final StaggeredGridLayoutManager$SavedState q4 = this.q;
                    this.p = q4.j;
                    this.H(q4.h);
                    this.al();
                    final StaggeredGridLayoutManager$SavedState q5 = this.q;
                    final int a = q5.a;
                    if (a != -1) {
                        this.f = a;
                        h.c = q5.i;
                    }
                    else {
                        h.c = this.e;
                    }
                    if (q5.e > 1) {
                        final qr h2 = this.h;
                        h2.a = q5.f;
                        h2.b = q5.g;
                    }
                }
                else {
                    this.al();
                    h.c = this.e;
                }
                Label_1011: {
                    if (!ol.g) {
                        final int f = this.f;
                        if (f != -1) {
                            if (f >= 0 && f < ol.a()) {
                                final StaggeredGridLayoutManager$SavedState q6 = this.q;
                                if (q6 != null && q6.a != -1 && q6.c > 0) {
                                    h.b = Integer.MIN_VALUE;
                                    h.a = this.f;
                                    break Label_1011;
                                }
                                final View t = this.T(this.f);
                                if (t == null) {
                                    final int f2 = this.f;
                                    h.a = f2;
                                    final int g = this.g;
                                    if (g == Integer.MIN_VALUE) {
                                        final boolean c2 = this.L(f2) == 1;
                                        h.c = c2;
                                        int b3;
                                        if (c2) {
                                            b3 = h.g.b.f();
                                        }
                                        else {
                                            b3 = h.g.b.j();
                                        }
                                        h.b = b3;
                                    }
                                    else if (h.c) {
                                        h.b = h.g.b.f() - g;
                                    }
                                    else {
                                        h.b = h.g.b.j() + g;
                                    }
                                    h.d = true;
                                    break Label_1011;
                                }
                                int a2;
                                if (this.e) {
                                    a2 = this.i();
                                }
                                else {
                                    a2 = this.c();
                                }
                                h.a = a2;
                                if (this.g != Integer.MIN_VALUE) {
                                    if (h.c) {
                                        h.b = this.b.f() - this.g - this.b.a(t);
                                        break Label_1011;
                                    }
                                    h.b = this.b.j() + this.g - this.b.d(t);
                                    break Label_1011;
                                }
                                else {
                                    if (this.b.b(t) > this.b.k()) {
                                        int b4;
                                        if (h.c) {
                                            b4 = this.b.f();
                                        }
                                        else {
                                            b4 = this.b.j();
                                        }
                                        h.b = b4;
                                        break Label_1011;
                                    }
                                    final int n5 = this.b.d(t) - this.b.j();
                                    if (n5 < 0) {
                                        h.b = -n5;
                                        break Label_1011;
                                    }
                                    final int b5 = this.b.f() - this.b.a(t);
                                    if (b5 < 0) {
                                        h.b = b5;
                                        break Label_1011;
                                    }
                                    h.b = Integer.MIN_VALUE;
                                    break Label_1011;
                                }
                            }
                            else {
                                this.f = -1;
                                this.g = Integer.MIN_VALUE;
                            }
                        }
                    }
                    int a4 = 0;
                    Label_0997: {
                        if (this.o) {
                            final int a3 = ol.a();
                            for (int j = this.as() - 1; j >= 0; --j) {
                                final int bo = bo(this.aB(j));
                                if (bo >= 0 && bo < a3) {
                                    a4 = bo;
                                    break Label_0997;
                                }
                            }
                        }
                        else {
                            final int a5 = ol.a();
                            for (int as = this.as(), k = 0; k < as; ++k) {
                                final int bo2 = bo(this.aB(k));
                                if (bo2 >= 0 && bo2 < a5) {
                                    a4 = bo2;
                                    break Label_0997;
                                }
                            }
                        }
                        a4 = 0;
                    }
                    h.a = a4;
                    h.b = Integer.MIN_VALUE;
                }
                h.e = true;
            }
            if (this.q == null && this.f == -1 && (h.c != this.o || this.K() != this.p)) {
                this.h.a();
                h.d = true;
            }
            if (this.as() > 0) {
                final StaggeredGridLayoutManager$SavedState q7 = this.q;
                if (q7 == null || q7.c <= 0) {
                    if (h.d) {
                        for (int l = 0; l < this.i; ++l) {
                            this.a[l].j();
                            final int b6 = h.b;
                            if (b6 != Integer.MIN_VALUE) {
                                this.a[l].l(b6);
                            }
                        }
                    }
                    else if (!b2 && this.H.f != null) {
                        for (int n6 = 0; n6 < this.i; ++n6) {
                            final pj pj = this.a[n6];
                            pj.j();
                            pj.l(this.H.f[n6]);
                        }
                    }
                    else {
                        for (int n7 = 0; n7 < this.i; ++n7) {
                            final pj pj2 = this.a[n7];
                            final boolean e2 = this.e;
                            final int b7 = h.b;
                            int n8;
                            if (e2) {
                                n8 = pj2.d(Integer.MIN_VALUE);
                            }
                            else {
                                n8 = pj2.f(Integer.MIN_VALUE);
                            }
                            pj2.j();
                            if (n8 != Integer.MIN_VALUE) {
                                if ((!e2 || n8 >= pj2.f.b.f()) && (e2 || n8 <= pj2.f.b.j())) {
                                    int n9 = n8;
                                    if (b7 != Integer.MIN_VALUE) {
                                        n9 = n8 + b7;
                                    }
                                    pj2.c = n9;
                                    pj2.b = n9;
                                }
                            }
                        }
                        final ph h3 = this.H;
                        final pj[] a6 = this.a;
                        final int length = a6.length;
                        final int[] f3 = h3.f;
                        if (f3 == null || f3.length < length) {
                            h3.f = new int[h3.g.a.length];
                        }
                        for (int n10 = 0; n10 < length; ++n10) {
                            h3.f[n10] = a6[n10].f(Integer.MIN_VALUE);
                        }
                    }
                }
            }
            this.aI(od);
            this.l.a = false;
            this.I(this.c.k());
            this.an(h.a, ol);
            if (h.c) {
                this.am(-1);
                this.R(od, this.l, ol);
                this.am(1);
                final ms m = this.l;
                m.c = h.a + m.d;
                this.R(od, m, ol);
            }
            else {
                this.am(1);
                this.R(od, this.l, ol);
                this.am(-1);
                final ms l2 = this.l;
                l2.c = h.a + l2.d;
                this.R(od, l2, ol);
            }
            if (this.c.h() != 1073741824) {
                final int as2 = this.as();
                float n11 = 0.0f;
                float max;
                for (int n12 = 0; n12 < as2; ++n12, n11 = max) {
                    final View ab = this.aB(n12);
                    final float n13 = (float)this.c.b(ab);
                    max = n11;
                    if (n13 >= n11) {
                        final pi pi = (pi)ab.getLayoutParams();
                        max = Math.max(n11, n13);
                    }
                }
                final int k2 = this.k;
                int n14 = Math.round(n11 * this.i);
                if (this.c.h() == Integer.MIN_VALUE) {
                    n14 = Math.min(n14, this.c.k());
                }
                this.I(n14);
                if (this.k != k2) {
                    for (int n15 = 0; n15 < as2; ++n15) {
                        final View ab2 = this.aB(n15);
                        final pi pi2 = (pi)ab2.getLayoutParams();
                        final boolean b8 = pi2.b;
                        if (this.K() && this.j == 1) {
                            final int n16 = -(this.i - 1 - pi2.a.e);
                            ab2.offsetLeftAndRight(this.k * n16 - n16 * k2);
                        }
                        else {
                            final int e3 = pi2.a.e;
                            final int n17 = this.k * e3;
                            final int n18 = e3 * k2;
                            if (this.j == 1) {
                                ab2.offsetLeftAndRight(n17 - n18);
                            }
                            else {
                                ab2.offsetTopAndBottom(n17 - n18);
                            }
                        }
                    }
                }
            }
            if (this.as() > 0) {
                if (this.e) {
                    this.W(od, ol, true);
                    this.ab(od, ol, false);
                }
                else {
                    this.ab(od, ol, true);
                    this.W(od, ol, false);
                }
            }
            int n19 = 0;
            Label_2026: {
                if (b && !ol.g && this.n != 0 && this.as() > 0 && this.s() != null) {
                    this.bx(this.K);
                    if (this.J()) {
                        n19 = n;
                        break Label_2026;
                    }
                }
                n19 = 0;
            }
            if (ol.g) {
                this.H.a();
            }
            this.o = h.c;
            this.p = this.K();
            if (n19 != 0) {
                this.H.a();
                this.ad(od, ol, false);
            }
            return;
        }
        this.aS(od);
        h.a();
    }
    
    private final void ah(final od od, final ms ms) {
        if (ms.a) {
            if (!ms.i) {
                if (ms.b == 0) {
                    if (ms.e == -1) {
                        this.ai(od, ms.g);
                        return;
                    }
                    this.ak(od, ms.f);
                }
                else {
                    final int e = ms.e;
                    final int n = 1;
                    int i = 1;
                    if (e == -1) {
                        final int f = ms.f;
                        int f2 = this.a[0].f(f);
                        while (i < this.i) {
                            final int f3 = this.a[i].f(f);
                            int n2;
                            if (f3 > (n2 = f2)) {
                                n2 = f3;
                            }
                            ++i;
                            f2 = n2;
                        }
                        final int n3 = f - f2;
                        int g;
                        if (n3 < 0) {
                            g = ms.g;
                        }
                        else {
                            g = ms.g - Math.min(n3, ms.b);
                        }
                        this.ai(od, g);
                        return;
                    }
                    final int g2 = ms.g;
                    int d = this.a[0].d(g2);
                    int n4;
                    for (int j = n; j < this.i; ++j, d = n4) {
                        final int d2 = this.a[j].d(g2);
                        if (d2 < (n4 = d)) {
                            n4 = d2;
                        }
                    }
                    final int n5 = d - ms.g;
                    int f4;
                    if (n5 < 0) {
                        f4 = ms.f;
                    }
                    else {
                        f4 = Math.min(n5, ms.b) + ms.f;
                    }
                    this.ak(od, f4);
                }
            }
        }
    }
    
    private final void ai(final od od, final int n) {
        int as = this.as();
        while (--as >= 0) {
            final View ab = this.aB(as);
            if (this.b.d(ab) < n || this.b.m(ab) < n) {
                break;
            }
            final pi pi = (pi)ab.getLayoutParams();
            final boolean b = pi.b;
            if (pi.a.a.size() == 1) {
                return;
            }
            final pj a = pi.a;
            final int size = a.a.size();
            final View view = a.a.remove(size - 1);
            final pi n2 = pj.n(view);
            n2.a = null;
            if (((ny)n2).lv() || ((ny)n2).lu()) {
                a.d -= a.f.b.b(view);
            }
            if (size == 1) {
                a.b = Integer.MIN_VALUE;
            }
            a.c = Integer.MIN_VALUE;
            this.aU(ab, od);
        }
    }
    
    private final void ak(final od od, final int n) {
        while (this.as() > 0) {
            final View ab = this.aB(0);
            if (this.b.a(ab) > n || this.b.l(ab) > n) {
                break;
            }
            final pi pi = (pi)ab.getLayoutParams();
            final boolean b = pi.b;
            if (pi.a.a.size() == 1) {
                return;
            }
            final pj a = pi.a;
            final View view = a.a.remove(0);
            final pi n2 = pj.n(view);
            n2.a = null;
            if (a.a.size() == 0) {
                a.c = Integer.MIN_VALUE;
            }
            if (((ny)n2).lv() || ((ny)n2).lu()) {
                a.d -= a.f.b.b(view);
            }
            a.b = Integer.MIN_VALUE;
            this.aU(ab, od);
        }
    }
    
    private final void al() {
        boolean d;
        if (this.j != 1 && this.K()) {
            d = (this.d ^ true);
        }
        else {
            d = this.d;
        }
        this.e = d;
    }
    
    private final void am(int n) {
        final ms l = this.l;
        l.e = n;
        final boolean e = this.e;
        final int n2 = 1;
        if (e == (n == -1)) {
            n = n2;
        }
        else {
            n = -1;
        }
        l.d = n;
    }
    
    private final void an(int k, final ol ol) {
        final ms l = this.l;
        final boolean b = false;
        l.b = 0;
        l.c = k;
        int i = 0;
        Label_0093: {
            Label_0091: {
                if (this.bh()) {
                    final int a = ol.a;
                    if (a != -1) {
                        if (this.e == a < k) {
                            k = this.b.k();
                            break Label_0091;
                        }
                        i = this.b.k();
                        k = 0;
                        break Label_0093;
                    }
                }
                k = 0;
            }
            i = 0;
        }
        final RecyclerView t = super.t;
        if (t != null && t.i) {
            this.l.f = this.b.j() - i;
            this.l.g = this.b.f() + k;
        }
        else {
            this.l.g = this.b.e() + k;
            this.l.f = -i;
        }
        final ms j = this.l;
        j.h = false;
        j.a = true;
        boolean m = b;
        if (this.b.h() == 0) {
            m = b;
            if (this.b.e() == 0) {
                m = true;
            }
        }
        j.i = m;
    }
    
    private final void bC(final pj pj, final int n, final int n2) {
        final int d = pj.d;
        if (n == -1) {
            if (pj.e() + d <= n2) {
                this.m.set(pj.e, false);
            }
        }
        else if (pj.c() - d >= n2) {
            this.m.set(pj.e, false);
        }
    }
    
    private final boolean bD(final int n) {
        if (this.j == 0) {
            return n == -1 != this.e;
        }
        return n == -1 == this.e == this.K();
    }
    
    private final void bE(final View view, int bf, int bf2) {
        this.aH(view, this.r);
        final pi pi = (pi)view.getLayoutParams();
        bf = bF(bf, pi.leftMargin + this.r.left, pi.rightMargin + this.r.right);
        bf2 = bF(bf2, pi.topMargin + this.r.top, pi.bottomMargin + this.r.bottom);
        if (this.bj(view, bf, bf2, (ny)pi)) {
            view.measure(bf, bf2);
        }
    }
    
    private static final int bF(final int n, int mode, final int n2) {
        int n3 = mode;
        if (mode == 0) {
            if (n2 == 0) {
                return n;
            }
            n3 = 0;
        }
        mode = View$MeasureSpec.getMode(n);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return n;
        }
        return View$MeasureSpec.makeMeasureSpec(Math.max(0, View$MeasureSpec.getSize(n) - n3 - n2), mode);
    }
    
    final void A(final int n, final ol ol) {
        int n2;
        int n3;
        if (n > 0) {
            n2 = this.i();
            n3 = 1;
        }
        else {
            n2 = this.c();
            n3 = -1;
        }
        this.l.a = true;
        this.an(n2, ol);
        this.am(n3);
        final ms l = this.l;
        l.c = n2 + l.d;
        l.b = Math.abs(n);
    }
    
    public final int B(final ol ol) {
        return this.M(ol);
    }
    
    public final int C(final ol ol) {
        return this.N(ol);
    }
    
    public final int D(final ol ol) {
        return this.O(ol);
    }
    
    public final int E(final ol ol) {
        return this.M(ol);
    }
    
    public final int F(final ol ol) {
        return this.N(ol);
    }
    
    public final int G(final ol ol) {
        return this.O(ol);
    }
    
    public final void H(final boolean b) {
        this.U((String)null);
        final StaggeredGridLayoutManager$SavedState q = this.q;
        if (q != null && q.h != b) {
            q.h = b;
        }
        this.d = b;
        this.aX();
    }
    
    final void I(final int n) {
        this.k = n / this.i;
        View$MeasureSpec.makeMeasureSpec(n, this.c.h());
    }
    
    public final boolean J() {
        if (this.as() != 0 && this.n != 0) {
            if (super.w) {
                int n;
                if (this.e) {
                    n = this.i();
                    this.c();
                }
                else {
                    n = this.c();
                    this.i();
                }
                if (n == 0 && this.s() != null) {
                    this.h.a();
                    this.aY();
                    this.aX();
                    return true;
                }
            }
        }
        return false;
    }
    
    final boolean K() {
        return this.aw() == 1;
    }
    
    public final PointF P(int l) {
        l = this.L(l);
        final PointF pointF = new PointF();
        if (l == 0) {
            return null;
        }
        if (this.j == 0) {
            pointF.x = (float)l;
            pointF.y = 0.0f;
        }
        else {
            pointF.x = 0.0f;
            pointF.y = (float)l;
        }
        return pointF;
    }
    
    public final Parcelable Q() {
        final StaggeredGridLayoutManager$SavedState q = this.q;
        if (q != null) {
            return (Parcelable)new StaggeredGridLayoutManager$SavedState(q);
        }
        final StaggeredGridLayoutManager$SavedState staggeredGridLayoutManager$SavedState = new StaggeredGridLayoutManager$SavedState();
        staggeredGridLayoutManager$SavedState.h = this.d;
        staggeredGridLayoutManager$SavedState.i = this.o;
        staggeredGridLayoutManager$SavedState.j = this.p;
        final qr h = this.h;
        int i = 0;
        Label_0122: {
            if (h != null) {
                final Object a = h.a;
                if (a != null) {
                    staggeredGridLayoutManager$SavedState.f = (int[])a;
                    staggeredGridLayoutManager$SavedState.e = staggeredGridLayoutManager$SavedState.f.length;
                    staggeredGridLayoutManager$SavedState.g = (List)h.b;
                    break Label_0122;
                }
            }
            staggeredGridLayoutManager$SavedState.e = 0;
        }
        final int as = this.as();
        final int n = -1;
        if (as > 0) {
            int a2;
            if (this.o) {
                a2 = this.i();
            }
            else {
                a2 = this.c();
            }
            staggeredGridLayoutManager$SavedState.a = a2;
            View view;
            if (this.e) {
                view = this.l(true);
            }
            else {
                view = this.r(true);
            }
            int bo;
            if (view == null) {
                bo = n;
            }
            else {
                bo = bo(view);
            }
            staggeredGridLayoutManager$SavedState.b = bo;
            final int j = this.i;
            staggeredGridLayoutManager$SavedState.c = j;
            staggeredGridLayoutManager$SavedState.d = new int[j];
            while (i < this.i) {
                int n3 = 0;
                Label_0302: {
                    int n2;
                    int n4;
                    if (this.o) {
                        n2 = this.a[i].d(Integer.MIN_VALUE);
                        if ((n3 = n2) == Integer.MIN_VALUE) {
                            break Label_0302;
                        }
                        n4 = this.b.f();
                    }
                    else {
                        n2 = this.a[i].f(Integer.MIN_VALUE);
                        if ((n3 = n2) == Integer.MIN_VALUE) {
                            break Label_0302;
                        }
                        n4 = this.b.j();
                    }
                    n3 = n2 - n4;
                }
                staggeredGridLayoutManager$SavedState.d[i] = n3;
                ++i;
            }
        }
        else {
            staggeredGridLayoutManager$SavedState.a = -1;
            staggeredGridLayoutManager$SavedState.b = -1;
            staggeredGridLayoutManager$SavedState.c = 0;
        }
        return (Parcelable)staggeredGridLayoutManager$SavedState;
    }
    
    public final void U(final String s) {
        if (this.q == null) {
            super.U(s);
        }
    }
    
    public final void X(final RecyclerView recyclerView, final od od) {
        this.bx(this.K);
        for (int i = 0; i < this.i; ++i) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }
    
    public final void Y(final AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (this.as() > 0) {
            final View r = this.r(false);
            final View l = this.l(false);
            if (r != null) {
                if (l != null) {
                    final int bo = bo(r);
                    final int bo2 = bo(l);
                    if (bo < bo2) {
                        accessibilityEvent.setFromIndex(bo);
                        accessibilityEvent.setToIndex(bo2);
                        return;
                    }
                    accessibilityEvent.setFromIndex(bo2);
                    accessibilityEvent.setToIndex(bo);
                }
            }
        }
    }
    
    public final void Z(final Parcelable parcelable) {
        if (parcelable instanceof StaggeredGridLayoutManager$SavedState) {
            final StaggeredGridLayoutManager$SavedState q = (StaggeredGridLayoutManager$SavedState)parcelable;
            this.q = q;
            if (this.f != -1) {
                q.a();
                this.q.b();
            }
            this.aX();
        }
    }
    
    public final void aM(final int n) {
        super.aM(n);
        for (int i = 0; i < this.i; ++i) {
            this.a[i].k(n);
        }
    }
    
    public final void aN(final int n) {
        super.aN(n);
        for (int i = 0; i < this.i; ++i) {
            this.a[i].k(n);
        }
    }
    
    public final void aQ(final int n) {
        if (n == 0) {
            this.J();
        }
    }
    
    public final void aa(final int f) {
        final StaggeredGridLayoutManager$SavedState q = this.q;
        if (q != null && q.a != f) {
            q.a();
        }
        this.f = f;
        this.g = Integer.MIN_VALUE;
        this.aX();
    }
    
    public final boolean ae() {
        return this.j == 0;
    }
    
    public final boolean af() {
        return this.j == 1;
    }
    
    public final boolean ag() {
        return this.n != 0;
    }
    
    public final void ao(final RecyclerView recyclerView, final int b) {
        final ok ok = new ok(recyclerView.getContext());
        ok.b = b;
        this.bf(ok);
    }
    
    public final void ap(int i, int j, final ol ol, final atlj atlj) {
        if (1 == this.j) {
            i = j;
        }
        if (this.as() != 0) {
            if (i != 0) {
                this.A(i, ol);
                final int[] k = this.J;
                final int n = 0;
                Label_0066: {
                    if (k != null) {
                        i = this.i;
                        if (k.length >= i) {
                            break Label_0066;
                        }
                    }
                    this.J = new int[this.i];
                }
                j = 0;
                i = 0;
                while (j < this.i) {
                    final ms l = this.l;
                    int n2;
                    int n3;
                    if (l.d == -1) {
                        n2 = l.f;
                        n3 = this.a[j].f(n2);
                    }
                    else {
                        n2 = this.a[j].d(l.g);
                        n3 = this.l.g;
                    }
                    final int n4 = n2 - n3;
                    int n5 = i;
                    if (n4 >= 0) {
                        this.J[i] = n4;
                        n5 = i + 1;
                    }
                    ++j;
                    i = n5;
                }
                Arrays.sort(this.J, 0, i);
                ms m;
                for (j = n; j < i && this.l.a(ol); ++j) {
                    atlj.t(this.l.c, this.J[j]);
                    m = this.l;
                    m.c += m.d;
                }
            }
        }
    }
    
    public final void bu() {
        this.h.a();
        for (int i = 0; i < this.i; ++i) {
            this.a[i].j();
        }
    }
    
    final int c() {
        if (this.as() == 0) {
            return 0;
        }
        return bo(this.aB(0));
    }
    
    public final int d(final int n, final od od, final ol ol) {
        return this.k(n, od, ol);
    }
    
    public final int e(final int n, final od od, final ol ol) {
        return this.k(n, od, ol);
    }
    
    public final ny f() {
        if (this.j == 0) {
            return (ny)new pi(-2, -1);
        }
        return (ny)new pi(-1, -2);
    }
    
    public final ny h(final Context context, final AttributeSet set) {
        return (ny)new pi(context, set);
    }
    
    final int i() {
        final int as = this.as();
        if (as == 0) {
            return 0;
        }
        return bo(this.aB(as - 1));
    }
    
    final int k(int n, final od od, final ol ol) {
        if (this.as() != 0 && n != 0) {
            this.A(n, ol);
            final int r = this.R(od, this.l, ol);
            if (this.l.b >= r) {
                if (n < 0) {
                    n = -r;
                }
                else {
                    n = r;
                }
            }
            this.b.n(-n);
            this.o = this.e;
            final ms l = this.l;
            l.b = 0;
            this.ah(od, l);
            return n;
        }
        return 0;
    }
    
    final View l(final boolean b) {
        final int j = this.b.j();
        final int f = this.b.f();
        int i = this.as() - 1;
        View view = null;
        while (i >= 0) {
            final View ab = this.aB(i);
            final int d = this.b.d(ab);
            final int a = this.b.a(ab);
            View view2 = view;
            if (a > j) {
                view2 = view;
                if (d < f) {
                    if (a <= f || !b) {
                        return ab;
                    }
                    if ((view2 = view) == null) {
                        view2 = ab;
                    }
                }
            }
            --i;
            view = view2;
        }
        return view;
    }
    
    public final void o(final od od, final ol ol) {
        this.ad(od, ol, true);
    }
    
    public final void p(final ol ol) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.q = null;
        this.H.a();
    }
    
    final View r(final boolean b) {
        final int j = this.b.j();
        final int f = this.b.f();
        final int as = this.as();
        int i = 0;
        View view = null;
        while (i < as) {
            final View ab = this.aB(i);
            final int d = this.b.d(ab);
            View view2 = view;
            if (this.b.a(ab) > j) {
                view2 = view;
                if (d < f) {
                    if (d >= j || !b) {
                        return ab;
                    }
                    if ((view2 = view) == null) {
                        view2 = ab;
                    }
                }
            }
            ++i;
            view = view2;
        }
        return view;
    }
    
    public final ny rm(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return (ny)new pi((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return (ny)new pi(viewGroup$LayoutParams);
    }
    
    public final View rn(View aa, int i, final od od, final ol ol) {
        if (this.as() == 0) {
            return null;
        }
        aa = this.aA(aa);
        if (aa == null) {
            return null;
        }
        this.al();
        final int n = 1;
        Label_0157: {
            Label_0142: {
                if (i != 1) {
                    if (i != 2) {
                        if ((i == 17) ? (this.j != 0) : ((i == 33) ? (this.j != 1) : ((i == 66) ? (this.j != 0) : (i != 130 || this.j != 1)))) {
                            i = Integer.MIN_VALUE;
                            break Label_0157;
                        }
                    }
                    else if (this.j != 1 && this.K()) {
                        break Label_0142;
                    }
                }
                else if (this.j == 1 || !this.K()) {
                    break Label_0142;
                }
                i = 1;
                break Label_0157;
            }
            i = -1;
        }
        if (i == Integer.MIN_VALUE) {
            return null;
        }
        final pi pi = (pi)aa.getLayoutParams();
        final boolean b = pi.b;
        final pj a = pi.a;
        int n2;
        if (i == 1) {
            n2 = this.i();
        }
        else {
            n2 = this.c();
        }
        this.an(n2, ol);
        this.am(i);
        final ms l = this.l;
        l.c = l.d + n2;
        l.b = (int)(this.b.k() * 0.33333334f);
        final ms j = this.l;
        j.h = true;
        final int n3 = 0;
        j.a = false;
        this.R(od, j, ol);
        this.o = this.e;
        final View g = a.g(n2, i);
        if (g != null && g != aa) {
            return g;
        }
        if (this.bD(i)) {
            for (int k = this.i - 1; k >= 0; --k) {
                final View g2 = this.a[k].g(n2, i);
                if (g2 != null && g2 != aa) {
                    return g2;
                }
            }
        }
        else {
            for (int n4 = 0; n4 < this.i; ++n4) {
                final View g3 = this.a[n4].g(n2, i);
                if (g3 != null && g3 != aa) {
                    return g3;
                }
            }
        }
        int n5;
        if ((this.d ^ true) == (i == -1)) {
            n5 = n;
        }
        else {
            n5 = 0;
        }
        int n6;
        if (n5 != 0) {
            n6 = a.a();
        }
        else {
            n6 = a.b();
        }
        final View t = this.T(n6);
        if (t != null && t != aa) {
            return t;
        }
        int n7 = n3;
        if (this.bD(i)) {
            int n8;
            View t2;
            for (i = this.i - 1; i >= 0; --i) {
                if (i != a.e) {
                    if (n5 != 0) {
                        n8 = this.a[i].a();
                    }
                    else {
                        n8 = this.a[i].b();
                    }
                    t2 = this.T(n8);
                    if (t2 != null && t2 != aa) {
                        return t2;
                    }
                }
            }
        }
        else {
            while (n7 < this.i) {
                if (n5 != 0) {
                    i = this.a[n7].a();
                }
                else {
                    i = this.a[n7].b();
                }
                final View t3 = this.T(i);
                if (t3 != null && t3 != aa) {
                    return t3;
                }
                ++n7;
            }
        }
        return null;
    }
    
    public final void rq(final Rect rect, int n, int n2) {
        final int n3 = this.getPaddingLeft() + this.getPaddingRight();
        final int n4 = this.getPaddingTop() + this.getPaddingBottom();
        if (this.j == 1) {
            n2 = ar(n2, rect.height() + n4, this.ax());
            n = ar(n, this.k * this.i + n3, this.ay());
        }
        else {
            n = ar(n, rect.width() + n3, this.ay());
            n2 = ar(n2, this.k * this.i + n4, this.ax());
        }
        this.bc(n, n2);
    }
    
    public final boolean rr() {
        return this.q == null;
    }
    
    public final void rs() {
        this.h.a();
        this.aX();
    }
    
    final View s() {
        int i = this.as() - 1;
        final BitSet set = new BitSet(this.i);
        set.set(0, this.i, true);
        int n;
        if (this.j == 1 && this.K()) {
            n = 1;
        }
        else {
            n = -1;
        }
        int n2;
        if (this.e) {
            n2 = -1;
        }
        else {
            n2 = i + 1;
            i = 0;
        }
        int n3;
        if (i < n2) {
            n3 = 1;
        }
        else {
            n3 = -1;
        }
        while (i != n2) {
            final View ab = this.aB(i);
            final pi pi = (pi)ab.getLayoutParams();
            if (set.get(pi.a.e)) {
                final pj a = pi.a;
                if (this.e) {
                    if (a.c() < this.b.f()) {
                        final ArrayList a2 = a.a;
                        final boolean b = pj.n((View)a2.get(a2.size() - 1)).b;
                        return ab;
                    }
                }
                else if (a.e() > this.b.j()) {
                    final boolean b2 = pj.n((View)a.a.get(0)).b;
                    return ab;
                }
                set.clear(pi.a.e);
            }
            final boolean b3 = pi.b;
            final int n4 = i + n3;
            if ((i = n4) != n2) {
                final View ab2 = this.aB(n4);
                if (this.e) {
                    final int a3 = this.b.a(ab);
                    final int a4 = this.b.a(ab2);
                    if (a3 < a4) {
                        return ab;
                    }
                    i = n4;
                    if (a3 != a4) {
                        continue;
                    }
                }
                else {
                    final int d = this.b.d(ab);
                    final int d2 = this.b.d(ab2);
                    if (d > d2) {
                        return ab;
                    }
                    if (d != d2) {
                        i = n4;
                        continue;
                    }
                }
                if (pi.a.e - ((pi)ab2.getLayoutParams()).a.e < 0 != n < 0) {
                    return ab;
                }
                i = n4;
            }
        }
        return null;
    }
    
    public final boolean t(final ny ny) {
        return ny instanceof pi;
    }
    
    public final void v(final int n, final int n2) {
        this.ac(n, n2, 1);
    }
    
    public final void x(final int n, final int n2) {
        this.ac(n, n2, 8);
    }
    
    public final void y(final int n, final int n2) {
        this.ac(n, n2, 2);
    }
    
    public final void z(final int n, final int n2) {
        this.ac(n, n2, 4);
    }
}
