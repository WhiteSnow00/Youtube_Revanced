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

public class FlexboxLayoutManager extends nx implements mar, oj
{
    private static final Rect h;
    private int H;
    private int I;
    private final SparseArray J;
    private final Context K;
    private View L;
    private int M;
    private final agpl N;
    public int a;
    public int b;
    public boolean c;
    public List d;
    public final mau e;
    public nl f;
    public nl g;
    private int i;
    private final int j;
    private boolean k;
    private od l;
    private ol m;
    private maw n;
    private final mav o;
    private FlexboxLayoutManager$SavedState p;
    private int q;
    private int r;
    
    static {
        h = new Rect();
    }
    
    public FlexboxLayoutManager(final Context k, final AttributeSet set, int a, final int n) {
        this.j = -1;
        this.d = new ArrayList();
        this.e = new mau((mar)this);
        this.o = new mav(this);
        this.q = -1;
        this.r = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.I = Integer.MIN_VALUE;
        this.J = new SparseArray();
        this.M = -1;
        this.N = new agpl();
        final nw az = az(k, set, a, n);
        a = az.a;
        if (a != 0) {
            if (a == 1) {
                if (az.c) {
                    this.M(3);
                }
                else {
                    this.M(2);
                }
            }
        }
        else if (az.c) {
            this.M(1);
        }
        else {
            this.M(0);
        }
        if (this.b != 1) {
            this.aR();
            this.an();
            this.b = 1;
            this.f = null;
            this.g = null;
            this.aX();
        }
        if (this.i != 4) {
            this.aR();
            this.an();
            this.i = 4;
            this.aX();
        }
        this.K = k;
    }
    
    private final int N(final ol ol) {
        if (this.as() == 0) {
            return 0;
        }
        final int a = ol.a();
        this.bD();
        final View ad = this.ad(a);
        final View ai = this.ai(a);
        if (ol.a() != 0 && ad != null && ai != null) {
            return Math.min(this.f.k(), this.f.a(ai) - this.f.d(ad));
        }
        return 0;
    }
    
    private final int O(final ol ol) {
        if (this.as() == 0) {
            return 0;
        }
        final int a = ol.a();
        final View ad = this.ad(a);
        final View ai = this.ai(a);
        if (ol.a() != 0 && ad != null) {
            if (ai != null) {
                final int bo = bo(ad);
                final int bo2 = bo(ai);
                final int abs = Math.abs(this.f.a(ai) - this.f.d(ad));
                final int[] b = this.e.b;
                final int n = b[bo];
                if (n != 0) {
                    if (n != -1) {
                        return Math.round(n * (abs / (float)(b[bo2] - n + 1)) + (this.f.j() - this.f.d(ad)));
                    }
                }
            }
        }
        return 0;
    }
    
    private final int R(final ol ol) {
        if (this.as() == 0) {
            return 0;
        }
        final int a = ol.a();
        final View ad = this.ad(a);
        final View ai = this.ai(a);
        if (ol.a() != 0 && ad != null && ai != null) {
            final View bm = this.bM(0, this.as());
            int bo;
            if (bm == null) {
                bo = -1;
            }
            else {
                bo = bo(bm);
            }
            return (int)(Math.abs(this.f.a(ai) - this.f.d(ad)) / (float)(this.L() - bo + 1) * ol.a());
        }
        return 0;
    }
    
