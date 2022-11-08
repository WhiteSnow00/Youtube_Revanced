// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.flexbox;

import android.support.v7.widget.RecyclerView;
import android.os.Parcelable;
import android.graphics.PointF;
import android.view.View$MeasureSpec;
import java.util.ArrayList;
import android.util.AttributeSet;
import java.util.List;
import android.view.View;
import android.content.Context;
import android.util.SparseArray;
import android.graphics.Rect;

public class FlexboxLayoutManager extends nw implements lyy, oi
{
    private static final Rect g;
    private int I;
    private int J;
    private SparseArray K;
    private final Context L;
    private View M;
    private int N;
    private agls O;
    public int a;
    public int b;
    public boolean c;
    public List d;
    public final lzb e;
    public nk f;
    private int h;
    private int i;
    private boolean j;
    private oc k;
    private ok l;
    private lzd m;
    private lzc n;
    private nk o;
    private FlexboxLayoutManager$SavedState p;
    private int q;
    private int r;
    
    static {
        g = new Rect();
    }
    
    public FlexboxLayoutManager(final Context l, final AttributeSet set, int a, final int n) {
        this.i = -1;
        this.d = new ArrayList();
        this.e = new lzb((lyy)this);
        this.n = new lzc(this);
        this.q = -1;
        this.r = Integer.MIN_VALUE;
        this.I = Integer.MIN_VALUE;
        this.J = Integer.MIN_VALUE;
        this.K = new SparseArray();
        this.N = -1;
        this.O = new agls();
        final nv az = az(l, set, a, n);
        a = az.a;
        if (a != 0) {
            if (a == 1) {
                if (az.c) {
                    this.N(3);
                }
                else {
                    this.N(2);
                }
            }
        }
        else if (az.c) {
            this.N(1);
        }
        else {
            this.N(0);
        }
        if (this.b != 1) {
            this.aR();
            this.bC();
            this.b = 1;
            this.f = null;
            this.o = null;
            this.aX();
        }
        if (this.h != 4) {
            this.aR();
            this.bC();
            this.h = 4;
            this.aX();
        }
        super.x = true;
        this.L = l;
    }
    
    private final int O(final ok ok) {
        if (this.as() == 0) {
            return 0;
        }
        final int a = ok.a();
        this.bE();
        final View ah = this.ah(a);
        final View ak = this.ak(a);
        if (ok.a() != 0 && ah != null && ak != null) {
            return Math.min(this.f.k(), this.f.a(ak) - this.f.d(ah));
        }
        return 0;
    }
    
    private final int R(final ok ok) {
        if (this.as() == 0) {
            return 0;
        }
        final int a = ok.a();
        final View ah = this.ah(a);
        final View ak = this.ak(a);
        if (ok.a() != 0 && ah != null) {
            if (ak != null) {
                final int bo = bo(ah);
                final int bo2 = bo(ak);
                final int abs = Math.abs(this.f.a(ak) - this.f.d(ah));
                final int[] b = this.e.b;
                final int n = b[bo];
                if (n != 0) {
                    if (n != -1) {
                        return Math.round(n * (abs / (float)(b[bo2] - n + 1)) + (this.f.j() - this.f.d(ah)));
                    }
                }
            }
        }
        return 0;
    }
    
    private final int S(final ok ok) {
        if (this.as() == 0) {
            return 0;
        }
        final int a = ok.a();
        final View ah = this.ah(a);
        final View ak = this.ak(a);
        if (ok.a() != 0 && ah != null && ak != null) {
            return (int)(Math.abs(this.f.a(ak) - this.f.d(ah)) / (float)(this.M() - this.L() + 1) * ok.a());
        }
        return 0;
    }
    
