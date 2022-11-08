// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.widget.GridView;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.util.Arrays;
import android.view.View$MeasureSpec;
import android.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;

public class GridLayoutManager extends LinearLayoutManager
{
    boolean a;
    public int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    public mq g;
    final Rect h;
    
    public GridLayoutManager(final int n) {
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = (mq)new mo();
        this.h = new Rect();
        this.r(n);
    }
    
    public GridLayoutManager(final int n, final int n2) {
        super(n2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = (mq)new mo();
        this.h = new Rect();
        this.r(n);
    }
    
    public GridLayoutManager(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = (mq)new mo();
        this.h = new Rect();
        this.r(az(context, set, n, n2).b);
    }
    
    private final int bC(final oc oc, final ok ok, final int n) {
        if (!ok.g) {
            return this.g.c(n, this.b);
        }
        final int a = oc.a(n);
        if (a == -1) {
            final StringBuilder sb = new StringBuilder("Cannot find span size for pre layout position. ");
            sb.append(n);
            Log.w("GridLayoutManager", sb.toString());
            return 0;
        }
        return this.g.c(a, this.b);
    }
    
    private final int bD(final oc oc, final ok ok, final int n) {
        if (!ok.g) {
            return this.g.a(n, this.b);
        }
        final int value = this.f.get(n, -1);
        if (value != -1) {
            return value;
        }
        final int a = oc.a(n);
        if (a == -1) {
            final StringBuilder sb = new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            sb.append(n);
            Log.w("GridLayoutManager", sb.toString());
            return 0;
        }
        return this.g.a(a, this.b);
    }
    
    private final int bE(final oc oc, final ok ok, final int n) {
        if (!ok.g) {
            return this.g.b(n);
        }
        final int value = this.e.get(n, -1);
        if (value != -1) {
            return value;
        }
        final int a = oc.a(n);
        if (a == -1) {
            final StringBuilder sb = new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            sb.append(n);
            Log.w("GridLayoutManager", sb.toString());
            return 1;
        }
        return this.g.b(a);
    }
    
    private final void bF(int n) {
        final int[] c = this.c;
        final int b = this.b;
        int[] c2 = null;
        Label_0046: {
            if (c != null) {
                final int length = c.length;
                if (length == b + 1) {
                    c2 = c;
                    if (c[length - 1] == n) {
                        break Label_0046;
                    }
                }
            }
            c2 = new int[b + 1];
        }
        final int n2 = 0;
        c2[0] = 0;
        final int n3 = n / b;
        final int n4 = n % b;
        int n5 = 0;
        int i = 1;
        n = n2;
        while (i <= b) {
            n += n4;
            int n6;
            if (n > 0 && b - n < n4) {
                n6 = n3 + 1;
                n -= b;
            }
            else {
                n6 = n3;
            }
            n5 += n6;
            c2[i] = n5;
            ++i;
        }
        this.c = c2;
    }
    
    private final void bG() {
        final View[] d = this.d;
        if (d != null && d.length == this.b) {
            return;
        }
        this.d = new View[this.b];
    }
    
    private final void bH(final View view, int n, final boolean b) {
        final mp mp = (mp)view.getLayoutParams();
        final Rect d = mp.d;
        final int n2 = d.top + d.bottom + mp.topMargin + mp.bottomMargin;
        final int n3 = d.left + d.right + mp.leftMargin + mp.rightMargin;
        final int c = this.c(mp.a, mp.b);
        int n4;
        if (this.i == 1) {
            n4 = au(c, n, n3, mp.width, false);
            n = au(this.j.k(), ((nw)this).D, n2, mp.height, true);
        }
        else {
            n = au(c, n, n2, mp.height, false);
            n4 = au(this.j.k(), ((nw)this).C, n3, mp.width, true);
        }
        this.bI(view, n4, n, b);
    }
    
    private final void bI(final View view, final int n, final int n2, final boolean b) {
        final nx nx = (nx)view.getLayoutParams();
        int bj;
        if (b) {
            final boolean y = ((nw)this).y;
            final int n3 = bj = 1;
            if (y) {
                bj = n3;
                if (nw.bg(view.getMeasuredWidth(), n, nx.width)) {
                    if (!nw.bg(view.getMeasuredHeight(), n2, nx.height)) {
                        bj = n3;
                    }
                    else {
                        bj = 0;
                    }
                }
            }
        }
        else {
            bj = (((nw)this).bj(view, n, n2, nx) ? 1 : 0);
        }
        if (bj != 0) {
            view.measure(n, n2);
        }
    }
    
    private final void bJ() {
        int n;
        int n2;
        if (super.i == 1) {
            n = ((nw)this).E - ((nw)this).getPaddingRight();
            n2 = ((nw)this).getPaddingLeft();
        }
        else {
            n = ((nw)this).F - ((nw)this).getPaddingBottom();
            n2 = ((nw)this).getPaddingTop();
        }
        this.bF(n - n2);
    }
    
    public final void A(final ok ok, final mw mw, final athu athu) {
        int d;
        for (int b = this.b, n = 0; n < this.b && mw.d(ok) && b > 0; b -= this.g.b(d), mw.d += mw.e, ++n) {
            d = mw.d;
            athu.t(d, Math.max(0, mw.g));
        }
    }
    
    final int c(int n, final int n2) {
        if (this.i == 1 && this.ah()) {
            final int[] c = this.c;
            n = this.b - n;
            return c[n] - c[n - n2];
        }
        final int[] c2 = this.c;
        return c2[n2 + n] - c2[n];
    }
    
    public final int d(final int n, final oc oc, final ok ok) {
        this.bJ();
        this.bG();
        return super.d(n, oc, ok);
    }
    
    public final int e(final int n, final oc oc, final ok ok) {
        this.bJ();
        this.bG();
        return super.e(n, oc, ok);
    }
    
    public nx f() {
        if (this.i == 0) {
            return (nx)new mp(-2, -1);
        }
        return (nx)new mp(-1, -2);
    }
    
    public final nx h(final Context context, final AttributeSet set) {
        return (nx)new mp(context, set);
    }
    
    public final View i(final oc oc, final ok ok, final boolean b, final boolean b2) {
        int as = ((nw)this).as();
        int i;
        int n;
        if (b2) {
            i = ((nw)this).as();
            as = -1;
            --i;
            n = -1;
        }
        else {
            n = 1;
            i = 0;
        }
        final int a = ok.a();
        this.W();
        final int j = this.j.j();
        final int f = this.j.f();
        View view = null;
        View view2 = null;
        while (i != as) {
            final View ab = ((nw)this).aB(i);
            final int bo = bo(ab);
            View view3 = view;
            View view4 = view2;
            if (bo >= 0) {
                view3 = view;
                view4 = view2;
                if (bo < a) {
                    if (this.bD(oc, ok, bo) != 0) {
                        view3 = view;
                        view4 = view2;
                    }
                    else if (((nx)ab.getLayoutParams()).lv()) {
                        view3 = view;
                        if ((view4 = view2) == null) {
                            view4 = ab;
                            view3 = view;
                        }
                    }
                    else {
                        if (this.j.d(ab) < f && this.j.a(ab) >= j) {
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
            i += n;
            view = view3;
            view2 = view4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }
    
    public final void k(final oc oc, final ok ok, final mw mw, final mv mv) {
        final int i = this.j.i();
        final boolean b = i != 1073741824;
        int n;
        if (((nw)this).as() > 0) {
            n = this.c[this.b];
        }
        else {
            n = 0;
        }
        if (b) {
            this.bJ();
        }
        final int e = mw.e;
        int b2 = this.b;
        if (e != 1) {
            b2 = this.bD(oc, ok, mw.d) + this.bE(oc, ok, mw.d);
        }
        int n2;
        for (n2 = 0; n2 < this.b && mw.d(ok) && b2 > 0; ++n2) {
            final int d = mw.d;
            final int be = this.bE(oc, ok, d);
            if (be > this.b) {
                final StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(d);
                sb.append(" requires ");
                sb.append(be);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.b);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
            b2 -= be;
            if (b2 < 0) {
                break;
            }
            final View a = mw.a(oc);
            if (a == null) {
                break;
            }
            this.d[n2] = a;
        }
        if (n2 != 0) {
            int n3;
            int j;
            int n4;
            if (e == 1) {
                n3 = n2;
                j = 0;
                n4 = 1;
            }
            else {
                j = n2 - 1;
                n3 = -1;
                n4 = -1;
            }
            int a2 = 0;
            while (j != n3) {
                final View view = this.d[j];
                final mp mp = (mp)view.getLayoutParams();
                final int be2 = this.bE(oc, ok, bo(view));
                mp.b = be2;
                mp.a = a2;
                a2 += be2;
                j += n4;
            }
            float n5 = 0.0f;
            int k = 0;
            int n6 = 0;
            while (k < n2) {
                final View view2 = this.d[k];
                if (mw.l == null) {
                    if (e == 1) {
                        ((nw)this).aF(view2);
                    }
                    else {
                        ((nw)this).aG(view2, 0);
                    }
                }
                else if (e == 1) {
                    ((nw)this).aD(view2);
                }
                else {
                    ((nw)this).aE(view2, 0);
                }
                ((nw)this).aH(view2, this.h);
                this.bH(view2, i, false);
                final int b3 = this.j.b(view2);
                int n7 = n6;
                if (b3 > n6) {
                    n7 = b3;
                }
                final float n8 = this.j.c(view2) / (float)((mp)view2.getLayoutParams()).b;
                float n9 = n5;
                if (n8 > n5) {
                    n9 = n8;
                }
                ++k;
                n5 = n9;
                n6 = n7;
            }
            int a3 = n6;
            if (b) {
                this.bF(Math.max(Math.round(n5 * this.b), n));
                int n10 = 0;
                int n11 = 0;
                while (true) {
                    a3 = n10;
                    if (n11 >= n2) {
                        break;
                    }
                    final View view3 = this.d[n11];
                    this.bH(view3, 1073741824, true);
                    final int b4 = this.j.b(view3);
                    int n12;
                    if (b4 > (n12 = n10)) {
                        n12 = b4;
                    }
                    ++n11;
                    n10 = n12;
                }
            }
            for (int l = 0; l < n2; ++l) {
                final View view4 = this.d[l];
                if (this.j.b(view4) != a3) {
                    final mp mp2 = (mp)view4.getLayoutParams();
                    final Rect d2 = mp2.d;
                    final int n13 = d2.top + d2.bottom + mp2.topMargin + mp2.bottomMargin;
                    final int n14 = d2.left + d2.right + mp2.leftMargin + mp2.rightMargin;
                    final int c = this.c(mp2.a, mp2.b);
                    int n15;
                    int n16;
                    if (this.i == 1) {
                        n15 = au(c, 1073741824, n14, mp2.width, false);
                        n16 = View$MeasureSpec.makeMeasureSpec(a3 - n13, 1073741824);
                    }
                    else {
                        n15 = View$MeasureSpec.makeMeasureSpec(a3 - n14, 1073741824);
                        n16 = au(c, 1073741824, n13, mp2.height, false);
                    }
                    this.bI(view4, n15, n16, true);
                }
            }
            mv.a = a3;
            int b5;
            int b6;
            int b7;
            int n17;
            if (this.i == 1) {
                if (mw.f == -1) {
                    b5 = mw.b;
                    b6 = b5 - a3;
                }
                else {
                    b6 = mw.b;
                    b5 = b6 + a3;
                }
                b7 = 0;
                n17 = 0;
            }
            else if (mw.f == -1) {
                final int b8 = mw.b;
                b7 = b8 - a3;
                b6 = 0;
                b5 = 0;
                n17 = b8;
            }
            else {
                b7 = mw.b;
                b5 = 0;
                n17 = b7 + a3;
                b6 = 0;
            }
            final int n18 = 0;
            int n19 = n17;
            int n20 = n18;
            int n21 = b7;
            int n22 = b5;
            int n23 = b6;
            while (n20 < n2) {
                final View view5 = this.d[n20];
                final mp mp3 = (mp)view5.getLayoutParams();
                int n25;
                int n26;
                if (this.i == 1) {
                    if (this.ah()) {
                        final int n24 = ((nw)this).getPaddingLeft() + this.c[this.b - mp3.a];
                        final int c2 = this.j.c(view5);
                        n25 = n24;
                        n26 = n24 - c2;
                    }
                    else {
                        n26 = ((nw)this).getPaddingLeft() + this.c[mp3.a];
                        n25 = this.j.c(view5) + n26;
                    }
                }
                else {
                    n23 = ((nw)this).getPaddingTop() + this.c[mp3.a];
                    n22 = this.j.c(view5) + n23;
                    n25 = n19;
                    n26 = n21;
                }
                bs(view5, n26, n23, n25, n22);
                if (((nx)mp3).lv() || ((nx)mp3).lu()) {
                    mv.c = true;
                }
                mv.d |= view5.hasFocusable();
                ++n20;
                n21 = n26;
                n19 = n25;
            }
            Arrays.fill(this.d, null);
            return;
        }
        mv.b = true;
    }
    
    public final void l(final oc oc, final ok ok, final mu mu, int i) {
        this.bJ();
        if (ok.a() > 0 && !ok.g) {
            int j = this.bD(oc, ok, mu.b);
            if (i == 1) {
                while (j > 0) {
                    i = mu.b;
                    if (i <= 0) {
                        break;
                    }
                    --i;
                    mu.b = i;
                    j = this.bD(oc, ok, i);
                }
            }
            else {
                int a;
                int n;
                int bd;
                for (a = ok.a(), i = mu.b; i < a - 1; i = n, j = bd) {
                    n = i + 1;
                    bd = this.bD(oc, ok, n);
                    if (bd <= j) {
                        break;
                    }
                }
                mu.b = i;
            }
        }
        this.bG();
    }
    
    public final void o(final oc oc, final ok ok) {
        if (ok.g) {
            for (int as = ((nw)this).as(), i = 0; i < as; ++i) {
                final mp mp = (mp)((nw)this).aB(i).getLayoutParams();
                final int lt = ((nx)mp).lt();
                this.e.put(lt, mp.b);
                this.f.put(lt, mp.a);
            }
        }
        super.o(oc, ok);
        this.e.clear();
        this.f.clear();
    }
    
    public final void p(final ok ok) {
        super.p(ok);
        this.a = false;
    }
    
    public final int pP(final oc oc, final ok ok) {
        if (this.i == 1) {
            return this.b;
        }
        if (ok.a() <= 0) {
            return 0;
        }
        return this.bC(oc, ok, ok.a() - 1) + 1;
    }
    
    public final int pQ(final oc oc, final ok ok) {
        if (this.i == 0) {
            return this.b;
        }
        if (ok.a() <= 0) {
            return 0;
        }
        return this.bC(oc, ok, ok.a() - 1) + 1;
    }
    
    public final void r(final int b) {
        if (b == this.b) {
            return;
        }
        this.a = true;
        if (b > 0) {
            this.b = b;
            this.g.e();
            ((nw)this).aX();
            return;
        }
        final StringBuilder sb = new StringBuilder("Span count should be at least 1. Provided ");
        sb.append(b);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public nx rg(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return (nx)new mp((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return (nx)new mp(viewGroup$LayoutParams);
    }
    
    public final View rh(View view, int as, final oc oc, final ok ok) {
        final View aa = ((nw)this).aA(view);
        View view2 = null;
        if (aa == null) {
            return null;
        }
        final mp mp = (mp)aa.getLayoutParams();
        final int a = mp.a;
        final int n = mp.b + a;
        if (super.rh(view, as, oc, ok) == null) {
            return null;
        }
        int n2;
        int n3;
        if (this.H(as) == 1 != this.l) {
            n2 = ((nw)this).as() - 1;
            as = -1;
            n3 = -1;
        }
        else {
            as = ((nw)this).as();
            n2 = 0;
            n3 = 1;
        }
        final boolean b = this.i == 1 && this.ah();
        final int bc = this.bC(oc, ok, n2);
        int i = n2;
        int a2 = -1;
        final int n4 = 0;
        int n5 = 0;
        int a3 = -1;
        view = null;
        final int n6 = bc;
        final int n7 = as;
        as = n4;
        while (i != n7) {
            final int bc2 = this.bC(oc, ok, i);
            final View ab = ((nw)this).aB(i);
            if (ab == aa) {
                break;
            }
            Label_0533: {
                if (ab.hasFocusable() && bc2 != n6) {
                    if (view2 != null) {
                        break;
                    }
                }
                else {
                    final mp mp2 = (mp)ab.getLayoutParams();
                    final int a4 = mp2.a;
                    final int n8 = mp2.b + a4;
                    if (ab.hasFocusable() && a4 == a && n8 == n) {
                        return ab;
                    }
                    if ((!ab.hasFocusable() || view2 != null) && (ab.hasFocusable() || view != null)) {
                        final int n9 = Math.min(n8, n) - Math.max(a4, a);
                        if (ab.hasFocusable()) {
                            if (n9 <= as) {
                                if (n9 != as) {
                                    break Label_0533;
                                }
                                if (b != a4 > a3) {
                                    break Label_0533;
                                }
                            }
                        }
                        else {
                            if (view2 != null) {
                                break Label_0533;
                            }
                            if (((nw)this).G.h(ab) && ((nw)this).H.h(ab)) {
                                break Label_0533;
                            }
                            if (n9 <= n5) {
                                if (n9 != n5) {
                                    break Label_0533;
                                }
                                if (b != a4 > a2) {
                                    break Label_0533;
                                }
                            }
                        }
                    }
                    if (ab.hasFocusable()) {
                        a3 = mp2.a;
                        as = Math.min(n8, n) - Math.max(a4, a);
                        view2 = ab;
                    }
                    else {
                        a2 = mp2.a;
                        n5 = Math.min(n8, n) - Math.max(a4, a);
                        view = ab;
                    }
                }
            }
            i += n3;
        }
        if (view2 != null) {
            return view2;
        }
        return view;
    }
    
    public final void ri(final oc oc, final ok ok, final aol aol) {
        super.ri(oc, ok, aol);
        aol.q((CharSequence)GridView.class.getName());
    }
    
    public final void rj(final oc oc, final ok ok, final View view, final aol aol) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof mp)) {
            super.aP(view, aol);
            return;
        }
        final mp mp = (mp)layoutParams;
        final int bc = this.bC(oc, ok, ((nx)mp).lt());
        if (this.i == 0) {
            aol.t((Object)bx.J(mp.a, mp.b, bc, 1, false, false));
            return;
        }
        aol.t((Object)bx.J(bc, 1, mp.a, mp.b, false, false));
    }
    
    public final void rk(final Rect rect, int ar, int ar2) {
        if (this.c == null) {
            super.rk(rect, ar, ar2);
        }
        final int n = ((nw)this).getPaddingLeft() + ((nw)this).getPaddingRight();
        final int n2 = ((nw)this).getPaddingTop() + ((nw)this).getPaddingBottom();
        if (this.i == 1) {
            ar2 = ar(ar2, rect.height() + n2, ((nw)this).ax());
            final int[] c = this.c;
            final int ar3 = ar(ar, c[c.length - 1] + n, ((nw)this).ay());
            ar = ar2;
            ar2 = ar3;
        }
        else {
            ar = ar(ar, rect.width() + n, ((nw)this).ay());
            final int[] c2 = this.c;
            final int ar4 = ar(ar2, c2[c2.length - 1] + n2, ((nw)this).ax());
            ar2 = ar;
            ar = ar4;
        }
        ((nw)this).bc(ar2, ar);
    }
    
    public final boolean rl() {
        return this.q == null && !this.a;
    }
    
    public final void rm() {
        this.g.e();
        this.g.d();
    }
    
    public final void s(final boolean b) {
        if (!b) {
            super.s(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }
    
    public final boolean t(final nx nx) {
        return nx instanceof mp;
    }
    
    public final void v(final int n, final int n2) {
        this.g.e();
        this.g.d();
    }
    
    public final void x(final int n, final int n2) {
        this.g.e();
        this.g.d();
    }
    
    public final void y(final int n, final int n2) {
        this.g.e();
        this.g.d();
    }
    
    public final void z(final int n, final int n2) {
        this.g.e();
        this.g.d();
    }
}