    private final int S(final od od, final ol ol, final maw maw) {
        final int f = maw.f;
        if (f != Integer.MIN_VALUE) {
            final int a = maw.a;
            if (a < 0) {
                maw.f = f + a;
            }
            this.bE(od, maw);
        }
        int a2 = maw.a;
        final boolean k = this.K();
        int n = a2;
        int n2 = 0;
        while (n > 0 || this.n.b) {
            final List d = this.d;
            final int d2 = maw.d;
            if (d2 < 0 || d2 >= ol.a()) {
                break;
            }
            final int c = maw.c;
            if (c < 0 || c >= d.size()) {
                break;
            }
            final mas mas = this.d.get(maw.c);
            maw.d = mas.o;
            int n16;
            int n18;
            int n19;
            if (this.K()) {
                final int paddingLeft = this.getPaddingLeft();
                final int paddingRight = this.getPaddingRight();
                final int d3 = super.D;
                int e = maw.e;
                if (maw.i == -1) {
                    e -= mas.g;
                }
                final int d4 = maw.d;
                final float n3 = (float)paddingLeft;
                final float n4 = (float)this.o.d;
                final float max = Math.max(0.0f, 0.0f);
                final int h = mas.h;
                float n5 = d3 - paddingRight - n4;
                float n6 = n3 - n4;
                int i = d4;
                int n7 = 0;
                final int n8 = e;
                while (i < d4 + h) {
                    final View s = this.s(i);
                    int n9;
                    if (maw.i == 1) {
                        this.aH(s, FlexboxLayoutManager.h);
                        this.aF(s);
                        n9 = n7;
                    }
                    else {
                        this.aH(s, FlexboxLayoutManager.h);
                        this.aG(s, n7);
                        n9 = n7 + 1;
                    }
                    final long n10 = this.e.c[i];
                    final int n11 = (int)n10;
                    final int n12 = mau.n(n10);
                    final FlexboxLayoutManager$LayoutParams flexboxLayoutManager$LayoutParams = (FlexboxLayoutManager$LayoutParams)s.getLayoutParams();
                    if (this.bL(s, n11, n12, (ny)flexboxLayoutManager$LayoutParams)) {
                        s.measure(n11, n12);
                    }
                    final float n13 = flexboxLayoutManager$LayoutParams.leftMargin + bn(s) + n6;
                    final float n14 = n5 - (flexboxLayoutManager$LayoutParams.rightMargin + bp(s));
                    final int n15 = n8 + bq(s);
                    if (this.c) {
                        this.e.i(s, mas, Math.round(n14) - s.getMeasuredWidth(), n15, Math.round(n14), n15 + s.getMeasuredHeight());
                    }
                    else {
                        this.e.i(s, mas, Math.round(n13), n15, Math.round(n13) + s.getMeasuredWidth(), n15 + s.getMeasuredHeight());
                    }
                    n6 = s.getMeasuredWidth() + flexboxLayoutManager$LayoutParams.rightMargin + bp(s) + max + n13;
                    n5 = n14 - (s.getMeasuredWidth() + flexboxLayoutManager$LayoutParams.leftMargin + bn(s) + max);
                    ++i;
                    n7 = n9;
                }
                maw.c += this.n.i;
                n16 = mas.g;
                final int n17 = n;
                n18 = a2;
                n19 = n17;
            }
            else {
                final int n20 = a2;
                final int paddingTop = this.getPaddingTop();
                final int paddingBottom = this.getPaddingBottom();
                final int e2 = super.E;
                final int e3 = maw.e;
                int n21;
                int n22;
                if (maw.i == -1) {
                    final int g = mas.g;
                    n21 = e3 + g;
                    n22 = e3 - g;
                }
                else {
                    n21 = e3;
                    n22 = e3;
                }
                final int d5 = maw.d;
                final float n23 = (float)paddingTop;
                final float n24 = (float)this.o.d;
                final float max2 = Math.max(0.0f, 0.0f);
                final int h2 = mas.h;
                float n25 = e2 - paddingBottom - n24;
                float n26 = n23 - n24;
                int j = d5;
                int n27 = 0;
                while (j < d5 + h2) {
                    final View s2 = this.s(j);
                    final long n28 = this.e.c[j];
                    final int n29 = (int)n28;
                    final int n30 = mau.n(n28);
                    final FlexboxLayoutManager$LayoutParams flexboxLayoutManager$LayoutParams2 = (FlexboxLayoutManager$LayoutParams)s2.getLayoutParams();
                    if (this.bL(s2, n29, n30, (ny)flexboxLayoutManager$LayoutParams2)) {
                        s2.measure(n29, n30);
                    }
                    final float n31 = n26 + (flexboxLayoutManager$LayoutParams2.topMargin + bq(s2));
                    final float n32 = n25 - (flexboxLayoutManager$LayoutParams2.rightMargin + bk(s2));
                    if (maw.i == 1) {
                        this.aH(s2, FlexboxLayoutManager.h);
                        this.aF(s2);
                    }
                    else {
                        this.aH(s2, FlexboxLayoutManager.h);
                        this.aG(s2, n27);
                        ++n27;
                    }
                    final int n33 = n22 + bn(s2);
                    final int n34 = n21 - bp(s2);
                    if (this.c) {
                        if (this.k) {
                            this.e.j(s2, mas, true, n34 - s2.getMeasuredWidth(), Math.round(n32) - s2.getMeasuredHeight(), n34, Math.round(n32));
                        }
                        else {
                            this.e.j(s2, mas, true, n34 - s2.getMeasuredWidth(), Math.round(n31), n34, Math.round(n31) + s2.getMeasuredHeight());
                        }
                    }
                    else if (this.k) {
                        this.e.j(s2, mas, false, n33, Math.round(n32) - s2.getMeasuredHeight(), n33 + s2.getMeasuredWidth(), Math.round(n32));
                    }
                    else {
                        this.e.j(s2, mas, false, n33, Math.round(n31), n33 + s2.getMeasuredWidth(), Math.round(n31) + s2.getMeasuredHeight());
                    }
                    n26 = n31 + (s2.getMeasuredHeight() + flexboxLayoutManager$LayoutParams2.topMargin + bk(s2) + max2);
                    n25 = n32 - (s2.getMeasuredHeight() + flexboxLayoutManager$LayoutParams2.bottomMargin + bq(s2) + max2);
                    ++j;
                }
                maw.c += this.n.i;
                n16 = mas.g;
                n19 = n;
                n18 = n20;
            }
            n2 += n16;
            if (!k && this.c) {
                maw.e -= mas.g * maw.i;
            }
            else {
                maw.e += mas.g * maw.i;
            }
            final int n35 = n19 - mas.g;
            a2 = n18;
            n = n35;
        }
        final int a3 = maw.a - n2;
        maw.a = a3;
        final int f2 = maw.f;
        if (f2 != Integer.MIN_VALUE) {
            final int f3 = f2 + n2;
            maw.f = f3;
            if (a3 < 0) {
                maw.f = f3 + a3;
            }
            this.bE(od, maw);
        }
        return a2 - maw.a;
    }
    