    private final int V(final oc oc, final ok ok, final lzd lzd) {
        final int f = lzd.f;
        if (f != Integer.MIN_VALUE) {
            final int a = lzd.a;
            if (a < 0) {
                lzd.f = f + a;
            }
            this.bF(oc, lzd);
        }
        int a2 = lzd.a;
        final boolean k = this.K();
        int n = a2;
        int n2 = 0;
        while (n > 0 || this.m.b) {
            final List d = this.d;
            final int d2 = lzd.d;
            if (d2 < 0 || d2 >= ok.a()) {
                break;
            }
            final int c = lzd.c;
            if (c < 0 || c >= d.size()) {
                break;
            }
            final lyz lyz = this.d.get(lzd.c);
            lzd.d = lyz.o;
            int n15;
            int n17;
            int n18;
            if (this.K()) {
                final int paddingLeft = this.getPaddingLeft();
                final int paddingRight = this.getPaddingRight();
                final int e = super.E;
                int e2 = lzd.e;
                if (lzd.i == -1) {
                    e2 -= lyz.g;
                }
                final int d3 = lzd.d;
                final float n3 = (float)this.n.d;
                float n4 = paddingLeft - n3;
                float n5 = e - paddingRight - n3;
                final float max = Math.max(0.0f, 0.0f);
                final int h = lyz.h;
                int i = d3;
                int n6 = 0;
                final int n7 = e2;
                while (i < d3 + h) {
                    final View s = this.s(i);
                    int n8;
                    if (lzd.i == 1) {
                        this.aH(s, FlexboxLayoutManager.g);
                        this.aF(s);
                        n8 = n6;
                    }
                    else {
                        this.aH(s, FlexboxLayoutManager.g);
                        this.aG(s, n6);
                        n8 = n6 + 1;
                    }
                    final long n9 = this.e.c[i];
                    final int n10 = (int)n9;
                    final int n11 = lzb.n(n9);
                    final FlexboxLayoutManager$LayoutParams flexboxLayoutManager$LayoutParams = (FlexboxLayoutManager$LayoutParams)s.getLayoutParams();
                    if (this.bM(s, n10, n11, (nx)flexboxLayoutManager$LayoutParams)) {
                        s.measure(n10, n11);
                    }
                    final float n12 = flexboxLayoutManager$LayoutParams.leftMargin + bn(s) + n4;
                    final float n13 = n5 - (flexboxLayoutManager$LayoutParams.rightMargin + bp(s));
                    final int n14 = n7 + bq(s);
                    if (this.c) {
                        this.e.i(s, lyz, Math.round(n13) - s.getMeasuredWidth(), n14, Math.round(n13), n14 + s.getMeasuredHeight());
                    }
                    else {
                        final View view = s;
                        this.e.i(view, lyz, Math.round(n12), n14, Math.round(n12) + view.getMeasuredWidth(), n14 + view.getMeasuredHeight());
                    }
                    n4 = s.getMeasuredWidth() + flexboxLayoutManager$LayoutParams.rightMargin + bp(s) + max + n12;
                    n5 = n13 - (s.getMeasuredWidth() + flexboxLayoutManager$LayoutParams.leftMargin + bn(s) + max);
                    ++i;
                    n6 = n8;
                }
                lzd.c += this.m.i;
                n15 = lyz.g;
                final int n16 = n;
                n17 = a2;
                n18 = n16;
            }
            else {
                final int n19 = a2;
                final int paddingTop = this.getPaddingTop();
                final int paddingBottom = this.getPaddingBottom();
                final int f2 = super.F;
                final int e3 = lzd.e;
                int n20;
                int n21;
                if (lzd.i == -1) {
                    final int g = lyz.g;
                    n20 = e3 + g;
                    n21 = e3 - g;
                }
                else {
                    n20 = e3;
                    n21 = e3;
                }
                final int d4 = lzd.d;
                final float n22 = (float)this.n.d;
                float n23 = paddingTop - n22;
                float n24 = f2 - paddingBottom - n22;
                final float max2 = Math.max(0.0f, 0.0f);
                final int h2 = lyz.h;
                int j = d4;
                int n25 = 0;
                while (j < d4 + h2) {
                    final View s2 = this.s(j);
                    final long n26 = this.e.c[j];
                    final int n27 = (int)n26;
                    final int n28 = lzb.n(n26);
                    final FlexboxLayoutManager$LayoutParams flexboxLayoutManager$LayoutParams2 = (FlexboxLayoutManager$LayoutParams)s2.getLayoutParams();
                    if (this.bM(s2, n27, n28, (nx)flexboxLayoutManager$LayoutParams2)) {
                        s2.measure(n27, n28);
                    }
                    final float n29 = n23 + (flexboxLayoutManager$LayoutParams2.topMargin + bq(s2));
                    final float n30 = n24 - (flexboxLayoutManager$LayoutParams2.rightMargin + bk(s2));
                    if (lzd.i == 1) {
                        this.aH(s2, FlexboxLayoutManager.g);
                        this.aF(s2);
                    }
                    else {
                        this.aH(s2, FlexboxLayoutManager.g);
                        this.aG(s2, n25);
                        ++n25;
                    }
                    final int n31 = n21 + bn(s2);
                    final int n32 = n20 - bp(s2);
                    if (this.c) {
                        if (this.j) {
                            this.e.j(s2, lyz, true, n32 - s2.getMeasuredWidth(), Math.round(n30) - s2.getMeasuredHeight(), n32, Math.round(n30));
                        }
                        else {
                            final View view2 = s2;
                            this.e.j(view2, lyz, true, n32 - view2.getMeasuredWidth(), Math.round(n29), n32, Math.round(n29) + view2.getMeasuredHeight());
                        }
                    }
                    else {
                        final View view3 = s2;
                        if (this.j) {
                            this.e.j(view3, lyz, false, n31, Math.round(n30) - view3.getMeasuredHeight(), n31 + view3.getMeasuredWidth(), Math.round(n30));
                        }
                        else {
                            this.e.j(view3, lyz, false, n31, Math.round(n29), n31 + view3.getMeasuredWidth(), Math.round(n29) + view3.getMeasuredHeight());
                        }
                    }
                    n23 = n29 + (s2.getMeasuredHeight() + flexboxLayoutManager$LayoutParams2.topMargin + bk(s2) + max2);
                    n24 = n30 - (s2.getMeasuredHeight() + flexboxLayoutManager$LayoutParams2.bottomMargin + bq(s2) + max2);
                    ++j;
                }
                lzd.c += this.m.i;
                n15 = lyz.g;
                n18 = n;
                n17 = n19;
            }
            n2 += n15;
            if (!k && this.c) {
                lzd.e -= lyz.g * lzd.i;
            }
            else {
                lzd.e += lyz.g * lzd.i;
            }
            final int n33 = n18 - lyz.g;
            a2 = n17;
            n = n33;
        }
        final int a3 = lzd.a - n2;
        lzd.a = a3;
        final int f3 = lzd.f;
        if (f3 != Integer.MIN_VALUE) {
            final int f4 = f3 + n2;
            lzd.f = f4;
            if (a3 < 0) {
                lzd.f = f4 + a3;
            }
            this.bF(oc, lzd);
        }
        return a2 - lzd.a;
    }
    
