// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.os.Parcelable;
import android.graphics.PointF;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class LinearLayoutManager extends nx implements ql, oj
{
    private mx a;
    private boolean b;
    private boolean c;
    private final mw d;
    private int e;
    private int[] f;
    public int i;
    nl j;
    public boolean k;
    boolean l;
    public boolean m;
    public boolean n;
    int o;
    int p;
    LinearLayoutManager$SavedState q;
    final mv r;
    
    public LinearLayoutManager() {
        this(1);
    }
    
    public LinearLayoutManager(final int n) {
        this.i = 1;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = -1;
        this.p = Integer.MIN_VALUE;
        this.q = null;
        this.r = new mv();
        this.d = new mw();
        this.e = 2;
        this.f = new int[2];
        this.ac(n);
        this.ad(false);
    }
    
    public LinearLayoutManager(final Context context, final AttributeSet set, final int n, final int n2) {
        this.i = 1;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = -1;
        this.p = Integer.MIN_VALUE;
        this.q = null;
        this.r = new mv();
        this.d = new mw();
        this.e = 2;
        this.f = new int[2];
        final nw az = az(context, set, n, n2);
        this.ac(az.a);
        this.ad(az.c);
        this.s(az.d);
    }
    
    private final int bC(final ol ol) {
        if (this.as() == 0) {
            return 0;
        }
        this.W();
        return ix.d(ol, this.j, this.al(this.n ^ true), this.ak(this.n ^ true), (nx)this, this.n);
    }
    
    private final int bD(int n, final od od, final ol ol, final boolean b) {
        final int n2 = this.j.f() - n;
        if (n2 > 0) {
            final int n3 = -this.O(-n2, od, ol);
            if (b) {
                n = this.j.f() - (n + n3);
                if (n > 0) {
                    this.j.n(n);
                    return n + n3;
                }
            }
            return n3;
        }
        return 0;
    }
    
    private final int bE(int n, final od od, final ol ol, final boolean b) {
        final int n2 = n - this.j.j();
        if (n2 > 0) {
            int n4;
            final int n3 = n4 = -this.O(n2, od, ol);
            if (b) {
                n = n + n3 - this.j.j();
                n4 = n3;
                if (n > 0) {
                    this.j.n(-n);
                    n4 = n3 - n;
                }
            }
            return n4;
        }
        return 0;
    }
    
    private final View bF() {
        return this.R(0, this.as());
    }
    
    private final View bG() {
        return this.R(this.as() - 1, -1);
    }
    
    private final View bH() {
        int n;
        if (this.l) {
            n = 0;
        }
        else {
            n = this.as() - 1;
        }
        return this.aB(n);
    }
    
    private final View bI() {
        int n;
        if (this.l) {
            n = this.as() - 1;
        }
        else {
            n = 0;
        }
        return this.aB(n);
    }
    
    private final void bJ(final od od, final mx mx) {
        if (mx.a) {
            if (!mx.m) {
                final int g = mx.g;
                final int i = mx.i;
                if (mx.f == -1) {
                    int as = this.as();
                    if (g >= 0) {
                        final int n = this.j.e() - g + i;
                        if (this.l) {
                            for (int j = 0; j < as; ++j) {
                                final View ab = this.aB(j);
                                if (this.j.d(ab) < n || this.j.m(ab) < n) {
                                    this.bK(od, 0, j);
                                    return;
                                }
                            }
                        }
                        else {
                            for (int k = --as; k >= 0; --k) {
                                final View ab2 = this.aB(k);
                                if (this.j.d(ab2) < n || this.j.m(ab2) < n) {
                                    this.bK(od, as, k);
                                    return;
                                }
                            }
                        }
                    }
                }
                else if (g >= 0) {
                    final int n2 = g - i;
                    int as2 = this.as();
                    if (this.l) {
                        for (int l = --as2; l >= 0; --l) {
                            final View ab3 = this.aB(l);
                            if (this.j.a(ab3) > n2 || this.j.l(ab3) > n2) {
                                this.bK(od, as2, l);
                                return;
                            }
                        }
                    }
                    else {
                        for (int n3 = 0; n3 < as2; ++n3) {
                            final View ab4 = this.aB(n3);
                            if (this.j.a(ab4) > n2 || this.j.l(ab4) > n2) {
                                this.bK(od, 0, n3);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
    
    private final void bK(final od od, final int n, int n2) {
        if (n == n2) {
            return;
        }
        int i;
        if (n2 > (i = n)) {
            while (--n2 >= n) {
                this.aV(n2, od);
            }
        }
        else {
            while (i > n2) {
                this.aV(i, od);
                --i;
            }
        }
    }
    
    private final void bL() {
        boolean k;
        if (this.i != 1 && this.ah()) {
            k = (this.k ^ true);
        }
        else {
            k = this.k;
        }
        this.l = k;
    }
    
    private final void bM(int n, final int c, final boolean b, final ol ol) {
        this.a.m = this.ai();
        this.a.f = n;
        final int[] f = this.f;
        f[0] = 0;
        final int n2 = 1;
        final int n3 = 1;
        f[1] = 0;
        this.V(ol, f);
        int max = Math.max(0, this.f[0]);
        final int max2 = Math.max(0, this.f[1]);
        int h;
        if (n == 1) {
            h = max2;
        }
        else {
            h = max;
        }
        final mx a = this.a;
        a.h = h;
        if (n != 1) {
            max = max2;
        }
        a.i = max;
        if (n == 1) {
            a.h = h + this.j.g();
            final View bh = this.bH();
            final mx a2 = this.a;
            if (!this.l) {
                n = n3;
            }
            else {
                n = -1;
            }
            a2.e = n;
            n = bo(bh);
            final mx a3 = this.a;
            a2.d = n + a3.e;
            a3.b = this.j.a(bh);
            n = this.j.a(bh) - this.j.f();
        }
        else {
            final View bi = this.bI();
            final mx a4 = this.a;
            a4.h += this.j.j();
            final mx a5 = this.a;
            n = n2;
            if (!this.l) {
                n = -1;
            }
            a5.e = n;
            n = bo(bi);
            final mx a6 = this.a;
            a5.d = n + a6.e;
            a6.b = this.j.d(bi);
            n = -this.j.d(bi) + this.j.j();
        }
        final mx a7 = this.a;
        a7.c = c;
        if (b) {
            a7.c = c - n;
        }
        a7.g = n;
    }
    
    private final void bN(final mv mv) {
        this.bO(mv.b, mv.c);
    }
    
    private final void bO(final int d, final int b) {
        this.a.c = this.j.f() - b;
        final mx a = this.a;
        int e;
        if (!this.l) {
            e = 1;
        }
        else {
            e = -1;
        }
        a.e = e;
        a.d = d;
        a.f = 1;
        a.b = b;
        a.g = Integer.MIN_VALUE;
    }
    
    private final void bP(final mv mv) {
        this.bQ(mv.b, mv.c);
    }
    
    private final void bQ(int n, final int b) {
        this.a.c = b - this.j.j();
        final mx a = this.a;
        a.d = n;
        final boolean l = this.l;
        n = 1;
        if (!l) {
            n = -1;
        }
        a.e = n;
        a.f = -1;
        a.b = b;
        a.g = Integer.MIN_VALUE;
    }
    
    private final int c(final ol ol) {
        if (this.as() == 0) {
            return 0;
        }
        this.W();
        return ix.b(ol, this.j, this.al(this.n ^ true), this.ak(this.n ^ true), (nx)this, this.n);
    }
    
    private final int r(final ol ol) {
        if (this.as() == 0) {
            return 0;
        }
        this.W();
        return ix.c(ol, this.j, this.al(this.n ^ true), this.ak(this.n ^ true), (nx)this, this.n, this.l);
    }
    
    public void A(final ol ol, final mx mx, final atlj atlj) {
        final int d = mx.d;
        if (d >= 0 && d < ol.a()) {
            atlj.t(d, Math.max(0, mx.g));
        }
    }
    
    public final int B(final ol ol) {
        return this.c(ol);
    }
    
    public final int C(final ol ol) {
        return this.r(ol);
    }
    
    public final int D(final ol ol) {
        return this.bC(ol);
    }
    
    public final int E(final ol ol) {
        return this.c(ol);
    }
    
    public final int F(final ol ol) {
        return this.r(ol);
    }
    
    public final int G(final ol ol) {
        return this.bC(ol);
    }
    
    final int H(final int n) {
        if (n != 1) {
            if (n != 2) {
                if (n != 17) {
                    if (n != 33) {
                        if (n != 66) {
                            if (n != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.i == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        else {
                            if (this.i == 0) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                    }
                    else {
                        if (this.i == 1) {
                            return -1;
                        }
                        return Integer.MIN_VALUE;
                    }
                }
                else {
                    if (this.i == 0) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
            }
            else {
                if (this.i == 1) {
                    return 1;
                }
                if (this.ah()) {
                    return -1;
                }
                return 1;
            }
        }
        else {
            if (this.i == 1) {
                return -1;
            }
            if (this.ah()) {
                return 1;
            }
            return -1;
        }
    }
    
    final int I(final od od, final mx mx, final ol ol, final boolean b) {
        final int c = mx.c;
        final int g = mx.g;
        if (g != Integer.MIN_VALUE) {
            if (c < 0) {
                mx.g = g + c;
            }
            this.bJ(od, mx);
        }
        int n = mx.c + mx.h;
        final mw d = this.d;
        while ((mx.m || n > 0) && mx.d(ol)) {
            d.a = 0;
            d.b = false;
            d.c = false;
            d.d = false;
            this.k(od, ol, mx, d);
            if (d.b) {
                break;
            }
            final int b2 = mx.b;
            final int a = d.a;
            mx.b = b2 + mx.f * a;
            int n2 = 0;
            Label_0191: {
                if (d.c && mx.l == null) {
                    n2 = n;
                    if (ol.g) {
                        break Label_0191;
                    }
                }
                mx.c -= a;
                n2 = n - a;
            }
            final int g2 = mx.g;
            if (g2 != Integer.MIN_VALUE) {
                final int g3 = g2 + a;
                mx.g = g3;
                final int c2 = mx.c;
                if (c2 < 0) {
                    mx.g = g3 + c2;
                }
                this.bJ(od, mx);
            }
            n = n2;
            if (!b) {
                continue;
            }
            n = n2;
            if (d.d) {
                break;
            }
        }
        return c - mx.c;
    }
    
    public int J() {
        final View s = this.S(0, this.as(), true, false);
        if (s == null) {
            return -1;
        }
        return bo(s);
    }
    
    public final int K() {
        final View s = this.S(0, this.as(), false, true);
        if (s == null) {
            return -1;
        }
        return bo(s);
    }
    
    public final int L() {
        final View s = this.S(this.as() - 1, -1, true, false);
        if (s == null) {
            return -1;
        }
        return bo(s);
    }
    
    public final int M() {
        final View s = this.S(this.as() - 1, -1, false, true);
        if (s == null) {
            return -1;
        }
        return bo(s);
    }
    
    @Deprecated
    protected int N(final ol ol) {
        if (ol.a != -1) {
            return this.j.k();
        }
        return 0;
    }
    
    final int O(int k, final od od, final ol ol) {
        if (this.as() == 0 || k == 0) {
            return 0;
        }
        this.W();
        this.a.a = true;
        int n;
        if (k > 0) {
            n = 1;
        }
        else {
            n = -1;
        }
        final int abs = Math.abs(k);
        this.bM(n, abs, true, ol);
        final mx a = this.a;
        final int n2 = a.g + this.I(od, a, ol, false);
        if (n2 < 0) {
            return 0;
        }
        if (abs > n2) {
            k = n * n2;
        }
        this.j.n(-k);
        return this.a.k = k;
    }
    
    public final PointF P(int n) {
        if (this.as() == 0) {
            return null;
        }
        boolean b = false;
        final int bo = bo(this.aB(0));
        final int n2 = 1;
        if (n < bo) {
            b = true;
        }
        n = n2;
        if (b != this.l) {
            n = -1;
        }
        if (this.i == 0) {
            return new PointF((float)n, 0.0f);
        }
        return new PointF(0.0f, (float)n);
    }
    
    public final Parcelable Q() {
        final LinearLayoutManager$SavedState q = this.q;
        if (q != null) {
            return (Parcelable)new LinearLayoutManager$SavedState(q);
        }
        final LinearLayoutManager$SavedState linearLayoutManager$SavedState = new LinearLayoutManager$SavedState();
        if (this.as() > 0) {
            this.W();
            final boolean c = this.b ^ this.l;
            linearLayoutManager$SavedState.c = c;
            if (c) {
                final View bh = this.bH();
                linearLayoutManager$SavedState.b = this.j.f() - this.j.a(bh);
                linearLayoutManager$SavedState.a = bo(bh);
            }
            else {
                final View bi = this.bI();
                linearLayoutManager$SavedState.a = bo(bi);
                linearLayoutManager$SavedState.b = this.j.d(bi) - this.j.j();
            }
        }
        else {
            linearLayoutManager$SavedState.a();
        }
        return (Parcelable)linearLayoutManager$SavedState;
    }
    
    final View R(final int n, final int n2) {
        this.W();
        if (n2 <= n) {
            if (n2 >= n) {
                return this.aB(n);
            }
        }
        final int d = this.j.d(this.aB(n));
        final int j = this.j.j();
        int n3;
        if (d < j) {
            n3 = 16388;
        }
        else {
            n3 = 4097;
        }
        int n4;
        if (d < j) {
            n4 = 16644;
        }
        else {
            n4 = 4161;
        }
        View view;
        if (this.i == 0) {
            view = this.F.g(n, n2, n4, n3);
        }
        else {
            view = this.G.g(n, n2, n4, n3);
        }
        return view;
    }
    
    final View S(final int n, final int n2, final boolean b, final boolean b2) {
        this.W();
        final int i = this.i;
        int n3 = 320;
        int n4;
        if (!b) {
            n4 = 320;
        }
        else {
            n4 = 24579;
        }
        if (!b2) {
            n3 = 0;
        }
        View view;
        if (i == 0) {
            view = this.F.g(n, n2, n4, n3);
        }
        else {
            view = this.G.g(n, n2, n4, n3);
        }
        return view;
    }
    
    public final View T(final int n) {
        final int as = this.as();
        if (as == 0) {
            return null;
        }
        final int n2 = n - bo(this.aB(0));
        if (n2 >= 0 && n2 < as) {
            final View ab = this.aB(n2);
            if (bo(ab) == n) {
                return ab;
            }
        }
        return super.T(n);
    }
    
    public final void U(final String s) {
        if (this.q == null) {
            super.U(s);
        }
    }
    
    protected final void V(final ol ol, final int[] array) {
        int n = this.N(ol);
        final int f = this.a.f;
        int n2;
        if (f == -1) {
            n2 = 0;
        }
        else {
            n2 = n;
        }
        if (f != -1) {
            n = 0;
        }
        array[0] = n;
        array[1] = n2;
    }
    
    final void W() {
        if (this.a == null) {
            this.a = new mx();
        }
    }
    
    public void X(final RecyclerView recyclerView, final od od) {
        if (this.c) {
            this.aS(od);
            od.d();
        }
    }
    
    public final void Y(final AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (this.as() > 0) {
            accessibilityEvent.setFromIndex(this.K());
            accessibilityEvent.setToIndex(this.M());
        }
    }
    
    public final void Z(final Parcelable parcelable) {
        if (parcelable instanceof LinearLayoutManager$SavedState) {
            final LinearLayoutManager$SavedState q = (LinearLayoutManager$SavedState)parcelable;
            this.q = q;
            if (this.o != -1) {
                q.a();
            }
            this.aX();
        }
    }
    
    public final void aa(final int o) {
        this.o = o;
        this.p = Integer.MIN_VALUE;
        final LinearLayoutManager$SavedState q = this.q;
        if (q != null) {
            q.a();
        }
        this.aX();
    }
    
    public final void ab(final int o, final int p2) {
        this.o = o;
        this.p = p2;
        final LinearLayoutManager$SavedState q = this.q;
        if (q != null) {
            q.a();
        }
        this.aX();
    }
    
    public final void ac(final int i) {
        if (i != 0 && i != 1) {
            final StringBuilder sb = new StringBuilder("invalid orientation:");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.U((String)null);
        if (i == this.i && this.j != null) {
            return;
        }
        final nl q = nl.q((nx)this, i);
        this.j = q;
        this.r.a = q;
        this.i = i;
        this.aX();
    }
    
    public final void ad(final boolean k) {
        this.U((String)null);
        if (k == this.k) {
            return;
        }
        this.k = k;
        this.aX();
    }
    
    public boolean ae() {
        return this.i == 0;
    }
    
    public boolean af() {
        return this.i == 1;
    }
    
    public boolean ag() {
        return true;
    }
    
    protected final boolean ah() {
        return this.aw() == 1;
    }
    
    final boolean ai() {
        return this.j.h() == 0 && this.j.e() == 0;
    }
    
    public final boolean aj() {
        if (super.C != 1073741824 && super.B != 1073741824) {
            for (int as = this.as(), i = 0; i < as; ++i) {
                final ViewGroup$LayoutParams layoutParams = this.aB(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    final View ak(final boolean b) {
        if (this.l) {
            return this.S(0, this.as(), b, true);
        }
        return this.S(this.as() - 1, -1, b, true);
    }
    
    final View al(final boolean b) {
        if (this.l) {
            return this.S(this.as() - 1, -1, b, true);
        }
        return this.S(0, this.as(), b, true);
    }
    
    public final void am(final View view, final View view2) {
        this.U("Cannot drop a view during a scroll or layout calculation");
        this.W();
        this.bL();
        final int bo = bo(view);
        final int bo2 = bo(view2);
        final boolean l = this.l;
        int n;
        if (bo < bo2) {
            n = 1;
        }
        else {
            n = -1;
        }
        if (l) {
            if (n == 1) {
                this.ab(bo2, this.j.f() - (this.j.d(view2) + this.j.b(view)));
                return;
            }
            this.ab(bo2, this.j.f() - this.j.a(view2));
        }
        else {
            if (n == -1) {
                this.ab(bo2, this.j.d(view2));
                return;
            }
            this.ab(bo2, this.j.a(view2) - this.j.b(view));
        }
    }
    
    public final void an() {
        this.c = true;
    }
    
    public void ao(final RecyclerView recyclerView, final int b) {
        final ok ok = new ok(recyclerView.getContext());
        ok.b = b;
        this.bf(ok);
    }
    
    public final void ap(int n, int n2, final ol ol, final atlj atlj) {
        if (1 == this.i) {
            n = n2;
        }
        if (this.as() != 0) {
            if (n != 0) {
                this.W();
                if (n > 0) {
                    n2 = 1;
                }
                else {
                    n2 = -1;
                }
                this.bM(n2, Math.abs(n), true, ol);
                this.A(ol, this.a, atlj);
            }
        }
    }
    
    public final void aq(final int n, final atlj atlj) {
        final LinearLayoutManager$SavedState q = this.q;
        int n2 = -1;
        boolean c;
        int n3;
        if (q != null && q.b()) {
            c = q.c;
            n3 = q.a;
        }
        else {
            this.bL();
            final boolean l = this.l;
            final int n4 = n3 = this.o;
            c = l;
            if (n4 == -1) {
                if (l) {
                    n3 = n - 1;
                    c = l;
                }
                else {
                    n3 = 0;
                    c = l;
                }
            }
        }
        if (!c) {
            n2 = 1;
        }
        for (int n5 = 0; n5 < this.e && n3 >= 0 && n3 < n; n3 += n2, ++n5) {
            atlj.t(n3, 0);
        }
    }
    
    public int d(final int n, final od od, final ol ol) {
        if (this.i == 1) {
            return 0;
        }
        return this.O(n, od, ol);
    }
    
    public int e(final int n, final od od, final ol ol) {
        if (this.i == 0) {
            return 0;
        }
        return this.O(n, od, ol);
    }
    
    public ny f() {
        return new ny(-2, -2);
    }
    
    public View i(final od od, final ol ol, final boolean b, final boolean b2) {
        this.W();
        int as = this.as();
        int i;
        int n;
        if (b2) {
            i = this.as();
            as = -1;
            --i;
            n = -1;
        }
        else {
            i = 0;
            n = 1;
        }
        final int a = ol.a();
        final int j = this.j.j();
        final int f = this.j.f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i != as) {
            final View ab = this.aB(i);
            final int bo = bo(ab);
            final int d = this.j.d(ab);
            final int a2 = this.j.a(ab);
            View view4 = view;
            View view5 = view2;
            View view6 = view3;
            Label_0322: {
                if (bo >= 0) {
                    view4 = view;
                    view5 = view2;
                    view6 = view3;
                    if (bo < a) {
                        if (((ny)ab.getLayoutParams()).lv()) {
                            view4 = view;
                            view5 = view2;
                            if ((view6 = view3) == null) {
                                view4 = view;
                                view5 = view2;
                                view6 = ab;
                            }
                        }
                        else {
                            final boolean b3 = a2 <= j && d < j;
                            final boolean b4 = d >= f && a2 > f;
                            if (!b3 && !b4) {
                                return ab;
                            }
                            Label_0311: {
                                if (b) {
                                    if (!b4) {
                                        view4 = view;
                                        view5 = view2;
                                        view6 = view3;
                                        if (view == null) {
                                            break Label_0311;
                                        }
                                        break Label_0322;
                                    }
                                }
                                else if (!b3) {
                                    view4 = view;
                                    view5 = view2;
                                    view6 = view3;
                                    if (view == null) {
                                        break Label_0311;
                                    }
                                    break Label_0322;
                                }
                                view4 = view;
                                view5 = ab;
                                view6 = view3;
                                break Label_0322;
                            }
                            view6 = view3;
                            view5 = view2;
                            view4 = ab;
                        }
                    }
                }
            }
            i += n;
            view = view4;
            view2 = view5;
            view3 = view6;
        }
        if (view != null) {
            view3 = view;
        }
        else if (view2 != null) {
            return view2;
        }
        return view3;
    }
    
    public void k(final od od, final ol ol, final mx mx, final mw mw) {
        final View a = mx.a(od);
        if (a == null) {
            mw.b = true;
            return;
        }
        final ny ny = (ny)a.getLayoutParams();
        if (mx.l == null) {
            if (this.l == (mx.f == -1)) {
                this.aF(a);
            }
            else {
                this.aG(a, 0);
            }
        }
        else if (this.l == (mx.f == -1)) {
            this.aD(a);
        }
        else {
            this.aE(a, 0);
        }
        this.bt(a);
        mw.a = this.j.b(a);
        int n;
        int paddingLeft;
        int b;
        int n2;
        if (this.i == 1) {
            if (this.ah()) {
                n = super.D - this.getPaddingRight();
                paddingLeft = n - this.j.c(a);
            }
            else {
                paddingLeft = this.getPaddingLeft();
                n = this.j.c(a) + paddingLeft;
            }
            if (mx.f == -1) {
                b = mx.b;
                n2 = b - mw.a;
            }
            else {
                n2 = mx.b;
                b = mw.a + n2;
            }
        }
        else {
            n2 = this.getPaddingTop();
            b = this.j.c(a) + n2;
            if (mx.f == -1) {
                final int b2 = mx.b;
                final int a2 = mw.a;
                n = b2;
                paddingLeft = b2 - a2;
            }
            else {
                final int b3 = mx.b;
                final int a3 = mw.a;
                paddingLeft = b3;
                n = a3 + b3;
            }
        }
        bs(a, paddingLeft, n2, n, b);
        if (ny.lv() || ny.lu()) {
            mw.c = true;
        }
        mw.d = a.hasFocusable();
    }
    
    public void l(final od od, final ol ol, final mv mv, final int n) {
    }
    
    public void o(final od od, final ol ol) {
        final LinearLayoutManager$SavedState q = this.q;
        int n = -1;
        if ((q == null && this.o == -1) || ol.a() != 0) {
            final LinearLayoutManager$SavedState q2 = this.q;
            if (q2 != null && q2.b()) {
                this.o = q2.a;
            }
            this.W();
            this.a.a = false;
            this.bL();
            final View ac = this.aC();
            final mv r = this.r;
            if (r.e && this.o == -1 && this.q == null) {
                if (ac != null && (this.j.d(ac) >= this.j.f() || this.j.a(ac) <= this.j.j())) {
                    this.r.c(ac, bo(ac));
                }
            }
            else {
                r.d();
                final mv r2 = this.r;
                r2.d = (this.l ^ this.m);
                Label_0928: {
                    if (!ol.g) {
                        final int o = this.o;
                        if (o != -1) {
                            if (o >= 0 && o < ol.a()) {
                                final int o2 = this.o;
                                r2.b = o2;
                                final LinearLayoutManager$SavedState q3 = this.q;
                                if (q3 != null && q3.b()) {
                                    final boolean c = q3.c;
                                    r2.d = c;
                                    if (c) {
                                        r2.c = this.j.f() - this.q.b;
                                        break Label_0928;
                                    }
                                    r2.c = this.j.j() + this.q.b;
                                    break Label_0928;
                                }
                                else if (this.p == Integer.MIN_VALUE) {
                                    final View t = this.T(o2);
                                    if (t == null) {
                                        if (this.as() > 0) {
                                            r2.d = (this.o < bo(this.aB(0)) == this.l);
                                        }
                                        r2.a();
                                        break Label_0928;
                                    }
                                    if (this.j.b(t) > this.j.k()) {
                                        r2.a();
                                        break Label_0928;
                                    }
                                    if (this.j.d(t) - this.j.j() < 0) {
                                        r2.c = this.j.j();
                                        r2.d = false;
                                        break Label_0928;
                                    }
                                    if (this.j.f() - this.j.a(t) < 0) {
                                        r2.c = this.j.f();
                                        r2.d = true;
                                        break Label_0928;
                                    }
                                    int d;
                                    if (r2.d) {
                                        d = this.j.a(t) + this.j.o();
                                    }
                                    else {
                                        d = this.j.d(t);
                                    }
                                    r2.c = d;
                                    break Label_0928;
                                }
                                else {
                                    final boolean l = this.l;
                                    r2.d = l;
                                    if (l) {
                                        r2.c = this.j.f() - this.p;
                                        break Label_0928;
                                    }
                                    r2.c = this.j.j() + this.p;
                                    break Label_0928;
                                }
                            }
                            else {
                                this.o = -1;
                                this.p = Integer.MIN_VALUE;
                            }
                        }
                    }
                    if (this.as() != 0) {
                        final View ac2 = this.aC();
                        if (ac2 != null) {
                            final ny ny = (ny)ac2.getLayoutParams();
                            if (!ny.lv() && ny.lt() >= 0 && ny.lt() < ol.a()) {
                                r2.c(ac2, bo(ac2));
                                break Label_0928;
                            }
                        }
                        final boolean b = this.b;
                        final boolean m = this.m;
                        if (b == m) {
                            final View i = this.i(od, ol, r2.d, m);
                            if (i != null) {
                                r2.b(i, bo(i));
                                if (ol.g || !this.rr()) {
                                    break Label_0928;
                                }
                                final int d2 = this.j.d(i);
                                final int a = this.j.a(i);
                                final int j = this.j.j();
                                final int f = this.j.f();
                                final boolean b2 = a <= j && d2 < j;
                                final boolean b3 = d2 >= f && a > f;
                                if (b2 || b3) {
                                    int c2;
                                    if (!r2.d) {
                                        c2 = j;
                                    }
                                    else {
                                        c2 = f;
                                    }
                                    r2.c = c2;
                                }
                                break Label_0928;
                            }
                        }
                    }
                    r2.a();
                    int b4;
                    if (this.m) {
                        b4 = ol.a() - 1;
                    }
                    else {
                        b4 = 0;
                    }
                    r2.b = b4;
                }
                this.r.e = true;
            }
            final mx a2 = this.a;
            int f2;
            if (a2.k >= 0) {
                f2 = 1;
            }
            else {
                f2 = -1;
            }
            a2.f = f2;
            final int[] f3 = this.f;
            f3[1] = (f3[0] = 0);
            this.V(ol, f3);
            final int n2 = Math.max(0, this.f[0]) + this.j.j();
            final int n3 = Math.max(0, this.f[1]) + this.j.g();
            int h = n2;
            int h2 = n3;
            if (ol.g) {
                final int o3 = this.o;
                h = n2;
                h2 = n3;
                if (o3 != -1) {
                    h = n2;
                    h2 = n3;
                    if (this.p != Integer.MIN_VALUE) {
                        final View t2 = this.T(o3);
                        h = n2;
                        h2 = n3;
                        if (t2 != null) {
                            int p2;
                            int p3;
                            if (this.l) {
                                p2 = this.j.f() - this.j.a(t2);
                                p3 = this.p;
                            }
                            else {
                                p3 = this.j.d(t2) - this.j.j();
                                p2 = this.p;
                            }
                            final int n4 = p2 - p3;
                            if (n4 > 0) {
                                h = n2 + n4;
                                h2 = n3;
                            }
                            else {
                                h2 = n3 - n4;
                                h = n2;
                            }
                        }
                    }
                }
            }
            final mv r3 = this.r;
            Label_1219: {
                if (r3.d) {
                    if (!this.l) {
                        break Label_1219;
                    }
                }
                else if (this.l) {
                    break Label_1219;
                }
                n = 1;
            }
            this.l(od, ol, r3, n);
            this.aI(od);
            this.a.m = this.ai();
            final mx a3 = this.a;
            a3.j = ol.g;
            a3.i = 0;
            final mv r4 = this.r;
            int b7;
            int b8;
            if (r4.d) {
                this.bP(r4);
                final mx a4 = this.a;
                a4.h = h;
                this.I(od, a4, ol, false);
                final mx a5 = this.a;
                final int b5 = a5.b;
                final int d3 = a5.d;
                final int c3 = a5.c;
                int h3 = h2;
                if (c3 > 0) {
                    h3 = h2 + c3;
                }
                this.bN(this.r);
                final mx a6 = this.a;
                a6.h = h3;
                a6.d += a6.e;
                this.I(od, a6, ol, false);
                final mx a7 = this.a;
                final int b6 = a7.b;
                final int c4 = a7.c;
                b7 = b5;
                b8 = b6;
                if (c4 > 0) {
                    this.bQ(d3, b5);
                    final mx a8 = this.a;
                    a8.h = c4;
                    this.I(od, a8, ol, false);
                    b7 = this.a.b;
                    b8 = b6;
                }
            }
            else {
                this.bN(r4);
                final mx a9 = this.a;
                a9.h = h2;
                this.I(od, a9, ol, false);
                final mx a10 = this.a;
                final int b9 = a10.b;
                final int d4 = a10.d;
                final int c5 = a10.c;
                int h4 = h;
                if (c5 > 0) {
                    h4 = h + c5;
                }
                this.bP(this.r);
                final mx a11 = this.a;
                a11.h = h4;
                a11.d += a11.e;
                this.I(od, a11, ol, false);
                final mx a12 = this.a;
                final int b10 = a12.b;
                final int c6 = a12.c;
                b7 = b10;
                b8 = b9;
                if (c6 > 0) {
                    this.bO(d4, b9);
                    final mx a13 = this.a;
                    a13.h = c6;
                    this.I(od, a13, ol, false);
                    b8 = this.a.b;
                    b7 = b10;
                }
            }
            int n5 = b7;
            int n6 = b8;
            if (this.as() > 0) {
                int n7;
                int n8;
                int n9;
                if (this.l ^ this.m) {
                    final int bd = this.bD(b8, od, ol, true);
                    n7 = b7 + bd;
                    n8 = b8 + bd;
                    n9 = this.bE(n7, od, ol, false);
                }
                else {
                    final int be = this.bE(b7, od, ol, true);
                    n7 = b7 + be;
                    n8 = b8 + be;
                    n9 = this.bD(n8, od, ol, false);
                }
                n5 = n7 + n9;
                n6 = n8 + n9;
            }
            if (ol.k && this.as() != 0 && !ol.g) {
                if (this.rr()) {
                    final List d5 = od.d;
                    final int size = d5.size();
                    final int bo = bo(this.aB(0));
                    int k = 0;
                    int h5 = 0;
                    int h6 = 0;
                    while (k < size) {
                        final oo oo = d5.get(k);
                        int n10 = h5;
                        int n11 = h6;
                        if (!oo.v()) {
                            if (oo.c() < bo != this.l) {
                                n10 = h5 + this.j.b(oo.a);
                                n11 = h6;
                            }
                            else {
                                n11 = h6 + this.j.b(oo.a);
                                n10 = h5;
                            }
                        }
                        ++k;
                        h5 = n10;
                        h6 = n11;
                    }
                    this.a.l = d5;
                    if (h5 > 0) {
                        this.bQ(bo(this.bI()), n5);
                        final mx a14 = this.a;
                        a14.h = h5;
                        a14.c = 0;
                        a14.b();
                        this.I(od, this.a, ol, false);
                    }
                    if (h6 > 0) {
                        this.bO(bo(this.bH()), n6);
                        final mx a15 = this.a;
                        a15.h = h6;
                        a15.c = 0;
                        a15.b();
                        this.I(od, this.a, ol, false);
                    }
                    this.a.l = null;
                }
            }
            if (!ol.g) {
                final nl j2 = this.j;
                j2.b = j2.k();
            }
            else {
                this.r.d();
            }
            this.b = this.m;
            return;
        }
        this.aS(od);
    }
    
    public void p(final ol ol) {
        this.q = null;
        this.o = -1;
        this.p = Integer.MIN_VALUE;
        this.r.d();
    }
    
    public View rn(View view, int h, final od od, final ol ol) {
        this.bL();
        if (this.as() == 0) {
            return null;
        }
        h = this.H(h);
        if (h == Integer.MIN_VALUE) {
            return null;
        }
        this.W();
        this.bM(h, (int)(this.j.k() * 0.33333334f), false, ol);
        final mx a = this.a;
        a.g = Integer.MIN_VALUE;
        a.a = false;
        this.I(od, a, ol, true);
        if (h == -1) {
            if (this.l) {
                view = this.bG();
            }
            else {
                view = this.bF();
            }
            h = -1;
        }
        else if (this.l) {
            view = this.bF();
        }
        else {
            view = this.bG();
        }
        View view2;
        if (h == -1) {
            view2 = this.bI();
        }
        else {
            view2 = this.bH();
        }
        if (!view2.hasFocusable()) {
            return view;
        }
        if (view == null) {
            return null;
        }
        return view2;
    }
    
    public boolean rr() {
        return this.q == null && this.b == this.m;
    }
    
    public void s(final boolean m) {
        this.U((String)null);
        if (this.m == m) {
            return;
        }
        this.m = m;
        this.aX();
    }
}