    private final int V(int n, final od od, final ol ol, final boolean b) {
        int ab;
        if (!this.K() && this.c) {
            final int n2 = n - this.f.j();
            if (n2 <= 0) {
                return 0;
            }
            ab = this.ab(n2, od, ol);
        }
        else {
            final int n3 = this.f.f() - n;
            if (n3 <= 0) {
                return 0;
            }
            ab = -this.ab(-n3, od, ol);
        }
        if (b) {
            n = this.f.f() - (n + ab);
            if (n > 0) {
                this.f.n(n);
                return n + ab;
            }
        }
        return ab;
    }
    
    private final int W(int n, final od od, final ol ol, final boolean b) {
        int ab;
        if (!this.K() && this.c) {
            final int n2 = this.f.f() - n;
            if (n2 <= 0) {
                return 0;
            }
            ab = this.ab(-n2, od, ol);
        }
        else {
            final int n3 = n - this.f.j();
            if (n3 <= 0) {
                return 0;
            }
            ab = -this.ab(n3, od, ol);
        }
        int n4 = ab;
        if (b) {
            n = n + ab - this.f.j();
            n4 = ab;
            if (n > 0) {
                this.f.n(-n);
                n4 = ab - n;
            }
        }
        return n4;
    }
    
    private final int ab(int g, final od od, final ol ol) {
        if (this.as() == 0 || g == 0) {
            return 0;
        }
        this.bD();
        this.n.j = true;
        final boolean b = !this.K() && this.c;
        final int i = (b ? (g < 0) : (g > 0)) ? 1 : -1;
        final int abs = Math.abs(g);
        this.n.i = i;
        final boolean k = this.K();
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(super.D, super.B);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(super.E, super.C);
        final boolean b2 = !k && this.c;
        Label_0865: {
            if (i == 1) {
                final View ab = this.aB(this.as() - 1);
                if (ab == null) {
                    break Label_0865;
                }
                this.n.e = this.f.a(ab);
                final int bo = bo(ab);
                final View ak = this.ak(ab, this.d.get(this.e.b[bo]));
                maw.a(this.n);
                final maw n = this.n;
                final int d = bo + n.h;
                n.d = d;
                final int[] b3 = this.e.b;
                if (b3.length <= d) {
                    n.c = -1;
                }
                else {
                    n.c = b3[d];
                }
                if (b2) {
                    n.e = this.f.d(ak);
                    this.n.f = -this.f.d(ak) + this.f.j();
                    final maw n2 = this.n;
                    n2.f = Math.max(n2.f, 0);
                }
                else {
                    n.e = this.f.a(ak);
                    this.n.f = this.f.a(ak) - this.f.f();
                }
                final int c = this.n.c;
                if ((c == -1 || c > this.d.size() - 1) && this.n.d <= this.l()) {
                    final int n3 = abs - this.n.f;
                    this.N.n();
                    if (n3 > 0) {
                        if (k) {
                            this.e.q(this.N, measureSpec, measureSpec2, n3, this.n.d, this.d);
                        }
                        else {
                            this.e.r(this.N, measureSpec, measureSpec2, n3, this.n.d, this.d);
                        }
                        this.e.e(measureSpec, measureSpec2, this.n.d);
                        this.e.l(this.n.d);
                    }
                }
            }
            else {
                final View ab2 = this.aB(0);
                if (ab2 == null) {
                    break Label_0865;
                }
                this.n.e = this.f.d(ab2);
                final int bo2 = bo(ab2);
                final View ah = this.ah(ab2, this.d.get(this.e.b[bo2]));
                maw.a(this.n);
                int c2;
                if ((c2 = this.e.b[bo2]) == -1) {
                    c2 = 0;
                }
                if (c2 > 0) {
                    this.n.d = bo2 - ((mas)this.d.get(c2 - 1)).h;
                }
                else {
                    this.n.d = -1;
                }
                final maw n4 = this.n;
                if (c2 > 0) {
                    --c2;
                }
                else {
                    c2 = 0;
                }
                n4.c = c2;
                if (b2) {
                    n4.e = this.f.a(ah);
                    this.n.f = this.f.a(ah) - this.f.f();
                    final maw n5 = this.n;
                    n5.f = Math.max(n5.f, 0);
                }
                else {
                    n4.e = this.f.d(ah);
                    this.n.f = -this.f.d(ah) + this.f.j();
                }
            }
            final maw n6 = this.n;
            n6.a = abs - n6.f;
        }
        final maw n7 = this.n;
        final int n8 = n7.f + this.S(od, ol, n7);
        if (n8 < 0) {
            return 0;
        }
        if (b) {
            if (abs > n8) {
                g = -i * n8;
            }
        }
        else if (abs > n8) {
            g = i * n8;
        }
        this.f.n(-g);
        return this.n.g = g;
    }
    