    private final int W(int n, final oc oc, final ok ok, final boolean b) {
        int ac;
        if (!this.K() && this.c) {
            final int n2 = n - this.f.j();
            if (n2 <= 0) {
                return 0;
            }
            ac = this.ac(n2, oc, ok);
        }
        else {
            final int n3 = this.f.f() - n;
            if (n3 <= 0) {
                return 0;
            }
            ac = -this.ac(-n3, oc, ok);
        }
        if (b) {
            n = this.f.f() - (n + ac);
            if (n > 0) {
                this.f.n(n);
                return n + ac;
            }
        }
        return ac;
    }
    
    private final int ab(int n, final oc oc, final ok ok, final boolean b) {
        int ac;
        if (!this.K() && this.c) {
            final int n2 = this.f.f() - n;
            if (n2 <= 0) {
                return 0;
            }
            ac = this.ac(-n2, oc, ok);
        }
        else {
            final int n3 = n - this.f.j();
            if (n3 <= 0) {
                return 0;
            }
            ac = -this.ac(n3, oc, ok);
        }
        int n4 = ac;
        if (b) {
            n = n + ac - this.f.j();
            n4 = ac;
            if (n > 0) {
                this.f.n(-n);
                n4 = ac - n;
            }
        }
        return n4;
    }
    
    private final int ac(int g, final oc oc, final ok ok) {
        if (this.as() == 0 || g == 0) {
            return 0;
        }
        this.bE();
        this.m.j = true;
        final boolean b = !this.K() && this.c;
        final int i = (b ? (g < 0) : (g > 0)) ? 1 : -1;
        final int abs = Math.abs(g);
        this.m.i = i;
        final boolean k = this.K();
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(super.E, super.C);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(super.F, super.D);
        final boolean b2 = !k && this.c;
        if (i == 1) {
            final View ab = this.aB(this.as() - 1);
            this.m.e = this.f.a(ab);
            final int bo = bo(ab);
            final View al = this.al(ab, this.d.get(this.e.b[bo]));
            lzd.a(this.m);
            final lzd m = this.m;
            final int d = bo + m.h;
            m.d = d;
            final int[] b3 = this.e.b;
            if (b3.length <= d) {
                m.c = -1;
            }
            else {
                m.c = b3[d];
            }
            if (b2) {
                m.e = this.f.d(al);
                this.m.f = -this.f.d(al) + this.f.j();
                final lzd j = this.m;
                int f;
                if ((f = j.f) < 0) {
                    f = 0;
                }
                j.f = f;
            }
            else {
                m.e = this.f.a(al);
                this.m.f = this.f.a(al) - this.f.f();
            }
            final int c = this.m.c;
            if ((c == -1 || c > this.d.size() - 1) && this.m.d <= this.l()) {
                final int n = abs - this.m.f;
                this.O.n();
                if (n > 0) {
                    if (k) {
                        this.e.q(this.O, measureSpec, measureSpec2, n, this.m.d, this.d);
                    }
                    else {
                        this.e.r(this.O, measureSpec, measureSpec2, n, this.m.d, this.d);
                    }
                    this.e.e(measureSpec, measureSpec2, this.m.d);
                    this.e.l(this.m.d);
                }
            }
        }
        else {
            final View ab2 = this.aB(0);
            this.m.e = this.f.d(ab2);
            final int bo2 = bo(ab2);
            final View ai = this.ai(ab2, this.d.get(this.e.b[bo2]));
            lzd.a(this.m);
            int c2;
            if ((c2 = this.e.b[bo2]) == -1) {
                c2 = 0;
            }
            if (c2 > 0) {
                this.m.d = bo2 - ((lyz)this.d.get(c2 - 1)).h;
            }
            else {
                this.m.d = -1;
            }
            final lzd l = this.m;
            if (c2 > 0) {
                --c2;
            }
            else {
                c2 = 0;
            }
            l.c = c2;
            if (b2) {
                l.e = this.f.a(ai);
                this.m.f = this.f.a(ai) - this.f.f();
                final lzd m2 = this.m;
                int f2;
                if ((f2 = m2.f) < 0) {
                    f2 = 0;
                }
                m2.f = f2;
            }
            else {
                l.e = this.f.d(ai);
                this.m.f = -this.f.d(ai) + this.f.j();
            }
        }
        final lzd m3 = this.m;
        final int f3 = m3.f;
        m3.a = abs - f3;
        final int n2 = f3 + this.V(oc, ok, m3);
        if (n2 < 0) {
            return 0;
        }
        if (b) {
            if (abs > n2) {
                g = -i * n2;
            }
        }
        else if (abs > n2) {
            g = i * n2;
        }
        this.f.n(-g);
        return this.m.g = g;
    }
    
    private final int ad(final int n) {
        if (this.as() != 0 && n != 0) {
            this.bE();
            final boolean k = this.K();
            int n2;
            if (k) {
                n2 = this.M.getWidth();
            }
            else {
                n2 = this.M.getHeight();
            }
            int n3;
            if (k) {
                n3 = super.E;
            }
            else {
                n3 = super.F;
            }
            int d2;
            if (this.aw() == 1) {
                final int abs = Math.abs(n);
                if (n < 0) {
                    return -Math.min(n3 + this.n.d - n2, abs);
                }
                final int d = this.n.d;
                final int min = n;
                if (d + n <= 0) {
                    return min;
                }
                d2 = d;
            }
            else {
                if (n > 0) {
                    return Math.min(n3 - this.n.d - n2, n);
                }
                if ((d2 = this.n.d) + n >= 0) {
                    return n;
                }
            }
            return -d2;
        }
        return 0;
    }
    
    private final View ah(int bo) {
        final View am = this.am(0, this.as(), bo);
        if (am == null) {
            return null;
        }
        bo = bo(am);
        bo = this.e.b[bo];
        if (bo == -1) {
            return null;
        }
        return this.ai(am, this.d.get(bo));
    }
    
    private final View ai(View view, final lyz lyz) {
        final boolean k = this.K();
        final int h = lyz.h;
        int i = 1;
        View view2 = view;
        while (i < h) {
            final View ab = this.aB(i);
            view = view2;
            Label_0114: {
                if (ab != null) {
                    if (ab.getVisibility() == 8) {
                        view = view2;
                    }
                    else {
                        if (this.c && !k) {
                            view = view2;
                            if (this.f.a(view2) >= this.f.a(ab)) {
                                break Label_0114;
                            }
                        }
                        else {
                            view = view2;
                            if (this.f.d(view2) <= this.f.d(ab)) {
                                break Label_0114;
                            }
                        }
                        view = ab;
                    }
                }
            }
            ++i;
            view2 = view;
        }
        return view2;
    }
    
    private final View ak(int bo) {
        final View am = this.am(this.as() - 1, -1, bo);
        if (am == null) {
            return null;
        }
        bo = bo(am);
        bo = this.e.b[bo];
        return this.al(am, this.d.get(bo));
    }
    
    private final View al(View view, final lyz lyz) {
        final boolean k = this.K();
        View view2;
        for (int i = this.as() - 2; i > this.as() - lyz.h - 1; --i, view = view2) {
            final View ab = this.aB(i);
            view2 = view;
            if (ab != null) {
                if (ab.getVisibility() == 8) {
                    view2 = view;
                }
                else {
                    if (this.c && !k) {
                        view2 = view;
                        if (this.f.d(view) <= this.f.d(ab)) {
                            continue;
                        }
                    }
                    else {
                        view2 = view;
                        if (this.f.a(view) >= this.f.a(ab)) {
                            continue;
                        }
                    }
                    view2 = ab;
                }
            }
        }
        return view;
    }
    