    private final int ac(final int n) {
        if (this.as() != 0 && n != 0) {
            this.bD();
            final boolean k = this.K();
            int n2;
            if (k) {
                n2 = this.L.getWidth();
            }
            else {
                n2 = this.L.getHeight();
            }
            int n3;
            if (k) {
                n3 = super.D;
            }
            else {
                n3 = super.E;
            }
            int d2;
            if (this.aw() == 1) {
                final int abs = Math.abs(n);
                if (n < 0) {
                    return -Math.min(n3 + this.o.d - n2, abs);
                }
                final int d = this.o.d;
                final int min = n;
                if (d + n <= 0) {
                    return min;
                }
                d2 = d;
            }
            else {
                if (n > 0) {
                    return Math.min(n3 - this.o.d - n2, n);
                }
                if ((d2 = this.o.d) + n >= 0) {
                    return n;
                }
            }
            return -d2;
        }
        return 0;
    }
    
    private final View ad(int bo) {
        final View al = this.al(0, this.as(), bo);
        if (al == null) {
            return null;
        }
        bo = bo(al);
        bo = this.e.b[bo];
        if (bo == -1) {
            return null;
        }
        return this.ah(al, this.d.get(bo));
    }
    
    private final View ah(View view, final mas mas) {
        final boolean k = this.K();
        final int h = mas.h;
        int i = 1;
        View view2 = view;
        while (i < h) {
            final View ab = this.aB(i);
            view = view2;
            Label_0110: {
                if (ab != null) {
                    view = view2;
                    if (ab.getVisibility() != 8) {
                        if (this.c && !k) {
                            view = view2;
                            if (this.f.a(view2) >= this.f.a(ab)) {
                                break Label_0110;
                            }
                        }
                        else {
                            view = view2;
                            if (this.f.d(view2) <= this.f.d(ab)) {
                                break Label_0110;
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
    
    private final View ai(int bo) {
        final View al = this.al(this.as() - 1, -1, bo);
        if (al == null) {
            return null;
        }
        bo = bo(al);
        bo = this.e.b[bo];
        return this.ak(al, this.d.get(bo));
    }
    
    private final View ak(View view, final mas mas) {
        final boolean k = this.K();
        View view2;
        for (int i = this.as() - 2; i > this.as() - mas.h - 1; --i, view = view2) {
            final View ab = this.aB(i);
            view2 = view;
            if (ab != null) {
                view2 = view;
                if (ab.getVisibility() != 8) {
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
    
    private final View al(final int n, final int n2, final int n3) {
        this.bD();
        this.bC();
        final int j = this.f.j();
        final int f = this.f.f();
        View view = null;
        int i = n;
        View view2 = null;
        while (i != n2) {
            final View ab = this.aB(i);
            View view3 = view;
            View view4 = view2;
            if (ab != null) {
                final int bo = bo(ab);
                view3 = view;
                view4 = view2;
                if (bo >= 0) {
                    view3 = view;
                    view4 = view2;
                    if (bo < n3) {
                        if (((ny)ab.getLayoutParams()).lv()) {
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
                            view3 = view;
                            view4 = view2;
                            if (view == null) {
                                view3 = ab;
                                view4 = view2;
                            }
                        }
                    }
                }
            }
            int n4;
            if (n2 > n) {
                n4 = 1;
            }
            else {
                n4 = -1;
            }
            i += n4;
            view = view3;
            view2 = view4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }
    
    private final View am() {
        return this.aB(0);
    }
    
    private final void an() {
        this.d.clear();
        this.o.b();
        this.o.d = 0;
    }
    
    private final void bC() {
        if (this.n == null) {
            this.n = new maw();
        }
    }
    
    private final void bD() {
        if (this.f != null) {
            return;
        }
        if (this.K()) {
            if (this.b == 0) {
                this.f = nl.p((nx)this);
                this.g = nl.r((nx)this);
                return;
            }
            this.f = nl.r((nx)this);
            this.g = nl.p((nx)this);
        }
        else {
            if (this.b == 0) {
                this.f = nl.r((nx)this);
                this.g = nl.p((nx)this);
                return;
            }
            this.f = nl.p((nx)this);
            this.g = nl.r((nx)this);
        }
    }
    
    private final void bE(final od od, final maw maw) {
        if (maw.j) {
            if (maw.i == -1) {
                if (maw.f >= 0) {
                    int as = this.as();
                    if (as != 0) {
                        final int n = as - 1;
                        final View ab = this.aB(n);
                        if (ab != null) {
                            int n2 = this.e.b[bo(ab)];
                            if (n2 != -1) {
                                mas mas = this.d.get(n2);
                                int n3 = n;
                                int n4;
                                while (true) {
                                    n4 = as;
                                    if (n3 < 0) {
                                        break;
                                    }
                                    final View ab2 = this.aB(n3);
                                    int n5 = as;
                                    mas mas2 = mas;
                                    int n6 = n2;
                                    if (ab2 != null) {
                                        final int f = maw.f;
                                        if (!this.K() && this.c) {
                                            n4 = as;
                                            if (this.f.a(ab2) > f) {
                                                break;
                                            }
                                        }
                                        else {
                                            n4 = as;
                                            if (this.f.d(ab2) < this.f.e() - f) {
                                                break;
                                            }
                                        }
                                        n5 = as;
                                        mas2 = mas;
                                        n6 = n2;
                                        if (mas.o == bo(ab2)) {
                                            if (n2 <= 0) {
                                                n4 = n3;
                                                break;
                                            }
                                            n6 = n2 + maw.i;
                                            mas2 = (mas)this.d.get(n6);
                                            n5 = n3;
                                        }
                                    }
                                    --n3;
                                    as = n5;
                                    mas = mas2;
                                    n2 = n6;
                                }
                                this.bF(od, n4, n);
                            }
                        }
                    }
                }
            }
            else if (maw.f >= 0) {
                final int as2 = this.as();
                if (as2 != 0) {
                    final View ab3 = this.aB(0);
                    if (ab3 != null) {
                        int n7 = this.e.b[bo(ab3)];
                        if (n7 != -1) {
                            mas mas3 = this.d.get(n7);
                            int i = 0;
                            int n8 = -1;
                            while (true) {
                                while (i < as2) {
                                    final View ab4 = this.aB(i);
                                    int n9 = n7;
                                    mas mas4 = mas3;
                                    int n10 = n8;
                                    if (ab4 != null) {
                                        final int f2 = maw.f;
                                        if (!this.K() && this.c) {
                                            if (this.f.e() - this.f.d(ab4) > f2) {
                                                break;
                                            }
                                        }
                                        else if (this.f.a(ab4) > f2) {
                                            break;
                                        }
                                        n9 = n7;
                                        mas4 = mas3;
                                        n10 = n8;
                                        if (mas3.p == bo(ab4)) {
                                            if (n7 >= this.d.size() - 1) {
                                                this.bF(od, 0, i);
                                                return;
                                            }
                                            n9 = n7 + maw.i;
                                            mas4 = this.d.get(n9);
                                            n10 = i;
                                        }
                                    }
                                    ++i;
                                    n7 = n9;
                                    mas3 = mas4;
                                    n8 = n10;
                                }
                                i = n8;
                                continue;
                            }
                        }
                    }
                }
            }
        }
    }
    
    private final void bF(final od od, final int n, int i) {
        while (i >= n) {
            this.aV(i, od);
            --i;
        }
    }
    
    private final void bG() {
        int n;
        if (this.K()) {
            n = super.C;
        }
        else {
            n = super.B;
        }
        final maw n2 = this.n;
        boolean b = true;
        if (n != 0) {
            b = (n == Integer.MIN_VALUE && b);
        }
        n2.b = b;
    }
    
    private final void bH(final int m) {
        if (m >= this.L()) {
            return;
        }
        final int as = this.as();
        this.e.g(as);
        this.e.h(as);
        this.e.f(as);
        if (m >= this.e.b.length) {
            return;
        }
        this.M = m;
        final View am = this.am();
        if (am == null) {
            return;
        }
        this.q = bo(am);
        if (!this.K() && this.c) {
            this.r = this.f.a(am) + this.f.g();
            return;
        }
        this.r = this.f.d(am) - this.f.j();
    }
    
    private final void bI(final mav mav, final boolean b, final boolean b2) {
        if (b2) {
            this.bG();
        }
        else {
            this.n.b = false;
        }
        if (!this.K() && this.c) {
            this.n.a = mav.c - this.getPaddingRight();
        }
        else {
            this.n.a = this.f.f() - mav.c;
        }
        final maw n = this.n;
        n.d = mav.a;
        maw.a(n);
        final maw n2 = this.n;
        n2.i = 1;
        n2.e = mav.c;
        n2.f = Integer.MIN_VALUE;
        n2.c = mav.b;
        if (b && this.d.size() > 1) {
            final int b3 = mav.b;
            if (b3 >= 0 && b3 < this.d.size() - 1) {
                final mas mas = this.d.get(mav.b);
                final maw n3 = this.n;
                ++n3.c;
                n3.d += mas.h;
            }
        }
    }
    
    private final void bJ(final mav mav, final boolean b, final boolean b2) {
        if (b2) {
            this.bG();
        }
        else {
            this.n.b = false;
        }
        if (!this.K() && this.c) {
            this.n.a = this.L.getWidth() - mav.c - this.f.j();
        }
        else {
            this.n.a = mav.c - this.f.j();
        }
        final maw n = this.n;
        n.d = mav.a;
        maw.a(n);
        final maw n2 = this.n;
        n2.i = -1;
        n2.e = mav.c;
        n2.f = Integer.MIN_VALUE;
        n2.c = mav.b;
        if (b && mav.b > 0) {
            final int size = this.d.size();
            final int b3 = mav.b;
            if (size > b3) {
                final mas mas = this.d.get(b3);
                final maw n3 = this.n;
                --n3.c;
                n3.d -= mas.h;
            }
        }
    }
    
    private static boolean bK(final int n, int size, final int n2) {
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
    
    private final boolean bL(final View view, final int n, final int n2, final ny ny) {
        return view.isLayoutRequested() || !super.x || !bK(view.getWidth(), n, ny.width) || !bK(view.getHeight(), n2, ny.height);
    }
    
    private final View bM(final int n, final int n2) {
        int n4;
        for (int i = n; i != n2; i += n4) {
            final View ab = this.aB(i);
            final int paddingLeft = this.getPaddingLeft();
            final int paddingTop = this.getPaddingTop();
            final int d = super.D;
            final int paddingRight = this.getPaddingRight();
            final int e = super.E;
            final int paddingBottom = this.getPaddingBottom();
            final ny ny = (ny)ab.getLayoutParams();
            final int bz = bz(ab);
            final int leftMargin = ny.leftMargin;
            final ny ny2 = (ny)ab.getLayoutParams();
            final int bb = bB(ab);
            final int topMargin = ny2.topMargin;
            final ny ny3 = (ny)ab.getLayoutParams();
            final int ba = bA(ab);
            final int rightMargin = ny3.rightMargin;
            final ny ny4 = (ny)ab.getLayoutParams();
            final int by = by(ab);
            final int bottomMargin = ny4.bottomMargin;
            boolean b = false;
            final int n3 = 1;
            final boolean b2 = bz - leftMargin >= d - paddingRight || ba + rightMargin >= paddingLeft;
            if (bb - topMargin >= e - paddingBottom || by + bottomMargin >= paddingTop) {
                b = true;
            }
            if (b2 && b) {
                return ab;
            }
            if (n2 > n) {
                n4 = n3;
            }
            else {
                n4 = -1;
            }
        }
        return null;
    }
    
    public final void A(final View view, int n, final int n2, final mas mas) {
        this.aH(view, FlexboxLayoutManager.h);
        if (this.K()) {
            n = bn(view) + bp(view);
            mas.e += n;
            mas.f += n;
            return;
        }
        n = bq(view) + bk(view);
        mas.e += n;
        mas.f += n;
    }
    
    public final int B(final ol ol) {
        return this.N(ol);
    }
    
    public final int C(final ol ol) {
        return this.O(ol);
    }
    
    public final int D(final ol ol) {
        return this.R(ol);
    }
    
    public final int E(final ol ol) {
        return this.N(ol);
    }
    
    public final int F(final ol ol) {
        return this.O(ol);
    }
    
    public final int G(final ol ol) {
        return this.R(ol);
    }
    
    public final void H(final mas mas) {
    }
    
    public final void I(final List d) {
        this.d = d;
    }
    
    public final void J(final int n, final View view) {
        this.J.put(n, (Object)view);
    }
    
    public final boolean K() {
        final int a = this.a;
        return a == 0 || a == 1;
    }
    
    public final int L() {
        final View bm = this.bM(this.as() - 1, -1);
        if (bm == null) {
            return -1;
        }
        return bo(bm);
    }
    
    public final void M(final int a) {
        if (this.a != a) {
            this.aR();
            this.a = a;
            this.f = null;
            this.g = null;
            this.an();
            this.aX();
        }
    }
    
    public final PointF P(int n) {
        if (this.as() == 0) {
            return null;
        }
        final View ab = this.aB(0);
        if (ab == null) {
            return null;
        }
        if (n < bo(ab)) {
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
            final View am = this.am();
            flexboxLayoutManager$SavedState.a = bo(am);
            flexboxLayoutManager$SavedState.b = this.f.d(am) - this.f.j();
        }
        else {
            flexboxLayoutManager$SavedState.a();
        }
        return (Parcelable)flexboxLayoutManager$SavedState;
    }
    
    public final void X(final RecyclerView recyclerView, final od od) {
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
        this.L = (View)recyclerView.getParent();
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
        if (this.b == 0) {
            return this.K();
        }
        if (this.K()) {
            final int d = super.D;
            final View l = this.L;
            int width;
            if (l != null) {
                width = l.getWidth();
            }
            else {
                width = 0;
            }
            if (d <= width) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean af() {
        if (this.b == 0) {
            return !this.K();
        }
        if (!this.K()) {
            final int e = super.E;
            final View l = this.L;
            int height;
            if (l != null) {
                height = l.getHeight();
            }
            else {
                height = 0;
            }
            if (e <= height) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean ag() {
        return true;
    }
    
    public final void ao(final RecyclerView recyclerView, final int b) {
        final ok ok = new ok(recyclerView.getContext());
        ok.b = b;
        this.bf(ok);
    }
    
    public final int b() {
        return this.i;
    }
    
    public final void bu() {
        this.aR();
    }
    
    public final void bv(final int n) {
        this.bH(n);
    }
    
    public final int c(final int n, final int n2, final int n3) {
        return au(super.E, super.C, n2, n3, this.af());
    }
    
    public final int d(int n, final od od, final ol ol) {
        if (this.K() && this.b != 0) {
            n = this.ac(n);
            final mav o = this.o;
            o.d += n;
            this.g.n(-n);
            return n;
        }
        n = this.ab(n, od, ol);
        this.J.clear();
        return n;
    }
    
    public final int e(int n, final od od, final ol ol) {
        if (!this.K() && (this.b != 0 || this.K())) {
            n = this.ac(n);
            final mav o = this.o;
            o.d += n;
            this.g.n(-n);
            return n;
        }
        n = this.ab(n, od, ol);
        this.J.clear();
        return n;
    }
    
    public final ny f() {
        return (ny)new FlexboxLayoutManager$LayoutParams();
    }
    
    public final int g(final int n, final int n2, final int n3) {
        return au(super.D, super.B, n2, n3, this.ae());
    }
    
    public final ny h(final Context context, final AttributeSet set) {
        return (ny)new FlexboxLayoutManager$LayoutParams(context, set);
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
            n2 = bn(view);
            n = bp(view);
        }
        else {
            n2 = bq(view);
            n = bk(view);
        }
        return n2 + n;
    }
    
    public final int k() {
        return this.a;
    }
    
    public final int l() {
        return this.m.a();
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
    
    public final void o(final od l, final ol m) {
        this.l = l;
        this.m = m;
        int a;
        if ((a = m.a()) == 0) {
            if (m.g) {
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
                                this.k = true;
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
            this.k = false;
        }
        this.bD();
        this.bC();
        this.e.g(a);
        this.e.h(a);
        this.e.f(a);
        this.n.j = false;
        final FlexboxLayoutManager$SavedState p2 = this.p;
        if (p2 != null && p2.b(a)) {
            this.q = p2.a;
        }
        final mav o = this.o;
        if (!o.f || this.q != -1 || p2 != null) {
            o.b();
            final mav o2 = this.o;
            final FlexboxLayoutManager$SavedState p3 = this.p;
            Label_0994: {
                if (!m.g) {
                    final int q = this.q;
                    if (q != -1) {
                        if (q >= 0 && q < m.a()) {
                            final int q2 = this.q;
                            o2.a = q2;
                            o2.b = this.e.b[q2];
                            final FlexboxLayoutManager$SavedState p4 = this.p;
                            if (p4 != null && p4.b(m.a())) {
                                o2.c = this.f.j() + p3.b;
                                o2.g = true;
                                o2.b = -1;
                                break Label_0994;
                            }
                            final int r = this.r;
                            if (r == Integer.MIN_VALUE) {
                                final View t = this.T(this.q);
                                if (t == null) {
                                    if (this.as() > 0) {
                                        final View ab = this.aB(0);
                                        if (ab != null) {
                                            o2.e = (this.q < bo(ab));
                                        }
                                    }
                                    o2.a();
                                    break Label_0994;
                                }
                                if (this.f.b(t) > this.f.k()) {
                                    o2.a();
                                    break Label_0994;
                                }
                                if (this.f.d(t) - this.f.j() < 0) {
                                    o2.c = this.f.j();
                                    o2.e = false;
                                    break Label_0994;
                                }
                                if (this.f.f() - this.f.a(t) < 0) {
                                    o2.c = this.f.f();
                                    o2.e = true;
                                    break Label_0994;
                                }
                                int d;
                                if (o2.e) {
                                    d = this.f.a(t) + this.f.o();
                                }
                                else {
                                    d = this.f.d(t);
                                }
                                o2.c = d;
                                break Label_0994;
                            }
                            else {
                                if (!this.K() && this.c) {
                                    o2.c = r - this.f.g();
                                    break Label_0994;
                                }
                                o2.c = this.f.j() + this.r;
                                break Label_0994;
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
                    if (o2.e) {
                        view = this.ai(m.a());
                    }
                    else {
                        view = this.ad(m.a());
                    }
                    if (view != null) {
                        final FlexboxLayoutManager h = o2.h;
                        nl nl;
                        if (h.b == 0) {
                            nl = h.g;
                        }
                        else {
                            nl = h.f;
                        }
                        if (!h.K() && h.c) {
                            if (o2.e) {
                                o2.c = nl.d(view) + nl.o();
                            }
                            else {
                                o2.c = nl.a(view);
                            }
                        }
                        else if (o2.e) {
                            o2.c = nl.a(view) + nl.o();
                        }
                        else {
                            o2.c = nl.d(view);
                        }
                        final int bo = bo(view);
                        o2.a = bo;
                        o2.g = false;
                        final FlexboxLayoutManager h2 = o2.h;
                        final int[] b = h2.e.b;
                        int n = bo;
                        if (bo == -1) {
                            n = 0;
                        }
                        int b2;
                        if ((b2 = b[n]) == -1) {
                            b2 = 0;
                        }
                        o2.b = b2;
                        final int size = h2.d.size();
                        final int b3 = o2.b;
                        if (size > b3) {
                            o2.a = ((mas)o2.h.d.get(b3)).o;
                        }
                        final boolean g = m.g;
                        break Label_0994;
                    }
                }
                o2.a();
                o2.a = 0;
                o2.b = 0;
            }
            this.o.f = true;
        }
        this.aI(l);
        final mav o3 = this.o;
        if (o3.e) {
            this.bJ(o3, false, true);
        }
        else {
            this.bI(o3, false, true);
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(super.D, super.B);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(super.E, super.C);
        final int d2 = super.D;
        final int e = super.E;
        boolean b5;
        int n3;
        if (this.K()) {
            final int h3 = this.H;
            final boolean b4 = h3 != Integer.MIN_VALUE && h3 != d2;
            final maw n2 = this.n;
            if (n2.b) {
                final int heightPixels = this.K.getResources().getDisplayMetrics().heightPixels;
                b5 = b4;
                n3 = heightPixels;
            }
            else {
                final int a3 = n2.a;
                b5 = b4;
                n3 = a3;
            }
        }
        else {
            final int i = this.I;
            b5 = (i != Integer.MIN_VALUE && i != e);
            final maw n4 = this.n;
            if (n4.b) {
                n3 = this.K.getResources().getDisplayMetrics().widthPixels;
            }
            else {
                n3 = n4.a;
            }
        }
        this.H = d2;
        this.I = e;
        Label_1693: {
            int j;
            if ((j = this.M) == -1) {
                if (this.q == -1 && !b5) {
                    j = -1;
                }
                else {
                    if (this.o.e) {
                        break Label_1693;
                    }
                    this.d.clear();
                    this.N.n();
                    if (this.K()) {
                        this.e.p(this.N, measureSpec, measureSpec2, n3, 0, this.o.a, this.d);
                    }
                    else {
                        this.e.p(this.N, measureSpec2, measureSpec, n3, 0, this.o.a, this.d);
                    }
                    this.d = (List)this.N.b;
                    this.e.d(measureSpec, measureSpec2);
                    this.e.k();
                    final mav o4 = this.o;
                    final int n5 = this.e.b[o4.a];
                    o4.b = n5;
                    this.n.c = n5;
                    break Label_1693;
                }
            }
            int n6;
            if (j != -1) {
                n6 = Math.min(j, this.o.a);
            }
            else {
                n6 = this.o.a;
            }
            this.N.n();
            if (this.K()) {
                if (this.d.size() > 0) {
                    this.e.b(this.d, n6);
                    this.e.p(this.N, measureSpec, measureSpec2, n3, n6, this.o.a, this.d);
                }
                else {
                    this.e.f(a);
                    this.e.q(this.N, measureSpec, measureSpec2, n3, 0, this.d);
                }
            }
            else if (this.d.size() > 0) {
                this.e.b(this.d, n6);
                this.e.p(this.N, measureSpec2, measureSpec, n3, n6, this.o.a, this.d);
            }
            else {
                this.e.f(a);
                this.e.r(this.N, measureSpec, measureSpec2, n3, 0, this.d);
            }
            this.d = (List)this.N.b;
            this.e.e(measureSpec, measureSpec2, n6);
            this.e.l(n6);
        }
        this.S(l, m, this.n);
        final mav o5 = this.o;
        int n7;
        int n8;
        if (o5.e) {
            n7 = this.n.e;
            this.bI(o5, true, false);
            this.S(l, m, this.n);
            n8 = this.n.e;
        }
        else {
            n8 = this.n.e;
            this.bJ(o5, true, false);
            this.S(l, m, this.n);
            n7 = this.n.e;
        }
        if (this.as() > 0) {
            if (this.o.e) {
                this.W(n7 + this.V(n8, l, m, true), l, m, false);
                return;
            }
            this.V(n8 + this.W(n7, l, m, true), l, m, false);
        }
    }
    
    public final void p(final ol ol) {
        this.p = null;
        this.q = -1;
        this.r = Integer.MIN_VALUE;
        this.M = -1;
        this.o.b();
        this.J.clear();
    }
    
    public final int q() {
        return this.j;
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
        final View view = (View)this.J.get(n);
        if (view != null) {
            return view;
        }
        return this.l.b(n);
    }
    
    public final boolean t(final ny ny) {
        return ny instanceof FlexboxLayoutManager$LayoutParams;
    }
    
    public final View u(final int n) {
        return this.s(n);
    }
    
    public final void v(final int n, final int n2) {
        this.bH(n);
    }
    
    public final List w() {
        return this.d;
    }
    
    public final void x(final int n, final int n2) {
        this.bH(Math.min(n, n2));
    }
    
    public final void y(final int n, final int n2) {
        this.bH(n);
    }
    
    public final void z(final int n, final int n2) {
        this.bv(n);
        this.bH(n);
    }
}