    private final View am(int i, final int n, final int n2) {
        this.bE();
        this.bD();
        final int j = this.f.j();
        final int f = this.f.f();
        int n3;
        if (n > i) {
            n3 = 1;
        }
        else {
            n3 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != n) {
            final View ab = this.aB(i);
            final int bo = bo(ab);
            View view3 = view;
            View view4 = view2;
            if (bo >= 0) {
                view3 = view;
                view4 = view2;
                if (bo < n2) {
                    if (((nx)ab.getLayoutParams()).lv()) {
                        view3 = view;
                        if ((view4 = view2) == null) {
                            view4 = ab;
                            view3 = view;
                        }
                    }
                    else {
                        if (this.f.d(ab) >= j && this.f.a(ab) <= f) {
                            return ab;
                        }
                        if (view != null) {
                            view3 = view;
                            view4 = view2;
                        }
                        else {
                            view3 = ab;
                            view4 = view2;
                        }
                    }
                }
            }
            i += n3;
            view = view3;
            view2 = view4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }
    
    private final View an() {
        return this.aB(0);
    }
    
    private final void bC() {
        this.d.clear();
        this.n.b();
        this.n.d = 0;
    }
    
    private final void bD() {
        if (this.m == null) {
            this.m = new lzd();
        }
    }
    
    private final void bE() {
        if (this.f != null) {
            return;
        }
        if (this.K()) {
            if (this.b == 0) {
                this.f = nk.p((nw)this);
                this.o = nk.r((nw)this);
                return;
            }
            this.f = nk.r((nw)this);
            this.o = nk.p((nw)this);
        }
        else {
            if (this.b == 0) {
                this.f = nk.r((nw)this);
                this.o = nk.p((nw)this);
                return;
            }
            this.f = nk.p((nw)this);
            this.o = nk.r((nw)this);
        }
    }
    
    private final void bF(final oc oc, final lzd lzd) {
        if (lzd.j) {
            if (lzd.i == -1) {
                if (lzd.f >= 0) {
                    this.f.e();
                    final int f = lzd.f;
                    int as = this.as();
                    if (as != 0) {
                        final int n = as - 1;
                        int n2 = this.e.b[bo(this.aB(n))];
                        if (n2 != -1) {
                            lyz lyz = this.d.get(n2);
                            int n3 = n;
                            int n4;
                            while (true) {
                                n4 = as;
                                if (n3 < 0) {
                                    break;
                                }
                                final View ab = this.aB(n3);
                                final int f2 = lzd.f;
                                if (!this.K() && this.c) {
                                    n4 = as;
                                    if (this.f.a(ab) > f2) {
                                        break;
                                    }
                                }
                                else if (this.f.d(ab) < this.f.e() - f2) {
                                    n4 = as;
                                    break;
                                }
                                lyz lyz2 = lyz;
                                int n5 = n2;
                                if (lyz.o == bo(ab)) {
                                    if (n2 <= 0) {
                                        n4 = n3;
                                        break;
                                    }
                                    n5 = n2 + lzd.i;
                                    lyz2 = (lyz)this.d.get(n5);
                                    as = n3;
                                }
                                --n3;
                                lyz = lyz2;
                                n2 = n5;
                            }
                            this.bG(oc, n4, n);
                        }
                    }
                }
            }
            else if (lzd.f >= 0) {
                final int as2 = this.as();
                if (as2 != 0) {
                    int n6 = this.e.b[bo(this.aB(0))];
                    if (n6 != -1) {
                        lyz lyz3 = this.d.get(n6);
                        int i = 0;
                        int n7 = -1;
                        while (true) {
                            while (i < as2) {
                                final View ab2 = this.aB(i);
                                final int f3 = lzd.f;
                                if (!this.K() && this.c) {
                                    if (this.f.e() - this.f.d(ab2) > f3) {
                                        break;
                                    }
                                }
                                else if (this.f.a(ab2) > f3) {
                                    break;
                                }
                                int n8 = n6;
                                lyz lyz4 = lyz3;
                                if (lyz3.p == bo(ab2)) {
                                    if (n6 >= this.d.size() - 1) {
                                        this.bG(oc, 0, i);
                                        return;
                                    }
                                    n8 = n6 + lzd.i;
                                    lyz4 = this.d.get(n8);
                                    n7 = i;
                                }
                                ++i;
                                n6 = n8;
                                lyz3 = lyz4;
                            }
                            i = n7;
                            continue;
                        }
                    }
                }
            }
        }
    }
    
    private final void bG(final oc oc, final int n, int i) {
        while (i >= n) {
            this.aV(i, oc);
            --i;
        }
    }
    
    private final void bH() {
        int n;
        if (this.K()) {
            n = super.D;
        }
        else {
            n = super.C;
        }
        final lzd m = this.m;
        boolean b = true;
        if (n != 0) {
            b = (n == Integer.MIN_VALUE && b);
        }
        m.b = b;
    }
    
    private final void bI(final int n) {
        final int l = this.L();
        final int m = this.M();
        if (n >= m) {
            return;
        }
        final int as = this.as();
        this.e.g(as);
        this.e.h(as);
        this.e.f(as);
        if (n >= this.e.b.length) {
            return;
        }
        this.N = n;
        final View an = this.an();
        if (an == null) {
            return;
        }
        if (l <= n && n <= m) {
            return;
        }
        this.q = bo(an);
        if (!this.K() && this.c) {
            this.r = this.f.a(an) + this.f.g();
            return;
        }
        this.r = this.f.d(an) - this.f.j();
    }
    
    private final void bJ(final lzc lzc, final boolean b, final boolean b2) {
        if (b2) {
            this.bH();
        }
        else {
            this.m.b = false;
        }
        if (!this.K() && this.c) {
            this.m.a = lzc.c - this.getPaddingRight();
        }
        else {
            this.m.a = this.f.f() - lzc.c;
        }
        final lzd m = this.m;
        m.d = lzc.a;
        lzd.a(m);
        final lzd i = this.m;
        i.i = 1;
        i.e = lzc.c;
        i.f = Integer.MIN_VALUE;
        i.c = lzc.b;
        if (b && this.d.size() > 1) {
            final int b3 = lzc.b;
            if (b3 >= 0 && b3 < this.d.size() - 1) {
                final lyz lyz = this.d.get(lzc.b);
                final lzd j = this.m;
                ++j.c;
                j.d += lyz.h;
            }
        }
    }
    
    private final void bK(final lzc lzc, final boolean b, final boolean b2) {
        if (b2) {
            this.bH();
        }
        else {
            this.m.b = false;
        }
        if (!this.K() && this.c) {
            this.m.a = this.M.getWidth() - lzc.c - this.f.j();
        }
        else {
            this.m.a = lzc.c - this.f.j();
        }
        final lzd m = this.m;
        m.d = lzc.a;
        lzd.a(m);
        final lzd i = this.m;
        i.i = -1;
        i.e = lzc.c;
        i.f = Integer.MIN_VALUE;
        i.c = lzc.b;
        if (b && lzc.b > 0) {
            final int size = this.d.size();
            final int b3 = lzc.b;
            if (size > b3) {
                final lyz lyz = this.d.get(b3);
                final lzd j = this.m;
                --j.c;
                j.d -= lyz.h;
            }
        }
    }
    
    private static boolean bL(final int n, int size, final int n2) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        if (n2 > 0 && n != n2) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            return mode == 0 || (mode == 1073741824 && size == n);
        }
        return size >= n;
    }
    
    private final boolean bM(final View view, final int n, final int n2, final nx nx) {
        return view.isLayoutRequested() || !super.y || !bL(view.getWidth(), n, nx.width) || !bL(view.getHeight(), n2, nx.height);
    }
    
    private final View bN(int n, final int n2) {
        int i = n;
        if (n2 > i) {
            n = 1;
        }
        else {
            n = -1;
        }
        while (i != n2) {
            final View ab = this.aB(i);
            final int paddingLeft = this.getPaddingLeft();
            final int paddingTop = this.getPaddingTop();
            final int e = super.E;
            final int paddingRight = this.getPaddingRight();
            final int f = super.F;
            final int paddingBottom = this.getPaddingBottom();
            final nx nx = (nx)ab.getLayoutParams();
            final int bz = bz(ab);
            final int leftMargin = nx.leftMargin;
            final nx nx2 = (nx)ab.getLayoutParams();
            final int bb = bB(ab);
            final int topMargin = nx2.topMargin;
            final nx nx3 = (nx)ab.getLayoutParams();
            final int ba = bA(ab);
            final int rightMargin = nx3.rightMargin;
            final nx nx4 = (nx)ab.getLayoutParams();
            final int by = by(ab);
            final int bottomMargin = nx4.bottomMargin;
            boolean b = false;
            final boolean b2 = bz - leftMargin >= e - paddingRight || ba + rightMargin >= paddingLeft;
            if (bb - topMargin >= f - paddingBottom || by + bottomMargin >= paddingTop) {
                b = true;
            }
            if (b2 && b) {
                return ab;
            }
            i += n;
        }
        return null;
    }
    
    public final void A(final View view, int n, final int n2, final lyz lyz) {
        this.aH(view, FlexboxLayoutManager.g);
        if (this.K()) {
            n = bn(view) + bp(view);
            lyz.e += n;
            lyz.f += n;
            return;
        }
        n = bq(view) + bk(view);
        lyz.e += n;
        lyz.f += n;
    }
    
    public final int B(final ok ok) {
        return this.O(ok);
    }
    
    public final int C(final ok ok) {
        this.R(ok);
        return this.R(ok);
    }
    
    public final int D(final ok ok) {
        return this.S(ok);
    }
    
    public final int E(final ok ok) {
        return this.O(ok);
    }
    
    public final int F(final ok ok) {
        return this.R(ok);
    }
    
    public final int G(final ok ok) {
        return this.S(ok);
    }
    
    public final void H(final lyz lyz) {
    }
    
    public final void I(final List d) {
        this.d = d;
    }
    
    public final void J(final int n, final View view) {
        this.K.put(n, (Object)view);
    }
    
    public final boolean K() {
        final int a = this.a;
        return a == 0 || a == 1;
    }
    
    public final int L() {
        final View bn = this.bN(0, this.as());
        if (bn == null) {
            return -1;
        }
        return bo(bn);
    }
    
    public final int M() {
        final View bn = this.bN(this.as() - 1, -1);
        if (bn == null) {
            return -1;
        }
        return bo(bn);
    }
    
    public final void N(final int a) {
        if (this.a != a) {
            this.aR();
            this.a = a;
            this.f = null;
            this.o = null;
            this.bC();
            this.aX();
        }
    }
    
    public final PointF P(int n) {
        if (this.as() == 0) {
            return null;
        }
        if (n < bo(this.aB(0))) {
            n = -1;
        }
        else {
            n = 1;
        }
        if (this.K()) {
            return new PointF(0.0f, (float)n);
        }
        return new PointF((float)n, 0.0f);
    }
    
    public final Parcelable Q() {
        final FlexboxLayoutManager$SavedState p = this.p;
        if (p != null) {
            return (Parcelable)new FlexboxLayoutManager$SavedState(p);
        }
        final FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState = new FlexboxLayoutManager$SavedState();
        if (this.as() > 0) {
            final View an = this.an();
            flexboxLayoutManager$SavedState.a = bo(an);
            flexboxLayoutManager$SavedState.b = this.f.d(an) - this.f.j();
        }
        else {
            flexboxLayoutManager$SavedState.a();
        }
        return (Parcelable)flexboxLayoutManager$SavedState;
    }
    
    public final void X(final RecyclerView recyclerView, final oc oc) {
    }
    
    public final void Z(final Parcelable parcelable) {
        if (parcelable instanceof FlexboxLayoutManager$SavedState) {
            this.p = (FlexboxLayoutManager$SavedState)parcelable;
            this.aX();
        }
    }
    
    public final int a() {
        return 5;
    }
    
    public final void aO(final RecyclerView recyclerView) {
        this.M = (View)recyclerView.getParent();
    }
    
    public final void aa(final int q) {
        this.q = q;
        this.r = Integer.MIN_VALUE;
        final FlexboxLayoutManager$SavedState p = this.p;
        if (p != null) {
            p.a();
        }
        this.aX();
    }
    
    public final boolean ae() {
        return !this.K() || super.E > this.M.getWidth();
    }
    
    public final boolean af() {
        return this.K() || super.F > this.M.getHeight();
    }
    
    public final void ao(final RecyclerView recyclerView, final int b) {
        final oj oj = new oj(recyclerView.getContext());
        oj.b = b;
        this.bf(oj);
    }
    
    public final int b() {
        return this.h;
    }
    
    public final void bu() {
        this.aR();
    }
    
    public final void bv(final int n) {
        this.bI(n);
    }
    
    public final int c(final int n, final int n2, final int n3) {
        return au(super.F, super.D, n2, n3, this.af());
    }
    
    public final int d(int n, final oc oc, final ok ok) {
        if (!this.K()) {
            n = this.ac(n, oc, ok);
            this.K.clear();
            return n;
        }
        n = this.ad(n);
        final lzc n2 = this.n;
        n2.d += n;
        this.o.n(-n);
        return n;
    }
    
    public final int e(int n, final oc oc, final ok ok) {
        if (this.K()) {
            n = this.ac(n, oc, ok);
            this.K.clear();
            return n;
        }
        n = this.ad(n);
        final lzc n2 = this.n;
        n2.d += n;
        this.o.n(-n);
        return n;
    }
    
    public final nx f() {
        return (nx)new FlexboxLayoutManager$LayoutParams();
    }
    
    public final int g(final int n, final int n2, final int n3) {
        return au(super.E, super.C, n2, n3, this.ae());
    }
    
    public final nx h(final Context context, final AttributeSet set) {
        return (nx)new FlexboxLayoutManager$LayoutParams(context, set);
    }
    
    public final int i(final View view) {
        int n;
        int n2;
        if (this.K()) {
            n = bq(view);
            n2 = bk(view);
        }
        else {
            n = bn(view);
            n2 = bp(view);
        }
        return n + n2;
    }
    
    public final int j(final View view, int n, int n2) {
        if (this.K()) {
            n = bn(view);
            n2 = bp(view);
        }
        else {
            n = bq(view);
            n2 = bk(view);
        }
        return n + n2;
    }
    
    public final int k() {
        return this.a;
    }
    
    public final int l() {
        return this.l.a();
    }
    
    public final int m() {
        return this.b;
    }
    
    public final int n() {
        final int size = this.d.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        final int size2 = this.d.size();
        int max = Integer.MIN_VALUE;
        while (i < size2) {
            max = Math.max(max, this.d.get(i).e);
            ++i;
        }
        return max;
    }
    
    public final void o(final oc k, final ok l) {
        this.k = k;
        this.l = l;
        int a;
        if ((a = l.a()) == 0) {
            if (l.g) {
                return;
            }
            a = 0;
        }
        final int aw = this.aw();
        final int a2 = this.a;
        Label_0133: {
            boolean c = false;
            Label_0122: {
                Label_0119: {
                    if (a2 != 0) {
                        if (a2 != 1) {
                            if (a2 != 2) {
                                this.c = (aw == 1);
                                this.j = true;
                                break Label_0133;
                            }
                            if (aw != 1) {
                                break Label_0119;
                            }
                        }
                        else if (aw == 1) {
                            break Label_0119;
                        }
                    }
                    else if (aw != 1) {
                        break Label_0119;
                    }
                    c = true;
                    break Label_0122;
                }
                c = false;
            }
            this.c = c;
            this.j = false;
        }
        this.bE();
        this.bD();
        this.e.g(a);
        this.e.h(a);
        this.e.f(a);
        this.m.j = false;
        final FlexboxLayoutManager$SavedState p2 = this.p;
        if (p2 != null && p2.b(a)) {
            this.q = p2.a;
        }
        final lzc n = this.n;
        if (!n.f || this.q != -1 || p2 != null) {
            n.b();
            final lzc n2 = this.n;
            final FlexboxLayoutManager$SavedState p3 = this.p;
            Label_0984: {
                if (!l.g) {
                    final int q = this.q;
                    if (q != -1) {
                        if (q >= 0 && q < l.a()) {
                            final int q2 = this.q;
                            n2.a = q2;
                            n2.b = this.e.b[q2];
                            final FlexboxLayoutManager$SavedState p4 = this.p;
                            if (p4 != null && p4.b(l.a())) {
                                n2.c = this.f.j() + p3.b;
                                n2.g = true;
                                n2.b = -1;
                                break Label_0984;
                            }
                            final int r = this.r;
                            if (r == Integer.MIN_VALUE) {
                                final View t = this.T(this.q);
                                if (t == null) {
                                    if (this.as() > 0) {
                                        n2.e = (this.q < bo(this.aB(0)));
                                    }
                                    n2.a();
                                    break Label_0984;
                                }
                                if (this.f.b(t) > this.f.k()) {
                                    n2.a();
                                    break Label_0984;
                                }
                                if (this.f.d(t) - this.f.j() < 0) {
                                    n2.c = this.f.j();
                                    n2.e = false;
                                    break Label_0984;
                                }
                                if (this.f.f() - this.f.a(t) < 0) {
                                    n2.c = this.f.f();
                                    n2.e = true;
                                    break Label_0984;
                                }
                                int d;
                                if (n2.e) {
                                    d = this.f.a(t) + this.f.o();
                                }
                                else {
                                    d = this.f.d(t);
                                }
                                n2.c = d;
                                break Label_0984;
                            }
                            else {
                                if (!this.K() && this.c) {
                                    n2.c = r - this.f.g();
                                    break Label_0984;
                                }
                                n2.c = this.f.j() + this.r;
                                break Label_0984;
                            }
                        }
                        else {
                            this.q = -1;
                            this.r = Integer.MIN_VALUE;
                        }
                    }
                }
                if (this.as() != 0) {
                    View view;
                    if (n2.e) {
                        view = this.ak(l.a());
                    }
                    else {
                        view = this.ah(l.a());
                    }
                    if (view != null) {
                        final FlexboxLayoutManager h = n2.h;
                        if (!h.K() && h.c) {
                            if (n2.e) {
                                n2.c = h.f.d(view) + n2.h.f.o();
                            }
                            else {
                                n2.c = h.f.a(view);
                            }
                        }
                        else if (n2.e) {
                            n2.c = h.f.a(view) + n2.h.f.o();
                        }
                        else {
                            n2.c = h.f.d(view);
                        }
                        final int bo = bo(view);
                        n2.a = bo;
                        n2.g = false;
                        final FlexboxLayoutManager h2 = n2.h;
                        final int[] b = h2.e.b;
                        int n3 = bo;
                        if (bo == -1) {
                            n3 = 0;
                        }
                        int b2;
                        if ((b2 = b[n3]) == -1) {
                            b2 = 0;
                        }
                        n2.b = b2;
                        final int size = h2.d.size();
                        final int b3 = n2.b;
                        if (size > b3) {
                            n2.a = ((lyz)n2.h.d.get(b3)).o;
                        }
                        final boolean g = l.g;
                        break Label_0984;
                    }
                }
                n2.a();
                n2.a = 0;
                n2.b = 0;
            }
            this.n.f = true;
        }
        this.aI(k);
        final lzc n4 = this.n;
        if (n4.e) {
            this.bK(n4, false, true);
        }
        else {
            this.bJ(n4, false, true);
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(super.E, super.C);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(super.F, super.D);
        final int e = super.E;
        final int f = super.F;
        boolean b5;
        int n5;
        if (this.K()) {
            final int i = this.I;
            final boolean b4 = i != Integer.MIN_VALUE && i != e;
            final lzd m = this.m;
            if (m.b) {
                final int heightPixels = this.L.getResources().getDisplayMetrics().heightPixels;
                b5 = b4;
                n5 = heightPixels;
            }
            else {
                final int a3 = m.a;
                b5 = b4;
                n5 = a3;
            }
        }
        else {
            final int j = this.J;
            b5 = (j != Integer.MIN_VALUE && j != f);
            final lzd m2 = this.m;
            if (m2.b) {
                n5 = this.L.getResources().getDisplayMetrics().widthPixels;
            }
            else {
                n5 = m2.a;
            }
        }
        this.I = e;
        this.J = f;
        Label_1683: {
            int n6;
            if ((n6 = this.N) == -1) {
                if (this.q == -1 && !b5) {
                    n6 = -1;
                }
                else {
                    if (this.n.e) {
                        break Label_1683;
                    }
                    this.d.clear();
                    this.O.n();
                    if (this.K()) {
                        this.e.p(this.O, measureSpec, measureSpec2, n5, 0, this.n.a, this.d);
                    }
                    else {
                        this.e.p(this.O, measureSpec2, measureSpec, n5, 0, this.n.a, this.d);
                    }
                    this.d = (List)this.O.b;
                    this.e.d(measureSpec, measureSpec2);
                    this.e.k();
                    final lzc n7 = this.n;
                    final int n8 = this.e.b[n7.a];
                    n7.b = n8;
                    this.m.c = n8;
                    break Label_1683;
                }
            }
            int n9;
            if (n6 != -1) {
                n9 = Math.min(n6, this.n.a);
            }
            else {
                n9 = this.n.a;
            }
            this.O.n();
            if (this.K()) {
                if (this.d.size() > 0) {
                    this.e.b(this.d, n9);
                    this.e.p(this.O, measureSpec, measureSpec2, n5, n9, this.n.a, this.d);
                }
                else {
                    this.e.f(a);
                    this.e.q(this.O, measureSpec, measureSpec2, n5, 0, this.d);
                }
            }
            else if (this.d.size() > 0) {
                this.e.b(this.d, n9);
                this.e.p(this.O, measureSpec2, measureSpec, n5, n9, this.n.a, this.d);
            }
            else {
                this.e.f(a);
                this.e.r(this.O, measureSpec, measureSpec2, n5, 0, this.d);
            }
            this.d = (List)this.O.b;
            this.e.e(measureSpec, measureSpec2, n9);
            this.e.l(n9);
        }
        int n10;
        int n11;
        if (this.n.e) {
            this.V(k, l, this.m);
            n10 = this.m.e;
            this.bJ(this.n, true, false);
            this.V(k, l, this.m);
            n11 = this.m.e;
        }
        else {
            this.V(k, l, this.m);
            n11 = this.m.e;
            this.bK(this.n, true, false);
            this.V(k, l, this.m);
            n10 = this.m.e;
        }
        if (this.as() > 0) {
            if (this.n.e) {
                this.ab(n10 + this.W(n11, k, l, true), k, l, false);
                return;
            }
            this.W(n11 + this.ab(n10, k, l, true), k, l, false);
        }
    }
    
    public final void p(final ok ok) {
        this.p = null;
        this.q = -1;
        this.r = Integer.MIN_VALUE;
        this.N = -1;
        this.n.b();
        this.K.clear();
    }
    
    public final int q() {
        return this.i;
    }
    
    public final int r() {
        final int size = this.d.size();
        int i = 0;
        int n = 0;
        while (i < size) {
            n += this.d.get(i).g;
            ++i;
        }
        return n;
    }
    
    public final View s(final int n) {
        final View view = (View)this.K.get(n);
        if (view != null) {
            return view;
        }
        return this.k.b(n);
    }
    
    public final boolean t(final nx nx) {
        return nx instanceof FlexboxLayoutManager$LayoutParams;
    }
    
    public final View u(final int n) {
        return this.s(n);
    }
    
    public final void v(final int n, final int n2) {
        this.bI(n);
    }
    
    public final List w() {
        return this.d;
    }
    
    public final void x(final int n, final int n2) {
        this.bI(Math.min(n, n2));
    }
    
    public final void y(final int n, final int n2) {
        this.bI(n);
    }
    
    public final void z(final int n, final int n2) {
        this.bv(n);
        this.bI(n);
    }
}
